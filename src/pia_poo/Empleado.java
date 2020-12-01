
package pia_poo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//AGREGUÉ AL REGISTRAR LA OPCIÓN DE ESTADO
//ADEMÁS DEL NUEVO ATRIBUTO Y SUS GETTERS Y SETTERS
//AGREGUÉ TAMBIEN EN LA ESCRITURA DEL ARCHIVO LA LÍNEA DEL ESTADO

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
    //NUEVO
    private boolean activo;
    
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
    
    public boolean getActivo(){
        return activo;
    }
    
    public void setActivo(boolean activo){
        this.activo = activo;
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
            id = id + " ";
            emple.setId_empleado(id);
            System.out.println("Ingrese nombre");
            String nom = var.nextLine();
            nom = nom + " ";
            emple.setNombre(nom);
            System.out.println("Ingrese apellido paterno");
            String app = var.nextLine();
            app = app + " ";
            emple.setApellidoP(app);
            System.out.println("Ingrese telefono");
            String tel = var.nextLine();
            tel = tel + " ";
            emple.setTelefono(tel);
            System.out.println("Ingrese email");
            String eml = var.nextLine();
            emple.setEmail(eml);
            int idDeptAux = 0;
            do{
            band = false;
            System.out.println("Ingrese el departamento sin acentos");
            String depa = var.nextLine();
            for(int i=0; i<5; i++){
                if(depa.equalsIgnoreCase(NOM_DEPTOS[i])){
                    band=true;
                    emple.setId_departamento(Integer.toString(i));
                    idDeptAux=i;
                    break;
                }
            }
            }while(!band);
            float sueldoAux = calcularSueldo();
            emple.setSueldo(sueldoAux);
            //Nuevo cambio
            //emple.setActivo(true);
            File archivoEmpleado;
            FileWriter escribir;
            PrintWriter escribirLinea;
            archivoEmpleado = new File( "Empleados.txt");
            
                try {
                    archivoEmpleado.createNewFile();
                    
                    escribir = new FileWriter(archivoEmpleado, true);
                    escribirLinea = new PrintWriter(escribir);
                    
                    escribirLinea.println();
                    escribirLinea.print(id);
                    escribirLinea.print(nom);
                    escribirLinea.print(app);
                    escribirLinea.print(tel);
                    escribirLinea.print(eml);
                    escribirLinea.print(" ");
                    escribirLinea.print(idDeptAux);
                    escribirLinea.print(" ");
                    escribirLinea.print(sueldoAux);
                    //NUEVOSCAMBIOS
                    escribirLinea.print(" ");
                    escribirLinea.print(true);
                            
                    escribir.close();
                    escribirLinea.close();
                } catch (IOException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            
            
            
            
            
    }

    @Override
    public void empleadoTrabaja() {
        System.out.println(DEPTO_TRABAJA[Integer.parseInt(id_departamento)]);
    
    }
    
    public String get_depto(){
        return NOM_DEPTOS[Integer.parseInt(id_departamento)];
    }
    
    
    
}
