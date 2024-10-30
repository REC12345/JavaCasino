
import java.util.Arrays;
import java.util.Scanner;

public class Blackjack 
{
//Variables and Scanner
    private double balance;
    private double payout;
    private int[] playerHand;
    private int[] dealerHand;
    private int playerTotal;
    private int dealerTotal;
    private int playersHits;
    private int dealersHits;
    private String winner;
    private String hit;

    Scanner theDealer = new Scanner(System.in);

//Constructors
    public Blackjack(double b)
    {
        balance = b;
        playerHand = new int[10];
        dealerHand = new int[10];
        playerTotal = 0;
        dealerTotal = 0;
        playersHits = 0;
        dealersHits = 0;
        hit = "";
    }

//Methods(Game actions)
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

    public void dealCards()
    {
        System.out.println("Welcome to BlackJack!\n");

        playerHit();
        playerHit();
        System.out.println("Players Hand: " + Arrays.toString(playerHand));

        dealerHit();
        System.out.println("Dealers Hand: " + Arrays.toString(dealerHand));
        dealerHit();
    }

    public void playGame()
    {
        System.out.println("Enter 'hit' to hit or 'stay' to stay.");
        hit = theDealer.nextLine();

        while((playerTotal <= 21) || hit.equals("hit"))
        {
            playerHit();
            System.out.println("Players Hand: " + Arrays.toString(playerHand));
            System.out.println("Enter 'hit' to hit or 'stay' to stay.");
            hit = theDealer.nextLine();
        }
        while(dealerTotal < 17)
        {
            dealerHit();
            System.out.println("Dealers Hand: " + Arrays.toString(dealerHand));
        }
    }

    public void getWinner()
    {
        if((playerTotal == dealerTotal) || ((playerTotal > 21) && (dealerTotal > 21)))
        {
            winner = "Tie! Nobody wins...";
            payout = 0;
        }
        else
        {
            if((playerTotal > dealerTotal) && (playerTotal <= 21))
            {
                winner = "Player Wins!";
                balance += balance;
                payout = balance;
            }
            else
            {
                winner = "Dealer Wins!  Better luck next time.";
                balance = 0;
                payout = balance * -1;
            }
        }
    }


//toString
    
    public String toString()
    {
        return winner + "\nPayout: " + payout + "$\nFinal Balance: " + balance + "$";
    }
}
