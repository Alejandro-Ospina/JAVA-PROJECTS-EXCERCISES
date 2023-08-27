
package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


// @author new53
 
public class CardsDeck {   
    private static List<String> cards;  
    private static List<String> cardsRemoved = new ArrayList<>();
    private static Scanner read = new Scanner(System.in);
    private static CardsNumber cardNumber;
    private static CardsSuit cardSuit;
    
    public static void fillDeck(){ 
        cards = new ArrayList<String>();
        for(CardsSuit i : cardSuit.values()){
            for(CardsNumber j : cardNumber.values()){
                cards.add(j.toString() + " of " + i);
            }
        }
        System.out.println("¡Deck filled Successfully!");
    }
    
    public static void shuffleDeck(){      
        Collections.shuffle(cards);
        System.out.println("¡Deck shuffled successfully!");
    }
    
    public static void nextCard(){
        if(cards.isEmpty() || cards.size() == 1){
            System.out.println("There aren´t cards to show");
        }else{
            System.out.println("Next card on deck: " + cards.get(1).toString());
        }
    }
    
    public static void availableCards(){
        System.out.println("Available cards: " + cards.size());
    }
    
    public static void giveCards(){
        System.out.print("Hoy many cards do you request?: ");
        int numCards = read.nextInt();
        if(cards.isEmpty() || cards.size() < numCards){
            System.out.println("¡There are not enough cards to give you!");
        }else{
            for(int i=0; i<numCards; i++){
                cardsRemoved.add(cards.get(i));
                cards.remove(cards.get(i));
            }
        }      
    }
    
    public static void givenCards(){
        System.out.println("Given card details");
        for(String i : cardsRemoved){
            System.out.println(i);
        }
    }
    
    public static void actualDeck(){
        System.out.println("Actual deck details");
        for(String i : cards){
            System.out.println(i);
        }
    }   
}