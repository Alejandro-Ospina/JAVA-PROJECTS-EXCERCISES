
package Main;

//  @author new53

import Servicio.CustomerService;
import Entidad.Rutina;
import Servicio.RoutineService;

public class DesafioGrupal3 {

    public static void main(String[] args) {
        CustomerService cliente = new CustomerService();
        System.out.println("");
        CustomerService cliente2 = new CustomerService(); 
        System.out.println("");
        System.out.println(CustomerService.obtenerCliente());
        System.out.println("");
        CustomerService.actualizarCliente(1111, "oscar", 12, 1.86d, 76, "dfdfdf");
        System.out.println("");
        System.out.println(CustomerService.obtenerCliente());
        System.out.println("");
        CustomerService.eliminarCliente(1111);
        System.out.println("");
        System.out.println(CustomerService.obtenerCliente());       
        Rutina objeto1 = new Rutina();
        Rutina objeto2 = new Rutina(); 
        RoutineService.crearRutina(objeto1);
        RoutineService.crearRutina(objeto2);                
    }
}