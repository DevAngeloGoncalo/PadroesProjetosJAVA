package subsistema1crm;

public class crmService {

    private crmService(){
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema CRM");
        System.out.println("Nome: " + nome + " cep: " + cep + " estado: " + estado);
    }   
}
