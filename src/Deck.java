import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.System.*;
public class Deck {
    public class Card extends JComponent implements ActionListener, MouseListener{
        private int value;
        private int xPos,yPos,xSize,ySize;
        public Card(int val){
            super();
            value = val;
            xPos = -1; yPos = -1;
            xSize = 500; ySize = 1000;
            setLayout(null);
            addMouseListener(this);
            
        }
        public int getValue(){return value;}
        public String toString(){return value+"";}
        public int compareTo(Card c){
            if (value>c.getValue()){
                return 1;
            }else if (value<c.getValue()){
                return -1;
            }else{
                return 0;
            }
        }
        @Override
        public void paint(Graphics g){
            paintComponent(g);
        }
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            //g.fillRect(0, 0, 50, 100);
            if (xPos!=-1&&yPos!=-1){
                g.setFont(new Font("Arial",25,20));
                g.drawString(value+"",30,40);
            }else{
                g.fillRect(0, 0, WIDTH, HEIGHT);
            }  
        }
        public void setXPos(int x){xPos = x;}
        public void setYPos (int y){yPos = y;}
        public int getXPos(){return xPos;}
        public int getYPos(){return yPos;}
        public Dimension getPreferredSize() {return new Dimension(xSize, ySize);}
        public Dimension getMinimumSize() {return new Dimension(xSize, ySize );}
        public Dimension getMaximumSize() {return new Dimension(xSize , ySize );}
        public void mouseClicked(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        public void actionPerformed(ActionEvent e) {}
    }
    private ArrayList<Card>deck = new ArrayList<>();
    public Deck(){
        //deck.add(new Card(0));
        for(int i =0;i<5;i++){
            deck.add(new Card(-2));
            deck.add(new Card(0));
            deck.add(new Card(0));
            deck.add(new Card(0));
            deck.add(new Card(-1));
            deck.add(new Card(-1));
        }
        for (int i =1;i<13;i++){
            for (int j = 0;j<10;j++){
                deck.add(new Card(i));
            }
        }
        Collections.shuffle(deck);
        int xPos = 0; int yPos = 0;
        for (int i =0;i<deck.size();i++){
            deck.get(i).setXPos(xPos+=55);
            deck.get(i).setYPos(yPos);
        }
        setBounds();
    }
    public void setBounds(){
        for (int i =0;i<deck.size();i++){
            Card temp = deck.get(i);
            temp.setBounds(temp.getXPos(),temp.getYPos(),temp.getPreferredSize().width,temp.getPreferredSize().height);
            temp.setVisible(true);
            deck.set(i,temp);
        }
    }
    public void check(){
        out.print(deck);
    }
    public void paintAll(Graphics g){
        for(int i =0;i<deck.size();i++){
            deck.get(i).paint(g);
        }
        //g.fillRect(0, 0, 100, 100);
    }
    public ArrayList<Card>getCards(){
        return deck;
    }
}
