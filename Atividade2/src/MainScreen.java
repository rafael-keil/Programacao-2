import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame {

    Footer footer = new Footer();
    DrawablePanel drawablePanel = new DrawablePanel(footer);
    ColorList colorList = new ColorList(drawablePanel);
    Menu menu = new Menu(drawablePanel, this);

    public MainScreen() throws HeadlessException {
        Container container = getContentPane();

        container.add(drawablePanel, BorderLayout.CENTER);
        container.add(colorList, BorderLayout.WEST);
        container.add(footer, BorderLayout.SOUTH);
        setJMenuBar(menu);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
