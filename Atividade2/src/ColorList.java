import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class ColorList extends JPanel {

    DrawablePanel drawablePanel;
    ActionListener changeColor = e -> {
        AbstractButton button = (AbstractButton) e.getSource();
        drawablePanel.setColor(button.getBackground());
    };

    public ColorList(DrawablePanel drawablePanel) {
        this.drawablePanel = drawablePanel;
        setLayout(new GridLayout(9, 1));
        setBorder(new EmptyBorder(5, 5, 5, 5));

        Color[] colorList = {
                Color.black,
                Color.blue,
                Color.green,
                Color.pink,
                Color.orange,
                Color.red,
                Color.yellow,
                Color.white
        };
        for (Color color :
                colorList) {
            JButton bt = new JButton("...");
            bt.setBackground(color);
            bt.setSize(1000, 50);
            bt.addActionListener(changeColor);
            add(bt);
        }
    }
}

