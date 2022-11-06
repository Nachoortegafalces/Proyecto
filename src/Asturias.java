import javax.swing.*;
import java.awt.*;

public class Asturias extends JScrollPane{
    public Inicio inicio;

    public Asturias(Inicio inicio){
        setLayout(null);

        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    }

}

