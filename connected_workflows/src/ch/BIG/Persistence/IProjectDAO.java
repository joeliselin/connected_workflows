/**
 * Interface of DAOs for data related to media types like books, magazines etc..
 * 
 * @author Arif Chughtai
 */

package ch.BIG.Persistence;

import java.util.Map;

public interface IProjectDAO {
	
	/**
	 * Inserts data of a book as Array
	 * @param projectData
	 */
	public void insertIProjectAsArray(String[] projectData);
	
	/**
	 * @param projectID
	 * @return Data of selected book as Array
	 */
	public String[] selectIProjectAsArray(int projectID);
	
	/**
	 * Inserts data of a book as Map
	 * @param projectData
	 */
	public void insertIProjectAsMap(Map<String, String> projectData);
	
	/**
	 * @param projectID
	 * @return Data of selected book as Map.
	 */
	public Map<String, String> selectIProjectAsMap(int projectID);
	
}
