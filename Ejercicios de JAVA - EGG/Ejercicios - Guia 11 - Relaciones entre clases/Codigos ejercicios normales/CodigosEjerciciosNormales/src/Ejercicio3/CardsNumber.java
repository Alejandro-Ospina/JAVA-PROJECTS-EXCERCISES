/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author new53
 */
public enum CardsNumber {
    One(1), Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Ten(10), 
    Eleven(11), Twelve(12);
    
    private final int cardNumber;

    private CardsNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }   

    public int getCardNumber() {
        return cardNumber;
    }   
}