/**
 * 
 */
package ec.com.altiora.entities.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Class to represent to ALT_ITEM table.
 * @author Cristian
 *
 */

@Data
@Entity
@Table(name="ALT_ITEM")
@SuppressWarnings("serial")
public class ItemDTO implements Serializable{
	
	/**
	 * ALT_ITEM table identificator.
	 */
	@Id
	@Column(name="ID_ITEM")
	private String idItem;
	
	/**
	 * Item name.
	 */
	@Column(name="NAME")
	private String name;
	
	/**
	 * Item price per unit.
	 */
	@Column(name="UNIT_PRICE")
	private float unitPrice;
	
}
