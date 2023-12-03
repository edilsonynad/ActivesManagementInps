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
@Table(name = "departamento", schema = "public")
@NamedQuery(name = "Departamento.findAll", query = "SELECT t FROM Departamento t")
public class Departamento extends BaseActiveRecord<Departamento> {

	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "DEPARTAMENTO";

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iddepartamento", nullable = false, updatable = false)
 	private Integer iddepartamento;
	@Size(max = 45)
	@Column(name = "nome")
	private String nome;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "geolocalizacao_idgeolocalizacao", foreignKey = @ForeignKey(name = "departamento_geolocalizacao_idgeolocalizacao_fkey"), referencedColumnName="idgeolocalizacao")
	private Geolocalizacao geolocalizacaoIdgeolocalizacao;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "contato_idcontato", foreignKey = @ForeignKey(name = "departamento_contato_idcontato_fkey"), referencedColumnName="idcontato")
	private Contato contatoIdcontato;

	public Integer getIddepartamento() { 
		return this.iddepartamento;
	}

	public void setIddepartamento(Integer iddepartamento) {
		 this.iddepartamento = iddepartamento;
	}

	public String getNome() { 
		return this.nome;
	}

	public void setNome(String nome) {
		 this.nome = nome;
	}

	public Geolocalizacao getGeolocalizacaoIdgeolocalizacao() { 
		return this.geolocalizacaoIdgeolocalizacao;
	}

	public void setGeolocalizacaoIdgeolocalizacao(Geolocalizacao geolocalizacaoIdgeolocalizacao) {
		 this.geolocalizacaoIdgeolocalizacao = geolocalizacaoIdgeolocalizacao;
	}

	public Contato getContatoIdcontato() { 
		return this.contatoIdcontato;
	}

	public void setContatoIdcontato(Contato contatoIdcontato) {
		 this.contatoIdcontato = contatoIdcontato;
	}

public static final class Field {
	public static final String IDDEPARTAMENTO = "iddepartamento";
	public static final String NOME = "nome";
	public static final String GEOLOCALIZACAO_IDGEOLOCALIZACAO = "geolocalizacaoIdgeolocalizacao";
	public static final String CONTATO_IDCONTATO = "contatoIdcontato";

	private Field() {}
	}
}