import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.System.*;
public class MainPanel extends JPanel{
    private Deck decks = new Deck();
    public MainPanel(){
        super();
        for (int i =0;i<decks.getCards().size();i++){
            add(decks.getCards().get(i));
        }
        setVisible(true);
        setLayout(null);
    }
    @Override
    public void paint(Graphics g){
        //decks.paintAll(g);
        paintComponents(g);
        repaint();
    }
}
