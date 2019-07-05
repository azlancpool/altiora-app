/**
 * 
 */
package ec.com.altiora.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to Client Entity.
 * 
 * @author Cristian
 *
 */

@RestController
@RequestMapping("/clientWs")
public class ClientController {
	
	@GetMapping(value = "/showMessage", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> showMessage(){
		return new ResponseEntity<>("message",HttpStatus.OK);
	}
}
