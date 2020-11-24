
package pia_poo;
import java.util.Scanner;

public class Empleado extends Coordinador {
    
    private String id_empleado;
    
    
    
    public String getId_empleado() {
        return id_empleado;
    }

    
    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }
    
    Scanner var = new Scanner(System.in);
   
   
    public void registarTrabajadores(Empleado emple) {
        System.out.println("Ingrese id de empleado");
        String id = var.nextLine();
        emple.setId_empleado(id);
    }
   
   /* @Override
     public void registarTrabajadores() {
        
    }*/
}
