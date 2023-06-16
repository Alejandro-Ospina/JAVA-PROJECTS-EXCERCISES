
package ejerciciopersonaservicio;

import Servicio.ServicioControl;

public class EjercicioPersonaServicio {

    public static void main(String[] args) {
        ServicioControl persona = new ServicioControl();
        persona.crearPersona("elio", "pez", 30);
        persona.mostrarPersona(persona);
        System.out.println("");
        persona.crearPersona("Alejo", "ospina", 27);
        persona.mostrarPersona(persona);
    }
}
