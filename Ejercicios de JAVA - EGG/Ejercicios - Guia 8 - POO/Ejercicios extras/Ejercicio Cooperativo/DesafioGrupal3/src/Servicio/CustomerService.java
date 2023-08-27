
package Servicio;

import Entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;


// @author new53
 
public class CustomerService {
    private static final ArrayList<Cliente> cliente = new ArrayList<>();
    private Cliente clienteI;
    private final Scanner leer = new Scanner(System.in);

    public CustomerService() {
        clienteI = registrarCliente();
    }
    
    private Cliente registrarCliente(){
        clienteI = new Cliente();
        System.out.print("Ingrese el id del cliente: ");
        clienteI.setId(leer.nextLine());
        System.out.print("Ingrese el nombre del cliente: ");
        clienteI.setNombre(leer.nextLine());
        System.out.print("Ingrese el objetivo del cliente: ");
        clienteI.setObjetivo(leer.nextLine());
        System.out.print("Ingrese la edad del cliente: ");
        clienteI.setEdad(leer.nextInt());
        System.out.print("Ingrese la altura del cliente (m): ");
        clienteI.setAltura(leer.nextDouble());
        System.out.print("Ingrese el peso del cliente (Kg): ");
        clienteI.setPeso(leer.nextDouble());
        leer.nextLine();
        cliente.add(clienteI);
        return clienteI;
    }
    
    public static ArrayList<Cliente> obtenerCliente(){
        return CustomerService.cliente;
    }
    
    public static void actualizarCliente(int id, String nombre, int edad, double altura,
            double peso, String objetivo){
        boolean comprobar = false;
        for(int i=0; i<cliente.size(); i++){
            if(cliente.get(i).getId().equalsIgnoreCase(Integer.toString(id))){
                cliente.get(i).setNombre(nombre);
                cliente.get(i).setEdad(edad);
                cliente.get(i).setAltura(altura);
                cliente.get(i).setPeso(peso);
                cliente.get(i).setObjetivo(objetivo);
                comprobar = true;
                break;
            }
        }
        if(!comprobar){
            System.out.println("¡El cliente a actualizar no se encontró!");
        }else{
            System.out.println("¡...Cliente actualizado correctamente!");
        }
//        for(Cliente cli : cliente){
//            if(cli.getId().equalsIgnoreCase(Integer.toString(id))){
//                cliente.get(cliente.indexOf(cli)).setNombre(nombre);
//                cliente.get(cliente.indexOf(cli)).setEdad(edad);
//                cliente.get(cliente.indexOf(cli)).setAltura(altura);
//                cliente.get(cliente.indexOf(cli)).setPeso(peso);
//                cliente.get(cliente.indexOf(cli)).setObjetivo(objetivo);
//            }
//        }
    }
    
    public static void eliminarCliente(int id){
        boolean comprobar = false;
        for(Cliente cli : cliente){
            if(cli.getId().equalsIgnoreCase(Integer.toString(id))){
                cliente.remove(cli);
                comprobar = true;
                break;
            }
        }
        if(!comprobar){
            System.out.println("¡No se encontró cliente para eliminar");
        }else{
            System.out.println("...¡Cliente eliminado correctamente!");
        }
    }          
}