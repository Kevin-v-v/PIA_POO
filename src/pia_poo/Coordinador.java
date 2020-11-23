
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

    
    public String getId_coordinador() {
        return id_coordinador;
    }

    
    public void setId_coordinador(String id_coordinador) {
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
