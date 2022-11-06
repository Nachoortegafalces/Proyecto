import javax.swing.*;
import java.awt.*;

public class Inicio extends JFrame {
    public Login login;
    public Registro registro;
    public RecuperarContraseña recuperarContraseña;
    public Viaje viaje;
    public Clasico clasico;
    public Satellite satellite;
    public Madrid madrid;
    public Catalunya catalunya;
    public Asturias asturias;
    public Cantabria cantabria;
    public Galicia galicia;
    public Valencia valencia;
    public Murcia murcia;
    public Andalucia andalucia;
    public Extremadura extremadura;
    public Leon leon;
    public Lamancha lamancha;
    public Navarra navarra;
    public Euskadi euskadi;
    public Aragon aragon;
    public Baleares baleares;


    public JPanel pnlCentral;
    public final static int ALTURA = 600;
    public final static int ANCHO = 1000;


    public static void main(String[] args) {
        new Inicio();

    }

    public Inicio() {

        login = new Login(this);
        registro = new Registro(this);
        recuperarContraseña=new RecuperarContraseña(this);
        viaje = new Viaje(this);
        clasico = new Clasico(this);
        satellite = new Satellite(this);
        madrid =new Madrid(this);
        catalunya =new Catalunya(this);
        asturias =new Asturias(this);
        cantabria =new Cantabria(this);
        galicia =new Galicia(this);
        valencia =new Valencia(this);
        murcia =new Murcia(this);
        andalucia =new Andalucia(this);
        extremadura =new Extremadura(this);
        leon =new Leon(this);
        lamancha =new Lamancha(this);
        navarra =new Navarra(this);
        euskadi =new Euskadi(this);
        aragon = new Aragon(this);
        baleares = new Baleares(this);



        setLayout(new BorderLayout());
        pnlCentral = new JPanel(new CardLayout());


        pnlCentral.add(login, "login");
        pnlCentral.add(registro, "registro");
        pnlCentral.add(recuperarContraseña,"recuperarContraseña");
        pnlCentral.add(viaje, "viaje");
        pnlCentral.add(clasico, "clasico");
        pnlCentral.add(satellite, "satellite");
        pnlCentral.add(madrid,"madrid");
        pnlCentral.add(catalunya,"catalunya");
        pnlCentral.add(asturias,"asturias");
        pnlCentral.add(cantabria,"cantabria");
        pnlCentral.add(galicia,"galicia");
        pnlCentral.add(valencia,"valencia");
        pnlCentral.add(murcia,"murcia");
        pnlCentral.add(andalucia,"andalucia");
        pnlCentral.add(extremadura,"extremadura");
        pnlCentral.add(leon,"leon");
        pnlCentral.add(lamancha,"lamancha");
        pnlCentral.add(navarra,"navarra");
        pnlCentral.add(euskadi,"euskadi");
        pnlCentral.add(aragon,"aragon");
        pnlCentral.add(baleares,"baleares");


        setTitle("www.satellite.com");
        setSize(ANCHO, ALTURA);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(pnlCentral, BorderLayout.CENTER);
        setVisible(true);

    }

    public void mostrarPanel(String panel, JPanel p) {
        CardLayout cl = (CardLayout) pnlCentral.getLayout();
        cl.show(pnlCentral, panel);
        p.requestFocus();
    }
    public void mostrarPaneldos(String panel, JScrollPane p) {
        CardLayout cl = (CardLayout) pnlCentral.getLayout();
        cl.show(pnlCentral, panel);
        p.requestFocus();
    }

    public Login getLogin() {
        return login;
    }

    public Registro getRegistro() {
        return registro;
    }
    public RecuperarContraseña getRecuperarContraseña() {return recuperarContraseña;}

    public Viaje getViaje() {
        return viaje;
    }

    public Clasico getClasico() {
        return clasico;
    }

    public Satellite getSatellite() {
        return satellite;
    }

    public Madrid getMadrid() { return madrid; }
    public Catalunya getCatalunya() { return catalunya; }
    public Asturias getAsturias() { return asturias; }
    public Cantabria getCantabria() { return cantabria; }
    public Galicia getGalicia() { return galicia; }
    public Valencia getValencia() { return valencia; }
    public Murcia getMurcia() { return murcia; }
    public Andalucia getAndalucia() { return andalucia; }
    public Extremadura getExtremadura() { return extremadura; }
    public Leon getLeon() { return leon; }
    public Lamancha getLamancha() { return lamancha; }
    public Navarra getNavarra() { return navarra; }
    public Euskadi getEuskadi() { return euskadi; }
    public Aragon getAragon() { return aragon; }
    public Baleares getBaleares() { return baleares; }

}

