/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author new53
 */
public enum LoadType {
    A(1000.0d),B(800.0d),C(600.0d),D(500.0d),E(300.0d),F(100.0d);
    
    private final double price;
    
    LoadType(double price){
        this.price = price;
    }
}