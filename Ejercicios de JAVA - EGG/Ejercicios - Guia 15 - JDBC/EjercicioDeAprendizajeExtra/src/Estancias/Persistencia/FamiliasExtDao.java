
package Estancias.Persistencia;

import Estancias.Entidades.Familias;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


// @author new53
 
public final class FamiliasExtDao extends DAO{
    
    public List<Familias> consultaA() throws NullPointerException{
        List<Familias> familias = new LinkedList<>();
        try{            
            String query = "SELECT * FROM familias WHERE num_hijos >= ? AND edad_maxima < ?";
            super.connectDatabase();
            PreparedStatement prepS = super.connection.prepareStatement(query);
            prepS.setInt(1, 3); prepS.setInt(2, 10);
            super.consultDatabse(prepS);
            while(super.resultSet.next()){
                Familias familia = new Familias();
                familia.setIdFamilia(resultSet.getInt(1));
                familia.setNombre(resultSet.getInt(2));
                familia.setEdadMinima(resultSet.getInt(3));
                familia.setEdadMaxima(resultSet.getInt(4));
                familia.setNumeroHijos(resultSet.getInt(5));
                familia.setEmail(resultSet.getString(6));
                familia.setIdCasaFamilia(resultSet.getInt(7));
                familias.add(familia);
            }           
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println(Arrays.toString(ex.getStackTrace()));           
        } finally {            
            try {
                super.disconnectDatabase();
            } catch (SQLException ex) {
                System.out.println(ex.getSQLState());
            }            
        } 
        if(familias == null){
            throw new NullPointerException("No hay familias dentro del arreglo");
        }else{
            return familias;
        }
    }
    

}
