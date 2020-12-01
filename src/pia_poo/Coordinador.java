
package pia_poo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        //Nuevo cambio
        //coordi.setActivo(true);
        
        File archivoCoordinador;
            FileWriter escribir;
            PrintWriter escribirLinea;
            archivoCoordinador = new File( "Coordinadores.txt");
            
                try {
                    archivoCoordinador.createNewFile();
                    
                    escribir = new FileWriter(archivoCoordinador, true);
                    escribirLinea = new PrintWriter(escribir);
                    
                    escribirLinea.println();
                    escribirLinea.print(id);
                    escribirLinea.print(" ");
                    escribirLinea.print(nom);
                    escribirLinea.print(" ");
                    escribirLinea.print(app);
                    escribirLinea.print(" ");
                    escribirLinea.print(tel);
                    escribirLinea.print(" ");
                    escribirLinea.print(eml);
                    escribirLinea.print(" ");
                    escribirLinea.print(coordi.getSueldo());
                    //NUEVOS CAMBIOS
                    escribirLinea.print(" ");
                    escribirLinea.print(true);
                            
                    escribir.close();
                    escribirLinea.close();
                } catch (IOException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }
        
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