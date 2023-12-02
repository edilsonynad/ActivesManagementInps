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
@Table(name = "geolocalizacao", schema = "public")
@NamedQuery(name = "Geolocalizacao.findAll", query = "SELECT t FROM Geolocalizacao t")
public class Geolocalizacao extends BaseActiveRecord<Geolocalizacao> {

	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "GEOLOCALIZACAO";

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idGEOLOCALIZACAO", nullable = false, updatable = false)
 	private Integer idgeolocalizacao;
	@Size(max = 100)
	@Column(name = "pais")
	private String pais;
	@Size(max = 100)
	@Column(name = "ilha")
	private String ilha;
	@Size(max = 100)
	@Column(name = "cidade")
	private String cidade;
	@Size(max = 100)
	@Column(name = "rua")
	private String rua;

	public Integer getIdgeolocalizacao() { 
		return this.idgeolocalizacao;
	}

	public void setIdgeolocalizacao(Integer idgeolocalizacao) {
		 this.idgeolocalizacao = idgeolocalizacao;
	}

	public String getPais() { 
		return this.pais;
	}

	public void setPais(String pais) {
		 this.pais = pais;
	}

	public String getIlha() { 
		return this.ilha;
	}

	public void setIlha(String ilha) {
		 this.ilha = ilha;
	}

	public String getCidade() { 
		return this.cidade;
	}

	public void setCidade(String cidade) {
		 this.cidade = cidade;
	}

	public String getRua() { 
		return this.rua;
	}

	public void setRua(String rua) {
		 this.rua = rua;
	}

public static final class Field {
	public static final String IDGEOLOCALIZACAO = "idgeolocalizacao";
	public static final String PAIS = "pais";
	public static final String ILHA = "ilha";
	public static final String CIDADE = "cidade";
	public static final String RUA = "rua";

	private Field() {}
	}
}