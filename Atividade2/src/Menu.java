import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class Menu extends JMenuBar {

    DrawablePanel drawablePanel;
    MainScreen mainScreen;
    ActionListener saveClick = e -> {
        JFileChooser fileChooser = new JFileChooser();
        int saveDialog = fileChooser.showSaveDialog(null);
        if (saveDialog == JFileChooser.APPROVE_OPTION) {
            try {
                drawablePanel.save(fileChooser.getSelectedFile());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    };
    ActionListener loadClick = e -> {
        JFileChooser fileChooser = new JFileChooser();
        int openDialog = fileChooser.showOpenDialog(null);
        if (openDialog == JFileChooser.APPROVE_OPTION) {
            try {
                drawablePanel.load(fileChooser.getSelectedFile());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    };
    ActionListener aboutClick = e -> JOptionPane.showMessageDialog(null, "Programação II");
    ActionListener exitClick = e -> dispatchEvent(new WindowEvent(mainScreen, WindowEvent.WINDOW_CLOSING));

    public Menu(DrawablePanel drawablePanel, MainScreen mainScreen) {
        JMenu menuArchive = new JMenu("Arquivo");
        JMenuItem itemSave = new JMenuItem("Salvar");
        JMenuItem itemLoad = new JMenuItem("Carregar");
        JMenuItem itemExit = new JMenuItem("Sair");
        menuArchive.add(itemSave);
        menuArchive.add(itemLoad);
        menuArchive.add(itemExit);
        itemSave.addActionListener(saveClick);
        itemLoad.addActionListener(loadClick);
        itemExit.addActionListener(exitClick);

        JMenu menuHelp = new JMenu("Ajuda");
        JMenuItem itemAbout = new JMenuItem("Sobre");
        menuHelp.add(itemAbout);
        itemAbout.addActionListener(aboutClick);

        add(menuArchive);
        add(menuHelp);

        this.drawablePanel = drawablePanel;
        this.mainScreen = mainScreen;
    }
}