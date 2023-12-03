package Registro de Ativos.pages.registro de ativos;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
import Registro de Ativos.pagedelegate.IRegistro de AtivosDelegate;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Registro de AtivosController extends Controller {

	private final IRegistro de AtivosDelegate registro de ativos;

	public Registro de AtivosController() {
		registro de ativos = getComponent(IRegistro de AtivosDelegate.class);
	}
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Registro de Ativos model = new Registro de Ativos();
		model.load();
		Registro de AtivosView view = new Registro de AtivosView();
		if(registro de ativos != null) registro de ativos.index(model, view);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.categoria.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.estado.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
