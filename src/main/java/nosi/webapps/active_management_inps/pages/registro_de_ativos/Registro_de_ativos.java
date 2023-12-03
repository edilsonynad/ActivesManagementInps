package Registro de Ativos.pages.registro de ativos;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Registro de Ativos extends Model{		

	@NotNull()
	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_codigo")
	private String codigo;

	@RParam(rParamName = "p_estado")
	private String estado;

	@RParam(rParamName = "p_categoria")
	private String categoria;

	@RParam(rParamName = "p_garantia")
	private Integer garantia;

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@RParam(rParamName = "p_sectionheader_2_text")
	private String sectionheader_2_text;

	@RParam(rParamName = "p_valor_da_compra")
	private String valor_da_compra;

	@RParam(rParamName = "p_valor_da_venda")
	private String valor_da_venda;

	@RParam(rParamName = "p_data_da_compra")
	private String data_da_compra;

	@RParam(rParamName = "p_data_da_venda")
	private String data_da_venda;

	@RParam(rParamName = "p_departamento")
	private String departamento;

	@RParam(rParamName = "p_funcionario")
	private String funcionario;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	public String getCodigo(){
		return this.codigo;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	public String getEstado(){
		return this.estado;
	}
	
	public void setCategoria(String categoria){
		this.categoria = categoria;
	}
	public String getCategoria(){
		return this.categoria;
	}
	
	public void setGarantia(Integer garantia){
		this.garantia = garantia;
	}
	public Integer getGarantia(){
		return this.garantia;
	}
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setSectionheader_2_text(String sectionheader_2_text){
		this.sectionheader_2_text = sectionheader_2_text;
	}
	public String getSectionheader_2_text(){
		return this.sectionheader_2_text;
	}
	
	public void setValor_da_compra(String valor_da_compra){
		this.valor_da_compra = valor_da_compra;
	}
	public String getValor_da_compra(){
		return this.valor_da_compra;
	}
	
	public void setValor_da_venda(String valor_da_venda){
		this.valor_da_venda = valor_da_venda;
	}
	public String getValor_da_venda(){
		return this.valor_da_venda;
	}
	
	public void setData_da_compra(String data_da_compra){
		this.data_da_compra = data_da_compra;
	}
	public String getData_da_compra(){
		return this.data_da_compra;
	}
	
	public void setData_da_venda(String data_da_venda){
		this.data_da_venda = data_da_venda;
	}
	public String getData_da_venda(){
		return this.data_da_venda;
	}
	
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	public String getDepartamento(){
		return this.departamento;
	}
	
	public void setFuncionario(String funcionario){
		this.funcionario = funcionario;
	}
	public String getFuncionario(){
		return this.funcionario;
	}



}
