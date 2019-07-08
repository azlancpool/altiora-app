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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ec.com.altiora.entities.dto.OrderDTO;
import ec.com.altiora.entities.dto.OrderItemDTO;

/**
 * @author Cristian
 *
 */

@Repository("orderDao")
public class OrderDAO implements IOrderDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<OrderDTO> findOrders() {
		Session session = this.sessionFactory.getCurrentSession();
		session.clear();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<OrderDTO> query = builder.createQuery(OrderDTO.class);
		Root<OrderDTO> root = query.from(OrderDTO.class);
		query.select(root);
		return session.createQuery(query).getResultList();
	}

	@Override
	public List<OrderItemDTO> findItemsByOrderId(Integer idOrder) {
		Session session = this.sessionFactory.getCurrentSession();
		session.clear();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<OrderItemDTO> query = builder.createQuery(OrderItemDTO.class);
		Root<OrderItemDTO> root = query.from(OrderItemDTO.class);
		query.where(builder.equal(root.get("idOrder"), idOrder));
		query.select(root);
		return session.createQuery(query).getResultList();
	}

}
