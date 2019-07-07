/**
 * 
 */
package ec.com.altiora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.com.altiora.core.IClientCore;
import ec.com.altiora.entities.dto.ClientDTO;

/**
 * Class that implements the service methods.
 * 
 * @author Cristian
 *
 */
@Service("clientService")
@Transactional(readOnly = true)
public class ClientService implements IClientService {

	@Autowired
	private IClientCore clientCore;

	@Override
	public List<ClientDTO> findAll() {
		return clientCore.findAll();
	}

	@Override
	@Transactional
	public void saveClient(ClientDTO clientDTO) {
		this.clientCore.saveClient(clientDTO);
	}

	@Override
	@Transactional
	public void deleteClientById(Integer id) {
		this.clientCore.deleteClientById(id);
	}

	@Override
	@Transactional
	public void updateClient(ClientDTO clientDTO) {
		this.clientCore.updateClient(clientDTO);
	}

}
