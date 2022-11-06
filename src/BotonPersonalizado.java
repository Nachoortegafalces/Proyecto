import javax.swing.*;
import java.awt.*;

public class BotonPersonalizado extends JButton {
    private boolean round;
    private Color colorFondo, colorPresionado;
    private int f, f1;

    //Constructor forma rectangulo bordes curvos
    public BotonPersonalizado(String rotulo, Color fon, Color pre, int i, int i1) {
        super(rotulo);
        f=i;
        f1=i1;
        round = false;
        colorFondo = fon;
        colorPresionado = pre;
        setContentAreaFilled(false);
    }

    @ Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(colorPresionado);
        } else {
            g.setColor(colorFondo);
        }
        g.fillRoundRect(0, 0, getSize().width - 1, getSize().height - 1, f, f1);

        super.paintComponent(g);
    }
    //Sobreescritura del borde
    @ Override
    public void paintBorder(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawRoundRect(0, 0, getSize().width - 1, getSize().height - 1, f, f1);
    }
}
