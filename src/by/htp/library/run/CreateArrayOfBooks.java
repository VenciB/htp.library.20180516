package by.htp.library.run;

import by.htp.library.entity.Author;
import by.htp.library.entity.Book;

public class CreateArrayOfBooks {

	private Author[ ] listOfAuthors;
	private Author author1;
	private Author author2;
	private Author author3;
	private Author author4;
	private Author author5;
	
	private Book book1;
	private Book book2;
	private Book book3;
	private Book book4;
	private Book book5;
	private Book book6;
	private Book book7;
	private Book book8;
	private Book book9;
	private Book book10;
	private Book[] listOfBooks;
	
	// constructor with Author[] in argument,
	// to populate array listOfAuthors:
	public CreateArrayOfBooks( ) {
		
	}
	
	public void populateBooks( Author[] listOfAuthors ) {

		this.listOfAuthors = new Author[ listOfAuthors.length ];
		for( int i = 0; i < listOfAuthors.length; i++ ) {
			this.listOfAuthors[ i ] = listOfAuthors[ i ];
		}
		
		author1 = listOfAuthors[ 0 ];
		author2 = listOfAuthors[ 1 ];
		author3 = listOfAuthors[ 2 ];
		author4 = listOfAuthors[ 3 ];
		author5 = listOfAuthors[ 4 ];
		
		book1 = new Book( 
				1867
				,"Capital"
				, 1
				, author1
				);
		book2 = new Book( 
				1867
				,"War and peace"
				, 2
				,author2
				);
		book3 = new Book( 
				1873
				,"Around the world in 80 days"
				, 3
				,author3
				,author4
				,author5
				,author2
				);
		book4 = new Book( 
				1969
				,"From here to there"
				, 4
				,author4
				);
		book5 = new Book( 
				1936
				,"Gone with the wind"
				, 5
				,author5
				,author3
				);
		book6 = new Book( 
				1932
				,"Why not now?"
				, 6
				,author1
				,author5
				);
		book7 = new Book( 
				2003
				,"Lady and a Man"
				, 7
				,author2
				,author4
				,author3
				);
		book8 = new Book( 
				1975
				,"Planet Venus"
				, 8
				,author3
				);
		book9 = new Book( 
				1995
				,"Astronomy"
				, 9
				,author4
				);
		book10 = new Book( 
				2018
				,"Java programming"
				, 10
				,author5
				,author3
				);
		
	} // end populateBooks
	
	public void createListOfBooks( ) {
		
		listOfBooks = new Book[ 10 ];
		listOfBooks[0] = book1;
		listOfBooks[1] = book2;
		listOfBooks[2] = book3;
		listOfBooks[3] = book4;
		listOfBooks[4] = book5;
		listOfBooks[5] = book6;
		listOfBooks[6] = book7;
		listOfBooks[7] = book8;
		listOfBooks[8] = book9;
		listOfBooks[9] = book10;
		System.out.println("");
	} // end createListOfBooks
		
	// create array with list of books:
	public Book[] getListOfBooks( ) {
		return listOfBooks;
	}

} // end class CreateArrayOfBooks
