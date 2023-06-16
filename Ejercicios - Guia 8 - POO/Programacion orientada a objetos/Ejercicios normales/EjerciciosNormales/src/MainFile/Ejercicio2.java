
package MainFile;

//  @author new53
/* Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio). */

import Entidad.Circunferencia;

public class Ejercicio2 {

    public static void main(String[] args) {
        Circunferencia circunferencia = new Circunferencia(3.6);
        System.out.println("Área circunferencia: " + circunferencia.area());
        System.out.println("Perímetro circunferencia: " + circunferencia.perimetro());        
        
        //creamos circunferencia
        System.out.println("");
        circunferencia.crearCircunferencia();
        System.out.println("Área circunferencia: " + circunferencia.area());
        System.out.println("Perímetro circunferencia: " + circunferencia.perimetro());
        
        //hacemos set del radio
        System.out.println("");
        circunferencia.setRadio(4);
        System.out.println("Área circunferencia: " + circunferencia.area());
        System.out.println("Perímetro circunferencia: " + circunferencia.perimetro());
    }
}
