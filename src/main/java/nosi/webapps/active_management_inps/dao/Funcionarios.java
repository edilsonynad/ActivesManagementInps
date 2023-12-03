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
@Table(name = "funcionarios", schema = "public")
@NamedQuery(name = "Funcionarios.findAll", query = "SELECT t FROM Funcionarios t")
public class Funcionarios extends BaseActiveRecord<Funcionarios> {

	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "FUNCIONARIOS";

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idfuncionarios", nullable = false, updatable = false)
 	private Integer idfuncionarios;
	@Size(max = 45)
	@Column(name = "nome")
	private String nome;
	@Size(max = 45)
	@Column(name = "cargo")
	private String cargo;
	@Size(max = 45)
	@Column(name = "sector")
	private String sector;
	@Size(max = 45)
	@Column(name = "dataadmissao")
	private String dataadmissao;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "departamento_iddepartamento", foreignKey = @ForeignKey(name = "funcionarios_departamento_iddepartamento_fkey"), referencedColumnName="iddepartamento")
	private Departamento departamentoIddepartamento;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "contato_idcontato", foreignKey = @ForeignKey(name = "funcionarios_contato_idcontato_fkey"), referencedColumnName="idcontato")
	private Contato contatoIdcontato;

	public Integer getIdfuncionarios() { 
		return this.idfuncionarios;
	}

	public void setIdfuncionarios(Integer idfuncionarios) {
		 this.idfuncionarios = idfuncionarios;
	}

	public String getNome() { 
		return this.nome;
	}

	public void setNome(String nome) {
		 this.nome = nome;
	}

	public String getCargo() { 
		return this.cargo;
	}

	public void setCargo(String cargo) {
		 this.cargo = cargo;
	}

	public String getSector() { 
		return this.sector;
	}

	public void setSector(String sector) {
		 this.sector = sector;
	}

	public String getDataadmissao() { 
		return this.dataadmissao;
	}

	public void setDataadmissao(String dataadmissao) {
		 this.dataadmissao = dataadmissao;
	}

	public Departamento getDepartamentoIddepartamento() { 
		return this.departamentoIddepartamento;
	}

	public void setDepartamentoIddepartamento(Departamento departamentoIddepartamento) {
		 this.departamentoIddepartamento = departamentoIddepartamento;
	}

	public Contato getContatoIdcontato() { 
		return this.contatoIdcontato;
	}

	public void setContatoIdcontato(Contato contatoIdcontato) {
		 this.contatoIdcontato = contatoIdcontato;
	}

public static final class Field {
	public static final String IDFUNCIONARIOS = "idfuncionarios";
	public static final String NOME = "nome";
	public static final String CARGO = "cargo";
	public static final String SECTOR = "sector";
	public static final String DATAADMISSAO = "dataadmissao";
	public static final String DEPARTAMENTO_IDDEPARTAMENTO = "departamentoIddepartamento";
	public static final String CONTATO_IDCONTATO = "contatoIdcontato";

	private Field() {}
	}
}