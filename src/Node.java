import java.util.Scanner;

public class Node {
	private String question;
	private String pokemon;
	private Node yes;
	private Node no;
	private String line;
	protected Object data;
	protected Node next;

	// is a string....
	//yes and no are other nodes...
	//question is a string....
    public static void main(String []arrrrrrrrrrrrrrrgs)
    {
    	Node first = new Node();		
		first.question = "Can this pokemon learn fly?";	
		first.yes = new Node();					
		first.no = new Node();	
		first.yes.pokemon = "pidgey";
		first.no.pokemon = "charmander";
		Scanner input = new Scanner(System.in);
		boolean occured;
		do {
			first.branch();
			//System.out.println("Play again or quit?");
		occured = input.nextLine().equalsIgnoreCase("quit");
		} while(!(occured));
		System.out.println("Thanks for playing.");
    }
    private void branch()
    {
    	Scanner input = new Scanner(System.in);
    	String in;
    	if(question !=null)
    	{
    		System.out.println(question);
    		in=input.nextLine().trim().toLowerCase();
	    	if(in.contains("yes"))
	    	{
	    		//yes branch
	    		yes.branch();
	    	}
	    	else
	    	{	//no branch
	    		no.branch();
	    	}
    	}
    	//branch is over
    	else if(question == null)
    	{
    		System.out.println("Is it a "+ pokemon+" .");
    		in=input.nextLine().trim().toLowerCase();
    		///
    		if(in.contains("yes"))
    		{
    			System.out.println("I have guessed your pokemon.");
    		}
    		//else the guess is incorrect
    		else
    		{
    			System.out.println("I give up!!!");
    			System.out.println("Who's that Pokemon?");
    			String newPokemon = input.nextLine().trim().toLowerCase();
    			System.out.println("Give me a question. A question that a "+newPokemon+" has but a "+ pokemon +" does not.");
    			String newQuestion = input.nextLine().trim();
    			yes=new Node();
    			//uses the new guess
    			yes.pokemon = newPokemon;
    			no = new Node();
    			//falls back on the previous guess
    			no.pokemon = pokemon;
    			pokemon=null;
    			question = newQuestion;
    			System.out.println("Your pokemon, " + newPokemon + " has been added to the pokedex!!!");
    			
    			
    			
    			
    		}
    		
    		
    	}
    }
    
}
