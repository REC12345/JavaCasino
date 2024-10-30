
//import java.util.ArrayList;
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
        String hit = theDealer.nextLine();

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

    public String getWinner()
    {
        if((playerTotal == dealerTotal) || ((playerTotal > 21) && (dealerTotal > 21)))
        {
            payout = 0;
            return "Tie! Nobody wins...";
        }
        else
        {
            if((playerTotal > dealerTotal) && (playerTotal <= 21))
            {
                balance += balance;
                payout = balance;
                return "Player Wins!";
            }
            else
            {
                balance = 0;
                payout = balance * -1;
                return "Dealer Wins!  Better luck next time.";
            }
        }
    }


//toString
    
    public String toString()
    {
        return getWinner() + "\nPayout: " + payout + "$\nFinal Balance: " + balance + "$";
    }
}
