import javax.swing.*;

public class Murcia extends JScrollPane {
    public Inicio inicio;

    public Murcia(Inicio inicio){
        setLayout(null);

        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    }

}
