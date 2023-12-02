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
@Table(name = "requisicao", schema = "public")
@NamedQuery(name = "Requisicao.findAll", query = "SELECT t FROM Requisicao t")
public class Requisicao extends BaseActiveRecord<Requisicao> {

	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "REQUISICAO";

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idREQUISICAO", nullable = false, updatable = false)
 	private Integer idrequisicao;
	@Size(max = 45)
	@Column(name = "tempo_previsto")
	private String tempoPrevisto;
	@Size(max = 45)
	@Column(name = "data_requisicao")
	private String dataRequisicao;
	@Size(max = 45)
	@Column(name = "data_devolucao")
	private String dataDevolucao;
	@NotNull
	@Column(name = "UTILIZADORES_idUtilizadores")
	private Integer utilizadoresIdutilizadores;

	public Integer getIdrequisicao() { 
		return this.idrequisicao;
	}

	public void setIdrequisicao(Integer idrequisicao) {
		 this.idrequisicao = idrequisicao;
	}

	public String getTempoPrevisto() { 
		return this.tempoPrevisto;
	}

	public void setTempoPrevisto(String tempoPrevisto) {
		 this.tempoPrevisto = tempoPrevisto;
	}

	public String getDataRequisicao() { 
		return this.dataRequisicao;
	}

	public void setDataRequisicao(String dataRequisicao) {
		 this.dataRequisicao = dataRequisicao;
	}

	public String getDataDevolucao() { 
		return this.dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		 this.dataDevolucao = dataDevolucao;
	}

	public Integer getUtilizadoresIdutilizadores() { 
		return this.utilizadoresIdutilizadores;
	}

	public void setUtilizadoresIdutilizadores(Integer utilizadoresIdutilizadores) {
		 this.utilizadoresIdutilizadores = utilizadoresIdutilizadores;
	}

public static final class Field {
	public static final String IDREQUISICAO = "idrequisicao";
	public static final String TEMPO_PREVISTO = "tempoPrevisto";
	public static final String DATA_REQUISICAO = "dataRequisicao";
	public static final String DATA_DEVOLUCAO = "dataDevolucao";
	public static final String UTILIZADORES_IDUTILIZADORES = "utilizadoresIdutilizadores";

	private Field() {}
	}
}