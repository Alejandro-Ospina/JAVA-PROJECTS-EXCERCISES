
package Ejercicio3;

//  @author new53
public class Ejercicio3 {

    public static void main(String[] args) {
        CardsDeck.fillDeck();
        System.out.println("-------------");
        CardsDeck.shuffleDeck();
        System.out.println("-------------");
        CardsDeck.actualDeck();
        System.out.println("-------------");
        CardsDeck.nextCard();  
        System.out.println("-------------");
        CardsDeck.giveCards();
        System.out.println("-------------");
        CardsDeck.givenCards();
        System.out.println("-------------");
        CardsDeck.nextCard();
        System.out.println("-------------");
        CardsDeck.actualDeck();
    }
}