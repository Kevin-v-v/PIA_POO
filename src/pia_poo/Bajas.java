package pia_poo;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//          
//                  TAPÉ EN DONDE SE DEBE SOBREESCRIBIR LOS ARCHIVOS 
//

public class Bajas {
    
    public static void bajaEmpleado(Empleado[] empleados, int contEmp){
        boolean val = false;
        Scanner scan = new Scanner(System.in);
        String buscar;
        
        do{
            System.out.println("\t\t- - - BAJAS EMPLEADOS - - -");
            System.out.printf("Ingrese el id del empleado\n>");
            buscar = scan.nextLine();
            for(int i = 0; i < contEmp; i++){
                if(buscar.equalsIgnoreCase(empleados[i].getId_empleado())){ 
                    val = false;
                    empleados[i].setActivo(val);
                    val = true;
                }                                          
            }
            if(val = true){
                System.out.println("No existe empleado con id: " + buscar);
            }
        }while(val != true);
        
        /*
        if(val==true){
            File archivoCoordinador;
            FileWriter escribir;
            PrintWriter escribirLinea;
            archivoCoordinador = new File( "Empleados.txt");
            
                try {
                    archivoCoordinador.createNewFile();
                    
                    escribir = new FileWriter(archivoCoordinador, true);
                    escribirLinea = new PrintWriter(escribir);
                    
                    escribirLinea.println();
                    escribirLinea.print(empleados[5].getId_empleado());
                    escribirLinea.print(" ");
                    escribirLinea.print(empleados[5].getNombre());
                    escribirLinea.print(" ");
                    escribirLinea.print(empleados[5].getApellidoP());
                    escribirLinea.print(" ");
                    escribirLinea.print(empleados[5].getTelefono());
                    escribirLinea.print(" ");
                    escribirLinea.print(empleados[5].getEmail());
                    escribirLinea.print(" ");
                    escribirLinea.print(empleados[5].getSueldo());
                    //NUEVOS CAMBIOS
                    escribirLinea.print(" ");
                    escribirLinea.print(empleados[5].getActivo());
                            
                    escribir.close();
                    escribirLinea.close();
                } catch (IOException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }
        }*/
        
       
    }
    
    public static void bajaCoordinador(Coordinador[] coordinadores, int contCoordi){
        boolean val = false;
        Scanner scan = new Scanner(System.in);
        String buscar = null;   
        do{
            System.out.println("\t\t- - - BAJAS COORDINADORES - - -");
            System.out.printf("Ingrese el id del coordinador\n>");
            buscar = scan.nextLine();            
            for(int i = 0; i < contCoordi; i++){               
                if(buscar.equalsIgnoreCase(coordinadores[i].getId_Empleado())){ 
                    val = true;
                    coordinadores[i].setActivo(false);                     
                }                                          
            }
            if(val == false){
                System.out.println("No existe coordinador con id: " + buscar);
            }
        }while(val != true);
        
        /*
        if(val==true){
            File archivoCoordinador;
            FileWriter escribir;
            PrintWriter escribirLinea;
            archivoCoordinador = new File( "Coordinadores.txt");
            
                try {
                    archivoCoordinador.createNewFile();
                    
                    escribir = new FileWriter(archivoCoordinador, true);
                    escribirLinea = new PrintWriter(escribir);
                    
                    escribirLinea.println();
                    escribirLinea.print(coordinadores[0].getId_Empleado());
                    escribirLinea.print(" ");
                    escribirLinea.print(coordinadores[0].getNombre());
                    escribirLinea.print(" ");
                    escribirLinea.print(coordinadores[0].getApellidoP());
                    escribirLinea.print(" ");
                    escribirLinea.print(coordinadores[0].getTelefono());
                    escribirLinea.print(" ");
                    escribirLinea.print(coordinadores[0].getEmail());
                    escribirLinea.print(" ");
                    escribirLinea.print(coordinadores[0].getSueldo());
                    //NUEVOS CAMBIOS
                    escribirLinea.print(" ");
                    escribirLinea.print(coordinadores[0].getActivo());
                            
                    escribir.close();
                    escribirLinea.close();
                } catch (IOException ex) {
                    Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
                }

        }*/
        
    }
    
    
}
