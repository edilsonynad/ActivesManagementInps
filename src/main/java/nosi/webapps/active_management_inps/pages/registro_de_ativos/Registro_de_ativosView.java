package Registro de Ativos.pages.registro de ativos;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Registro de AtivosView extends View {

	public Field sectionheader_1_text;
	public Field nome;
	public Field categoria;
	public Field estado;
	public Field dimensao;
	public Field data_aquisicao;
	public Field vida_util;
	public Field valor_aquisisao;
	public Field data_depreciacao;
	public Field fornecedores;
	public Field departamento;
	public Field pais;
	public Field ilha;
	public Field cidade;
	public Field rua;
	public Field coordenadas;
	public Field sectionheader_2_text;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;
	public IGRPForm atribuicao;
	public IGRPSectionHeader sectionheader_2;


	public Registro de AtivosView(){

		this.setPageTitle("Registro de Ativos");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","Form");

		atribuicao = new IGRPForm("atribuicao","Atribuição");

		sectionheader_2 = new IGRPSectionHeader("sectionheader_2","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Informa&ccedil;&otilde;es Gerais&nbsp;</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		categoria = new ListField(model,"categoria");
		categoria.setLabel(gt("Categoria"));
		categoria.propertie().add("name","p_categoria").add("type","select").add("placeholder",gt("")).add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("placeholder",gt("")).add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		dimensao = new TextField(model,"dimensao");
		dimensao.setLabel(gt("Dimensão"));
		dimensao.propertie().add("name","p_dimensao").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		data_aquisicao = new DateField(model,"data_aquisicao");
		data_aquisicao.setLabel(gt("Data Aquisição"));
		data_aquisicao.propertie().add("name","p_data_aquisicao").add("type","date").add("enableTime","false").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt(""));
		
		vida_util = new TextField(model,"vida_util");
		vida_util.setLabel(gt("Vida util"));
		vida_util.propertie().add("name","p_vida_util").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		valor_aquisisao = new TextField(model,"valor_aquisisao");
		valor_aquisisao.setLabel(gt("Valor Aquisição"));
		valor_aquisisao.propertie().add("name","p_valor_aquisisao").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		data_depreciacao = new TextField(model,"data_depreciacao");
		data_depreciacao.setLabel(gt("Data Depreciação"));
		data_depreciacao.propertie().add("name","p_data_depreciacao").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		fornecedores = new TextField(model,"fornecedores");
		fornecedores.setLabel(gt("Fornecedores"));
		fornecedores.propertie().add("name","p_fornecedores").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		departamento = new TextField(model,"departamento");
		departamento.setLabel(gt("Departamento"));
		departamento.propertie().add("name","p_departamento").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		pais = new TextField(model,"pais");
		pais.setLabel(gt("País"));
		pais.propertie().add("name","p_pais").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		ilha = new TextField(model,"ilha");
		ilha.setLabel(gt("Ilha"));
		ilha.propertie().add("name","p_ilha").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		cidade = new TextField(model,"cidade");
		cidade.setLabel(gt("Cidade"));
		cidade.propertie().add("name","p_cidade").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		rua = new TextField(model,"rua");
		rua.setLabel(gt("Rua"));
		rua.propertie().add("name","p_rua").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		coordenadas = new TextField(model,"coordenadas");
		coordenadas.setLabel(gt("Coordenadas"));
		coordenadas.propertie().add("name","p_coordenadas").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		sectionheader_2_text = new TextField(model,"sectionheader_2_text");
		sectionheader_2_text.setLabel(gt(""));
		sectionheader_2_text.setValue(gt("<p>Informa&ccedil;&otilde;es de atribui&ccedil;&atilde;o</p>"));
		sectionheader_2_text.propertie().add("type","text").add("name","p_sectionheader_2_text").add("maxlength","4000");
		


		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);

		form_1.addField(nome);
		form_1.addField(categoria);
		form_1.addField(estado);
		form_1.addField(dimensao);
		form_1.addField(data_aquisicao);
		form_1.addField(vida_util);
		form_1.addField(valor_aquisisao);
		form_1.addField(data_depreciacao);
		form_1.addField(fornecedores);

		atribuicao.addField(departamento);
		atribuicao.addField(pais);
		atribuicao.addField(ilha);
		atribuicao.addField(cidade);
		atribuicao.addField(rua);
		atribuicao.addField(coordenadas);

		sectionheader_2.addField(sectionheader_2_text);

		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
		this.addToPage(atribuicao);
		this.addToPage(sectionheader_2);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		categoria.setValue(model);
		estado.setValue(model);
		dimensao.setValue(model);
		data_aquisicao.setValue(model);
		vida_util.setValue(model);
		valor_aquisisao.setValue(model);
		data_depreciacao.setValue(model);
		fornecedores.setValue(model);
		departamento.setValue(model);
		pais.setValue(model);
		ilha.setValue(model);
		cidade.setValue(model);
		rua.setValue(model);
		coordenadas.setValue(model);	

		}
}
