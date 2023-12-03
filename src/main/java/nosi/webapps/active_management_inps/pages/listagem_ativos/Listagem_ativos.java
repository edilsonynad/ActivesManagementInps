package nosi.webapps.active_management_inps.pages.listagem_ativos;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Listagem_ativos extends Model{		

	@RParam(rParamName = "p_page_header_description")
	private String page_header_description;

	@RParam(rParamName = "p_nome_ativo")
	private String nome_ativo;

	@RParam(rParamName = "p_departamento_p")
	private String departamento_p;

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;
	
	private List<Table_ativo> table_ativo = new ArrayList<>();	
	public void setTable_ativo(List<Table_ativo> table_ativo){
		this.table_ativo = table_ativo;
	}
	public List<Table_ativo> getTable_ativo(){
		return this.table_ativo;
	}

	
	public void setPage_header_description(String page_header_description){
		this.page_header_description = page_header_description;
	}
	public String getPage_header_description(){
		return this.page_header_description;
	}
	
	public void setNome_ativo(String nome_ativo){
		this.nome_ativo = nome_ativo;
	}
	public String getNome_ativo(){
		return this.nome_ativo;
	}
	
	public void setDepartamento_p(String departamento_p){
		this.departamento_p = departamento_p;
	}
	public String getDepartamento_p(){
		return this.departamento_p;
	}
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}


	public static class Table_ativo extends IGRPTable.Table{
		private String nome;
		private int id_ativos;
		private String tipo;
		private String estado;
		private String categoria;
		private String departamento;
		public void setNome(String nome){
			this.nome = nome;
		}
		public String getNome(){
			return this.nome;
		}

		public void setId_ativos(int id_ativos){
			this.id_ativos = id_ativos;
		}
		public int getId_ativos(){
			return this.id_ativos;
		}

		public void setTipo(String tipo){
			this.tipo = tipo;
		}
		public String getTipo(){
			return this.tipo;
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

		public void setDepartamento(String departamento){
			this.departamento = departamento;
		}
		public String getDepartamento(){
			return this.departamento;
		}

	}

	public void loadTable_ativo(BaseQueryInterface query) {
		this.setTable_ativo(this.loadTable(query,Table_ativo.class));
	}

}
