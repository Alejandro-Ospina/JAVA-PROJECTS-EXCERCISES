
package MainFile;

//  @author new53

import Entidad.Curso;
import Servicios.ServicioCurso;

public class Ejercicio13 {

    public static void main(String[] args) {
        ServicioCurso curso = new ServicioCurso();
        Curso curso1 = curso.crearCurso(); // se crea el curso
        
        //calculamos la ganancia
        System.out.println("\nGanancia: $" + ServicioCurso.calcularGananciaSemana(curso1));
        ServicioCurso.detalleCurso(curso1);
    }
}
