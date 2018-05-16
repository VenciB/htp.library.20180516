package by.htp.library.entity;

public class Book {
	
	private int yearOfPublishing;
	private String title;
	private int book_id;
	private Author[] authors;
	
	public Book( 
				int yearOfPublishing, 
				String title,
				int book_id,
				Author...listofauthors) {
		this.yearOfPublishing = yearOfPublishing;
		this.title = title;
		this.book_id = book_id;
		if( listofauthors.length == 0 ) {
			authors = new Author[1];
			authors[0] = new Author( );
		} else {
			authors = new Author[ listofauthors.length ];
			for( int i = 0; i < listofauthors.length; i++ ) {
				authors[ i ] = listofauthors[ i ];
			} // end for loop
			System.out.println("");
		}
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}
	
//	public void setYearOfPublishing(int yearOfPublishing) {
//		this.yearOfPublishing = yearOfPublishing;
//	}
	
	public String getTitle() {
		return title;
	}
	
//	public void setTitle(String title) {
//		this.title = title;
//	}
	
	public Author[ ] getAuthor() {
		return authors;
	}
//	
//	public void setAuthor(Author author) {
//		this.author = author;
//	}

	public int getBook_id() {
		return book_id;
	}

//	public void setBook_id(int book_id) {
//		this.book_id = book_id;
//	}

}
