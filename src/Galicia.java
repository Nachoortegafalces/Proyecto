import javax.swing.*;
import java.awt.*;

public class Galicia extends JScrollPane{
    public Inicio inicio;

    public Galicia(Inicio inicio){
        setLayout(null);

        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    }

}

