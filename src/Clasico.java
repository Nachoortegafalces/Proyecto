import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clasico extends JPanel {
    public Inicio inicio;
    public JButton madrid;
    public JButton catalunya;
    public JButton asturias;
    public JButton cantabria;
    public JButton galicia;
    public JButton valencia;
    public JButton murcia;
    public JButton andalucia;
    public JButton extremadura;
    public JButton leon;
    public JButton lamancha;
    public JButton navarra;
    public JButton euskadi;
    public JButton aragon;
    public JButton baleares;

    public Clasico(Inicio inicio){
        this.inicio=inicio;
        setLayout(null);

        madrid = new JButton("Madrid");
        madrid.setBorderPainted(false);
        madrid.setContentAreaFilled(false);
        madrid.setFocusable(false);
        madrid.setRolloverEnabled(true);
        madrid.setBounds(400,230,75,30);
        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPaneldos("madrid",inicio.getMadrid());
            }
        });
        add(madrid);

        catalunya = new JButton("Catalunya");
        catalunya.setBorderPainted(false);
        catalunya.setContentAreaFilled(false);
        catalunya.setFocusable(false);
        catalunya.setRolloverEnabled(true);
        catalunya.setBounds(700,130,150,30);
        catalunya.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPanel("catalunya",inicio.getCatalunya());
            }
        });
        add(catalunya);

        asturias = new JButton("Asturias");
        asturias.setBorderPainted(false);
        asturias.setContentAreaFilled(false);
        asturias.setFocusable(false);
        asturias.setRolloverEnabled(true);
        asturias.setBounds(250,25,150,30);
        asturias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPaneldos("asturias",inicio.getAsturias());
            }
        });
        add(asturias);

        cantabria = new JButton("Cantabria");
        cantabria.setBorderPainted(false);
        cantabria.setContentAreaFilled(false);
        cantabria.setFocusable(false);
        cantabria.setRolloverEnabled(true);
        cantabria.setBounds(360,30,130,30);
        cantabria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPaneldos("cantabria",inicio.getCantabria());
            }
        });
        add(cantabria);

        galicia = new JButton("Galicia");
        galicia.setBorderPainted(false);
        galicia.setContentAreaFilled(false);
        galicia.setFocusable(false);
        galicia.setRolloverEnabled(true);
        galicia.setBounds(150,70,75,30);
        galicia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPaneldos("galicia",inicio.getGalicia());
            }
        });
        add(galicia);

        valencia = new JButton("Valencia");
        valencia.setBorderPainted(false);
        valencia.setContentAreaFilled(false);
        valencia.setFocusable(false);
        valencia.setRolloverEnabled(true);
        valencia.setBounds(560,310,150,30);
        valencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPaneldos("valencia",inicio.getValencia());
            }
        });
        add(valencia);

        murcia = new JButton("Murcia");
        murcia.setBorderPainted(false);
        murcia.setContentAreaFilled(false);
        murcia.setFocusable(false);
        murcia.setRolloverEnabled(true);
        murcia.setBounds(545,400,75,30);
        murcia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPaneldos("murcia",inicio.getMurcia());
            }
        });
        add(murcia);

        andalucia = new JButton("Andalucia");
        andalucia.setBorderPainted(false);
        andalucia.setContentAreaFilled(false);
        andalucia.setFocusable(false);
        andalucia.setRolloverEnabled(true);
        andalucia.setBounds(325,450,150,30);
        andalucia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPaneldos("andalucia",inicio.getAndalucia());
            }
        });
        add(andalucia);

        extremadura = new JButton("Extremadura");
        extremadura.setBorderPainted(false);
        extremadura.setContentAreaFilled(false);
        extremadura.setFocusable(false);
        extremadura.setRolloverEnabled(true);
        extremadura.setBounds(225,310,150,30);
        extremadura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPaneldos("extremadura",inicio.getExtremadura());
            }
        });
        add(extremadura);

        leon = new JButton("C.Leon");
        leon.setBorderPainted(false);
        leon.setContentAreaFilled(false);
        leon.setFocusable(false);
        leon.setRolloverEnabled(true);
        leon.setBounds(350,140,75,30);
        leon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPaneldos("leon",inicio.getLeon());
            }
        });
        add(leon);

        lamancha = new JButton("C.La Mancha");
        lamancha.setBorderPainted(false);
        lamancha.setContentAreaFilled(false);
        lamancha.setFocusable(false);
        lamancha.setRolloverEnabled(true);
        lamancha.setBounds(400,300,150,30);
        lamancha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPaneldos("lamancha",inicio.getLamancha());
            }
        });
        add(lamancha);

        navarra = new JButton("Navarra");
        navarra.setBorderPainted(false);
        navarra.setContentAreaFilled(false);
        navarra.setFocusable(false);
        navarra.setRolloverEnabled(true);
        navarra.setBounds(500,75,125,30);
        navarra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPaneldos("galicia",inicio.getNavarra());
            }
        });
        add(navarra);

        euskadi = new JButton("Euskadi");
        euskadi.setBorderPainted(false);
        euskadi.setContentAreaFilled(false);
        euskadi.setFocusable(false);
        euskadi.setRolloverEnabled(true);
        euskadi.setBounds(455,40,125,30);
        euskadi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPaneldos("euskadi",inicio.getEuskadi());
            }
        });
        add(euskadi);

        aragon = new JButton("Aragon");
        aragon.setBorderPainted(false);
        aragon.setContentAreaFilled(false);
        aragon.setFocusable(false);
        aragon.setRolloverEnabled(true);
        aragon.setBounds(575,150,125,30);
        aragon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPaneldos("aragon",inicio.getAragon());
            }
        });
        add(aragon);

        baleares = new JButton("Baleares");
        baleares.setBorderPainted(false);
        baleares.setContentAreaFilled(false);
        baleares.setFocusable(false);
        baleares.setRolloverEnabled(true);
        baleares.setBounds(745,270,205,100);
        baleares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPaneldos("baleares",inicio.getBaleares());
            }
        });
        add(baleares);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon fondo = new ImageIcon(getClass().getResource("españa.jpg"));
        g.drawImage(fondo.getImage(), 0, 0, inicio.ANCHO, inicio.ALTURA, this);
    }
}
