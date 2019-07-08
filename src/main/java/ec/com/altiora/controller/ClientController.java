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

import ec.com.altiora.entities.dto.ClientDTO;
import ec.com.altiora.service.IClientService;

/**
 * Controller to Client Entity.
 * 
 * @author Cristian
 *
 */

@RestController
@RequestMapping("/clientWs")
public class ClientController {

	/**
	 * ClientService bean.
	 */
	@Autowired
	private IClientService clientService;

	/**
	 * Web service that exposes findAll service.
	 * 
	 * @return ResponseEntity<List<ClientDTO>> object.
	 */
	@GetMapping(value = "/listClient", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ClientDTO>> findAll() {
		return new ResponseEntity<List<ClientDTO>>(clientService.findAll(), HttpStatus.OK);
	}

	/**
	 * Web service that exposes saveClient service.
	 * 
	 * @param clientDTO ClientDTO object.
	 */
	@PostMapping(value = "/saveClient", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveClient(@RequestBody ClientDTO clientDTO) {
		clientService.saveClient(clientDTO);
	}

	/**
	 * Web service that exposes deleteClientById service.
	 * 
	 * @param id clientDTO's id.
	 */
	@DeleteMapping(value = "/deleteClient/client/{id}")
	public void deleteClient(@PathVariable Integer id) {
		clientService.deleteClientById(id);
	}

	/**
	 * Web service that exposes updateClient service.
	 * 
	 * @param clientDTO ClientDTO object.
	 */
	@PutMapping(value = "/updateClient", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateClient(@RequestBody ClientDTO clientDTO) {
		clientService.updateClient(clientDTO);
	}
}
