package nosi.webapps.active_management_inps.dao;

import javax.persistence.GeneratedValue;
import nosi.base.ActiveRecord.BaseActiveRecord;
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
@Table(name = "vistoria_has_ativos", schema = "public")
@NamedQuery(name = "VistoriaHasAtivos.findAll", query = "SELECT t FROM VistoriaHasAtivos t")
public class VistoriaHasAtivos extends BaseActiveRecord<VistoriaHasAtivos> {

	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "VISTORIA_HAS_ATIVOS";

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VISTORIA_idVISTORIA", nullable = false, updatable = false)
 	private Integer vistoriaIdvistoria;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ATIVOS_idATIVOS", nullable = false, updatable = false)
 	private Integer ativosIdativos;

	public Integer getVistoriaIdvistoria() { 
		return this.vistoriaIdvistoria;
	}

	public void setVistoriaIdvistoria(Integer vistoriaIdvistoria) {
		 this.vistoriaIdvistoria = vistoriaIdvistoria;
	}

	public Integer getAtivosIdativos() { 
		return this.ativosIdativos;
	}

	public void setAtivosIdativos(Integer ativosIdativos) {
		 this.ativosIdativos = ativosIdativos;
	}

public static final class Field {
	public static final String VISTORIA_IDVISTORIA = "vistoriaIdvistoria";
	public static final String ATIVOS_IDATIVOS = "ativosIdativos";

	private Field() {}
	}
}