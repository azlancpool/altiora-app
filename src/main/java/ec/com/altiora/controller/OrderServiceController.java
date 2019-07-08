/**
 * 
 */
package ec.com.altiora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.com.altiora.entities.dto.OrderDTO;
import ec.com.altiora.entities.dto.OrderItemDTO;
import ec.com.altiora.service.IOrderService;

/**
 * Controller to Order Entity.
 * 
 * @author Cristian
 *
 */

@RestController
@RequestMapping("/orderWs")
public class OrderServiceController {

	@Autowired
	private IOrderService orderService;

	/**
	 * Web service that exposes findAll service.
	 * 
	 * @return ResponseEntity<List<OrderItemDTO>> object list.
	 */
	@GetMapping(value = "/listOrder", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<OrderDTO>> findOrders() {
		return new ResponseEntity<List<OrderDTO>>(orderService.findOrders(), HttpStatus.OK);
	}
	
	/**
	 * Web service that exposes findItemsByOrderId service.
	 * 
	 * @return ResponseEntity<List<OrderItemDTO>> object list.
	 */
	@GetMapping(value = "/listItemsByOrderId/{idOrder}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<OrderItemDTO>> findItemsByOrderId(@PathVariable Integer idOrder) {
		return new ResponseEntity<List<OrderItemDTO>>(orderService.findItemsByOrderId(idOrder), HttpStatus.OK);
	}

}
