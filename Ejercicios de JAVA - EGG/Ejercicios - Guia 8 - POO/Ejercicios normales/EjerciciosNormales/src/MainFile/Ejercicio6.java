
package MainFile;

//  @author new53

import Entidad.Cafetera;

public class Ejercicio6 {

    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera(2000,600);
        cafetera.servirTaza(600);
        System.out.println(cafetera.toString());
        cafetera.llenarCafetera();
        System.out.println(cafetera.toString());
        cafetera.servirTaza(600);
        System.out.println(cafetera.toString());
        cafetera.servirTaza(600);
        System.out.println(cafetera.toString());
        cafetera.servirTaza(600);
        System.out.println(cafetera.toString());
        cafetera.servirTaza(600);
        System.out.println(cafetera.toString());
        cafetera.agregarCafe(300);
        System.out.println(cafetera.toString());
        cafetera.agregarCafe(2000);
        System.out.println(cafetera.toString());
    }
}
