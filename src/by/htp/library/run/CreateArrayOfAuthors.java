package by.htp.library.run;

import by.htp.library.entity.Author;

public class CreateArrayOfAuthors {

	private static Author author1;
	private static Author author2;
	private static Author author3;
	private static Author author4;
	private static Author author5;
	private Author[] listOfAuthors = new Author[ 5 ]; 
	
	public CreateArrayOfAuthors( ) {
	
		author1 = new Author( 
				"Karl",
				"Marx",
				"Heinrichovich",
				1830,
				1);
		author2 = new Author( 
				"Lev",
				"Tolstoy",
				"Sergeevich",
				1850,
				2);
		author3 = new Author( 
				"Yugoslav",
				"Bujic",
				"Zdravkovich",
				1966,
				3);
		author4 = new Author( 
				"Aleksandr",
				"Aleks",
				"Aleksandrovich",
				1940,
				4);
		author5 = new Author( 
				"Ivan",
				"Kucko",
				"Andreevich",
				1970,
				5);
		} // end constructor CreateArrayOfAuthors


	// create array with list of authors:
	public void createListOfAutorhs( ) {
		listOfAuthors[0] = author1;
		listOfAuthors[1] = author2;
		listOfAuthors[2] = author3;
		listOfAuthors[3] = author4;
		listOfAuthors[4] = author5;

	}


	public Author[] getListOfAuthors() {
		return listOfAuthors;
	}


//	public void setListOfAuthors(Author[] listOfAuthors) {
//		this.listOfAuthors = listOfAuthors;
//	}

} // end main
