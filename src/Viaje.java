import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Viaje extends JPanel {
    public JButton btnclasico;
    public JButton btnsatellite;

    public Inicio inicio;

    public Viaje(Inicio inicio){
        this.inicio = inicio;

        btnclasico = new BotonPersonalizado("Viaje Clasico", Color.WHITE,Color.LIGHT_GRAY,150,150);
        btnclasico.setBounds(250,200,150,150);


        btnsatellite = new BotonPersonalizado("Viaje Satelite",Color.WHITE,Color.LIGHT_GRAY,150,150);
        btnsatellite.setBounds(540,200,150,150);


        this.setLayout(null);
        this.setBackground(new Color(69,178,159));
        this.add(btnclasico);
        this.add(btnsatellite);


        btnclasico.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                inicio.mostrarPanel("clasico", inicio.getClasico());
            }

        });

        btnsatellite.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                inicio.mostrarPanel("satellite", inicio.getSatellite());

            }
        });

    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon fondo = new ImageIcon(getClass().getResource("viaje.jpg"));
        g.drawImage(fondo.getImage(), 0, 0, inicio.ANCHO, inicio.ALTURA, this);
    }


}