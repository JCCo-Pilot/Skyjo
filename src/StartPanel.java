import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.System.*;
public class StartPanel extends JPanel implements ActionListener{
    private JButton start = new JButton("Start");
    private JButton add = new JButton();
    private JButton subtract = new JButton();
    private int numPlayers = 0;
    public StartPanel(){
        setLayout(null);
        start.setBounds(100,100,150,50);
        start.setVisible(true);
        add(start);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

    }
}
