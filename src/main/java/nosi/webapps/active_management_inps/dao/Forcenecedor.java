package nosi.webapps.active_management_inps.dao;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.GenerationType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import jakarta.validation.constraints.Size;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import jakarta.validation.constraints.NotNull;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 * @author: Nositeste 03-12-2023
*/
//@XmlRootElement // Can be used for REST / XML API

@Entity
@Table(name = "forcenecedor", schema = "public")
@NamedQuery(name = "Forcenecedor.findAll", query = "SELECT t FROM Forcenecedor t")
public class Forcenecedor extends BaseActiveRecord<Forcenecedor> {

	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "FORCENECEDOR";

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idforcenecedor", nullable = false, updatable = false)
 	private Integer idforcenecedor;
	@Size(max = 45)
	@Column(name = "nomeempresa")
	private String nomeempresa;
	@Size(max = 45)
	@Column(name = "nif")
	private String nif;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "contato_idcontato", foreignKey = @ForeignKey(name = "forcenecedor_contato_idcontato_fkey"), referencedColumnName="idcontato")
	private Contato contatoIdcontato;

	public Integer getIdforcenecedor() { 
		return this.idforcenecedor;
	}

	public void setIdforcenecedor(Integer idforcenecedor) {
		 this.idforcenecedor = idforcenecedor;
	}

	public String getNomeempresa() { 
		return this.nomeempresa;
	}

	public void setNomeempresa(String nomeempresa) {
		 this.nomeempresa = nomeempresa;
	}

	public String getNif() { 
		return this.nif;
	}

	public void setNif(String nif) {
		 this.nif = nif;
	}

	public Contato getContatoIdcontato() { 
		return this.contatoIdcontato;
	}

	public void setContatoIdcontato(Contato contatoIdcontato) {
		 this.contatoIdcontato = contatoIdcontato;
	}

public static final class Field {
	public static final String IDFORCENECEDOR = "idforcenecedor";
	public static final String NOMEEMPRESA = "nomeempresa";
	public static final String NIF = "nif";
	public static final String CONTATO_IDCONTATO = "contatoIdcontato";

	private Field() {}
	}
}