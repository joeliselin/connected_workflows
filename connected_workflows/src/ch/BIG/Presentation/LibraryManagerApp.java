package ch.BIG.Presentation;

public class LibraryManagerApp;

{

}  


/**
 * Class implementing the main method of the LibraryManager application.
 * rgrg
 * @author Arif Chughtai
 */

package  org.arifchughtai.training.casestudies.librarymanager.v2.presentation;


public class LibraryManagerApp {

	// The test data
	private static final String[] bookTitles = {
			"Analyse und Design mit der UML 2.5 - Objektorientierte Softwareentwicklung",
			"Software Architecture: A Comprehensive Framework and Guide for Practitioners",
			"Design Patterns - Elements of Reusable Object-Oriented Software",
			"Effective Java � Programming Language Guide" };
	
	private static final String[] bookPrices = { "CHF 79.90", "CHF 81.40", "CHF 84.90", "CHF 74.90" };
	private static final String[] bookISBNs = { "3486721402", "3642197353", "0201633612", "0321356683" };
	
	/**
	 * Main of the LibraryManager application.
	 * @param args
	 */
	public static void main(String[] args) {		
		ConsoleClient theClient = new ConsoleClient();
		
		// Create books
		for (int i = 0; i < bookTitles.length; i++) {							
			theClient.createBook(bookTitles[i], bookPrices[i], bookISBNs[i]);
		}
		
		// Display books
		for (int i = 0; i < bookTitles.length; i++) {							
			theClient.displayBook(i);
		}
	}
}
