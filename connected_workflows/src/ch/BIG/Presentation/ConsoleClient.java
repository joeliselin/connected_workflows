package ch.BIG.Presentation;

public class ConsoleClient {

}


/**
 * Class implementing the console client of the
 * LibraryManager application.
 * 
 * @author Arif Chughtai
 */

package org.arifchughtai.training.casestudies.librarymanager.v2.presentation;

import org.arifchughtai.training.casestudies.librarymanager.v2.business.Media;
import org.arifchughtai.training.casestudies.librarymanager.v2.business.MediaFactory;


public class ConsoleClient {
	
	// MediaFactory to use
	private MediaFactory theMediaFactory = null;
	
	// Constructors
	
	public ConsoleClient() {
		theMediaFactory = MediaFactory.getInstance();
	}

	// Methods	
	
	/**
	 * Creates a book.
	 * @param title the title of the book to create.
	 * @param price the price of the book to create.
	 */	
	public void createBook(String title, String price, String isbn){
		// Create new book
		Media book = theMediaFactory.createMedia(title, price, isbn);
		
		// Save book
		theMediaFactory.saveMedia(book);
	}

	/**
	 * Displays a book.
	 * @param bookID the ID of the book to display.
	 */
	public void displayBook(int bookID){
		// Get book with given ID
		Media book = theMediaFactory.findMedia(bookID);
		
		// Display book
		System.out.println("+++ Book: " + "Title: " + book.getTitle() + " / Price: " + book.getPrice() + " / ISBN: N/A");
	}
}
