
package Controller;

import Controller.Helper.ClienteHelper;
import View.ViewCliente;



/**
 *
 * @author pedro
 */
public class ClienteController {
    private final ViewCliente view;
    private final ClienteHelper helper;

    public ClienteController(ViewCliente view) {
        this.view = view;
        this.helper = new ClienteHelper(this.view);
    }
    
    public void mostrarHorario(int id){
        if(id != 0)
            helper.mostrarMensagemNoText(id);
    }
    
    
    
}
