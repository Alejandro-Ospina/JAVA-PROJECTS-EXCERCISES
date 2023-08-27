
package MainFile;

//  @author new53

import Entidad.FigurasGeometricas;
import Servicios.ServicioFigurasGeometricas;
import java.util.Scanner;

public class ActividadCooperativa2 {

    public static void main(String[] args) {
        ServicioFigurasGeometricas figuras = new ServicioFigurasGeometricas();
        Scanner entrada = new Scanner(System.in);
        System.out.println("MENÚ DE FIGURAS GEOMÉTRICAS\n" + 
                "1. Cuadrado\n" + "2. Rectángulo\n" + "3. Triángulo equilatero\n" + 
                "4. Circulo\n" + "5. Hexágono regular\n" + "6. Pentágono regular\n" +
                "7. Rombo");
        System.out.print("Elija la opción de figura que desea trabajar: ");
        int opcion = entrada.nextInt();
        System.out.println("");
        switch(opcion){
            case 1:
                FigurasGeometricas cuadrado = figuras.crearCuadrado();
                ServicioFigurasGeometricas.perimetroAreaCuadrado(cuadrado);
                break;
            case 2:
                FigurasGeometricas rectangulo = figuras.crearRectangulo();
                ServicioFigurasGeometricas.perimetroAreaRectangulo(rectangulo);
                break;
            case 3:
                FigurasGeometricas triangulo = figuras.crearTriangulo();
                ServicioFigurasGeometricas.perimetroAreaTriangulo(triangulo);
                break;
            case 4:
                FigurasGeometricas circulo = figuras.crearCirculo();
                ServicioFigurasGeometricas.perimetroAreaCirculo(circulo);
                break;
            case 5:
                FigurasGeometricas hexagono = figuras.crearHexagono();
                ServicioFigurasGeometricas.perimetroAreaHexagono(hexagono);
                break;
            case 6:
                FigurasGeometricas pentagono = figuras.crearPentagono();
                ServicioFigurasGeometricas.perimetroAreaPentagono(pentagono);
                break;
            case 7:
                FigurasGeometricas rombo = figuras.crearRombo();
                ServicioFigurasGeometricas.perimetroAreaRombo(rombo);
                break;
            default:
                System.out.println("¡Opción no válida!");
        }               
    }
}
