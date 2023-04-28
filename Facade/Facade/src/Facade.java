import subsistema1crm.crmService;
import subsistema2cep.cepApi;

public class Facade {
    
    public void migrarCliente(String nome, String cep){
        
        String cidade = cepApi.getInstance().recuperarCidade(cep);
        String estado = cepApi.getInstance().recuperarEstado(cep);
        crmService.gravarCliente(nome, cep, cidade, estado);
    }
}
