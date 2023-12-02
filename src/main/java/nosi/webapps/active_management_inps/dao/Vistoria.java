package nosi.webapps.active_management_inps.dao;

import javax.persistence.GeneratedValue;
import nosi.base.ActiveRecord.BaseActiveRecord;
import jakarta.validation.constraints.Size;
import javax.persistence.Table;
import javax.persistence.NamedQuery;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GenerationType;

/**
 * @author: Nositeste 02-12-2023
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
	@Column(name = "idVISTORIA", nullable = false, updatable = false)
 	private Integer idvistoria;
	@Size(max = 45)
	@Column(name = "tipo")
	private String tipo;
	@Size(max = 45)
	@Column(name = "auditor")
	private String auditor;
	@Column(name = "data_inicio")
	private LocalDate dataInicio;
	@Column(name = "data_fim")
	private LocalDate dataFim;
	@Size(max = 45)
	@Column(name = "custo")
	private String custo;
	@Size(max = 45)
	@Column(name = "tipovistoria")
	private String tipovistoria;

	public Integer getIdvistoria() { 
		return this.idvistoria;
	}

	public void setIdvistoria(Integer idvistoria) {
		 this.idvistoria = idvistoria;
	}

	public String getTipo() { 
		return this.tipo;
	}

	public void setTipo(String tipo) {
		 this.tipo = tipo;
	}

	public String getAuditor() { 
		return this.auditor;
	}

	public void setAuditor(String auditor) {
		 this.auditor = auditor;
	}

	public LocalDate getDataInicio() { 
		return this.dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		 this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() { 
		return this.dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		 this.dataFim = dataFim;
	}

	public String getCusto() { 
		return this.custo;
	}

	public void setCusto(String custo) {
		 this.custo = custo;
	}

	public String getTipovistoria() { 
		return this.tipovistoria;
	}

	public void setTipovistoria(String tipovistoria) {
		 this.tipovistoria = tipovistoria;
	}

public static final class Field {
	public static final String IDVISTORIA = "idvistoria";
	public static final String TIPO = "tipo";
	public static final String AUDITOR = "auditor";
	public static final String DATA_INICIO = "dataInicio";
	public static final String DATA_FIM = "dataFim";
	public static final String CUSTO = "custo";
	public static final String TIPOVISTORIA = "tipovistoria";

	private Field() {}
	}
}