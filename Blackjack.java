
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

//Constructors
    public Blackjack(double b)
    {
        balance = b;
        payout = 0.0;
        playerHand = new int[10];
        dealerHand = new int[10];
        playerTotal = 0;
        dealerTotal = 0;
    }
    public Blackjack()
    {
        balance = 0.0;
        payout = 0.0;
        playerHand = new int[10];
        dealerHand = new int[10];
        playerTotal = 0;
        dealerTotal = 0;
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

    public void playerHit(int i)
    {
        playerHand[i] = (int)(Math.random() * 14);
        playerTotal += playerHand[i];
    }
    public void dealerHit(int j)
    {
        dealerHand[j] = (int)(Math.random() * 14);
        dealerTotal += dealerHand[j];
    }

//getWinner and toString
    public String getWinner()
    {
        String winner;
        if(playerTotal==dealerTotal)
        {
            winner = "Tie! Nobody wins...";
        }
        else
        {
            if(playerTotal>dealerTotal)
            {
                winner = "Player Wins!";
            }
            else
            {
                winner = "Dealer Wins!  Better luck next time.";
            }
        }
        return winner;
    }
    public String toString()
    {
        return "Payout: " + payout + "$\nFinal Balance: " + balance + "$";
    }
}
