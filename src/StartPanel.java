import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.System.*;
public class StartPanel extends JPanel implements ActionListener{
    private JButton start = new JButton("Start");
    private JButton add = new JButton("Add 1 Player");
    private JButton subtract = new JButton("Subtract 1 Player");
    private ArrayList<JButton>buttons = new ArrayList<>();
    private JTextField counter = new JTextField();
    private int numPlayers = 2;
    public StartPanel(){
        setLayout(null);
        start.setBounds(720,600,150,50);
        start.setVisible(true);
        add(start);
        add.setBounds(920,600,150,50);
        add.setVisible(true);
        add(add);
        subtract.setBounds(520,600,150,50);
        add(subtract);
        buttons.add(start); buttons.add(add); buttons.add(subtract);
        for (int i =0;i<buttons.size();i++){
            buttons.get(i).addActionListener(this);
        }
        checkVisible();
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){

    }
    public void checkVisible(){
        if (numPlayers==2){
            subtract.setVisible(false);
        }else{
            subtract.setVisible(true);
        }
        if (numPlayers==8){
            add.setVisible(false);
        }else{
            add.setVisible(true);
        }
    }
}
