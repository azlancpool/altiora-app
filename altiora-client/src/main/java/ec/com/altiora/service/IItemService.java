/**
 * 
 */
package ec.com.altiora.service;

import java.util.List;

import ec.com.altiora.entities.dto.ItemDTO;

/**
 * Class that expose the service methods.
 * 
 * @author Cristian
 *
 */
public interface IItemService {

	/**
	 * List all items.
	 * 
	 * @return List<ItemDTO>.
	 */
	List<ItemDTO> findAll();

	/**
	 * Save a ItemDTO object.
	 * 
	 * @param itemDTO ItemDTO object.
	 */
	void saveItem(ItemDTO itemDTO);

	/**
	 * Delete a ItemDTO object.
	 * 
	 * @param id Register id.
	 */
	void deleteItemById(String id);

	/**
	 * Update a ItemDTO object.
	 * 
	 * @param itemDTO ItemDTO object.
	 */
	void updateItem(ItemDTO itemDTO);

}
