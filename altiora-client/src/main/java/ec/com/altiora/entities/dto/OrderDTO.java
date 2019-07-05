/**
 * 
 */
package ec.com.altiora.entities.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * Class to represent to ALT_ORDER table.
 * @author Cristian
 *
 */

@Data
@Entity
@Table(name="ALT_ORDER")
@SuppressWarnings("serial")
public class OrderDTO implements Serializable{
	
	/**
	 * ALT_ORDER table identificator.
	 */
	@Id
	@Column(name="ID_ORDER")
	private int idOrder;
	
	/**
	 * ALT_CLIENT table identificator.
	 */
	@Column(name="ID_CLIENT")
	private int idClient;
	
	/**
	 * Order date.
	 */
	@Column(name="ORDER_DATE")
	private LocalDateTime date;
	
	/**
	 * Client - Order relation.
	 */
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT", referencedColumnName = "ID_ORDER", insertable = false, updatable = false)
	private ClientDTO clientDTO;
	
	
}
