import java.util.ArrayList;

public class DeckOfCards 
{
    public static final String[][] globalDeck = {{"Color","Value","Suit"}};

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

//Methods
    public int drawCard()
    {
        card = deck.get((int)(Math.random() * deckSize));
        deck.remove(card);
        return card;
    }

    public String getColor()
    {
        return "color";
    }
    public String getSuit()
    {
        return "suit";
    }

    public ArrayList<Integer> getDeck()
    {
        return deck;
    }
}
