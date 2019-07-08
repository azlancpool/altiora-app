/**
 * 
 */
package ec.com.altiora.service;

import java.util.List;

import ec.com.altiora.entities.dto.OrderDTO;
import ec.com.altiora.entities.dto.OrderItemDTO;

/**
 * Class that expose the service methods.
 * 
 * @author Cristian
 *
 */
public interface IOrderService {

	/**
	 * List all order.
	 * 
	 * @return List<OrderDTO> Order list.
	 */
	List<OrderDTO> findOrders();
	
	/**
	 * List all order.
	 * 
	 * @return Map<Integer, List<OrderItemDTO>>.
	 */
	List<OrderItemDTO> findItemsByOrderId(Integer idOrder);

}
