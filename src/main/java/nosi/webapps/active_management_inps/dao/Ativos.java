package nosi.webapps.active_management_inps.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.GenerationType;
import javax.persistence.ForeignKey;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import jakarta.xml.bind.annotation.XmlTransient;
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
@Table(name = "ativos", schema = "public")
@NamedQuery(name = "Ativos.findAll", query = "SELECT t FROM Ativos t")
public class Ativos extends BaseActiveRecord<Ativos> {

	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "ATIVOS";

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idativos", nullable = false, updatable = false)
 	private Integer idativos;
	@Size(max = 45)
	@Column(name = "nome")
	private String nome;
	@Size(max = 45)
	@Column(name = "tipo")
	private String tipo;
	@Size(max = 45)
	@Column(name = "dataaquisicao")
	private String dataaquisicao;
	@Size(max = 45)
	@Column(name = "valoraquisicao")
	private String valoraquisicao;
	@Size(max = 45)
	@Column(name = "vidautil")
	private String vidautil;
	@Size(max = 45)
	@Column(name = "datadepreciacao")
	private String datadepreciacao;
	@Size(max = 45)
	@Column(name = "estado")
	private String estado;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "departamento_iddepartamento", foreignKey = @ForeignKey(name = "ativos_departamento_iddepartamento_fkey"), referencedColumnName="iddepartamento")
	private Departamento departamentoIddepartamento;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "geolocalizacao_idgeolocalizacao", foreignKey = @ForeignKey(name = "ativos_geolocalizacao_idgeolocalizacao_fkey"), referencedColumnName="idgeolocalizacao")
	private Geolocalizacao geolocalizacaoIdgeolocalizacao;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "forcenecedor_idforcenecedor", foreignKey = @ForeignKey(name = "ativos_forcenecedor_idforcenecedor_fkey"), referencedColumnName="idforcenecedor")
	private Forcenecedor forcenecedorIdforcenecedor;
	@Size(max = 45)
	@Column(name = "dimensao")
	private String dimensao;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "forcenecedorIdforcenecedor")
	private List<Ativos> ativosList;

	public Integer getIdativos() { 
		return this.idativos;
	}

	public void setIdativos(Integer idativos) {
		 this.idativos = idativos;
	}

	public String getNome() { 
		return this.nome;
	}

	public void setNome(String nome) {
		 this.nome = nome;
	}

	public String getTipo() { 
		return this.tipo;
	}

	public void setTipo(String tipo) {
		 this.tipo = tipo;
	}

	public String getDataaquisicao() { 
		return this.dataaquisicao;
	}

	public void setDataaquisicao(String dataaquisicao) {
		 this.dataaquisicao = dataaquisicao;
	}

	public String getValoraquisicao() { 
		return this.valoraquisicao;
	}

	public void setValoraquisicao(String valoraquisicao) {
		 this.valoraquisicao = valoraquisicao;
	}

	public String getVidautil() { 
		return this.vidautil;
	}

	public void setVidautil(String vidautil) {
		 this.vidautil = vidautil;
	}

	public String getDatadepreciacao() { 
		return this.datadepreciacao;
	}

	public void setDatadepreciacao(String datadepreciacao) {
		 this.datadepreciacao = datadepreciacao;
	}

	public String getEstado() { 
		return this.estado;
	}

	public void setEstado(String estado) {
		 this.estado = estado;
	}

	public Departamento getDepartamentoIddepartamento() { 
		return this.departamentoIddepartamento;
	}

	public void setDepartamentoIddepartamento(Departamento departamentoIddepartamento) {
		 this.departamentoIddepartamento = departamentoIddepartamento;
	}

	public Geolocalizacao getGeolocalizacaoIdgeolocalizacao() { 
		return this.geolocalizacaoIdgeolocalizacao;
	}

	public void setGeolocalizacaoIdgeolocalizacao(Geolocalizacao geolocalizacaoIdgeolocalizacao) {
		 this.geolocalizacaoIdgeolocalizacao = geolocalizacaoIdgeolocalizacao;
	}

	public Forcenecedor getForcenecedorIdforcenecedor() { 
		return this.forcenecedorIdforcenecedor;
	}

	public void setForcenecedorIdforcenecedor(Forcenecedor forcenecedorIdforcenecedor) {
		 this.forcenecedorIdforcenecedor = forcenecedorIdforcenecedor;
	}

	public String getDimensao() { 
		return this.dimensao;
	}

	public void setDimensao(String dimensao) {
		 this.dimensao = dimensao;
	}

	@XmlTransient
	public List<Ativos> getativosList() {
		return ativosList;
	}
	public void setativosList(List<Ativos> ativosList) {
		this.ativosList = ativosList;
	}

public static final class Field {
	public static final String IDATIVOS = "idativos";
	public static final String NOME = "nome";
	public static final String TIPO = "tipo";
	public static final String DATAAQUISICAO = "dataaquisicao";
	public static final String VALORAQUISICAO = "valoraquisicao";
	public static final String VIDAUTIL = "vidautil";
	public static final String DATADEPRECIACAO = "datadepreciacao";
	public static final String ESTADO = "estado";
	public static final String DEPARTAMENTO_IDDEPARTAMENTO = "departamentoIddepartamento";
	public static final String GEOLOCALIZACAO_IDGEOLOCALIZACAO = "geolocalizacaoIdgeolocalizacao";
	public static final String FORCENECEDOR_IDFORCENECEDOR = "forcenecedorIdforcenecedor";
	public static final String DIMENSAO = "dimensao";

	private Field() {}
	}
}