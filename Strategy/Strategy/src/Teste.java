import Comportamentos.Comportamento;
import Comportamentos.ComportamentoNormal;
import Comportamentos.ComportamentoOfensivo;
import Comportamentos.ComportamentoDefensivo;

public class Teste {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento ofensivo = new ComportamentoOfensivo(); 
        Comportamento defensivo = new ComportamentoDefensivo();
        
        Robo robo = new Robo();
        robo.setComportamento(normal); 

        robo.mover();  
        robo.mover(); 

        robo.setComportamento(ofensivo); 
        robo.mover(); 
        robo.mover(); 
        robo.mover(); 

        robo.setComportamento(defensivo); 
        robo.mover(); 
    }
}
