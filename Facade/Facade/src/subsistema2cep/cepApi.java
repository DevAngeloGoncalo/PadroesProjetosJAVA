package subsistema2cep;
public class cepApi {

    private static cepApi instancia = new cepApi();

    private cepApi(){
        super();
    }

    public static cepApi getInstance(){

        return instancia;
    } 

    public String recuperarCidade(String cep){
    
        return "Lagoa de Itaenga";
    }

    public String recuperarEstado(String cep){
    
        return "Pernambuco";
    }
    
}
