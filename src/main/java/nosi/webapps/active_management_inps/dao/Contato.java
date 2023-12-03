package nosi.webapps.active_management_inps.dao;

import javax.persistence.Column;
import jakarta.validation.constraints.Size;
import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.NamedQuery;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 * @author: Nositeste 03-12-2023
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
	@Column(name = "idcontato", nullable = false, updatable = false)
 	private Integer idcontato;
	@Size(max = 45)
	@Column(name = "email")
	private String email;
	@Size(max = 45)
	@Column(name = "telefone")
	private String telefone;
	@Size(max = 45)
	@Column(name = "site")
	private String site;
	@Size(max = 45)
	@Column(name = "contatocol")
	private String contatocol;

	public Integer getIdcontato() { 
		return this.idcontato;
	}

	public void setIdcontato(Integer idcontato) {
		 this.idcontato = idcontato;
	}

	public String getEmail() { 
		return this.email;
	}

	public void setEmail(String email) {
		 this.email = email;
	}

	public String getTelefone() { 
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		 this.telefone = telefone;
	}

	public String getSite() { 
		return this.site;
	}

	public void setSite(String site) {
		 this.site = site;
	}

	public String getContatocol() { 
		return this.contatocol;
	}

	public void setContatocol(String contatocol) {
		 this.contatocol = contatocol;
	}

public static final class Field {
	public static final String IDCONTATO = "idcontato";
	public static final String EMAIL = "email";
	public static final String TELEFONE = "telefone";
	public static final String SITE = "site";
	public static final String CONTATOCOL = "contatocol";

	private Field() {}
	}
}