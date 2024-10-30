import java.util.ArrayList;

public class DeckOfCards 
{
    private ArrayList<Integer> cardDeck;
    private int numCards;

    public DeckOfCards(int nc)
    {
        numCards = nc;
        cardDeck = new ArrayList<>();

        for (int i = 0; i < numCards; i++)
        {
            cardDeck.add(i);
        }
    }

    public int drawCard()
    {
        int card = 0;
        return card;
    }


}
