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
@Table(name = "transacoes", schema = "public")
@NamedQuery(name = "Transacoes.findAll", query = "SELECT t FROM Transacoes t")
public class Transacoes extends BaseActiveRecord<Transacoes> {

	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "TRANSACOES";

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtransacoes", nullable = false, updatable = false)
 	private Integer idtransacoes;
	@Size(max = 45)
	@Column(name = "datatransacao")
	private String datatransacao;
	@Size(max = 45)
	@Column(name = "tipotransacao")
	private String tipotransacao;
	@Size(max = 45)
	@Column(name = "valortransacao")
	private String valortransacao;
	@Size(max = 45)
	@Column(name = "transacoescol")
	private String transacoescol;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "ativos_idativos", foreignKey = @ForeignKey(name = "transacoes_ativos_idativos_fkey"), referencedColumnName="idativos")
	private Ativos ativosIdativos;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "funcionarios_idfuncionarios", foreignKey = @ForeignKey(name = "transacoes_funcionarios_idfuncionarios_fkey"), referencedColumnName="idfuncionarios")
	private Funcionarios funcionariosIdfuncionarios;

	public Integer getIdtransacoes() { 
		return this.idtransacoes;
	}

	public void setIdtransacoes(Integer idtransacoes) {
		 this.idtransacoes = idtransacoes;
	}

	public String getDatatransacao() { 
		return this.datatransacao;
	}

	public void setDatatransacao(String datatransacao) {
		 this.datatransacao = datatransacao;
	}

	public String getTipotransacao() { 
		return this.tipotransacao;
	}

	public void setTipotransacao(String tipotransacao) {
		 this.tipotransacao = tipotransacao;
	}

	public String getValortransacao() { 
		return this.valortransacao;
	}

	public void setValortransacao(String valortransacao) {
		 this.valortransacao = valortransacao;
	}

	public String getTransacoescol() { 
		return this.transacoescol;
	}

	public void setTransacoescol(String transacoescol) {
		 this.transacoescol = transacoescol;
	}

	public Ativos getAtivosIdativos() { 
		return this.ativosIdativos;
	}

	public void setAtivosIdativos(Ativos ativosIdativos) {
		 this.ativosIdativos = ativosIdativos;
	}

	public Funcionarios getFuncionariosIdfuncionarios() { 
		return this.funcionariosIdfuncionarios;
	}

	public void setFuncionariosIdfuncionarios(Funcionarios funcionariosIdfuncionarios) {
		 this.funcionariosIdfuncionarios = funcionariosIdfuncionarios;
	}

public static final class Field {
	public static final String IDTRANSACOES = "idtransacoes";
	public static final String DATATRANSACAO = "datatransacao";
	public static final String TIPOTRANSACAO = "tipotransacao";
	public static final String VALORTRANSACAO = "valortransacao";
	public static final String TRANSACOESCOL = "transacoescol";
	public static final String ATIVOS_IDATIVOS = "ativosIdativos";
	public static final String FUNCIONARIOS_IDFUNCIONARIOS = "funcionariosIdfuncionarios";

	private Field() {}
	}
}