
package pia_poo;
import java.util.Scanner;

public class Empleado implements IDepartamentos, IEmpleado{

    /**
     * @return the id_departamento
     */
    public String getId_departamento() {
        return id_departamento;
    }

    /**
     * @param id_departamento the id_departamento to set
     */
    public void setId_departamento(String id_departamento) {
        this.id_departamento = id_departamento;
    }
    
    private String id_empleado;
    private String id_departamento;
    //Estos atributos de abajo se heredan a Coordinador
    private String nombre;
    private String apellidoP;
    private String telefono;
    private String email;
    private float sueldo;
    
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
    
   
    
    
    public String getId_empleado() {
        return id_empleado;
    }

    
    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }
    
    
    public float getSueldo() {
        return sueldo;
    }

   
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    Scanner var = new Scanner(System.in);
    
    //calcularSueldo() se hereda a Coordinador
    public float calcularSueldo(){
        
        int horas;
        float pago;
        
        System.out.println("Ingrese horas trabajadas");
        horas=var.nextInt();
        System.out.println("Ingrese pago por hora");
        pago=var.nextFloat();
        System.out.println("Sueldo: $" + horas*pago);
        return horas*pago;
    }
   
   
    public void registarEmpleados(Empleado emple) {
        boolean band = false;
        System.out.println("Ingrese id de empleado");
        String id = var.nextLine();
        emple.setId_empleado(id);
        System.out.println("Ingrese nombre");
        String nom = var.nextLine();
        emple.setNombre(nom);
        System.out.println("Ingrese apellido paterno");
        String app = var.nextLine();
        emple.setApellidoP(app);
        System.out.println("Ingrese telefono");
        String tel = var.nextLine();
        emple.setTelefono(tel);
        System.out.println("Ingrese email");
        String eml = var.nextLine();
        emple.setEmail(eml);
        do{
        band = false;
        System.out.println("Ingrese el departamento sin acentos");
        String depa = var.nextLine();
        for(int i=0; i<5; i++){
            if(depa.equalsIgnoreCase(NOM_DEPTOS[i])){
                band=true;
                emple.setId_departamento(Integer.toString(i));
                break;
            }
        }
        }while(!band);
        emple.setSueldo(emple.calcularSueldo());
    }

    @Override
    public void empleadoTrabaja() {
        System.out.println(DEPTO_TRABAJA[Integer.parseInt(id_departamento)]);
    }


    
}
