import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RecuperarContraseña extends JPanel {
    public Inicio inicio;
    public JTextField usuario;
    public JTextField correo;
    public JButton hecho;
    public JButton reenviar;

    public RecuperarContraseña(Inicio inicio){
        this.inicio = inicio;
        setLayout(null);
        usuario = new JTextField();
        correo = new JTextField();
        hecho = new JButton("Hecho");
        reenviar = new JButton("ENVIAR CORREO");
        hecho.setBounds(800,50,100,40);
        reenviar.setBounds(700,280,150,50);
        hecho.setBackground(Color.WHITE);
        reenviar.setBackground(Color.WHITE);
        hecho.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0){
                hecho.setForeground(Color.GREEN);
                //hecho.setText("Hecho");
                //System.out.println("Raton entra");

            }
            @Override
            public void mouseExited(MouseEvent e){
               hecho.setForeground(Color.BLACK);
                //hecho.setText("Hecho");
                //System.out.println("Raton sale");


            }


        });
        hecho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPanel("login",inicio.getLogin());
            }
        });
        add(hecho);
        add(reenviar);
        usuario.setBounds(400,200,200,50);
        correo.setBounds(400,400,200,50);
        add(usuario);
        add(correo);

    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        ImageIcon fondo = new ImageIcon(getClass().getResource("recuperacion.jpg"));
        g.drawImage(fondo.getImage(), 0, 0, inicio.ANCHO, inicio.ALTURA, this);
        g.setFont(new Font("Tahoma", Font.BOLD, 20));
        g.drawString("usuario", 450, 175);
        g.drawString("correo electronico", 410, 375);
    }
}
