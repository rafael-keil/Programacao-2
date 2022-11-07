package telacolunas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaColunas extends JFrame {
    JTextArea txtArea = new JTextArea();
    JLabel footer = new JLabel("Rodapé...");
    JList<String> list;
    DefaultListModel<String> model = new DefaultListModel<>();
    MouseAdapter upperCaseClick = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            txtArea.setText(txtArea.getText().toUpperCase());
        }
    };
    MouseAdapter lowerCaseClick = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            txtArea.setText(txtArea.getText().toLowerCase());
        }
    };
    MouseAdapter jListClick = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            String selected = list.getSelectedValue();
            txtArea.append(selected);
            footer.setText(selected);
        }
    };
    ActionListener aboutClick = e -> JOptionPane.showMessageDialog(null, "Programação II");
    ActionListener addClick = e -> {
        String input = JOptionPane.showInputDialog(null, "Adicione uma palavra:");
        if (input != null){
            model.addElement(input);
        }
    };
    ActionListener exitClick = e -> System.exit(0);

    public void configScreen() {
        setTitle("Tela Colunas");
        Container container = getContentPane();
        JScrollPane scroll = new JScrollPane(txtArea);
        container.add(scroll, BorderLayout.CENTER);

        JPanel pnLeftFlow = new JPanel(new FlowLayout());
        JPanel pnLeftBts = new JPanel(new GridLayout(0, 1));
        JButton upper = new JButton("Maiúsculo");
        JButton lower = new JButton("Minusculo");
        upper.addMouseListener(upperCaseClick);
        lower.addMouseListener(lowerCaseClick);
        pnLeftBts.add(upper);
        pnLeftBts.add(lower);
        pnLeftFlow.add(pnLeftBts);
        container.add(pnLeftFlow, BorderLayout.WEST);

        model.addElement("um");
        model.addElement("dois");
        model.addElement("tres");
        model.addElement("quatro");
        list = new JList<>(model);
        container.add(list, BorderLayout.EAST);
        list.addMouseListener(jListClick);

        container.add(footer, BorderLayout.SOUTH);

        JMenu menuArchive = new JMenu("Arquivo");
        JMenuItem itemAdd = new JMenuItem("Adicionar");
        JMenuItem itemExit = new JMenuItem("Sair");
        menuArchive.add(itemAdd);
        menuArchive.add(itemExit);
        itemAdd.addActionListener(addClick);
        itemExit.addActionListener(exitClick);

        JMenu menuHelp = new JMenu("Ajuda");
        JMenuItem itemAbout = new JMenuItem("Sobre");
        menuHelp.add(itemAbout);
        itemAbout.addActionListener(aboutClick);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuArchive);
        menuBar.add(menuHelp);
        setJMenuBar(menuBar);

        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
