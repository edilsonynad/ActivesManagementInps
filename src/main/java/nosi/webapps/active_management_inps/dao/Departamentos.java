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
@Table(name = "departamentos", schema = "public")
@NamedQuery(name = "Departamentos.findAll", query = "SELECT t FROM Departamentos t")
public class Departamentos extends BaseActiveRecord<Departamentos> {

	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "DEPARTAMENTOS";

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDEPARTAMENTOS", nullable = false, updatable = false)
 	private Integer iddepartamentos;
	@Size(max = 45)
	@Column(name = "nome")
	private String nome;

	public Integer getIddepartamentos() { 
		return this.iddepartamentos;
	}

	public void setIddepartamentos(Integer iddepartamentos) {
		 this.iddepartamentos = iddepartamentos;
	}

	public String getNome() { 
		return this.nome;
	}

	public void setNome(String nome) {
		 this.nome = nome;
	}

public static final class Field {
	public static final String IDDEPARTAMENTOS = "iddepartamentos";
	public static final String NOME = "nome";

	private Field() {}
	}
}