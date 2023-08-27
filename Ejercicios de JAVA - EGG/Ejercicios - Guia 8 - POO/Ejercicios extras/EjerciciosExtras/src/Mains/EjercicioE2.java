package Mains;

//  @author new53

import Servicios.ServicioPuntos;

public class EjercicioE2 {

    public static void main(String[] args) {
        ServicioPuntos objeto1 = new ServicioPuntos(); // Se crea el primer objeto de la clase entidad Puntos por medio del constructor vacío del servicio
        ServicioPuntos objeto2 = new ServicioPuntos(1.0d, 2.0d, 3.0d, 4.0d); // se crea un segundo objeto de la clase entidad Puntos, por medio del constructor parametrizado del servicio
        
        System.out.println("\nDistancia Euclidiana del primer objeto...");
        System.out.printf("D: %.3f\n", objeto1.calcularDistanciaE());
        ///////
        System.out.println("\nDistancia Euclidiana del segundo objeto...");
        System.out.printf("D: %.3f\n", objeto2.calcularDistanciaE());       
    }
}