
package pia_poo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Coordinador extends Empleado implements IEmpleado{
    
    private String id_coordinador;
   

    
 
    public void registarCoordinadores(Coordinador coordi) {
        //System.out.println("Ingrese id de coordinador");
        String id = JOptionPane.showInputDialog(null, "Ingrese id de coordinador" , "Registro de Coordinadores", JOptionPane.INFORMATION_MESSAGE);
        coordi.setId_Coordinador(id);
        //System.out.println("Ingrese nombre");
        String nom = JOptionPane.showInputDialog(null, "Ingrese nombre" , "Registro de Coordinadores", JOptionPane.INFORMATION_MESSAGE);
        coordi.setNombre(nom);
        //System.out.println("Ingrese ");
        String app = JOptionPane.showInputDialog(null, "Ingrese apellido paterno" , "Registro de Coordinadores", JOptionPane.INFORMATION_MESSAGE);
        coordi.setApellidoP(app);
        //System.out.println("Ingrese telefono");
        String tel = JOptionPane.showInputDialog(null, "Ingrese telefono" , "Registro de Coordinadores", JOptionPane.INFORMATION_MESSAGE);
        coordi.setTelefono(tel);
        //System.out.println("Ingrese email");
        String eml = JOptionPane.showInputDialog(null, "Ingrese email" , "Registro de Coordinadores", JOptionPane.INFORMATION_MESSAGE);
        coordi.setEmail(eml);
        coordi.setSueldo(coordi.calcularSueldo());
        
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
    JOptionPane.showMessageDialog(null, "Los coordinadores se dedican a mantener el orden entre los empleados, resuelven problemas de mayor importancia y vigilan que los empleados esten realizando bien sus labores" , "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);    }

   
}