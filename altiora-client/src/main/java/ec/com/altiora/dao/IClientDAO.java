/**
 * 
 */
package ec.com.altiora.dao;

import java.util.List;

import ec.com.altiora.entities.dto.ClientDTO;

/**
 * Class that expose the dao methods.
 * 
 * @author Cristian
 *
 */
public interface IClientDAO {

	/**
	 * List all clients.
	 * 
	 * @return List<ClientDTO>.
	 */
	List<ClientDTO> findAll();

	/**
	 * Save a ClientDTO object.
	 * 
	 * @param clientDTO ClientDTO object.
	 */
	void saveClient(ClientDTO clientDTO);

	/**
	 * Delete a ClientDTO object.
	 * 
	 * @param id Register id.
	 */
	void deleteClientById(Integer id);

	/**
	 * Update a ClientDTO object.
	 * 
	 * @param clientDTO ClientDTO object.
	 */
	void updateClient(ClientDTO clientDTO);

}
