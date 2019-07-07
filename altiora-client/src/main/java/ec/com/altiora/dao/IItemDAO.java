/**
 * 
 */
package ec.com.altiora.dao;

import java.util.List;

import ec.com.altiora.entities.dto.ItemDTO;

/**
 * Class that expose the dao methods.
 * 
 * @author Cristian
 *
 */
public interface IItemDAO {

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
