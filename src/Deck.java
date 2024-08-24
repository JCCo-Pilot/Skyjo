import java.util.*;
import static java.lang.System.*;
public class Deck {
    public class Card{
        private int value;
        public Card(int val){value = val;}
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
    }
    private ArrayList<Card>deck = new ArrayList<>();
    public Deck(){
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
        
    }
    public void check(){
        out.print(deck);
    }
}
