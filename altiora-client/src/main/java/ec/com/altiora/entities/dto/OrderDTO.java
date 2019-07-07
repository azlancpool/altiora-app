/**
 * 
 */
package ec.com.altiora.entities.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
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
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
	@SequenceGenerator(name = "sequence", sequenceName = "ALT_SEQ_ORDER", allocationSize=1)
	@Column(name="ID_ORDER")
	private Integer idOrder;
	
	/**
	 * ALT_CLIENT table identificator.
	 */
	@Column(name="ID_CLIENT")
	private Integer idClient;
	
	/**
	 * Order date.
	 */
	@Column(name="ORDER_DATE")
	private LocalDateTime date;
	
	/**
	 * Client - Order relation.
	 */
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT", referencedColumnName = "ID_CLIENT", insertable = false, updatable = false)
	private ClientDTO clientDTO;
	
	
}
