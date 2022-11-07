import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DrawablePanel extends JPanel {

    Footer footer;
    private Color color = Color.black;
    private BufferedImage paintImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
    ComponentAdapter resize = new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent e) {
            printImage(paintImage);
            footer.setNotSaved();
        }
    };
    MouseAdapter draw = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            super.mouseDragged(e);
            draw(e.getX(), e.getY());
        }
    };

    public DrawablePanel(Footer footer) {
        clearPaint(paintImage);
        addComponentListener(resize);
        addMouseListener(draw);
        addMouseMotionListener(draw);
        this.footer = footer;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(paintImage, 0, 0, null);
    }

    public void save(File file) throws IOException {
        ImageIO.write(paintImage, "jpg", file);
        footer.setSaved();
    }

    public void load(File file) throws IOException {
        printImage(ImageIO.read(file));
        repaint();
        footer.setSaved();
    }

    private void draw(int x, int y) {
        Graphics g = paintImage.createGraphics();
        g.setColor(color);
        g.fillRect(x, y, 5, 5);
        g.dispose();
        repaint();
        footer.setNotSaved();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    private void clearPaint(BufferedImage image) {
        Graphics2D g = image.createGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, image.getWidth(), image.getHeight());
        g.dispose();
    }

    private void printImage(BufferedImage image) {
        BufferedImage newPaint = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        clearPaint(newPaint);

        Graphics2D g = newPaint.createGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();

        paintImage = newPaint;
    }
}