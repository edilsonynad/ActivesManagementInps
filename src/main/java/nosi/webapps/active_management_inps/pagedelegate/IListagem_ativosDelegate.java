package nosi.webapps.active_management_inps.pagedelegate;

import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
import nosi.webapps.active_management_inps.pages.listagem_ativos.Listagem_ativos;
import nosi.webapps.active_management_inps.pages.listagem_ativos.Listagem_ativosView;

public interface IListagem_ativosDelegate {

	default void index(Listagem_ativos model, Listagem_ativosView view) {}

	default Response pesquisar(Listagem_ativos model) throws IOException {
		return null;
	}

	default Response detalhes(Listagem_ativos model) throws IOException {
		return null;
	}

	default Response editar(Listagem_ativos model) throws IOException {
		return null;
	}

	default Response eliminar(Listagem_ativos model) throws IOException {
		return null;
	}

	

}
