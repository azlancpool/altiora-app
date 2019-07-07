/**
 * 
 */
package ec.com.altiora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.com.altiora.core.IItemCore;
import ec.com.altiora.entities.dto.ItemDTO;

/**
 * Class that implements the service methods.
 * 
 * @author Cristian
 *
 */
@Service("itemService")
@Transactional(readOnly = true)
public class ItemService implements IItemService {

	@Autowired
	private IItemCore itemCore;

	@Override
	public List<ItemDTO> findAll() {
		return itemCore.findAll();
	}

	@Override
	@Transactional
	public void saveItem(ItemDTO itemDTO) {
		this.itemCore.saveItem(itemDTO);
	}

	@Override
	@Transactional
	public void deleteItemById(String id) {
		this.itemCore.deleteItemById(id);
	}

	@Override
	@Transactional
	public void updateItem(ItemDTO itemDTO) {
		this.itemCore.updateItem(itemDTO);
	}

}
