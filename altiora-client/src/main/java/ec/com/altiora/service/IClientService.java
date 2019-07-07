/**
 * 
 */
package ec.com.altiora.service;

import java.util.List;

import ec.com.altiora.entities.dto.ClientDTO;

/**
 * 
 * Class that expose the service methods.
 * @author Cristian
 *
 */
public interface IClientService {
	
	/**
	 * List all clients.
	 * @return List<ClientDTO>.
	 */
	List<ClientDTO> findAll();
	
	/**
	 * Save a ClientDTO object.
	 * @param clientDTO ClientDTO object.
	 */
	void saveClient(ClientDTO clientDTO);
	
	/**
	 * Delete a ClientDTO object.
	 * @param id Register id.
	 */
	void deleteClientById(Integer id);
	
	/**
	 * Update a ClientDTO object.
	 * @param clientDTO ClientDTO object.
	 */
	void updateClient(ClientDTO clientDTO);
	
}
