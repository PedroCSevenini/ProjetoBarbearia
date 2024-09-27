package Controller;

import BDO.HorarioBanco;
import BDO.ServicoBanco;
import Model.Horario;
import Model.Pessoa;
import Model.Servico;
import View.ViewFuncionario;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FuncionarioController {
    private final ViewFuncionario view;

    public FuncionarioController(ViewFuncionario view) {
        this.view = view;
    }
    
    public void adicionaCamposTabelaConfirmados(){
        DefaultTableModel model = (DefaultTableModel) view.getTabelaConfirmados().getModel();
        
        model.setRowCount(0);
        HorarioBanco bd = new HorarioBanco();
        try{
            List<Horario> horariosFuncionario = bd.retornaHorariosMarcadosFuncionario(view.getFuncionario().getId());
            for(Horario horario : horariosFuncionario){
                if(horario.isMarcado() == true){
                    model.addRow(new Object[]{
                        horario.getId(),
                        horario.getServico().getNome(),
                        horario.getData(),
                        horario.getHorarioInicio(),
                        horario.getCliente(),
                        horario.getServico().getPreco()        
                    });    
                }
            }
            int tamanho = model.getRowCount()*20;
            view.getTabelaConfirmados().setPreferredSize(new java.awt.Dimension(view.getTabelaConfirmados().getWidth(), tamanho));
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
        
        
        
    }
    
    public void adicionaCamposTabelaPendentes(){
        DefaultTableModel model = (DefaultTableModel) view.getTabelaPendentes().getModel();
        model.setRowCount(0);
        HorarioBanco bd = new HorarioBanco();
        try{
            List<Horario> horariosFuncionario = bd.retornaHorariosPendentesFuncionario(view.getFuncionario().getId());
            for(Horario horario : horariosFuncionario){
                if(horario.isMarcado() == false){
                    model.addRow(new Object[]{
                        horario.getId(),
                        horario.getServico().getNome(),
                        horario.getData(),
                        horario.getHorarioInicio(),
                        horario.getCliente(),
                        horario.getServico().getPreco()        
                    });
                }
            }
            int tamanho = model.getRowCount()*20;
            view.getTabelaPendentes().setPreferredSize(new java.awt.Dimension(view.getTabelaPendentes().getWidth(), tamanho));
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void removerHorarioSelecionado(){
        HorarioBanco bd = new HorarioBanco();
        try{
            int selectedRow = view.getTabelaConfirmados().getSelectedRow();
            int idHorario = Integer.parseInt(view.getTabelaConfirmados().getValueAt(selectedRow, 0).toString());
            Object[] options = {"Sim", "Cancelar"};
            int opcao = JOptionPane.showOptionDialog(
                    null, 
                    "Deseja remover esse horário?", 
                    "Confirmação de Remoção",      
                    JOptionPane.YES_NO_OPTION,     
                    JOptionPane.WARNING_MESSAGE,   
                    null,                          
                    options,                       
                    options[0]                     
            );
            if (opcao == JOptionPane.YES_OPTION) {
                bd.removeHorarioPorID(idHorario);
            }  
        }catch(HeadlessException | NumberFormatException e){
            System.out.println("Nenhum valor selecionado!");
        }
   
    }
    
    public void confirmarHorarioSelecionado(){
        HorarioBanco bd = new HorarioBanco();
        try{
            int selectedRow = view.getTabelaPendentes().getSelectedRow();
            int idHorario = Integer.parseInt(view.getTabelaPendentes().getValueAt(selectedRow, 0).toString());
            Object[] options = {"Sim", "Cancelar"};
            int opcao = JOptionPane.showOptionDialog(
                    null, 
                    "Deseja marcar esse horário?", 
                    "Confirmação de Remoção",      
                    JOptionPane.YES_NO_OPTION,     
                    JOptionPane.WARNING_MESSAGE,   
                    null,                          
                    options,                       
                    options[0]                     
            );
            if (opcao == JOptionPane.YES_OPTION) {
                bd.marcarHorario(idHorario);
            }  
        }catch(HeadlessException | NumberFormatException e){
            System.out.println("Nenhum valor selecionado!");
        }
    }
    
    public void removerHorarioSelecionadoPendentes(){
        HorarioBanco bd = new HorarioBanco();
        try{
            int selectedRow = view.getTabelaPendentes().getSelectedRow();
            int idHorario = Integer.parseInt(view.getTabelaPendentes().getValueAt(selectedRow, 0).toString());
            Object[] options = {"Sim", "Cancelar"};
            int opcao = JOptionPane.showOptionDialog(
                    null, 
                    "Deseja recusar esse horário?", 
                    "Confirmação de Remoção",      
                    JOptionPane.YES_NO_OPTION,     
                    JOptionPane.WARNING_MESSAGE,   
                    null,                          
                    options,                       
                    options[0]                     
            );
            if (opcao == JOptionPane.YES_OPTION) {
                bd.removeHorarioPorID(idHorario);
            }  
        }catch(HeadlessException | NumberFormatException e){
            System.out.println("Nenhum valor selecionado!");
        }
   
    }
    
    public void atualizaCamposConfirmados(){
        HorarioBanco bd = new HorarioBanco();
        int selectedRow = view.getTabelaConfirmados().getSelectedRow();
        int idHorario = Integer.parseInt(view.getTabelaConfirmados().getValueAt(selectedRow, 0).toString());
        Horario horarioId = bd.retornaHorarioPorID(idHorario);
        view.getjTextFieldNomeCliente().setText(horarioId.getCliente().getNome());
        view.getjTextFieldTelefoneCliente().setText(horarioId.getCliente().getTelefone());
        setarServicoNoComboBox(horarioId.getServico()); 
    }
    
    public void atualizaCamposPendentes(){
        HorarioBanco bd = new HorarioBanco();
        int selectedRow = view.getTabelaPendentes().getSelectedRow();
        int idHorario = Integer.parseInt(view.getTabelaPendentes().getValueAt(selectedRow, 0).toString());
        Horario horarioId = bd.retornaHorarioPorID(idHorario);
        view.getjTextFieldNomeCliente().setText(horarioId.getCliente().getNome());
        view.getjTextFieldTelefoneCliente().setText(horarioId.getCliente().getTelefone());
        setarServicoNoComboBox(horarioId.getServico()); 
    }
   
    public void setarComboBoxServico(){
        ServicoBanco banco =  new ServicoBanco();
        List <Servico> servicos = banco.retornaServicos();
        view.getjComboBoxServico().addItem(new Servico(0, "Selecione um serviço"));
        try {
            for(Servico servico : servicos){
                view.getjComboBoxServico().addItem(servico);
            }
        }catch (NullPointerException e) {
            System.out.println("Não existem serviços registrados.");
        }
        view.getjComboBoxServico().setEnabled(false);
    }
    
    public void setarServicoNoComboBox(Servico servicoSelecionado) {
        for (int i = 0; i < view.getjComboBoxServico().getItemCount(); i++){
            Servico servico = (Servico) view.getjComboBoxServico().getItemAt(i);
            if (servico.getId() == servicoSelecionado.getId()){
                view.getjComboBoxServico().setSelectedIndex(i);
                break;
            }
        }
    }
    
    public void implementarHorariosDisponiveis(){
        HorarioBanco bd = new HorarioBanco();
        Pessoa funcionarioSelecionado = view.getFuncionario();
        Servico servicoSelecionado = (Servico) view.getjComboBoxServico().getSelectedItem();

        
        if(funcionarioSelecionado == null || servicoSelecionado == null){
            view.getjLabelAviso().setText("Por favor, selecione um funcionário e um serviço.");
            return;
        }

        int id = funcionarioSelecionado.getId();

        
        Date dataSelecionada = view.getjSelecionaData().getDate();
        if (dataSelecionada == null) {
            view.getjLabelAviso().setText("Por favor, selecione uma data válida.");
            return; 
        }
       
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formato.format(dataSelecionada);
        
        int selectedRow = view.getTabelaConfirmados().getSelectedRow();
        int idHorario = Integer.parseInt(view.getTabelaConfirmados().getValueAt(selectedRow, 0).toString());
       
        List<String> horariosDisponiveis = bd.consultarHorariosDisponiveisFuncionario(dataFormatada, id, servicoSelecionado, idHorario);

       
        view.getjComboBoxHorario().removeAllItems();
        view.getjComboBoxHorario().addItem("Selecione um horário");

        if (horariosDisponiveis.isEmpty()){
            view.getjLabelAviso().setVisible(true);
        } else {
            for (String horario : horariosDisponiveis) {
                view.getjComboBoxHorario().addItem(horario);
            }
        }
    }
    
    
    public void editaHorario(){
        HorarioBanco bdHorario = new HorarioBanco();
        
        int selectedRow = view.getTabelaConfirmados().getSelectedRow();
        int idHorario = Integer.parseInt(view.getTabelaConfirmados().getValueAt(selectedRow, 0).toString());
        
        Servico servico = (Servico)(view.getjComboBoxServico().getSelectedItem());
        
        Date dataSelecionada = view.getjSelecionaData().getDate();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String data = formato.format(dataSelecionada);
        String horario = (String)view.getjComboBoxHorario().getSelectedItem();
        
        if(bdHorario.editarHorario(idHorario,servico, data, horario)){
            view.mostrarAviso("Horário editado");
        }else{
            view.mostrarAviso("Erro ao editar horário...");
        }
    }
    
    public void limpaHorariosPassados(){
        HorarioBanco bdHorario = new HorarioBanco();
        bdHorario.removerHorariosPassados();
    }
    
    
}
