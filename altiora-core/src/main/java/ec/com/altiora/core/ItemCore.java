/**
 * 
 */
package ec.com.altiora.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ec.com.altiora.dao.IItemDAO;
import ec.com.altiora.entities.dto.ItemDTO;

/**
 * Class that implements the business logic.
 * 
 * @author Cristian
 *
 */
@Component("itemCore")
public class ItemCore implements IItemCore {

	@Autowired
	private IItemDAO itemDao;

	@Override
	public List<ItemDTO> findAll() {
		return itemDao.findAll();
	}

	@Override
	public void saveItem(ItemDTO itemDTO) {
		this.itemDao.saveItem(itemDTO);
	}

	@Override
	public void deleteItemById(String id) {
		this.itemDao.deleteItemById(id);
	}

	@Override
	public void updateItem(ItemDTO itemDTO) {
		this.itemDao.updateItem(itemDTO);
	}

}
