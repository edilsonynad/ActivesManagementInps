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
@Table(name = "fornecedores", schema = "public")
@NamedQuery(name = "Fornecedores.findAll", query = "SELECT t FROM Fornecedores t")
public class Fornecedores extends BaseActiveRecord<Fornecedores> {

	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "FORNECEDORES";

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFORNECEDOR", nullable = false, updatable = false)
 	private Integer idfornecedor;
	@Size(max = 45)
	@Column(name = "empresa")
	private String empresa;
	@Size(max = 45)
	@Column(name = "nif")
	private String nif;

	public Integer getIdfornecedor() { 
		return this.idfornecedor;
	}

	public void setIdfornecedor(Integer idfornecedor) {
		 this.idfornecedor = idfornecedor;
	}

	public String getEmpresa() { 
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		 this.empresa = empresa;
	}

	public String getNif() { 
		return this.nif;
	}

	public void setNif(String nif) {
		 this.nif = nif;
	}

public static final class Field {
	public static final String IDFORNECEDOR = "idfornecedor";
	public static final String EMPRESA = "empresa";
	public static final String NIF = "nif";

	private Field() {}
	}
}