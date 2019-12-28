package ch.BIG.Persistence;

/**
 * The class BookDAOMockTest is a class for testing the class BookDataAccessMock.
 * 
 * @author Arif Chughtai
 */


import org.arifchughtai.training.casestudies.librarymanager.v1.persistence.BookDAOMock;


public class BookDAOMockTest {

	// The test data
	private final String[] bookTitles = {
			"Analyse und Design mit der UML 2.5 - Objektorientierte Softwareentwicklung",
			"Software Architecture: A Comprehensive Framework and Guide for Practitioners",
			"Design Patterns - Elements of Reusable Object-Oriented Software",
			"Effective Java – Programming Language Guide" };
	
	private final String[] bookPrices = { "CHF 79.90", "CHF 81.40", "CHF 84.90", "CHF 74.90" };
	private final String[] bookISBNs = { "3486721402", "3642197353", "0201633612", "0321356683" };

	// The number of properties of each book 
	private final int BOOK_PROPERTY_COUNT = 3;
	
	// The number of books
	private int bookCount = bookTitles.length;

	// Create data access to test
	private BookDAOMock dataAccessUnderTest = new BookDAOMock();

	/**
	 * The test for the methods BookDAOMock:insertBook and BookDAOMock:selectBook.
	 */
	public void testInsertAndSelectBook() {
		String[] bookData = null;

		System.out.println("+++ Test BookDAOMock:insertBook(String[]) and BookDAOMock:selectBook(int) +++");
		System.out.println();

		// Save test data
		for (int i = 0; i < bookCount; i++) {
			bookData = new String[BOOK_PROPERTY_COUNT];
			bookData[0] = bookTitles[i];
			bookData[1] = bookPrices[i];
			bookData[2] = bookISBNs[i];
			dataAccessUnderTest.insertBook(bookData);
		}

		// Display test data inserted by insertBook(String[])
		for (int i = 0; i < bookCount; i++) {
			bookData = dataAccessUnderTest.selectBook(i);
			System.out.println(i + 1 + ". Book: " + "Title: " + bookData[0]
					+ " / Price: " + bookData[1] + " / ISBN: " + bookData[2]);
		}

		
		/*System.out.println();
		System.out.println("+++ Test BookDAOMock:insertBook(String, String, String) and BookDAOMock:selectBook +++");
		System.out.println();

		// Save test data
		for (int i = 0; i < bookCount; i++) {
			dataAccessUnderTest.insertBook(bookTitles[i], bookPrices[i], bookISBNs[i]);
		}

		// Display test data inserted by insertBook(String[]) and
		// insertBook(String, String, String)

		bookCount = 2 * bookTitles.length;

		for (int i = 0; i < bookCount; i++) {
			bookData = dataAccessUnderTest.selectBook(i);
			System.out.println(i + 1 + ". Book: " + "Title: " + bookData[0]
					+ " / Price: " + bookData[1] + " / ISBN: " + bookData[2]);
		}*/
	}

	/**
	 * Main of the test of UCBookDataAccessMock.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		// Instantiate test class
		BookDAOMockTest dataAccessTest = new BookDAOMockTest();

		// Call test method
		dataAccessTest.testInsertAndSelectBook();
	}
}
