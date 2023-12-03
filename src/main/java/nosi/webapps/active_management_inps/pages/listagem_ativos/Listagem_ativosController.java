package nosi.webapps.active_management_inps.pages.listagem_ativos;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
import nosi.webapps.active_management_inps.pagedelegate.IListagem_ativosDelegate;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Listagem_ativosController extends Controller {

	private final IListagem_ativosDelegate listagem_ativos;

	public Listagem_ativosController() {
		listagem_ativos = getComponent(IListagem_ativosDelegate.class);
	}
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Listagem_ativos model = new Listagem_ativos();
		model.load();
		Listagem_ativosView view = new Listagem_ativosView();
		if(listagem_ativos != null) listagem_ativos.index(model, view);
		view.id_ativos.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_ativo(Core.query(null,"SELECT 'Officia amet stract laudantium' as nome,'hidden-b5f5_3685' as id_ativos,'Adipiscing consectetur stract' as tipo,'Dolor rem sit iste consectetur' as estado,'Anim ut voluptatem sit sed' as categoria,'Officia sed deserunt consectet' as departamento "));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionPesquisar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Listagem_ativos model = new Listagem_ativos();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_ativos",Core.getParam("p_id_ativos"));
		  return this.forward("active_management_inps","Listagem_ativos","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (pesquisar)  *//* End-Code-Block  */
		/*----#start-code(pesquisar)----*/
		
      return this.forward("active_management_inps","Listagem_ativos","index",this.queryString());
		/*----#end-code----*/
			
	}
	
	public Response actionDetalhes() throws IOException, IllegalArgumentException, IllegalAccessException{
		Listagem_ativos model = new Listagem_ativos();
		model.load();
		Response response = listagem_ativos==null?this.redirect("active_management_inps","Registro_de_ativos","index",this.queryString()):listagem_ativos.detalhes(model);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_ativos",Core.getParam("p_id_ativos"));
		  return this.forward("active_management_inps","Registro_de_ativos","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (detalhes)  *//* End-Code-Block  */
		/*----#start-code(detalhes)----*/
		
		
		/*----#end-code----*/
		return response;	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Listagem_ativos model = new Listagem_ativos();
		model.load();
		Response response = listagem_ativos==null?this.redirect("active_management_inps","Registro_de_ativos","index",this.queryString()):listagem_ativos.editar(model);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_ativos",Core.getParam("p_id_ativos"));
		  return this.forward("active_management_inps","Registro_de_ativos","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  *//* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return response;	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Listagem_ativos model = new Listagem_ativos();
		model.load();
		Response response = listagem_ativos==null?this.redirect("active_management_inps","Registro_de_ativos","index",this.queryString()):listagem_ativos.eliminar(model);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_ativos",Core.getParam("p_id_ativos"));
		  return this.forward("active_management_inps","Registro_de_ativos","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  *//* End-Code-Block  */
		/*----#start-code(eliminar)----*/
		
		
		/*----#end-code----*/
		return response;	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
