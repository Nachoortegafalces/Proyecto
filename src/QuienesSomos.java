import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuienesSomos extends JPanel {
    public Inicio inicio;
    public QuienesSomos(Inicio inicio ) {
        this.inicio = inicio;


        this.setLayout(null);
        this.setBackground(new Color(69, 178, 159));

    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon fondo = new ImageIcon(getClass().getResource("viaje.jpg"));
        g.drawImage(fondo.getImage(), 0, 0, inicio.ANCHO, inicio.ALTURA, this);
    }


}

