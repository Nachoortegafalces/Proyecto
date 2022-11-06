import javax.swing.*;

public class Lamancha extends JScrollPane {
    public Inicio inicio;

    public Lamancha(Inicio inicio){
        setLayout(null);

        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    }

}
