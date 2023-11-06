/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioE3;

/**
 *
 * @author new53
 */
public enum GymType {
    A(50.0),B(30.0);
    
    private final double gymPriceType;

    private GymType(double gymPriceType) {
        this.gymPriceType = gymPriceType;
    }

    public double getGymPriceType() {
        return gymPriceType;
    }
}