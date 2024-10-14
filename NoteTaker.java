import java.util.Scanner;

public class NoteTaker 
{
//Scanner------------------------------------------------------------------
Scanner theScanTron = new Scanner(System.in);

//Variables----------------------------------------------------------------
    private String notes;
    private int notesPlace;

//Constructors--------------------------------------------------------------
    public NoteTaker(String n, int np)
    {
        notes = n;
        notesPlace = np;
    }

    public NoteTaker()
    {
        notes = "";
        notesPlace = 0;
    }

//Methods----------------------------------------------------------------

//Writing
    public void writeMode()
    {
        System.out.println("Enter your notes: ");
        String notesUpdate = theScanTron.nextLine();
        notes = notes + ' ' + notesUpdate;
        notesPlace += notesUpdate.length();
    }

//Reading
    public void readMode()
    {
        System.out.println("Here are your notes: ");
        System.out.println(notes);
    }

//Deleting
    public void delete()
    {
        System.out.println("Where would you like to start deleting?");
        int deleteStart = theScanTron.nextInt();
        System.out.println("Where would you like to stop deleting?");
        int deleteStop = theScanTron.nextInt();

        System.out.println("The text has been deleted!");
    }
//Inserting
    public void insert()
    {
        System.out.println("Where would you like to insert text?");
        int insert = theScanTron.nextInt();
        System.out.println("What would you like to insert?");
        String noteInsert = theScanTron.nextLine();

        System.out.println("Your text has been inserted!");
    }


//toString--------------------------------------------------------------
    public String toString()
    {
        return notes;
    }

}
