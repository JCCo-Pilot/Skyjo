import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.System.*;
public class MainPanel extends JPanel{
    private Deck decks = new Deck();
    public MainPanel(){
        super();
        setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        decks.paintAll(g);
    }
}
