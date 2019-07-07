/**
 * 
 */
package ec.com.altiora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.com.altiora.entities.dto.ItemDTO;
import ec.com.altiora.service.IItemService;

/**
 * Controller to Item Entity.
 * 
 * @author Cristian
 *
 */

@RestController
@RequestMapping("/itemWs")
public class ItemController {

	/**
	 * ItemService bean.
	 */
	@Autowired
	private IItemService itemService;

	/**
	 * Web service that exposes findAll service.
	 * 
	 * @return ResponseEntity<List<ItemDTO>> object.
	 */
	@GetMapping(value = "/listItem", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ItemDTO>> findAll() {
		return new ResponseEntity<List<ItemDTO>>(itemService.findAll(), HttpStatus.OK);
	}

	/**
	 * Web service that exposes saveItem service.
	 * 
	 * @param itemDTO ItemDTO object.
	 */
	@PostMapping(value = "/saveItem", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveItem(@RequestBody ItemDTO itemDTO) {
		this.itemService.saveItem(itemDTO);
	}

	/**
	 * Web service that exposes deleteItemById service.
	 * 
	 * @param id itemDTO's id.
	 */
	@DeleteMapping(value = "/deleteItem/item/{id}")
	public void deleteItem(@PathVariable String id) {
		this.itemService.deleteItemById(id);
	}

	/**
	 * Web service that exposes updateItem service.
	 * 
	 * @param itemDTO ItemDTO object.
	 */
	@PutMapping(value = "/updateItem", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateItem(@RequestBody ItemDTO itemDTO) {
		this.itemService.updateItem(itemDTO);
	}

}
