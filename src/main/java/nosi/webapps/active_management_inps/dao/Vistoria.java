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
@Table(name = "vistoria", schema = "public")
@NamedQuery(name = "Vistoria.findAll", query = "SELECT t FROM Vistoria t")
public class Vistoria extends BaseActiveRecord<Vistoria> {

	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "VISTORIA";

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idvistoria", nullable = false, updatable = false)
 	private Integer idvistoria;
	@Size(max = 45)
	@Column(name = "datavistoria")
	private String datavistoria;
	@Size(max = 45)
	@Column(name = "tipo1vistoria")
	private String tipo1vistoria;
	@Size(max = 45)
	@Column(name = "custovistoria")
	private String custovistoria;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "ativos_idativos", foreignKey = @ForeignKey(name = "vistoria_ativos_idativos_fkey"), referencedColumnName="idativos")
	private Ativos ativosIdativos;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "funcionarios_idfuncionarios", foreignKey = @ForeignKey(name = "vistoria_funcionarios_idfuncionarios_fkey"), referencedColumnName="idfuncionarios")
	private Funcionarios funcionariosIdfuncionarios;

	public Integer getIdvistoria() { 
		return this.idvistoria;
	}

	public void setIdvistoria(Integer idvistoria) {
		 this.idvistoria = idvistoria;
	}

	public String getDatavistoria() { 
		return this.datavistoria;
	}

	public void setDatavistoria(String datavistoria) {
		 this.datavistoria = datavistoria;
	}

	public String getTipo1vistoria() { 
		return this.tipo1vistoria;
	}

	public void setTipo1vistoria(String tipo1vistoria) {
		 this.tipo1vistoria = tipo1vistoria;
	}

	public String getCustovistoria() { 
		return this.custovistoria;
	}

	public void setCustovistoria(String custovistoria) {
		 this.custovistoria = custovistoria;
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
	public static final String IDVISTORIA = "idvistoria";
	public static final String DATAVISTORIA = "datavistoria";
	public static final String TIPO1VISTORIA = "tipo1vistoria";
	public static final String CUSTOVISTORIA = "custovistoria";
	public static final String ATIVOS_IDATIVOS = "ativosIdativos";
	public static final String FUNCIONARIOS_IDFUNCIONARIOS = "funcionariosIdfuncionarios";

	private Field() {}
	}
}