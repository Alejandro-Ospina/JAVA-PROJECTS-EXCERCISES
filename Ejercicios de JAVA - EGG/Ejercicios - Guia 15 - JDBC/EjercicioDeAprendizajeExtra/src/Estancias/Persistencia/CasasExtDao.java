
package Estancias.Persistencia;

import Estancias.Entidades.Casas;
import java.util.List;


// @author new53
 
public final class CasasExtDao extends DAO{
    
    public List<Casas> consultaB(){
        
            String query = "SELECT * FROM casas WHERE TO_DAYS()";
        
        return null;
    }
    

}
