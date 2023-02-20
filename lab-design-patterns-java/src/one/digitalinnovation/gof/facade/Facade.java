package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsystem1.crm.CrmService;
import one.digitalinnovation.gof.subsystem2.cep.CepApi;

public class Facade {

	public void migrateClient(String name, String cep) {
		String city = CepApi.getInstancia().getCity(cep);
		String state = CepApi.getInstancia().getState(cep);
		
		CrmService.saveClient(name, cep, city, state);
	}
}
