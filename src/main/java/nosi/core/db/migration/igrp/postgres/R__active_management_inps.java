package nosi.core.db.migration.igrp.postgres;

import nosi.core.db.migration.igrp.IgrpMigrationTemplate;
import nosi.webapps.igrp.dao.Application;
import nosi.webapps.igrp.dao.Config_env;

/**
 * Nositeste
 * dez. 02, 2023
 */
public class R__active_management_inps extends IgrpMigrationTemplate{

	@Override
	public void app() {
	  this.app = new Application("active_management_inps", "Active Management INPS", "default.svg", "", 1, null,"");
	}

	@Override
	public void pages() {
		// Not implemented yet... Put your code here!
	}

	@Override
	public void transactions() {
		// Not implemented yet... Put your code here!
	}

	@Override
	public void domains() {
		// Not implemented yet... Put your code here!
	}

	@Override
	public void dbConnections() {
	  this.configs.add(new Config_env(null, "1", "org.hibernate.dialect.PostgreSQLDialect", "utf-8", "G6pC5Z/zvrwZsWyWjfO0RA==", "N/EwTHhbGGqWg6o5mrTlhA==", "dlKrjWqXzn+TFDsnJdcRUQ==", "active_management_inps_postgresql_1", "rvDSR1rjREYbBKk7KybFLkNuiy8sacBkrIT9jGIQvI34CyqXurD2A/aJ2HibSuj2", "fDYSEiVw09DSlMzSTJUW6XvVluz2/lrAfVM3rchj8pc=", this.app, (short)1, "e173efc0-8e82-4876-bf0a-06ca4e0483b4"));	}

	@Override
	public void reports() {
		// Not implemented yet... Put your code here!
	}

	@Override
	public void bpmns() {
		// Not implemented yet... Put your code here!
	}

	@Override
	public void documentTypes() {
		// Not implemented yet... Put your code here!
	}


	@Override
	public Integer getChecksum() {
		return 1699972550;
	}

}