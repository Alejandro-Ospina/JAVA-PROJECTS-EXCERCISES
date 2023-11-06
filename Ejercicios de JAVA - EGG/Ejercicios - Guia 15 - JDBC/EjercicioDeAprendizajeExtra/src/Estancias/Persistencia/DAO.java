
package Estancias.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


// @author new53
 
public abstract class DAO {
    protected Connection connection;
    protected ResultSet resultSet;
    protected final String USER = "root";
    protected final String PASSWORD = "root";
    protected final String DATABASE = "estancias_exterior";
    protected final String DRIVER = "com.mysql.jdbc.Driver";
    
    protected void connectDatabase() throws ClassNotFoundException, SQLException{
        try{
            Class.forName(DRIVER);
            String URL = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (ClassNotFoundException | SQLException ex){
            throw ex;
        }
    } 
    
    protected void disconnectDatabase() throws SQLException{
        try{
            if(connection != null){
                connection.close();
            }
            if(resultSet != null){
                connection.close();
            }
        }catch(SQLException ex){
            throw ex;
        }
    }
    
    /////// CRUD statements
    protected void create(){};
    protected void reset(){};
    protected void update(){};
    protected void delete(){};
    
    /////// Consult statement
    protected void consultDatabse(PreparedStatement preparedStatement) throws SQLException{
        try{
            this.resultSet = preparedStatement.executeQuery();          
        }catch(SQLException ex){
            throw ex;
        }
    }         
}