package nosi.webapps.active_management_inps.pages.listagem_ativos;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Listagem_ativosView extends View {

	public Field page_header_description;
	public Field nome;
	public Field id_ativos;
	public Field tipo;
	public Field estado;
	public Field categoria;
	public Field departamento;
	public Field nome_ativo;
	public Field departamento_p;
	public Field sectionheader_1_text;
	public IGRPForm page_header;
	public IGRPForm card_1;
	public IGRPTable table_ativo;
	public IGRPForm form_1;
	public IGRPSectionHeader sectionheader_1;

	public IGRPButton btn_pesquisar;
	public IGRPButton btn_detalhes;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar;

	public Listagem_ativosView(){

		this.setPageTitle("Listagem ativos");
			
		page_header = new IGRPForm("page_header","Listagem ativos");

		card_1 = new IGRPForm("card_1","Card");

		table_ativo = new IGRPTable("table_ativo","Lista Ativos");

		form_1 = new IGRPForm("form_1","Form");

		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		page_header_description = new TextField(model,"page_header_description");
		page_header_description.setLabel(gt(""));
		page_header_description.propertie().add("name","p_page_header_description").add("type","text").add("maxlength","4000");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","30").add("showLabel","true").add("filter","true").add("table","true").add("group_in","");
		
		id_ativos = new HiddenField(model,"id_ativos");
		id_ativos.setLabel(gt(""));
		id_ativos.propertie().add("name","p_id_ativos").add("type","hidden").add("maxlength","30").add("showLabel","true").add("filter","true").add("table","true").add("group_in","").add("java-type","int").add("tag","id_ativos");
		
		tipo = new TextField(model,"tipo");
		tipo.setLabel(gt("Tipo"));
		tipo.propertie().add("name","p_tipo").add("type","text").add("maxlength","30").add("showLabel","true").add("filter","true").add("table","true").add("group_in","");
		
		estado = new TextField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","text").add("maxlength","30").add("showLabel","true").add("filter","true").add("table","true").add("group_in","");
		
		categoria = new TextField(model,"categoria");
		categoria.setLabel(gt("Categoria"));
		categoria.propertie().add("name","p_categoria").add("type","text").add("maxlength","30").add("showLabel","true").add("filter","true").add("table","true").add("group_in","");
		
		departamento = new TextField(model,"departamento");
		departamento.setLabel(gt("Departamento"));
		departamento.propertie().add("name","p_departamento").add("type","text").add("maxlength","30").add("showLabel","true").add("filter","true").add("table","true").add("group_in","");
		
		nome_ativo = new TextField(model,"nome_ativo");
		nome_ativo.setLabel(gt("Nome Ativo"));
		nome_ativo.propertie().add("name","p_nome_ativo").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		departamento_p = new TextField(model,"departamento_p");
		departamento_p.setLabel(gt("Departamento"));
		departamento_p.propertie().add("name","p_departamento_p").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Lista de Ativos</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		


		btn_pesquisar = new IGRPButton("Pesquisar","active_management_inps","Listagem_ativos","pesquisar","submit","btn-info|","","");
		btn_pesquisar.propertie.add("id","button_dfb7_db79").add("type","form").add("class","info").add("rel","pesquisar").add("refresh_components","");

		btn_detalhes = new IGRPButton("Detalhes","active_management_inps","Listagem_ativos","detalhes","_blank","btn-info|fa-eye","","");
		btn_detalhes.propertie.add("id","button_afad_344e").add("type","specific").add("class","info").add("rel","detalhes").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","active_management_inps","Listagem_ativos","editar","confirm","btn-warning|fa-pencil","","");
		btn_editar.propertie.add("id","button_4b0d_ab06").add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","").add("labelConfirm","Deseja realmente realizar esta operação?");

		btn_eliminar = new IGRPButton("Eliminar","active_management_inps","Listagem_ativos","eliminar","_blank","btn-danger|fa-trash","","");
		btn_eliminar.propertie.add("id","button_64e6_da63").add("type","specific").add("class","danger").add("rel","eliminar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		page_header.addField(page_header_description);


		table_ativo.addField(nome);
		table_ativo.addField(id_ativos);
		table_ativo.addField(tipo);
		table_ativo.addField(estado);
		table_ativo.addField(categoria);
		table_ativo.addField(departamento);

		form_1.addField(nome_ativo);
		form_1.addField(departamento_p);

		sectionheader_1.addField(sectionheader_1_text);

		form_1.addButton(btn_pesquisar);
		table_ativo.addButton(btn_detalhes);
		table_ativo.addButton(btn_editar);
		table_ativo.addButton(btn_eliminar);
		this.addToPage(page_header);
		this.addToPage(card_1);
		this.addToPage(table_ativo);
		this.addToPage(form_1);
		this.addToPage(sectionheader_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		page_header_description.setValue(model);
		nome.setValue(model);
		id_ativos.setValue(model);
		tipo.setValue(model);
		estado.setValue(model);
		categoria.setValue(model);
		departamento.setValue(model);
		nome_ativo.setValue(model);
		departamento_p.setValue(model);	

		table_ativo.loadModel(((Listagem_ativos) model).getTable_ativo());
		}
}
