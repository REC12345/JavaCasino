import java.util.ArrayList;

public class DeckOfCards 
{
    public static final String[][] globalDeck = {
        {"Color","Value","Suit"},
        {"Color","Value","Suit"}
    };

    //Variables
    private ArrayList<Integer> deck;
    private int deckSize;
    private int card;

    //Constructors
    public DeckOfCards()
    {
        deck = new ArrayList<>(52);
        deckSize = deck.size();
    }

    //Methods the modify the deck
    public void drawCard()
    {
        card = deck.get((int)(Math.random() * deckSize));
        deck.remove(card);
    }
    public void insertCard()
    {

    }
    public void dealHand()
    {

    }

/*
    //Methods that don't modify the deck
    public void shuffle()
    {

    }
    public ArrayList<Integer> getDeck()
    {
        return deck;
    }
    public ArrayList<Integer> getHand(char hand)
    {
        return deck;
    }
 
    public String getColor()
    {
        return "color";
    }
    public String getSuit()
    {
        return "suit";
    }
    public String getValue()
    {
        return "value";
    }
*/
}
