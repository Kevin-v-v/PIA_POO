
package pia_poo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class PIA_POO {

    public static int leerArchivoEmp(Empleado[] empleados){
        // En caso de que sea la primera ejecucion para pasar los empleados guardados al arreglo de empleados.
            int cont = 0;
            try
            {
                int contAux =0;
                String empaux = "";
                Scanner entrada = new Scanner( new File( "Empleados.txt") ); // Lee los datos dentro del archivo
                BufferedReader leer=new BufferedReader(new FileReader ("Empleados.txt"));
                String linea="";
                while((linea=leer.readLine()) != null)
                {
                    contAux++;
                    if(linea.indexOf(empaux) != -1) // Al encontrar el dato buscado
                    {   
                        empleados[cont] = new Empleado();
                        String id_empleadoAux = entrada.next(); 
                        empleados[cont].setId_empleado(id_empleadoAux);
                        String nombreAux = entrada.next(); 
                        empleados[cont].setNombre(nombreAux);
                        String apellidoPAux = entrada.next(); 
                        empleados[cont].setApellidoP(apellidoPAux);
                        String telefonoAux = entrada.next(); 
                        empleados[cont].setTelefono(telefonoAux);
                        String emailAux = entrada.next(); 
                        empleados[cont].setEmail(emailAux);
                        int deptAux = entrada.nextInt();
                        empleados[cont].setId_departamento(Integer.toString(deptAux));
                        float sueldoAux = entrada.nextFloat();
                        empleados[cont].setSueldo(sueldoAux);
                        cont++;

                    }
                    
                }
                
               
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
            System.out.println("El archivo de Empleados fue leido exitosamente");
            return cont;
        }
     public static int leerArchivoCordi(Coordinador[] cordi){
        // En caso de que sea la primera ejecucion para pasar los empleados guardados al arreglo de empleados.
            int cont = 0;
            try
            {
                int contAux =0;
                String empaux = "";
                Scanner entrada = new Scanner( new File( "Coordinadores.txt") ); // Lee los datos dentro del archivo
                BufferedReader leer=new BufferedReader(new FileReader ("Coordinadores.txt"));
                String linea="";
                while((linea=leer.readLine()) != null)
                {
                    contAux++;
                    if(linea.indexOf(empaux) != -1) // Al encontrar el dato buscado
                    {   
                        cordi[cont] = new Coordinador();
                        String id_empleadoAux = entrada.next(); 
                        cordi[cont].setId_Coordinador(id_empleadoAux);
                        String nombreAux = entrada.next(); 
                        cordi[cont].setNombre(nombreAux);
                        String apellidoPAux = entrada.next(); 
                        cordi[cont].setApellidoP(apellidoPAux);
                        String telefonoAux = entrada.next(); 
                        cordi[cont].setTelefono(telefonoAux);
                        String emailAux = entrada.next(); 
                        cordi[cont].setEmail(emailAux);
                        float sueldoAux = entrada.nextFloat();
                        cordi[cont].setSueldo(sueldoAux);
                        cont++;

                    }
                    
                }
                
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
            System.out.println("El archivo de Coordinadores fue leido exitosamente");
            return cont;
     }
    
    public static void main(String[] args) {
        
        Coordinador[] coordinadores = new Coordinador[10];
        Empleado[] empleados = new Empleado[100];
        int contEmp = 0, contCordi = 0;
        int opc;
        Scanner in = new Scanner(System.in);
        contCordi = leerArchivoCordi(coordinadores);    
        contEmp = leerArchivoEmp(empleados);//aqui se lee los datos de empleados
        do{
        do{
        System.out.println("=== PROGRAMA DE GESTION DE PERSONAL ===");
        System.out.println("1.-- REGISTRAR COORDINADORES");
        System.out.println("2.-- REGISTRAR EMPLEADOS");
        System.out.println("3.-- GUARDAR Y SALIR");
        System.out.println("========================================");
        System.out.println("Ingrese una opcion: > ");
        System.out.println(empleados[4].getNombre()+empleados[4].getApellidoP()+empleados[4].getSueldo());
            System.out.println(coordinadores[0].getNombre()+coordinadores[0].getApellidoP()+coordinadores[0].getSueldo());
        opc = in.nextInt();
        in.nextLine();
        }while(opc<1||opc>3);
        
        switch(opc){
            case 1:
                if(contCordi<=9){
                coordinadores[contCordi] = new Coordinador();
                coordinadores[contCordi].registarCoordinadores(coordinadores[contCordi]);
                }
                else
                    System.out.println("Excedio el número máximo de coordinadores");
                break;
            case 2:
                
                if(contEmp<=99)
                {
                    empleados[contEmp] = new Empleado();
                    empleados[contEmp].registarEmpleados(empleados[contEmp]);
                }
                else
                    System.out.println("Excedio el número máximo de empleados");
                break;
            case 3:
                System.out.println("Gracias por usar el programa");
                break;
            
        }
        }while(opc!=3);

    }
    
}
