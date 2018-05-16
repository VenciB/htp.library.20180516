package by.htp.library.run;

import java.util.Scanner;

import by.htp.library.entity.Author;
import by.htp.library.entity.Book;
import by.htp.library.entity.Library;
import by.htp.library.logic.Librarian;

public class AppMain {

	public static void main(String[] args) {
		
		// create a list of authors:
		CreateArrayOfAuthors caoa = new CreateArrayOfAuthors( );
		caoa.createListOfAutorhs( );
		Author[] listOfAuthors = caoa.getListOfAuthors( );
		System.out.println("");
		// create a list of books
		CreateArrayOfBooks caob = new CreateArrayOfBooks( );
		caob.populateBooks( listOfAuthors );
		caob.createListOfBooks();
		Book[] listOfBooks = caob.getListOfBooks( );
	
		// create a new library:
		Library lib1 = new Library( );

		// create and assign a librarian to a library:
		Librarian librarian1 = new Librarian( 
										lib1,
										listOfAuthors
										);
		librarian1.addNewBooks( listOfBooks );
		
		String answer = null;
		Scanner in = new Scanner( System.in );
		GetAnswer ga = new GetAnswer( );
		do {
			librarian1.printMenu();
			answer = ga.getAnswer( in );
			switch ( answer ) {
				case "1":
					// instruct librarian to print a list of all books:
					librarian1.printAllBooks( 
						lib1
						,"Printing a list of all books from library 1:" );
					break;
				case "2":
					librarian1.printFullInformationOfOneBook( 
						ga
						,in
						,"Printing full information about one book");
					break;
				case "3":
					librarian1.printListOfAllAuthors( 
						"Printing list of all authors:"
					);
					break;
				case "4":
					System.out.println( "number 4" );
					librarian1.searchByAuthorTitleYear(
						in
						,ga
						,"Searching by author, title and year"
					);
					break;
				case "5":
					librarian1.printAllBooksByAuthor(
						in
						, ga
						, "Printing all books of one author"
					);
					break;
				case "exit":
					break;
			default:
					System.out.println( "Wrong entry. Try again.");
					break;
			} // end switch
				
		} while ( !answer.equals( "exit" ) );
		
		if( answer.equals("exit") ) {
			in.close();
			System.out.println("Thank you, and come back!");
		} else {
			in.close();
			System.out.println("Something went wrong. "
					+ "Exiting the application");
		}
	}
}
