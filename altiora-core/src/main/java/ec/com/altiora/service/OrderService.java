/**
 * 
 */
package ec.com.altiora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.altiora.core.IOrderCore;
import ec.com.altiora.entities.dto.OrderDTO;
import ec.com.altiora.entities.dto.OrderItemDTO;

/**
 * 
 * Class that implements the service methods.
 * 
 * @author Cristian
 *
 */

@Service("orderService")
public class OrderService implements IOrderService{
	
	@Autowired
	private IOrderCore orderCore;

	@Override
	public List<OrderDTO> findOrders() {
		return orderCore.findOrders();
	}

	@Override
	public List<OrderItemDTO> findItemsByOrderId(Integer idOrder) {
		return orderCore.findItemsByOrderId(idOrder);
	}

}
