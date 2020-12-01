
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
import javax.swing.JOptionPane;

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
    public boolean getActivo(){
        return activo;
    }

    public void setActivo(boolean activo){
        this.activo = activo;
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
    
   
    public float calcularSueldo(){
        
        int horas;
        float pago;
        
       
        horas=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las horas trabajadas" , "Calculo de Sueldo", JOptionPane.INFORMATION_MESSAGE));
       
        pago=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el pago por hora" , "Calculo de Sueldo", JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null, "Sueldo: $" + horas*pago, "Calculo de Sueldo", JOptionPane.INFORMATION_MESSAGE, null);

        return horas*pago;
    }
   
   
    public void registarEmpleados(Empleado emple) {
        
            
            boolean band = false;
            
            String id = JOptionPane.showInputDialog(null, "Ingrese id de coordinador" , "Registro de Empleados", JOptionPane.INFORMATION_MESSAGE);
            id = id + " ";
            emple.setId_empleado(id);
            
            String nom = JOptionPane.showInputDialog(null, "Ingrese nombre" , "Registro de Empleados", JOptionPane.INFORMATION_MESSAGE);
            nom = nom + " ";
            emple.setNombre(nom);
           
            String app = JOptionPane.showInputDialog(null, "Ingrese apellido paterno" , "Registro de Empleados", JOptionPane.INFORMATION_MESSAGE);
            app = app + " ";
            emple.setApellidoP(app);
           
            String tel = JOptionPane.showInputDialog(null, "Ingrese telefono" , "Registro de Empleados", JOptionPane.INFORMATION_MESSAGE);
            tel = tel + " ";
            emple.setTelefono(tel);
            
            String eml = JOptionPane.showInputDialog(null, "Ingrese email" , "Registro de Empleados", JOptionPane.INFORMATION_MESSAGE);
            emple.setEmail(eml);
            int idDeptAux = 0;
            do{
            band = false;
            
            String depa = JOptionPane.showInputDialog(null, "Ingrese el departamento sin acentos" , "Registro de Empleados", JOptionPane.INFORMATION_MESSAGE);
            for(int i=0; i<5; i++){
                if(depa.equalsIgnoreCase(NOM_DEPTOS[i])){
                    band=true;
                    emple.setId_departamento(Integer.toString(i));
                    idDeptAux=i;
                    break;
                }
            }
            }while(!band);
            emple.setActivo(true);
            float sueldoAux = calcularSueldo();
            emple.setSueldo(sueldoAux);
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
        JOptionPane.showMessageDialog(null, DEPTO_TRABAJA[Integer.parseInt(id_departamento)], "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
        //System.out.println(DEPTO_TRABAJA[Integer.parseInt(id_departamento)]);
    
    }
    
    public String get_depto(){
        return NOM_DEPTOS[Integer.parseInt(id_departamento)];
    }
    
    
    
}
