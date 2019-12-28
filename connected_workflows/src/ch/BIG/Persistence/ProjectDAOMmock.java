/**
 * The class BookDAOMock is a data access mock implementation
 * using an array as in-memory data storage for book data.
 * This implementation is simplified and not save because there could be 
 * multiple DB instances. 
 * 
 * @author Arif Chughtai
 */

package org.arifchughtai.training.casestudies.librarymanager.v1.persistence;

public class BookDAOMock {

	/**
	 * The constants for accessing book data in.
	 * the in-memory storage.
	 */
	public static final int TITLE = 0;
	public static final int PRICE = 1;
	public static final int ISBN = 2;
	
	/**
	 * The in-memory data storage.
	 * 1. dimension = books, 2. dimension = data (title, price etc.) of a book.
	 */	
	private String[][] books = null;
	
	/**
	 * The management of in-memory data storage.
	 */
	private final int MAX_BOOKS = 100;
	private int bookCount = 0;	
	
	/**
	 * Default constructor
	 */
	public BookDAOMock() {		
		books = new String[MAX_BOOKS][3];
	}

	/**
	 * Inserts book data into in-memory data storage.
	 * 
	 * @param bookData the book data to insert.
	 */
	public void insertBook(String[] bookData) {
		if(bookCount < MAX_BOOKS){
			books[bookCount] = bookData;
			bookCount++;			
		}		
	}

	/**
	 * Inserts book data into in-memory data storage.
	 * 
	 * @param title the title of the book to insert.
	 * @param price the price of the book to insert.
	 * @param isbn the ISBN of the book to insert.
	 */
	/*public void insertBook(String title, String price, String isbn) {
		String[] bookData = new String[3];
		bookData[TITLE] = title;
		bookData[PRICE] = price;					
		bookData[ISBN] = isbn;
		insertBook(bookData);		
	}*/
	
	/**
	 * @param bookID
	 * 
	 * @return the data of the selected book as array. If bookID doesn`t exists, null is returned.
	 */
	public String[] selectBook(int bookID) {
		if(bookID < bookCount && bookID >= 0){
			return books[bookID];	
		}	

		// return books[0];
		return null;
	}	
}