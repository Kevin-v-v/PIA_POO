package pia_poo;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//          
//                  TAPÉ EN DONDE SE DEBE SOBREESCRIBIR LOS ARCHIVOS 
//

public class Bajas {
    
    public static void bajaEmpleado(Empleado[] empleados, int contEmp){
        boolean val = false;
        Scanner scan = new Scanner(System.in);
        String buscar;
        
        do{
            
            //System.out.println("\t\t- - - BAJAS EMPLEADOS - - -");
            //System.out.printf("Ingrese el id del empleado\n>");
            buscar = JOptionPane.showInputDialog(null, "Ingrese id de empleado" , "Baja de empleados", JOptionPane.INFORMATION_MESSAGE);
            for(int i = 0; i < contEmp; i++){
                if(buscar.equalsIgnoreCase(empleados[i].getId_empleado())){ 
                    val=true;
                    empleados[i].setActivo(false);
                    break;
                }                                          
            }
            if(!val){
                JOptionPane.showMessageDialog(null, "No existe empleado con id: " + buscar , "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
                //System.out.println("No existe empleado con id: " + buscar);
            }
        }while(!val);
        
        
      
         //intento
             File archivoViejo = new File( "Empleados.txt");
            archivoViejo.delete();
            File archivoNuevo = new File( "Empleados.txt");
            FileWriter escribir;
            PrintWriter escribirLinea;
            archivoNuevo = new File( "Empleados.txt");
            
                try {
                    archivoNuevo.createNewFile();
                    
                    escribir = new FileWriter(archivoNuevo, false);
                    escribirLinea = new PrintWriter(escribir);
                    for (int i = 0; i < contEmp; i++) {
                    escribirLinea.println();
                    escribirLinea.print(empleados[i].getId_empleado());
                    escribirLinea.print(" ");
                    escribirLinea.print(empleados[i].getNombre());
                    escribirLinea.print(" ");
                    escribirLinea.print(empleados[i].getApellidoP());
                    escribirLinea.print(" ");
                    escribirLinea.print(empleados[i].getTelefono());
                    escribirLinea.print(" ");
                    escribirLinea.print(empleados[i].getEmail());
                    escribirLinea.print(" ");
                    escribirLinea.print(empleados[i].getId_departamento());
                    escribirLinea.print(" ");
                    escribirLinea.print(empleados[i].getSueldo());
                    //NUEVOS CAMBIOS
                    escribirLinea.print(" ");
                    escribirLinea.print(empleados[i].getActivo());
                    
                    }
                    escribir.close();
                    escribirLinea.close();
                } catch (IOException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
       
    }
    
    public static void bajaCoordinador(Coordinador[] coordinadores, int contCoordi){
        boolean val = false;
        Scanner scan = new Scanner(System.in);
        String buscar = null;   
        do{
            System.out.println("\t\t- - - BAJAS COORDINADORES - - -");
            System.out.printf("Ingrese el id del coordinador\n>");
            buscar = JOptionPane.showInputDialog(null, "Ingrese id del coordinador" , "Baja de coordinadores", JOptionPane.INFORMATION_MESSAGE);           
            for(int i = 0; i < contCoordi; i++){               
                if(buscar.equalsIgnoreCase(coordinadores[i].getId_Empleado())){ 
                    val = true;
                    coordinadores[i].setActivo(false);                     
                }                                          
            }
            if(val == false){
               JOptionPane.showMessageDialog(null, "No existe empleado con id: " + buscar , "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
            }
        }while(val != true);
        
        
       
            //intento
            File archivoViejo = new File( "Coordinadores.txt");
            archivoViejo.delete();
            File archivoNuevo = new File( "Coordinadores.txt");
            FileWriter escribir;
            PrintWriter escribirLinea;
            //archivoCoordinador = new File( "Coordinadores.txt");
            
                try {
                    archivoNuevo.createNewFile();
                    
                    escribir = new FileWriter(archivoNuevo, false); 
                    escribirLinea = new PrintWriter(escribir);
                    for (int i = 0; i < contCoordi; i++) {
                        
                    
                   
                    
                    escribirLinea.println();
                    escribirLinea.print(coordinadores[i].getId_Empleado());
                    escribirLinea.print(" ");
                    escribirLinea.print(coordinadores[i].getNombre());
                    escribirLinea.print(" ");
                    escribirLinea.print(coordinadores[i].getApellidoP());
                    escribirLinea.print(" ");
                    escribirLinea.print(coordinadores[i].getTelefono());
                    escribirLinea.print(" ");
                    escribirLinea.print(coordinadores[i].getEmail());
                    escribirLinea.print(" ");
                    escribirLinea.print(coordinadores[i].getSueldo());
                    //NUEVOS CAMBIOS
                    escribirLinea.print(" ");
                    escribirLinea.print(coordinadores[i].getActivo());
                    
                }
                    escribir.close();
                    escribirLinea.close();
                } catch (IOException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
    }
    
    
}