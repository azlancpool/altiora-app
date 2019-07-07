/**
 * 
 */
package ec.com.altiora.core;

import java.util.List;

import ec.com.altiora.entities.dto.ItemDTO;

/**
 * Class that expose the business methods.
 * @author Cristian
 *
 */
public interface IItemCore {
	
	/**
	 * List all items.
	 * @return List<ItemDTO>.
	 */
	List<ItemDTO> findAll();
	
	/**
	 * Save a ItemDTO object.
	 * @param itemDTO ItemDTO object.
	 */
	void saveItem(ItemDTO itemDTO);
	
	/**
	 * Delete a ItemDTO object.
	 * @param id Register id.
	 */
	void deleteItemById(String id);
	
	/**
	 * Update a ItemDTO object.
	 * @param itemDTO ItemDTO object.
	 */
	void updateItem(ItemDTO itemDTO);

}
