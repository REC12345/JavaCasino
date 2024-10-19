public class Casino
{
//Variables
    private double balance;
//Constructors
    public Casino(double b)
    {
        balance = b;
    }
    public Casino()
    {
        balance = 0.0;
    }

//Methods(Games)
    public void playBlackjack()
    {
        //Blackjack newGame = new Blackjack(balance);
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
        return "Current Balance: " + balance;
    }
}
