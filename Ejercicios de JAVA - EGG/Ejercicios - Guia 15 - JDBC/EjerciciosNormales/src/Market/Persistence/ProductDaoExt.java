
package Market.Persistence;

import Market.Entities.Manufacturer;
import Market.Entities.Product;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// @author new53
 
public final class ProductDaoExt extends DAO{
    
    /**
     * This method inserts a new product into "producto" table within "tienda" database
     * @param product
     * @throws NullPointerException if product is empty
     * @throws SQLException whether some SQL issues appear or any connection breaks.
     * @throws ClassNotFoundException 
     */
    public void consultF(Product product) throws NullPointerException, SQLException, ClassNotFoundException{
        try{
            if(product == null){
                throw new NullPointerException("¡Error: Product data empty!");
            } 
            String query = "INSERT INTO producto(nombre, precio, codigo_fabricante) VALUES(?, ?, ?);";
            super.connectDatabase();
            PreparedStatement pS = connection.prepareStatement(query);
            pS.setString(1, product.getProductName());
            pS.setDouble(2, product.getProductPrice());
            pS.setInt(3, product.getManufacturerCode());
            super.crudDatabase(pS);
        } catch (NullPointerException | SQLException | ClassNotFoundException ex){
            throw ex;
        } 
    }
    
    /**
     * This method retrieves a list of products within product table
     * @return List of objects from database "tienda" within 
     * "producto" table.
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public List<String> consultA() throws SQLException, ClassNotFoundException{
        try{
            String query = "SELECT nombre FROM producto;";
            super.connectDatabase();
            PreparedStatement pS = connection.prepareStatement(query);
            super.consultDatabase(pS);
            List<String> listOfProducts = new ArrayList();           
            while(super.resultSet.next()){
                String name = super.resultSet.getString(1); 
                listOfProducts.add(name);
            }
            return listOfProducts;
        }catch (SQLException | ClassNotFoundException ex){
            throw ex;
        }finally {
            super.disconnectDatabase();
        }       
    }
    
    /**
     * This method retrieves a list of products with its prices within "producto" table
     * @return List of products and its prices
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public List<String> consultB() throws SQLException, ClassNotFoundException{
        try{
            String query = "SELECT nombre, precio FROM producto;";
            super.connectDatabase();
            PreparedStatement pS = connection.prepareStatement(query);
            super.consultDatabase(pS);
            List<String> listOfProducts = new ArrayList();           
            while(super.resultSet.next()){                
                String name = super.resultSet.getString(1); 
                double price= super.resultSet.getDouble(2); 
                listOfProducts.add(name + " - " + Double.toString(
                price));
            }
            return listOfProducts;
        }catch (SQLException | ClassNotFoundException ex){
            throw ex;
        }finally {
            super.disconnectDatabase();
        }       
    }
    
    /**
     * This method retrieves a list of productos within "producto" table, whose price
     * rounds between 120 and 202
     * @return List of products with price between 120 and 202
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public List<Product> consultC() throws SQLException, ClassNotFoundException{
        try{
            String query = "SELECT * FROM producto WHERE precio BETWEEN ? AND ?;";
            super.connectDatabase();
            PreparedStatement pS = connection.prepareStatement(query);
            pS.setDouble(1, 120.0d); pS.setDouble(2, 202.d); 
            super.consultDatabase(pS);
            List<Product> listOfProducts = new ArrayList();           
            while(super.resultSet.next()){
                Product product = new Product();
                product.setProductCode(super.resultSet.getInt(1)); 
                product.setProductName(super.resultSet.getString(2)); 
                product.setProductPrice(super.resultSet.getDouble(3)); 
                product.setManufacturerCode(super.resultSet.getInt(4)); 
                listOfProducts.add(product);
            }
            return listOfProducts;
        }catch (SQLException | ClassNotFoundException ex){
            throw ex;
        }finally {
            super.disconnectDatabase();
        }       
    }
    
    /**
     * This method retrieves a list of products that contain "Portátil" word
     * @return List of products that contain "Portátil" word
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public List<String> consultD() throws SQLException, ClassNotFoundException{
        try{
            super.connectDatabase();
            String query = "SELECT nombre FROM producto WHERE nombre LIKE ?;";
            String like = "%Portátil%";
            PreparedStatement pS = connection.prepareStatement(query);
            pS.setString(1, like);
            super.consultDatabase(pS);
            List<String> listOfProducts = new ArrayList();           
            while(super.resultSet.next()){
                String name = super.resultSet.getString(1); 
                listOfProducts.add(name);
            }
            return listOfProducts;
        }catch (SQLException | ClassNotFoundException ex){
            throw ex;
        }finally {
            super.disconnectDatabase();
        }       
    }
    
    /**
     * Retrieves the name and price of cheapest product from "producto" table
     * @return The name and price of cheapest product from "producto" table
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public String consultE() throws SQLException, ClassNotFoundException{
        try{
            super.connectDatabase();
            String query = "SELECT * FROM producto ORDER BY precio ASC LIMIT ?;";
            PreparedStatement pS = connection.prepareStatement(query);
            pS.setInt(1, 1); 
            super.consultDatabase(pS);  
            String name = ""; double price = 0;
            while(super.resultSet.next()){
                name = super.resultSet.getString(2); 
                price = super.resultSet.getDouble(3);                
            } 
            return name + " - " + Double.toString(price);
        }catch (SQLException | ClassNotFoundException ex){
            throw ex;
        }finally {
            super.disconnectDatabase();
        }       
    }
    
    /**
     * This method updates any name and price from table "producto".
     * Additionally, user can choose the row to be updated by typing product id
     * @param id or product code
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void updateProduct(int id) throws SQLException, ClassNotFoundException{
        try{            
            System.out.print("Insert new name: "); 
            String name = new Scanner(System.in).useDelimiter("\n").nextLine();
            System.out.print("Insert new price: "); 
            double price = new Scanner(System.in).useDelimiter("\n").nextDouble();
            super.connectDatabase();
            String sqlQuery = "UPDATE producto SET nombre = ?, precio = ? "
                    + "WHERE codigo = ?";
            PreparedStatement pS2 = connection.prepareStatement(sqlQuery);
            pS2.setString(1, name); pS2.setDouble(2, price); pS2.setInt(3, id);           
            super.crudDatabase(pS2);
        }catch (SQLException | ClassNotFoundException ex){
            throw ex;
        }finally {
            super.disconnectDatabase();
        }  
    }   
}