/**
 * 
 */
package ec.com.altiora.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ec.com.altiora.entities.dto.ClientDTO;

/**
 * Class that implements the persistence methods.
 * 
 * @author Cristian
 *
 */
@Repository("clientDAO")
public class ClientDAO implements IClientDAO {

	private final Logger logger = LoggerFactory.getLogger(ClientDAO.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<ClientDTO> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
		session.clear();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<ClientDTO> query = builder.createQuery(ClientDTO.class);
		Root<ClientDTO> root = query.from(ClientDTO.class);
		query.select(root);
		List<ClientDTO> list = session.createQuery(query).getResultList();
		return list;
	}

	@Override
	public void saveClient(ClientDTO clientDTO) {
		try {
			this.sessionFactory.getCurrentSession().save(clientDTO);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Override
	public void deleteClientById(Integer id) {
		try {
			Session session = this.sessionFactory.getCurrentSession();
			ClientDTO clientDTO = (ClientDTO) session.load(ClientDTO.class, id);
			session.delete(clientDTO);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Override
	public void updateClient(ClientDTO clientDTO) {
		try {
			this.sessionFactory.getCurrentSession().update(clientDTO);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

}
