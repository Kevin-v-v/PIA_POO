
package pia_poo;
import java.util.Scanner;

public class Coordinador extends Empleado implements IEmpleado{
    
    private String id_coordinador;
   
    Scanner sc = new Scanner(System.in);
    
 
    public void registarCoordinadores(Coordinador coordi) {
        System.out.println("Ingrese id de coordinador");
        String id = sc.nextLine();
        coordi.setId_Coordinador(id);
        System.out.println("Ingrese nombre");
        String nom = sc.nextLine();
        coordi.setNombre(nom);
        System.out.println("Ingrese apellido paterno");
        String app = sc.nextLine();
        coordi.setApellidoP(app);
        System.out.println("Ingrese telefono");
        String tel = sc.nextLine();
        coordi.setTelefono(tel);
        System.out.println("Ingrese email");
        String eml = sc.nextLine();
        coordi.setEmail(eml);
        coordi.setSueldo(coordi.calcularSueldo());
    }

     
    
    public String getId_Empleado() {
        return id_coordinador;
    }

    
    public void setId_Coordinador(String id_coordinador) {
        this.id_coordinador = id_coordinador;
    }

    @Override
    public void empleadoTrabaja() {
        //Este metodo debe mostrar un mensaje que describa el trabajo del coordinador
    }

   
}