
package Main;

//  @author new53

import Service.MarketService;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        //menu for product operations
        Scanner options = new Scanner(System.in);
        System.out.println("Welcome to market product operations. On next, we show you \n" + 
                "the options availabe to carry with market products.");
        System.out.println("\nMenu" + 
                "\n1. Add products to List" + 
                "\n2. Update some product price" + 
                "\n3. Delete some product from list" + 
                "\n4. Show products details" + 
                "\n5. Exit");
        System.out.print("\nSelect any option from Menu: ");
        int option;
        do{
            option = options.nextInt();
            switch(option){
                case 1:
                    MarketService.createAddProduct();
                    break;
                case 2:
                    MarketService.updateProductPrice();
                    break;
                case 3:
                    MarketService.deleteProduct();
                    break;
                case 4:
                    MarketService.productListDetails();
                    break;
                case 5:
                    System.out.println("See you next time!");
                    break;
                default:
                    System.out.print("\n¡Invalid option! Try another one: ");
                    break;
            }
            if(option==5){               
                break;
            }else{
                System.out.print("\nAdd another option: ");
            }           
        }while(true);
        }
}