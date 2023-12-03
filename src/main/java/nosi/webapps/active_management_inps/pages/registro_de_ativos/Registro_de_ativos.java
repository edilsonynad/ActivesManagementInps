package Registro de Ativos.pages.registro de ativos;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Registro de Ativos extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@NotNull()
	@RParam(rParamName = "p_nome")
	private String nome;

	@NotNull()
	@RParam(rParamName = "p_categoria")
	private String categoria;

	@RParam(rParamName = "p_estado")
	private String estado;

	@RParam(rParamName = "p_dimensao")
	private String dimensao;

	@NotNull()
	@RParam(rParamName = "p_data_aquisicao")
	private String data_aquisicao;

	@RParam(rParamName = "p_vida_util")
	private String vida_util;

	@NotNull()
	@RParam(rParamName = "p_valor_aquisisao")
	private String valor_aquisisao;

	@NotNull()
	@RParam(rParamName = "p_data_depreciacao")
	private String data_depreciacao;

	@RParam(rParamName = "p_fornecedores")
	private String fornecedores;

	@RParam(rParamName = "p_departamento")
	private String departamento;

	@RParam(rParamName = "p_pais")
	private String pais;

	@RParam(rParamName = "p_ilha")
	private String ilha;

	@RParam(rParamName = "p_cidade")
	private String cidade;

	@RParam(rParamName = "p_rua")
	private String rua;

	@RParam(rParamName = "p_coordenadas")
	private String coordenadas;

	@RParam(rParamName = "p_sectionheader_2_text")
	private String sectionheader_2_text;
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setCategoria(String categoria){
		this.categoria = categoria;
	}
	public String getCategoria(){
		return this.categoria;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	public String getEstado(){
		return this.estado;
	}
	
	public void setDimensao(String dimensao){
		this.dimensao = dimensao;
	}
	public String getDimensao(){
		return this.dimensao;
	}
	
	public void setData_aquisicao(String data_aquisicao){
		this.data_aquisicao = data_aquisicao;
	}
	public String getData_aquisicao(){
		return this.data_aquisicao;
	}
	
	public void setVida_util(String vida_util){
		this.vida_util = vida_util;
	}
	public String getVida_util(){
		return this.vida_util;
	}
	
	public void setValor_aquisisao(String valor_aquisisao){
		this.valor_aquisisao = valor_aquisisao;
	}
	public String getValor_aquisisao(){
		return this.valor_aquisisao;
	}
	
	public void setData_depreciacao(String data_depreciacao){
		this.data_depreciacao = data_depreciacao;
	}
	public String getData_depreciacao(){
		return this.data_depreciacao;
	}
	
	public void setFornecedores(String fornecedores){
		this.fornecedores = fornecedores;
	}
	public String getFornecedores(){
		return this.fornecedores;
	}
	
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	public String getDepartamento(){
		return this.departamento;
	}
	
	public void setPais(String pais){
		this.pais = pais;
	}
	public String getPais(){
		return this.pais;
	}
	
	public void setIlha(String ilha){
		this.ilha = ilha;
	}
	public String getIlha(){
		return this.ilha;
	}
	
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	public String getCidade(){
		return this.cidade;
	}
	
	public void setRua(String rua){
		this.rua = rua;
	}
	public String getRua(){
		return this.rua;
	}
	
	public void setCoordenadas(String coordenadas){
		this.coordenadas = coordenadas;
	}
	public String getCoordenadas(){
		return this.coordenadas;
	}
	
	public void setSectionheader_2_text(String sectionheader_2_text){
		this.sectionheader_2_text = sectionheader_2_text;
	}
	public String getSectionheader_2_text(){
		return this.sectionheader_2_text;
	}



}
