/**
 * 
 */
package ec.com.altiora.entities.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * Class to represent to ALT_ORDER_ITEM table.
 * @author Cristian
 *
 */

@Data
@Entity
@Table(name="ALT_ORDER_ITEM")
@SuppressWarnings("serial")
public class OrderItemDTO implements Serializable{
	
	/**
	 * ALT_ORDER_ITEM table identificator.
	 */
	@Id
	@Column(name="ID_ORDER_ITEM")
	private Integer idClient;
	
	/**
	 * ALT_ORDER_ITEM table identificator.
	 */
	@Id
	@Column(name="ID_ORDER")
	private Integer idOrder;
	
	/**
	 * Order date.
	 */
	@Column(name="ID_ITEM")
	private String idItem;
	
	/**
	 * Item quantity. 
	 */
	@Column(name="QUANTITY")
	private Integer quantity;
	
	/**
	 * Item price when that was sold. 
	 */
	@Column(name="PRICE")
	private Float price;
	
	/**
	 * Order relation.
	 */
	@ManyToOne
	@JoinColumn(name = "ID_ORDER", referencedColumnName = "ID_ORDER", insertable = false, updatable = false)
	private OrderDTO orderDTO;
	
	/**
	 * Item relation.
	 */
	@ManyToOne
	@JoinColumn(name = "ID_ITEM", referencedColumnName = "ID_ITEM", insertable = false, updatable = false)
	private ItemDTO itemDTO;
	
}
