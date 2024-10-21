
public class Random 
{
//Variables
    private int range;

//Establish range of output values
    public Random(int r)
    {
        range = r;
    }

//Returns a random number within the specified range
    public int getRandom()
    {
        int random = (int)(Math.random() * range);
        return random;
    }

}
