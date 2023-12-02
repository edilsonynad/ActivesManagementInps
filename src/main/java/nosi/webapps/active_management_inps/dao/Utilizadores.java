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
@Table(name = "utilizadores", schema = "public")
@NamedQuery(name = "Utilizadores.findAll", query = "SELECT t FROM Utilizadores t")
public class Utilizadores extends BaseActiveRecord<Utilizadores> {

	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "UTILIZADORES";

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUtilizadores", nullable = false, updatable = false)
 	private Integer idutilizadores;
	@Size(max = 45)
	@Column(name = "nome")
	private String nome;
	@Size(max = 45)
	@Column(name = "codigo")
	private String codigo;
	@Size(max = 45)
	@Column(name = "tipo")
	private String tipo;

	public Integer getIdutilizadores() { 
		return this.idutilizadores;
	}

	public void setIdutilizadores(Integer idutilizadores) {
		 this.idutilizadores = idutilizadores;
	}

	public String getNome() { 
		return this.nome;
	}

	public void setNome(String nome) {
		 this.nome = nome;
	}

	public String getCodigo() { 
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		 this.codigo = codigo;
	}

	public String getTipo() { 
		return this.tipo;
	}

	public void setTipo(String tipo) {
		 this.tipo = tipo;
	}

public static final class Field {
	public static final String IDUTILIZADORES = "idutilizadores";
	public static final String NOME = "nome";
	public static final String CODIGO = "codigo";
	public static final String TIPO = "tipo";

	private Field() {}
	}
}