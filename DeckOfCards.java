import java.util.ArrayList;

public class DeckOfCards 
{
    public static final int[] globalDeck = {
        101,102,103,104,105,106,107,108,109,110,111,112,113,
        201,202,203,204,205,206,207,208,209,210,211,212,213,
        301,302,303,304,305,306,307,308,309,310,311,312,313,
        401,402,403,404,405,406,407,408,409,410,411,412,413,
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
