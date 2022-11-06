import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro extends JPanel {
    public Inicio inicio;
    public JTextField nombre;
    public JTextField correo;
    public JPasswordField contraseña;
    public JPasswordField confirmarContraseña;
    public JButton registrarse;
    public JButton volver;
    public Registro(Inicio inicio){
        this.inicio=inicio;
        setLayout(null);

        nombre = new JTextField("");
        correo = new JTextField("");
        contraseña = new JPasswordField("");
        confirmarContraseña = new JPasswordField("");
        registrarse = new JButton("REGISTRARSE");
        volver = new JButton("volver");

        volver.setBounds(850,50,80,35);
        volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPanel("login",inicio.getLogin());
            }
        });
        add(volver);

        nombre.setBounds(250,110,200,40);
        correo.setBounds(250,210,200,40);
        contraseña.setBounds(250,310,200,40);
        confirmarContraseña.setBounds(250,410,200,40);
        registrarse.setBounds(740,450,150,50);

        registrarse.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (contraseña.getText().equals(confirmarContraseña.getText())){
                    JOptionPane.showMessageDialog(null,"cuenta creada");
                    inicio.mostrarPanel("login",inicio.getLogin());
                    System.out.println(contraseña.getText());
                }
                else {
                    JOptionPane.showMessageDialog(null,"las contraseñas no coinciden");
                }
            }
        });

        add(nombre);
        add(correo);
        add(contraseña);
        add(confirmarContraseña);
        add(registrarse);

    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        ImageIcon fondo = new ImageIcon(getClass().getResource("tierra.jpg"));
        g.drawImage(fondo.getImage(), 0, 0, inicio.ANCHO, inicio.ALTURA, this);
        g.setFont(new Font("Tahoma", Font.BOLD, 20));
        g.drawString("nombre de usuario:", 50, 100);
        g.drawString("correo electrónico:", 50, 200);
        g.drawString("contraseña:", 50, 300);
        g.drawString("repetir contraseña:", 50, 400);
        //ImageIcon titulo = new ImageIcon(getClass().getResource("titulo.png"));
        //g.drawImage(titulo.getImage(), 620, 200, 300, 150, this);

    }
}
