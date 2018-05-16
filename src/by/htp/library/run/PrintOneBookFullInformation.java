package by.htp.library.run;

import by.htp.library.entity.Book;
import by.htp.library.entity.Library;

public class PrintOneBookFullInformation {
	
	//Library library;
	Book thisbook;
	PrintMessage pm;
	
	public PrintOneBookFullInformation( ) {
		pm = new PrintMessage( );
	}



	public void printBookFullInformation( int numberOfBook, Library library ) {
		
		if( numberOfBook > library.getBooksCount() ) { // start outer if - else
			System.out.println(
					"You entered incorrect book number!"
					+ "\nPlease try again."			
					);
		} else {
			thisbook = library.getOneBook( numberOfBook - 1 );
			pm.printShortLine();
			System.out.println( 
					"Title: \t" 
					+ thisbook.getTitle() 
					);
			System.out.println( 
					"Year: \t" 
					+ thisbook.getYearOfPublishing() 
					);
			if( thisbook.getAuthor().length == 1 ) { // start inner if - else if 
				System.out.println( 
					"Author:\t" 
					+ thisbook.getAuthor()[0].getFirstName() + " "
					+ thisbook.getAuthor()[0].getLastName() + " "
					+ thisbook.getAuthor()[0].getOtchestvo()
					);
			} else if ( thisbook.getAuthor().length > 1 ) {
				System.out.print( "Authors:");
				for( int i = 0; i < thisbook.getAuthor().length; i++ ) {
					System.out.println( 
							( i == 0 ? "\t" : "\t\t" ) 
							+ thisbook.getAuthor()[ i ].getFirstName() + " "
							+ thisbook.getAuthor()[ i ].getLastName() + " "
							+ thisbook.getAuthor()[ i ].getOtchestvo()
					);
				} // end for loop
			} // end inner if - else if
		} // end outer if - else
		pm.printShortLine();
		
	} // end printOneBookFullInformation

	
	
}
