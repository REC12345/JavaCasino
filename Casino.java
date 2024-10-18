public class Casino
{
//Variables(User's balance)
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

//Methods(Different games)
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
//toString(Returns the user's balance)
    public String toString()
    {
        return "Current Balance: " + balance;
    }
}
