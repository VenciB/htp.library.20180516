package by.htp.library.logic;

import java.util.Scanner;

import by.htp.library.entity.Author;
import by.htp.library.entity.Book;
import by.htp.library.entity.Library;
import by.htp.library.run.GetAnswer;
import by.htp.library.run.PrintMessage;
import by.htp.library.run.PrintOneBookFullInformation;

public class Librarian {
	
	private Book[] books;
	private Author[] authors;
	private Library library;
	private PrintMessage pm;
	private PrintOneBookFullInformation pobfi;
	
	
	private String answer = null;
	
	public Librarian( Library library, Author[ ] authors ) {
		this.library = library;
		this.authors = authors;
		pm = new PrintMessage();
		pobfi = new PrintOneBookFullInformation();
	}

	public void addNewBooks( Book[] listOfBooks ) {
		this.books = listOfBooks;
		for( int i = 0; i < listOfBooks.length; i++ ) {
			library.addBook( books[ i ] );
		} // end for loop
	} // end addNewBooks

	
	
	// ##################################################
	// case 1, printing a list of all books             #
	// ##################################################
	public void printAllBooks( Library library, String message ) {
		pm.printTopMessage( message );
		for( int i = 0; i < library.getBooks().length; i++ ) {
			System.out.println("Book " + ( i + 1 ) + ": " + 
								library.getBookName( i ) );		
		} // end for loop
	} // end printAllBooks
	
	
	
	// ##################################################
	// case 2, printing full information about one book #
	// ##################################################
	public void printFullInformationOfOneBook( 
							GetAnswer ga,
							Scanner in,
							String message ) {
		pm.printTopMessage( message );
		System.out.println( "Enter the book number: " );
		
		answer  = ga.getAnswer( in );
		int numberOfBook = Integer.parseInt( answer );
		pobfi.printBookFullInformation( numberOfBook, library );

	} // end case 2, printing full information about one book

	
	
	// #################################################
	// case 3, printing list of all authors            #
	// #################################################
	public void printListOfAllAuthors( String message ) {
		pm.printTopMessage( message );
		for( int i = 0; i < authors.length; i++ ) {
			System.out.print("Autor " + ( i + 1 ) + ":");
			System.out.print("\t" 
					+ authors[i].getLastName() + " "
					+ authors[ i ].getFirstName() + " "
					+ authors[ i ].getOtchestvo() + "\n"
			);
		} // end for loop
		pm.printLongLine();
		
	} // end case 3, printing list of all authors
	

	
	// ################################################
	// case 4, searching by author, title and year    #
	// ################################################
	public void searchByAuthorTitleYear( 
			 Scanner in
			, GetAnswer ga
			, String message ) {
		pm.printTopMessage( message );
		
		System.out.println( "Enter year of the book:" );		
		// get user input:
		answer  = ga.getAnswer( in );
		int book_year = Integer.parseInt( answer );
		
		System.out.println( "Enter the book title:" );		
		// get user input:
		String book_title = ga.getAnswer( in );
		
		System.out.println( "Enter the author's last name:" );		
		// get user input:
		String author_last_name = ga.getAnswer( in );
		
		System.out.println( "Enter the author's first name:" );		
		// get user input:
		String author_first_name = ga.getAnswer( in );
		
		System.out.println( "Enter the author's otchestvo:" );		
		// get user input:
		String author_otchestvo = ga.getAnswer( in );
		
		boolean foundIt = false;
		int book_founded = -1;
		search_for_book:
		// i - outer for loop
		// j - inner for loop
		for( int i = 0; i < library.getBooksCount(); i++ ) { // start outer for loop
			
			if( book_year == library.getBooks()[ i ].getYearOfPublishing() 
				&&
				book_title.equals( library.getBooks()[ i ].getTitle() )
			) {
				for( int j = 0; j < library.getBooks()[ i ].getAuthor().length; j++  ) { // start inner for loop
					if(	
						author_last_name.equals( library.getBooks()[ i ].getAuthor()[ j ].getLastName() )
						&&
						author_first_name.equals( library.getBooks()[ i ].getAuthor()[ j ].getFirstName() )
						&&
						author_otchestvo.equals( library.getBooks()[ i ].getAuthor()[ j ].getOtchestvo() )
					) {
						foundIt = true;
						book_founded = i + 1;
						break search_for_book;
					}
				} // end inner for loop
				
			} // end if
			
		} // end outer for loop
		// end label search_for_book
		
		System.out.println("");
		
		if( foundIt ) { // start if - else
			System.out.println(
					"The book with such parameters was found."
					+ "\nHere is the full information about the book:");
			pm.printLongLine();
			pobfi.printBookFullInformation( book_founded, library );
		} else {
			System.out.println(
					"The book with such parameters was not found!"
					+ "\nPlease try again.");
			pm.printLongLine();
		} // end if - else
		
		
	} // end case 4, searching by author, title and year
	
	
	
	// ################################################
	// case 5, printing all books of one author       #
	// ################################################
	public void printAllBooksByAuthor( 
			 Scanner in
			, GetAnswer ga
			, String message ) {
		
		pm.printTopMessage( message );
		
		System.out.println( "Enter the author number: " );
		// get user input:
		answer  = ga.getAnswer( in );
		int author_id = Integer.parseInt( answer );
		
		int countNumberOfBooksOfOneAuthor = 0;
		StringBuilder sb = new StringBuilder();
		String listOfBooksForAuthor = "";
		// i - outer loop
		// j - inner loop
		get_list_of_authors_books:
		for( int i = 0; i < library.getBooks().length; i++ ) {
			if( author_id > authors.length ) {
				break get_list_of_authors_books;
			}
			for( int j = 0; j < library.getBooks()[ i ].getAuthor().length; j++ ) {
				if( author_id == library.getBooks()[ i ].getAuthor()[ j ].getAuthor_id() ) {
					sb.append( ( ( i + 1 ) < 10 ? "     " : "    " ) 
								+ ( i + 1 ) 
								+ "      - ");
					sb.append( library.getBooks()[ i ].getTitle() );
					sb.append("\n");
					countNumberOfBooksOfOneAuthor++;
				}
			}
		} // end for loop
		
		if( countNumberOfBooksOfOneAuthor > 0 ) {
			listOfBooksForAuthor = sb.toString();
			System.out.println(
					"The list of books of author "
					+ author_id + " ("
					+ authors[ author_id - 1 ].getLastName() + " "
					+ authors[ author_id - 1 ].getFirstName() + " "
					+ authors[ author_id - 1 ].getOtchestvo() + ")"
					+ " in library:"
					);
			pm.printTopMessage( "Book number - Book title" );
			System.out.println( listOfBooksForAuthor );
		} else if ( author_id > authors.length ) {
			System.out.println("You entered incorrect author's number!"
					+ "\nPlease try again.");			
		} else if( countNumberOfBooksOfOneAuthor == 0 ) {
			System.out.println(
					"No books of author " 
					+ authors[ author_id ].getLastName() + " "
					+ authors[ author_id ].getFirstName() + " "
					+ authors[ author_id ].getOtchestvo()
					+ " in library."
					);
		} // end if else
		
	} // end case 5, printAllBooksByAuthor

	
	
	public void printMenu( ) {
		pm.printMenu();
	}
	
}
