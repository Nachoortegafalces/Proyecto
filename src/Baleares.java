import javax.swing.*;

public class Baleares extends JScrollPane {
    public Inicio inicio;

    public Baleares(Inicio inicio){
        this.inicio=inicio;
        setLayout(null);
        setSize(1000,2000);

        JButton boton1 = new JButton("HOLA");
        JButton boton2 = new JButton("adios");
        boton1.setBounds(200,100,100,50);
        boton2.setBounds(200,1200,100,50);
        add(boton1);
        add(boton2);

        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    }

}