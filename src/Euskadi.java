import javax.swing.*;

public class Euskadi extends JScrollPane {
    public Inicio inicio;

    public Euskadi(Inicio inicio){
        setLayout(null);

        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    }

}
