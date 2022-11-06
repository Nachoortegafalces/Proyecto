import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Catalunya extends JPanel{
    public Inicio inicio;
    public JButton boton1;
    public JButton boton2;
    public JButton boton3;
    public JButton boton4;

    public JPanel panelCentral;
    public JPanel cabecera;
    public JPanel panel1;
    public JPanel panel2;
    public JPanel panel3;
    public JPanel panel4;

    public Catalunya(Inicio inicio){
        this.inicio=inicio;

        setLayout(new BorderLayout());
        panelCentral = new JPanel(new CardLayout());
        cabecera = new JPanel();
        panel1 = new JPanel(null);
        panel2 = new JPanel(null);
        panel3 = new JPanel(null);
        panel4 = new JPanel(null);
        cabecera.setBackground(new Color(69, 198, 159));

        boton1 = new JButton("HOTELES");
        boton2 = new JButton("VUELOS");
        boton3 = new JButton("ACTIVIDADES");
        boton4 = new JButton("PRECIO");

        JScrollPane sc = new JScrollPane(panel1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        panel1.add(sc);

        boton1.setBounds(100,50,100,50);
        boton2.setBounds(300,50,100,50);
        boton3.setBounds(500,50,100,50);
        boton4.setBounds(700,50,100,50);

        add(cabecera, BorderLayout.NORTH);
        cabecera.add(boton1);
        cabecera.add(boton2);
        cabecera.add(boton3);
        cabecera.add(boton4);

        panel1.setBackground(Color.GREEN);
        panel2.setBackground(Color.BLACK);
        panel3.setBackground(Color.ORANGE);
        panel4.setBackground(Color.RED);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("hoteles",getPanel1());
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("vuelos",getPanel2());
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("actividades",getPanel3());
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPanel("precio",getPanel4());
            }
        });

        add(panelCentral, BorderLayout.CENTER);
        panelCentral.add(panel1,"hoteles");
        panelCentral.add(panel2,"vuelos");
        panelCentral.add(panel3,"actividades");
        panelCentral.add(panel4,"precio");


        JTextField tx = new JTextField("hola");





        //this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    }
    public void mostrarPanel(String panel, JPanel p) {
        CardLayout cl = (CardLayout) panelCentral.getLayout();
        cl.show(panelCentral, panel);
        p.requestFocus();
    }
    public JPanel getPanel1(){return panel1;}
    public JPanel getPanel2(){return panel2;}
    public JPanel getPanel3(){return panel3;}
    public JPanel getPanel4(){return panel4;}

}

