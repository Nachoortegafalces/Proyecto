import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JPanel {
    public Inicio inicio;

    public BotonPersonalizado comenzar;
    public JButton registrarse;
    public JButton recuperar;
    public JButton visualizar;

    public JLabel txtUsuario;
    public JLabel txtContraseña;
    public JLabel txtBienvenido;

    public RoundJTextField usuario;
    public JTextField contraseña;

    public TextPrompt placeholder1;
    public TextPrompt placeholder2;

    //Para localizar el recuadro blanco
    public final int X = 200;
    public final int Y = 50;

    public int contraseñaincorrecta = 0;


    public Login(Inicio inicio) {

        this.inicio = inicio;
        setLayout(null);


        txtBienvenido = new JLabel("Bienvenido de nuevo");
        txtBienvenido.setBounds(X + 230,Y,400,300);
        txtBienvenido.setFont(new Font("Calibri", 1, 20));

        txtUsuario = new JLabel("Usuario");
        txtUsuario.setBounds(X + 200,Y+ 100,180,180);
        txtUsuario.setFont(new Font("Calibri", 0, 16));

        txtContraseña = new JLabel("Contraseña");
        txtContraseña.setBounds(X + 200,Y + 170,180,180);
        txtContraseña.setFont(new Font("Calibri", 0, 16));

        usuario = new RoundJTextField(30);
        usuario.setForeground(new Color(150,150,150));
        usuario.setBorder(null);
        usuario.setBackground(new Color(244,244,244));
        usuario.setBounds(X + 180, Y + 200, 300, 35);
        usuario.setFont(new Font("Calibri", 0, 12));
        TextPrompt placeholder1 = new TextPrompt(" Introduce tu usuario", usuario, TextPrompt.Show.ALWAYS);

        contraseña = new JPasswordField(30);
        contraseña.setForeground(new Color(150,150,150));
        contraseña.setBorder(null);
        contraseña.setBackground(new Color(244,244,244));
        contraseña.setBounds(X + 180, Y + 270, 300, 35);
        contraseña.setFont(new Font("Calibri", 0, 12));
        TextPrompt placeholder2 = new TextPrompt(" Introduce tu contraseña", contraseña, TextPrompt.Show.ALWAYS);


        visualizar = new JButton();
        visualizar.setBounds(X + 485,Y + 280,26,26);
        visualizar.setBackground(new Color(244,244,244));
        visualizar.setBorder(null);
        add(visualizar);

        /*
        visualizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0){

                //System.out.println("hola");

            }

        });*/

        visualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("entra");
                //aqui meter que se vea la contraseña
            }
        });


        comenzar = new BotonPersonalizado("Iniciar sesion",new Color(100,180,140),Color.BLACK,20,20);
        comenzar.setBounds(X + 260, Y + 340, 120, 40);
        comenzar.setFont(new Font("Calibri", 1, 12));
        comenzar.setBorderPainted(false);
        add(comenzar);

        comenzar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0){
                comenzar.setForeground(new Color(255,255,255));


            }
            @Override
            public void mouseExited(MouseEvent e){
                comenzar.setForeground(new Color(0,0,0));



            }
        });
        comenzar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //if (usuario.getText().equals("gonzalo"))
                inicio.mostrarPanel("viaje", inicio.getViaje());
               /* else{
                    //JOptionPane.showMessageDialog(null,"usuario o contraseña incorrectos");
                    recuperar.setVisible(true);
                    contraseñaincorrecta = 1;
                    repaint();
                }*/
            }
        });

        registrarse = new JButton("¿No tienes cuenta?");
        registrarse.setBorderPainted(false);
        registrarse.setForeground(new Color(150,150,150));
        registrarse.setFont(new Font("Calibri", 0, 12));
        registrarse.setContentAreaFilled(false);
        registrarse.setFocusable(false);
        registrarse.setRolloverEnabled(true);
        registrarse.setBounds(420, Y + 425, 200, 30);
        add(registrarse);

        registrarse.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0){
                registrarse.setForeground(new Color(50,50,50));
                //hecho.setText("Hecho");
                //System.out.println("Raton entra");

            }
            @Override
            public void mouseExited(MouseEvent e){
                registrarse.setForeground(new Color(150,150,150));
                //hecho.setText("Hecho");
                //System.out.println("Raton sale");


            }
        });
        registrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPanel("registro", inicio.getRegistro());
            }
        });

        recuperar = new JButton("¿Se te ha olvidado la contraseña?");
        recuperar.setForeground(new Color(150,150,150)); //AQUI CABIAS COLOR DE TEXTO DE BOTON
        recuperar.setFont(new Font("Calibri", 0, 12));
        recuperar.setVisible(true);
        recuperar.setBorderPainted(false);
        recuperar.setContentAreaFilled(false);
        recuperar.setFocusable(false);
        recuperar.setRolloverEnabled(true);
        recuperar.setBounds(400,Y + 395,250,30);

        recuperar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio.mostrarPanel("recuperarContraseña",inicio.getRecuperarContraseña());
            }
        });
        add(recuperar);

        recuperar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent arg0){
                recuperar.setForeground(new Color(50,50,50));

            }
            @Override
            public void mouseExited(MouseEvent e){
                recuperar.setForeground(new Color(150,150,150));

            }
        });

        add(txtBienvenido);
        add(txtUsuario);
        add(txtContraseña);
        add(usuario);
        add(contraseña);
        //add(viewcnt);

        this.setBackground(new Color(169,233,164));
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon fondo = new ImageIcon(getClass().getResource("fondo.png"));
        g.drawImage(fondo.getImage(), X, Y, 600, 500, this);

        ImageIcon titulo = new ImageIcon(getClass().getResource("logo.png"));
        g.drawImage(titulo.getImage(), X + 250, Y - 50, 150, 150, this);

        ImageIcon candado = new ImageIcon(getClass().getResource("candado.png"));
        g.drawImage(candado.getImage(), X + 180, Y + 250, 16, 16, this);

        ImageIcon usuario = new ImageIcon(getClass().getResource("usuario.png"));
        g.drawImage(usuario.getImage(), X + 180, Y + 180, 16, 16, this);
        //ImageIcon ojoabierto = new ImageIcon(getClass().getResource("ojoabierto.png"));
        //g.drawImage(ojoabierto.getImage(), X + 485,Y + 320, 26, 26, this);
        //ImageIcon ojocerrado = new ImageIcon(getClass().getResource("ojocerrado.png"));
        //g.drawImage(ojocerrado.getImage(), X + 485,Y + 350, 26, 26, this);

        g.setColor(new Color(100,180,140));
        g.drawLine(380, 355, 680, 355);
        g.drawLine(380, 285, 680, 285);


        if(contraseñaincorrecta==1) {
            g.setColor(Color.RED);
            g.setFont(new Font("Aldhabi", Font.BOLD, 10));
            g.drawString("Contraseña incorrecta",380,370);
        }

    }
}