/**
 * 
 */
package ec.com.altiora.entities.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

/**
 * Class to represent to ALT_CLIENT table.
 * @author Cristian
 *
 */

@Data
@Entity
@Table(name="ALT_CLIENT")
@SuppressWarnings("serial")
public class ClientDTO implements Serializable{
	
	/**
	 * ALT_CLIENT table identificator.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
	@SequenceGenerator(name = "sequence", sequenceName = "ALT_SEQ_CLIENT", allocationSize=1)
	@Column(name="ID_CLIENT")
	private Integer idClient;
	
	/**
	 * Client name.
	 */
	@Column(name="FIRST_NAME")
	private String name;
	
	/**
	 * Client last name.
	 */
	@Column(name="LAST_NAME")
	private String lastName;
	
}
