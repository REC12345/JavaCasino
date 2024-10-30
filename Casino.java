import java.util.Scanner;

public class Casino
{
    //Scanner, variables, and constructors
    Scanner theDealer = new Scanner(System.in);
    private double balance;
    public Casino(double b)
    {
        balance = b;
    }

    //Methods(Games)
    public void playBlackjack()
    {
        Blackjack newGame = new Blackjack(balance);

        newGame.dealCards();
        newGame.playGame();

        System.out.println(newGame);
    }

    public void playCraps()
    {
        //Craps newGame = new Craps(balance);
    }

    public void playSlots()
    {
        //Slots newGame = new Slots(balance);
    }

    public void playRoulette()
    {
        //Roulette newGame = new Roulette(balance);
    }
    
    //toString
    public String toString()
    {
        return "Thank you for playing!/nCurrent Balance: " + balance;
    }
}
