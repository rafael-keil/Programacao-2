import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Footer extends JLabel {

    private static final String SAVED = "Imagem Original";
    private static final String NOT_SAVED = "Imagem Modificada";

    public Footer() {
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setText(SAVED);
    }

    public void setSaved() {
        setText(SAVED);
    }

    public void setNotSaved() {
        setText(NOT_SAVED);
    }
}
