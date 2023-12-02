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
@Table(name = "ativos", schema = "public")
@NamedQuery(name = "Ativos.findAll", query = "SELECT t FROM Ativos t")
public class Ativos extends BaseActiveRecord<Ativos> {

	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "ATIVOS";

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idATIVOS", nullable = false, updatable = false)
 	private Integer idativos;
	@Size(max = 45)
	@Column(name = "valor_venda")
	private String valorVenda;
	@Size(max = 45)
	@Column(name = "valor_compra")
	private String valorCompra;
	@Size(max = 45)
	@Column(name = "data_compra")
	private String dataCompra;
	@Size(max = 45)
	@Column(name = "data_venda")
	private String dataVenda;
	@Size(max = 45)
	@Column(name = "estado")
	private String estado;
	@Size(max = 45)
	@Column(name = "garantia")
	private String garantia;
	@Size(max = 45)
	@Column(name = "categoria")
	private String categoria;
	@Size(max = 45)
	@Column(name = "codigo")
	private String codigo;
	@Size(max = 45)
	@Column(name = "nome")
	private String nome;
	@Size(max = 45)
	@Column(name = "obs")
	private String obs;
	@Size(max = 45)
	@Column(name = "tamanho")
	private String tamanho;
	@NotNull
	@Column(name = "DEPARTAMENTOS_idDEPARTAMENTOS")
	private Integer departamentosIddepartamentos;
	@NotNull
	@Column(name = "UTILIZADORES_idUtilizadores")
	private Integer utilizadoresIdutilizadores;
	@NotNull
	@Column(name = "GEOLOCALIZACAO_idGEOLOCALIZACAO")
	private Integer geolocalizacaoIdgeolocalizacao;
	@NotNull
	@Column(name = "REQUISICAO_idREQUISICAO")
	private Integer requisicaoIdrequisicao;
	@NotNull
	@Column(name = "FORNECEDORES_idFORNECEDOR")
	private Integer fornecedoresIdfornecedor;
	@NotNull
	@Column(name = "MARCAS_id")
	private Integer marcasId;

	public Integer getIdativos() { 
		return this.idativos;
	}

	public void setIdativos(Integer idativos) {
		 this.idativos = idativos;
	}

	public String getValorVenda() { 
		return this.valorVenda;
	}

	public void setValorVenda(String valorVenda) {
		 this.valorVenda = valorVenda;
	}

	public String getValorCompra() { 
		return this.valorCompra;
	}

	public void setValorCompra(String valorCompra) {
		 this.valorCompra = valorCompra;
	}

	public String getDataCompra() { 
		return this.dataCompra;
	}

	public void setDataCompra(String dataCompra) {
		 this.dataCompra = dataCompra;
	}

	public String getDataVenda() { 
		return this.dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		 this.dataVenda = dataVenda;
	}

	public String getEstado() { 
		return this.estado;
	}

	public void setEstado(String estado) {
		 this.estado = estado;
	}

	public String getGarantia() { 
		return this.garantia;
	}

	public void setGarantia(String garantia) {
		 this.garantia = garantia;
	}

	public String getCategoria() { 
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		 this.categoria = categoria;
	}

	public String getCodigo() { 
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		 this.codigo = codigo;
	}

	public String getNome() { 
		return this.nome;
	}

	public void setNome(String nome) {
		 this.nome = nome;
	}

	public String getObs() { 
		return this.obs;
	}

	public void setObs(String obs) {
		 this.obs = obs;
	}

	public String getTamanho() { 
		return this.tamanho;
	}

	public void setTamanho(String tamanho) {
		 this.tamanho = tamanho;
	}

	public Integer getDepartamentosIddepartamentos() { 
		return this.departamentosIddepartamentos;
	}

	public void setDepartamentosIddepartamentos(Integer departamentosIddepartamentos) {
		 this.departamentosIddepartamentos = departamentosIddepartamentos;
	}

	public Integer getUtilizadoresIdutilizadores() { 
		return this.utilizadoresIdutilizadores;
	}

	public void setUtilizadoresIdutilizadores(Integer utilizadoresIdutilizadores) {
		 this.utilizadoresIdutilizadores = utilizadoresIdutilizadores;
	}

	public Integer getGeolocalizacaoIdgeolocalizacao() { 
		return this.geolocalizacaoIdgeolocalizacao;
	}

	public void setGeolocalizacaoIdgeolocalizacao(Integer geolocalizacaoIdgeolocalizacao) {
		 this.geolocalizacaoIdgeolocalizacao = geolocalizacaoIdgeolocalizacao;
	}

	public Integer getRequisicaoIdrequisicao() { 
		return this.requisicaoIdrequisicao;
	}

	public void setRequisicaoIdrequisicao(Integer requisicaoIdrequisicao) {
		 this.requisicaoIdrequisicao = requisicaoIdrequisicao;
	}

	public Integer getFornecedoresIdfornecedor() { 
		return this.fornecedoresIdfornecedor;
	}

	public void setFornecedoresIdfornecedor(Integer fornecedoresIdfornecedor) {
		 this.fornecedoresIdfornecedor = fornecedoresIdfornecedor;
	}

	public Integer getMarcasId() { 
		return this.marcasId;
	}

	public void setMarcasId(Integer marcasId) {
		 this.marcasId = marcasId;
	}

public static final class Field {
	public static final String IDATIVOS = "idativos";
	public static final String VALOR_VENDA = "valorVenda";
	public static final String VALOR_COMPRA = "valorCompra";
	public static final String DATA_COMPRA = "dataCompra";
	public static final String DATA_VENDA = "dataVenda";
	public static final String ESTADO = "estado";
	public static final String GARANTIA = "garantia";
	public static final String CATEGORIA = "categoria";
	public static final String CODIGO = "codigo";
	public static final String NOME = "nome";
	public static final String OBS = "obs";
	public static final String TAMANHO = "tamanho";
	public static final String DEPARTAMENTOS_IDDEPARTAMENTOS = "departamentosIddepartamentos";
	public static final String UTILIZADORES_IDUTILIZADORES = "utilizadoresIdutilizadores";
	public static final String GEOLOCALIZACAO_IDGEOLOCALIZACAO = "geolocalizacaoIdgeolocalizacao";
	public static final String REQUISICAO_IDREQUISICAO = "requisicaoIdrequisicao";
	public static final String FORNECEDORES_IDFORNECEDOR = "fornecedoresIdfornecedor";
	public static final String MARCAS_ID = "marcasId";

	private Field() {}
	}
}