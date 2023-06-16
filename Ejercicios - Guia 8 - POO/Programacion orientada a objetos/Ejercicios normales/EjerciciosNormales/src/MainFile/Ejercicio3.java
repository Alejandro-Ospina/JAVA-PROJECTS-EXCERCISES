
package MainFile;

//  @author new53

import Entidad.Operacion;

/* Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main. */
public class Ejercicio3 {

    public static void main(String[] args) {
        //creamos una objeto de la clase Operacion llamado operacion
        Operacion operacion = new Operacion();
        Operacion operacion2 = new Operacion(3,15);
        
        //usando el método crearOperacion
        System.out.println("");
        operacion.crearOperacion();
        System.out.println("Suma: " + operacion.sumar());
        System.out.println("Resta: " + operacion.restar());
        System.out.println("Multiplicación: " + operacion.multiplicar());
        System.out.println("División: " + operacion.dividir());
        
        //usando el método set
        System.out.println("");
        operacion.setNumero1(15);
        operacion.setNumero2(0);
        System.out.println("Suma: " + operacion.sumar());
        System.out.println("Resta: " + operacion.restar());
        System.out.println("Multiplicación: " + operacion.multiplicar());
        System.out.println("División: " + operacion.dividir());
        
        //usando un objeto del metodo constructor
        System.out.println("");
        System.out.println("Suma: " + operacion2.sumar());
        System.out.println("Resta: " + operacion2.restar());
        System.out.println("Multiplicación: " + operacion2.multiplicar());
        System.out.println("División: " + operacion2.dividir());               
    }
}
