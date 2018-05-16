package by.htp.library.entity;

public class Library {
	
	private Book[] books;
	private int lastIndex;
	private int booksIndex;

	public Library(Book[] books) {
		this.books = books;
		this.booksIndex = books.length;
		this.lastIndex = booksIndex;
	}
	
	public Library() {
		this.booksIndex = 1;
		this.books = new Book[booksIndex];
		this.lastIndex = 0;
	}
	

	public void addBook( Book book ) {
		if( lastIndex < booksIndex ) {
			books[lastIndex] = book;
			lastIndex++;
		} else if ( lastIndex >= booksIndex ) {
			Book[] booksNew = new Book[ lastIndex + 1 ];
			for( int i = 0; i < books.length; i++ ) {
				booksNew[i] = books[i];
			}
			booksNew[lastIndex] = book;
			books = booksNew;
			lastIndex++;
			booksIndex++;
		} // end if
	}
	
	public Book[] getBooks() {
		return books;
	}
	
	public Book getOneBook( int book_id ) {
		return books[ book_id ];
	}
	
	public String getBookName( int bookID ) {
		return books[ bookID ].getTitle();
	}

//	public void setBooks(Book[] books) {
//		this.books = books;
//	}

	public int getBooksCount() {
		//return booksIndex;
		return books.length;
	}

//	public void setBooksCount(int booksCount) {
//		this.booksCount = booksCount;
//	}
	
} // end class
