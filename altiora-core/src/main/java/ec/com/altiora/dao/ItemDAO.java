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

import ec.com.altiora.entities.dto.ItemDTO;

/**
 * @author Cristian
 *
 */
@Repository("itemDao")
public class ItemDAO implements IItemDAO {

	private final Logger logger = LoggerFactory.getLogger(ItemDAO.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<ItemDTO> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
		session.clear();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<ItemDTO> query = builder.createQuery(ItemDTO.class);
		Root<ItemDTO> root = query.from(ItemDTO.class);
		query.select(root);
		List<ItemDTO> list = session.createQuery(query).getResultList();
		return list;
	}

	@Override
	public void saveItem(ItemDTO itemDTO) {
		try {
			this.sessionFactory.getCurrentSession().save(itemDTO);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Override
	public void deleteItemById(String id) {
		try {
			Session session = this.sessionFactory.getCurrentSession();
			ItemDTO itemDTO = (ItemDTO) session.load(ItemDTO.class, id);
			session.delete(itemDTO);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@Override
	public void updateItem(ItemDTO itemDTO) {
		try {
			this.sessionFactory.getCurrentSession().update(itemDTO);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

}
