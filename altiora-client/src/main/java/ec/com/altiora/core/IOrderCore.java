/**
 * 
 */
package ec.com.altiora.core;

import java.util.List;

import ec.com.altiora.entities.dto.OrderDTO;
import ec.com.altiora.entities.dto.OrderItemDTO;

/**
 * Class that expose the business methods.
 * 
 * @author Cristian
 *
 */
public interface IOrderCore {
	
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
