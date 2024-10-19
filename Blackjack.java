public class Blackjack 
{
//Variables
    private double balance;
    private double payout;

//Constructors
    public Blackjack(double b)
    {
        balance = b;
        payout = 0.0;
    }
    public Blackjack()
    {
        balance = 0.0;
        payout = 0.0;
    }

//Methods(Rules, player actions, house actions)
//toString(Returns amount won/lost and a 'thank you for playing' message)
    public String toString()
    {
        return "Payout: " + payout + "$\nFinal Balance: " + balance + "$";
    }
}
