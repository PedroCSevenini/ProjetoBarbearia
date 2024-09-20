package Components;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class comboBoxProfissionais extends JFrame {
    private static final int SPACING = 10; // Espaçamento entre os componentes

    private JButton botaoProfissionais;
    private JComboBox<String> comboBoxProfissionais;
    private GroupLayout layout;

    public comboBoxProfissionais() {
        // ... (inicialização da janela e outros componentes)

        initComponents();
        createLayout();
        addListeners();
    }

    private void initComponents() {
        botaoProfissionais = new JButton("Profissionais");
        comboBoxProfissionais = new JComboBox<>(new String[]{"Profissional 1", "Profissional 2"});
        comboBoxProfissionais.setVisible(false);
    }

    private void createLayout() {
        layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        GroupLayout.SequentialGroup group = layout.createSequentialGroup()
                .addComponent(botaoProfissionais)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, SPACING, Short.MAX_VALUE)
                .addComponent(comboBoxProfissionais);

        layout.setHorizontalGroup(group);
        layout.setVerticalGroup(group);
    }

    private void addListeners() {
        botaoProfissionais.addActionListener(e -> {
            toggleComboBoxVisibility();
        });
    }

    private void toggleComboBoxVisibility() {
        comboBoxProfissionais.setVisible(!comboBoxProfissionais.isVisible());
        invalidate();
        validate();
        repaint();
    }
}