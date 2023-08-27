
package MainFile;

//  @author new53

import ejerciciopractica2.Servicio.ServicioCircunferencia;



public class EjercicioPractica2 {

    public static void main(String[] args) {
        //Circunferencia objeto = new Circunferencia();        
        //objeto.setRadio(6);
        //System.out.println("Valor del radio: " + objeto.getRadio());       
        ServicioCircunferencia objeto = new ServicioCircunferencia();
        
        //Detalle circunferencia
        System.out.println("Perimetro: " + objeto.calcularPerimetro() + 
                           "\nÁrea: " + objeto.calcularArea());      
    }
}
