
import java.util.Arrays;


public class Blackjack 
{
//Variables
    private double balance;
    private double payout;
    private int[] playerHand;
    private int[] dealerHand;
    private int playerTotal;
    private int dealerTotal;
    private int playersHits;
    private int dealersHits;

//Constructors
    public Blackjack(double b)
    {
        balance = b;
        payout = 0.0;
        playerHand = new int[10];
        dealerHand = new int[10];
        playerTotal = 0;
        dealerTotal = 0;
        playersHits = 0;
        dealersHits = 0;
    }
    public Blackjack()
    {
        balance = 0.0;
        payout = 0.0;
        playerHand = new int[10];
        dealerHand = new int[10];
        playerTotal = 0;
        dealerTotal = 0;
        playersHits = 0;
        dealersHits = 0;
    }

//Methods(Game actions)
    public String getPlayerHand()
    {
        return (Arrays.toString(playerHand));
    }
    public String getDealerHand()
    {
        return (Arrays.toString(dealerHand));
    }

    public int getPlayerTotal()
    {
        return playerTotal;
    }
    public int getDealerTotal()
    {
        return dealerTotal;
    }

    public void playerHit()
    {
        playerHand[playersHits] = (int)(Math.random() * 14);
        playerTotal += playerHand[playersHits];
        playersHits++;
    }
    public void dealerHit()
    {
        dealerHand[dealersHits] = (int)(Math.random() * 14);
        dealerTotal += dealerHand[dealersHits];
        dealersHits++;
    }

//getWinner and toString
    public String getWinner()
    {
        String winner;
        if((playerTotal==dealerTotal)||((playerTotal>21)&&(dealerTotal>21)))
        {
            winner = "Tie! Nobody wins...";
            payout = 0;
        }
        else
        {
            if((playerTotal>dealerTotal)&&(playerTotal<=21))
            {
                winner = "Player Wins!";
                balance += balance;
                payout = balance;
            }
            else
            {
                winner = "Dealer Wins!  Better luck next time.";
                balance = 0;
                payout = -1*balance;
            }
        }
        return winner;
    }
    public String toString()
    {
        return "Payout: " + payout + "$\nFinal Balance: " + balance + "$";
    }
}
