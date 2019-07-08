/**
 * 
 */
package ec.com.altiora.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ec.com.altiora.dao.IOrderDAO;
import ec.com.altiora.entities.dto.OrderDTO;
import ec.com.altiora.entities.dto.OrderItemDTO;

/**
 * Class that implements the business logic.
 * 
 * @author Cristian
 *
 */

@Component("orderCore")
public class OrderCore implements IOrderCore {
	
	@Autowired
	private IOrderDAO orderDao;

	@Override
	public List<OrderDTO> findOrders() {
		return orderDao.findOrders();
	}

	@Override
	public List<OrderItemDTO> findItemsByOrderId(Integer idOrder) {
		return orderDao.findItemsByOrderId(idOrder);
	}

}
