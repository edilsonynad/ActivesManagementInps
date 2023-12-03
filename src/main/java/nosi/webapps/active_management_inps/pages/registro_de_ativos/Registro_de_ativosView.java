package Registro de Ativos.pages.registro de ativos;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Registro de AtivosView extends View {

	public Field nome;
	public Field codigo;
	public Field estado;
	public Field categoria;
	public Field garantia;
	public Field sectionheader_1_text;
	public Field sectionheader_2_text;
	public Field valor_da_compra;
	public Field valor_da_venda;
	public Field data_da_compra;
	public Field data_da_venda;
	public Field departamento;
	public Field funcionario;
	public IGRPForm form_1;
	public IGRPSectionHeader sectionheader_1;
	public IGRPSectionHeader sectionheader_2;
	public IGRPForm buyandsell;
	public IGRPForm atribuicao;


	public Registro de AtivosView(){

		this.setPageTitle("Registro de Ativos");
			
		form_1 = new IGRPForm("form_1","Informações do ativo");

		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		sectionheader_2 = new IGRPSectionHeader("sectionheader_2","");

		buyandsell = new IGRPForm("buyandsell","Informações de compra e venda");

		atribuicao = new IGRPForm("atribuicao","Atribuição");

		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		codigo = new TextField(model,"codigo");
		codigo.setLabel(gt("Código"));
		codigo.propertie().add("name","p_codigo").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("placeholder",gt("")).add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		categoria = new ListField(model,"categoria");
		categoria.setLabel(gt("Categoria"));
		categoria.propertie().add("name","p_categoria").add("type","select").add("placeholder",gt("")).add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		garantia = new NumberField(model,"garantia");
		garantia.setLabel(gt("Garantia"));
		garantia.propertie().add("name","p_garantia").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("java-type","");
		
		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Informa&ccedil;&otilde;es Gerais&nbsp;</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		sectionheader_2_text = new TextField(model,"sectionheader_2_text");
		sectionheader_2_text.setLabel(gt(""));
		sectionheader_2_text.setValue(gt("<p>Informa&ccedil;&otilde;es de compra/venda</p>"));
		sectionheader_2_text.propertie().add("type","text").add("name","p_sectionheader_2_text").add("maxlength","4000");
		
		valor_da_compra = new TextField(model,"valor_da_compra");
		valor_da_compra.setLabel(gt("Valor da compra"));
		valor_da_compra.propertie().add("name","p_valor_da_compra").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		valor_da_venda = new TextField(model,"valor_da_venda");
		valor_da_venda.setLabel(gt("Valor da venda "));
		valor_da_venda.propertie().add("name","p_valor_da_venda").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		data_da_compra = new DateField(model,"data_da_compra");
		data_da_compra.setLabel(gt("Data da compra "));
		data_da_compra.propertie().add("name","p_data_da_compra").add("type","date").add("enableTime","false").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt(""));
		
		data_da_venda = new DateField(model,"data_da_venda");
		data_da_venda.setLabel(gt("Data da venda"));
		data_da_venda.propertie().add("name","p_data_da_venda").add("type","date").add("enableTime","false").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt(""));
		
		departamento = new TextField(model,"departamento");
		departamento.setLabel(gt("Departamento"));
		departamento.propertie().add("name","p_departamento").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		
		funcionario = new TextField(model,"funcionario");
		funcionario.setLabel(gt("Funcionário "));
		funcionario.propertie().add("name","p_funcionario").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","");
		


		
	}
		
	@Override
	public void render(){
		
		form_1.addField(nome);
		form_1.addField(codigo);
		form_1.addField(estado);
		form_1.addField(categoria);
		form_1.addField(garantia);

		sectionheader_1.addField(sectionheader_1_text);

		sectionheader_2.addField(sectionheader_2_text);

		buyandsell.addField(valor_da_compra);
		buyandsell.addField(valor_da_venda);
		buyandsell.addField(data_da_compra);
		buyandsell.addField(data_da_venda);

		atribuicao.addField(departamento);
		atribuicao.addField(funcionario);

		this.addToPage(form_1);
		this.addToPage(sectionheader_1);
		this.addToPage(sectionheader_2);
		this.addToPage(buyandsell);
		this.addToPage(atribuicao);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		codigo.setValue(model);
		estado.setValue(model);
		categoria.setValue(model);
		garantia.setValue(model);
		valor_da_compra.setValue(model);
		valor_da_venda.setValue(model);
		data_da_compra.setValue(model);
		data_da_venda.setValue(model);
		departamento.setValue(model);
		funcionario.setValue(model);	

		}
}
