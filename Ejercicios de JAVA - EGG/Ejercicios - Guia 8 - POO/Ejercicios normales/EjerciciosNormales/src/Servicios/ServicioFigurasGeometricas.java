
package Servicios;

import Entidad.FigurasGeometricas;
import java.util.Scanner;


// @author new53
 
public class ServicioFigurasGeometricas {
    private final Scanner entrada = new Scanner(System.in);
    private final FigurasGeometricas objeto = new FigurasGeometricas();
    
    public FigurasGeometricas crearCuadrado(){
        System.out.print("Ingrese el valor del lado (cm): ");
        objeto.setLado(entrada.nextDouble());
        return objeto;
    }
    
    public FigurasGeometricas crearRectangulo(){
        System.out.print("Ingrese el valor del ancho (cm): ");
        objeto.setAncho(entrada.nextDouble());
        System.out.print("Ingrese el valor del largo (cm): ");
        objeto.setLargo(entrada.nextDouble());
        return objeto;
    }
    
    public FigurasGeometricas crearTriangulo(){
        System.out.print("Ingrese el valor de la base (cm): ");
        objeto.setBase(entrada.nextDouble());        
        return objeto;
    }
    
    public FigurasGeometricas crearCirculo(){
        System.out.print("Ingrese el valor del radio (cm): ");
        objeto.setRadio(entrada.nextDouble());        
        return objeto;
    }
    
    public FigurasGeometricas crearHexagono(){
        System.out.print("Ingrese el valor del lado del hexágono (cm): ");
        objeto.sethLado(entrada.nextDouble());       
        return objeto;
    }
    
    public FigurasGeometricas crearPentagono(){
        System.out.print("Ingrese el valor del lado del pentágono (cm): ");
        objeto.setpLado(entrada.nextDouble());
        return objeto;
    }
    
    public FigurasGeometricas crearRombo(){
        System.out.print("Ingrese el valor de la diagonal 1 (cm): ");
        objeto.setDiagonal1(entrada.nextDouble());
        System.out.print("Ingrese el valor de la diagonal 2 (cm): ");
        objeto.setDiagonal2(entrada.nextDouble());
        return objeto;
    }
    
    public static void perimetroAreaCuadrado(FigurasGeometricas objeto){
        System.out.println("");
        System.out.println("PERÍMETRO Y ÁREA DE UN CUADRADO");
        System.out.printf("Perímetro: '%.3f' cm \nÁrea: '%.3f' cm2\n", (objeto.getLado() * 4),
                  (objeto.getLado()*objeto.getLado()));
    }
    
    public static void perimetroAreaRectangulo(FigurasGeometricas objeto){
        System.out.println("");
        System.out.println("PERÍMETRO Y ÁREA DE UN RECTÁNGULO");
        System.out.printf("Perímetro: '%.3f' cm \nÁrea: '%.3f' cm2\n", (objeto.getAncho()*2 + objeto.getLargo()*2),
                 (objeto.getLargo()*objeto.getAncho()));
    }
    
    public static void perimetroAreaTriangulo(FigurasGeometricas objeto){
        System.out.println("");
        System.out.println("PERÍMETRO Y ÁREA DE UN TRIÁNGULO EQUILATERO");
        System.out.printf("Perímetro: '%.3f' cm \nÁrea: '%.3f' cm2\n", (objeto.getBase() * 3), 
                (((Math.sqrt(3))*(objeto.getBase()*objeto.getBase()))/4));
    }
    
    public static void perimetroAreaCirculo(FigurasGeometricas objeto){
        System.out.println("");
        System.out.println("PERÍMETRO Y ÁREA DE UN CIRCULO");
        System.out.printf("Perímetro: '%.3f' cm \nÁrea: '%.3f' cm2\n", (objeto.getRadio()*2*Math.PI), 
                (Math.PI*objeto.getRadio()*objeto.getRadio()));
    }
    
    public static void perimetroAreaHexagono(FigurasGeometricas objeto){
        System.out.println("");
        System.out.println("PERÍMETRO Y ÁREA DE UN HEXÁGONO REGULAR");
        System.out.printf("Perímetro: '%.3f' cm \nÁrea: '%.3f' cm2\n", (objeto.gethLado()*6), 
                ((3*(objeto.gethLado()*objeto.gethLado())*Math.sqrt(3))/2));
    }
    
    public static void perimetroAreaPentagono(FigurasGeometricas objeto){
        System.out.println("");
        System.out.println("PERÍMETRO Y ÁREA DE UN PENTÁGONO REGULAR");
        System.out.printf("Perímetro: '%.3f' cm \nÁrea: '%.3f' cm2\n", (objeto.getpLado()*5), 
                ((Math.sqrt(5*(objeto.getpLado()*objeto.getpLado())*(5+(2*Math.sqrt(5)))))));
    }
    
    public static void perimetroAreaRombo(FigurasGeometricas objeto){
        System.out.println("");
        System.out.println("PERÍMETRO Y ÁREA DE UN ROMBO REGULAR");
        System.out.printf("Perímetro: '%.3f' cm \nÁrea: '%.3f' cm2\n", (2*Math.sqrt((objeto.getDiagonal1()*objeto.getDiagonal1())+(objeto.getDiagonal2()*objeto.getDiagonal2()))), 
                ((objeto.getDiagonal1()*objeto.getDiagonal2())/2));
    }
}