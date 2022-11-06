import javax.swing.*;

public class Aragon extends JScrollPane {
    public Inicio inicio;

    public Aragon(Inicio inicio){
        setLayout(null);

        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    }

}
