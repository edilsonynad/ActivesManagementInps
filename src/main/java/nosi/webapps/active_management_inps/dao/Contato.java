package nosi.webapps.active_management_inps.dao;

import javax.persistence.GeneratedValue;
import nosi.base.ActiveRecord.BaseActiveRecord;
import jakarta.validation.constraints.Size;
import javax.persistence.Table;
import javax.persistence.NamedQuery;
import javax.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GenerationType;

/**
 * @author: Nositeste 02-12-2023
*/
//@XmlRootElement // Can be used for REST / XML API

@Entity
@Table(name = "contato", schema = "public")
@NamedQuery(name = "Contato.findAll", query = "SELECT t FROM Contato t")
public class Contato extends BaseActiveRecord<Contato> {

	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "CONTATO";

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCONTATO", nullable = false, updatable = false)
 	private Integer idcontato;
	@Size(max = 45)
	@Column(name = "telefone")
	private String telefone;
	@Size(max = 45)
	@Column(name = "email")
	private String email;
	@Size(max = 45)
	@Column(name = "facebook")
	private String facebook;
	@Size(max = 45)
	@Column(name = "site")
	private String site;
	@NotNull
	@Column(name = "FORNECEDORES_idFORNECEDOR")
	private Integer fornecedoresIdfornecedor;

	public Integer getIdcontato() { 
		return this.idcontato;
	}

	public void setIdcontato(Integer idcontato) {
		 this.idcontato = idcontato;
	}

	public String getTelefone() { 
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		 this.telefone = telefone;
	}

	public String getEmail() { 
		return this.email;
	}

	public void setEmail(String email) {
		 this.email = email;
	}

	public String getFacebook() { 
		return this.facebook;
	}

	public void setFacebook(String facebook) {
		 this.facebook = facebook;
	}

	public String getSite() { 
		return this.site;
	}

	public void setSite(String site) {
		 this.site = site;
	}

	public Integer getFornecedoresIdfornecedor() { 
		return this.fornecedoresIdfornecedor;
	}

	public void setFornecedoresIdfornecedor(Integer fornecedoresIdfornecedor) {
		 this.fornecedoresIdfornecedor = fornecedoresIdfornecedor;
	}

public static final class Field {
	public static final String IDCONTATO = "idcontato";
	public static final String TELEFONE = "telefone";
	public static final String EMAIL = "email";
	public static final String FACEBOOK = "facebook";
	public static final String SITE = "site";
	public static final String FORNECEDORES_IDFORNECEDOR = "fornecedoresIdfornecedor";

	private Field() {}
	}
}