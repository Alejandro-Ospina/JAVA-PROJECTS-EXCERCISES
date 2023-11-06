
package Market;

//  @author new53

import Market.Services.MarketService;
import java.sql.SQLException;
import java.util.Arrays;

public class MarketMain {

    public static void main(String[] args) {
        MarketService mService = MarketService.createService();
        try{
            mService.menuSQLQueries();
        } catch (ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }
}