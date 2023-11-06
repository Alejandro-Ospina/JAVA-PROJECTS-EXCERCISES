
package Market.Services;

import Market.Entities.Manufacturer;
import Market.Entities.Product;
import Market.Persistence.ManufacturerDaoExt;
import Market.Persistence.ProductDaoExt;
import java.sql.SQLException;
import java.util.Scanner;


// @author new53
 
public class MarketService {
    private ManufacturerDaoExt mDao;
    private ProductDaoExt pDao;
    private static MarketService singleton;
    
    private MarketService(){
        mDao = new ManufacturerDaoExt();
        pDao = new ProductDaoExt();
    }
    
    /**
     * This method creates a unique instance of service to work with database
     * @return MarketService unique object
     */
    public static MarketService createService(){
        if(MarketService.singleton == null){
            singleton = new MarketService();           
        }
        return singleton;
    }
    
    public void menuSQLQueries() throws SQLException, ClassNotFoundException{
        boolean execution = true;
        System.out.println("Welcome to MENU queries...\n");
        System.out.println("1. List the whole name of products within table product.\n"
                + "2. List the name and prices of those products within table product.\n"
                + "3. List those products whose price rounds between 120 and 202.\n"
                + "4. Look up and list those products that implies portátil name.\n"
                + "5. List the name and price of that cheapest product.\n"
                + "6. Insert a new product to database.\n"
                + "7. Insert a new manufacturer to database.\n"
                + "8. Update name and price of any product.\n"
                + "9. Exit.\n");             
        do{
            System.out.print("Type the option: ");  
            int option = new Scanner(System.in).nextInt();
            switch(option){
                case 1:
                    System.out.println(pDao.consultA());
                    break;
                case 2:
                    System.out.println(pDao.consultB());
                    break;
                case 3:
                    System.out.println(pDao.consultC());
                    break;
                case 4:
                    System.out.println(pDao.consultD());
                    break;
                case 5:
                    System.out.println(pDao.consultE());
                    break;
                case 6:
                    System.out.print("Name of new product: ");
                    String name = new Scanner(System.in).useDelimiter("\n").nextLine();
                    System.out.print("Price of new product: ");
                    double price = new Scanner(System.in).useDelimiter("\n").nextDouble();
                    System.out.print("Manufacturer code: ");
                    int manufCode = new Scanner(System.in).useDelimiter("\n").nextInt();
                    pDao.consultF(new Product(name, price, manufCode));
                    break;
                case 7:
                    System.out.print("Name of new manufacturer: ");
                    String manufName = new Scanner(System.in).useDelimiter("\n").nextLine();                    
                    mDao.consultG(new Manufacturer(manufName));
                    break;
                case 8:
                    System.out.print("Type the product id to be updated: ");
                    int id = new Scanner(System.in).useDelimiter("\n").nextInt(); 
                    pDao.updateProduct(id);
                    break;  
                case 9:
                    System.out.println("Thanks!!");
                    execution = false;
                    break;
                default:
                    System.out.print("¡Value not recognized!");
                    break;
            }
        }while(execution);
    }   
}