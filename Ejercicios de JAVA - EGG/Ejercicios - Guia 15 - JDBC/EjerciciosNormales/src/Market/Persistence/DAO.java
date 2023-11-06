
package Market.Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 
public abstract class DAO {   
    protected Connection connection = null;
    protected ResultSet resultSet = null;  
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    protected void connectDatabase() throws ClassNotFoundException, SQLException{
        try{
            Class.forName(DRIVER);
            String urlDatabase = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            connection = DriverManager.getConnection(urlDatabase, USER, PASSWORD);
        }catch (ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }
    
    protected void disconnectDatabase() throws SQLException{
        try{
            if (connection != null) {
                connection.close();
            }            
            if (resultSet != null) {
                resultSet.close();
            }
        }catch (SQLException ex){
            throw ex;
        }
    }
    
    protected void crudDatabase(PreparedStatement preparedStatement) throws SQLException, ClassNotFoundException{
        try{                       
            preparedStatement.executeUpdate();
        }catch (SQLException ex){
            throw ex;
        }finally {           
            disconnectDatabase();          
        }
    }
    
    protected void consultDatabase(PreparedStatement preparedStatement) throws ClassNotFoundException, SQLException{
        try{            
            resultSet = preparedStatement.executeQuery();                   
        }catch (SQLException ex){
            throw ex;
        }
    }
}