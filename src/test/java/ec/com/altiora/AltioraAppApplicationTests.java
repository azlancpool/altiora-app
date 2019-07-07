package ec.com.altiora;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ec.com.altiora.entities.dto.ClientDTO;
import ec.com.altiora.service.IClientService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AltioraAppApplicationTests {

	private final Logger logger = LoggerFactory.getLogger(AltioraAppApplicationTests.class);

	@Autowired
	private IClientService clientService;

	@Test
	public void findAllClients() {
		ClientDTO clientDTO = new ClientDTO();
		clientDTO.setName("Cristian");
		clientDTO.setLastName("Naranjo");
		clientService.saveClient(clientDTO);
		clientService.saveClient(clientDTO);
		List<ClientDTO> list = clientService.findAll();
		list.forEach(client -> logger.info(client.getIdClient().toString().concat("-").concat(client.getName())));
	}

}
