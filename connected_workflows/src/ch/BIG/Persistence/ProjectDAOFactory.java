/**
 * Class implementing a factory for DAO implementations.
 * 
 * @author Arif Chughtai
 */

package ch.BIG.Persistence;


public class ProjectDAOFactory {
	
	/**
	 * The singleton instance 
	 */
	// private static DAOFactory theInstance = new DAOFactory();
	private static ProjectDAOFactory theInstance = null;
	
	
	/**
	 * Default constructor
	 */
	private ProjectDAOFactory() {
	}
	
	/**
	 * @return The Singleton
	 */
	public static ProjectDAOFactory getInstance(){
		if(theInstance == null){
			theInstance = new ProjectDAOFactory();
		}
		return theInstance;
	}
	
	/**
	 * Creates concrete DAO
	 * @return DAO
	 */
	public IProjectDAO createIProjectDAO(){
		// return new BookDAOMockMap();	// Concrete DAO should be configured.
		return new BookDAOMockArray();	// Concrete DAO should be configured.
	}
}
