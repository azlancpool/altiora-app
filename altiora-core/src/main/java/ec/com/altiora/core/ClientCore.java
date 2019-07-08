/**
 * 
 */
package ec.com.altiora.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ec.com.altiora.dao.IClientDAO;
import ec.com.altiora.entities.dto.ClientDTO;

/**
 * Class that implements the business logic.
 * 
 * @author Cristian.
 *
 */
@Component("clientCore")
public class ClientCore implements IClientCore {

	@Autowired
	private IClientDAO clientDAO;

	@Override
	public List<ClientDTO> findAll() {
		return clientDAO.findAll();
	}

	@Override
	public void saveClient(ClientDTO clientDTO) {
		this.clientDAO.saveClient(clientDTO);
	}

	@Override
	public void deleteClientById(Integer id) {
		this.clientDAO.deleteClientById(id);
	}

	@Override
	public void updateClient(ClientDTO clientDTO) {
		this.clientDAO.updateClient(clientDTO);
	}

}
