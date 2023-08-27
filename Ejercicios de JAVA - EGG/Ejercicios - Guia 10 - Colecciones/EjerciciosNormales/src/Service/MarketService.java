
package Service;

import Entity.MarketProducts;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


// @author new53
 
public class MarketService {
    private static final HashMap<String, Double> productList = new
        HashMap();
    private static final Scanner read = new Scanner(System.in);
    
    public static void createAddProduct(){
        String answer;
        System.out.print("Please, fill the product name: ");
        while(true){
            MarketProducts product = new MarketProducts();
            product.setProductName(read.nextLine());           
            System.out.print("Set product price per unit: $");
            product.setProductPrice(read.nextDouble());
            read.nextLine();
            productList.put(product.getProductName(), product.getProductPrice());
            System.out.print("¿Would you like to add another product to list? (y/n): ");            
            answer = read.nextLine();
            if("n".equalsIgnoreCase(answer)){
                break;
            }else{
                System.out.print("\nPlease, fill another product name: ");
            }
        }
    }
    
    public static void updateProductPrice(){
        System.out.print("¿What's the product name you wish to update price?: ");
        String productName = read.nextLine();
        boolean isInList = false;
        for(String name : productList.keySet()){
            if(name.equalsIgnoreCase(productName)){
                System.out.print("Set the new price of product: $");
                productList.replace(name, productList.get(name), read.nextDouble());
                read.nextLine();
                isInList = true;
                break;
            }
        }
        if(!isInList){
            System.out.println("¡Ups! the product you just typed has NOT been found on list");
        }else{
            System.out.println("¡The product price has been updated successfully!");
        }
    }
    
    public static void deleteProduct(){
        System.out.print("¿What's the product name you wish to delete?: ");
        String productName = read.nextLine();
        boolean isInList = false;
        for(String name : productList.keySet()){
            if(name.equalsIgnoreCase(productName)){
                productList.remove(name);
                isInList = true;
                break;
            }
        }
        if(!isInList){
            System.out.println("¡Ups! the product you just typed has NOT been found on list");
        }else{
            System.out.println("¡The product has been deleted from list successfully!");
        }
    }
    
    public static void productListDetails(){
        System.out.println("\nProduct Name ---- Prices");
        productList.entrySet().forEach((products) -> {
            System.out.println(products.getKey() + " ---- " + products.getValue());
        });
    }
}