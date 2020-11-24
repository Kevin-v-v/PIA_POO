
package pia_poo;
import java.util.Scanner;

public class Coordinador {
    
    private String id_coordinador;
    private String nombre;
    private String apellidoP;
    private String telefono;
    private String email;
    
    
    Scanner sc = new Scanner(System.in);
    

    public float calcularSueldo(){
        
        int horas;
        float pago;
        
        System.out.println("Ingrese horas trabajadas");
        horas=sc.nextInt();
        System.out.println("Ingrese pago por hora");
        pago=sc.nextFloat();
        
        return horas*pago;
    }
 
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
    }

     
    
    public String getId_Empleado() {
        return id_coordinador;
    }

    
    public void setId_Coordinador(String id_coordinador) {
        this.id_coordinador = id_coordinador;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getApellidoP() {
        return apellidoP;
    }

    
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    
    public String getTelefono() {
        return telefono;
    }

    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    

   

   
    
    
    
    
}
