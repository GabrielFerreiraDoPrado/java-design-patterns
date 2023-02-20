package one.digitalinnovation.gof.subsystem2.cep;

public class CepApi {

private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String getCity(String cep) {
		return "Brasilia";
	}
	
	public String getState(String cep) {
		return "DF";
	}
}
