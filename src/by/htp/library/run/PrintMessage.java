package by.htp.library.run;

public class PrintMessage {

	public void printTopMessage( String message ) {
		printLongLine( );
		System.out.println( "\n" + message );
		printLongLine( );
	}

	public void printLongLine( ) {
		System.out.println( 
			"==========================================================" );
	}
	
	public void printShortLine( ) {
		System.out.println( 
			"============================" );
	}
	
	public void printMenu() {
		printShortLine();
		printLongLine();
		System.out.println(
				"Menu list, please choose one option by selecting "
				+ "\nthe number of option, or enter \"exit\" to exit.");
		printLongLine();
		System.out.println( "1 - Print a list of all books from library" );
		System.out.println( "2 - Print full information about one book" );
		System.out.println( "3 - Print a full list of all authors" );
		System.out.println( "4 - Search by author name, title and year");
		System.out.println( "5 - Print all books of one author");
		printLongLine();
		printShortLine();
	}
	
}
