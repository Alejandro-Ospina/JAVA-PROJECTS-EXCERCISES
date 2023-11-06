
package Market.Persistence;

import Market.Entities.Manufacturer;
import java.sql.PreparedStatement;
import java.sql.SQLException;


// @author new53
 
public class ManufacturerDaoExt extends DAO{
    
    /**
     * This method inserts a new manufacturer into "producto" table within "tienda" database
     * @param manufacturer
     * @throws NullPointerException if manufacturer object is empty
     * @throws SQLException whether some SQL issues appear or any connection breaks.
     * @throws ClassNotFoundException
     */
    public void consultG(Manufacturer manufacturer) throws NullPointerException, 
            SQLException, ClassNotFoundException{
        try{
            if(manufacturer == null){
                throw new NullPointerException("¡Error: Manufacturer data is empty!");
            }
            super.connectDatabase();
            String query = "INSERT INTO fabricante(nombre) VALUES(?);";
            PreparedStatement pS = connection.prepareStatement(query);
            pS.setString(1,manufacturer.getManufacturerName());
            super.crudDatabase(pS);
        }catch (NullPointerException | SQLException | ClassNotFoundException ex){
            throw ex;
        }
    }
}