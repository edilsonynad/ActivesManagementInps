package nosi.webapps.active_management_inps.dao;

import javax.persistence.GeneratedValue;
import nosi.base.ActiveRecord.BaseActiveRecord;
import jakarta.validation.constraints.Size;
import javax.persistence.Table;
import javax.persistence.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GenerationType;

/**
 * @author: Nositeste 02-12-2023
*/
//@XmlRootElement // Can be used for REST / XML API

@Entity
@Table(name = "marcas", schema = "public")
@NamedQuery(name = "Marcas.findAll", query = "SELECT t FROM Marcas t")
public class Marcas extends BaseActiveRecord<Marcas> {

	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "MARCAS";

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@Size(max = 45)
	@Column(name = "nome")
	private String nome;

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public String getNome() { 
		return this.nome;
	}

	public void setNome(String nome) {
		 this.nome = nome;
	}

public static final class Field {
	public static final String ID = "id";
	public static final String NOME = "nome";

	private Field() {}
	}
}