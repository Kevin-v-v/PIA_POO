package pia_poo;

import java.util.Scanner;
import static pia_poo.IDepartamentos.*;

//                                  AQUÍ SÓLO AGREGUÉ LA NUEVA OPCIÓN QUE ES DE ESTADO 

public class Consultas {

    public static void ConsultaEmpNombre(Empleado[] empleados, int contEmp){
        System.out.println("\t\t- - - Consulta Nombre - - -\n");
        Scanner scan = new Scanner(System.in);
        String buscar;
        System.out.println("Ingrese el nombre del empleado: ");
        buscar = scan.nextLine();
        boolean band=false;
        for (int i = 0; i < contEmp; i++) {
            if (buscar.equalsIgnoreCase(empleados[i].getNombre())) {
                band=true;
                System.out.println("\nEmpleado #" + (i + 1));
                System.out.println("\tNombre: " + empleados[i].getNombre() + " " + empleados[i].getApellidoP() + " - Id: " + empleados[i].getId_empleado());
                System.out.println("\tEmail: " + empleados[i].getEmail() + " - Teléfono: " + empleados[i].getTelefono());
                //CAMBIE EL .GETID_DEPTO, YA QUE ME SALÍA ERROR AL EJECUTAR Y ME SACABA
                //ASÍ TAMBIÉN EN LOS QUE ESTÁN DESPUÉS DE ESTA CLASE
                System.out.println("\tDepartamento: " + empleados[i].getId_departamento()+ " - Sueldo: $" + empleados[i].getSueldo());                
                System.out.println("\tActividad: " + empleados[i].getActivo());                
                System.out.println();
            }
        }
        if(!band){
           System.out.println("No hay empleados con ese nombre registrados");
           
       }

    }

    public static void ConsultaId(Empleado[] empleados, int contEmp) {
        boolean band;
        System.out.println("\t\t- - - Consulta Departamentos - - -\n");
        Scanner scan = new Scanner(System.in);
        int i;
        String depa = null;
        do{
            band = false;
            System.out.println("Ingrese el departamento sin acentos");
            depa = scan.nextLine();
            for(i=0; i<5; i++){
                if(depa.equalsIgnoreCase(NOM_DEPTOS[i])){
                    band=true;
                    break;
                }
            }
            }while(!band);
        System.out.println(DEPTO_TRABAJA[i] + "\n\n");
        band=false;
        for (i = 0; i < contEmp; i++) {
            
            if (depa.equalsIgnoreCase(empleados[i].get_depto())) {
                band=true;
                System.out.println("\nEmpleado #" + (i + 1));
                System.out.println("\tNombre: " + empleados[i].getNombre() + " " + empleados[i].getApellidoP() + " - Id: " + empleados[i].getId_empleado());
                System.out.println("\tEmail: " + empleados[i].getEmail() + " - Teléfono: " + empleados[i].getTelefono());
                System.out.println("\tDepartamento: " + empleados[i].getId_departamento()+ " - Sueldo: $" + empleados[i].getSueldo());
                System.out.println("\tActividad: " + empleados[i].getActivo());
                System.out.println();
            }
        }
        if(!band){
           System.out.println("No se encontro ningun empleado en ese departamento");
       }

    }

    public static void ConsultaTodos(Empleado[] empleados, int contEmp) {
        if(contEmp==0){
           System.out.println("No hay empleados registrados");
           return;
       }
        System.out.println("\t\t- - - Consulta Empleados - - -\n");
        for (int i = 0; i < contEmp; i++) {
            System.out.println("\nEmpleado #" + (i + 1));
            System.out.println("\tNombre: " + empleados[i].getNombre() + " " + empleados[i].getApellidoP() + " - Id: " + empleados[i].getId_empleado());
            System.out.println("\tEmail: " + empleados[i].getEmail() + " - Teléfono: " + empleados[i].getTelefono());
            System.out.println("\tDepartamento: " + empleados[i].getId_departamento()+ " - Sueldo: $" + empleados[i].getSueldo());
            System.out.println("\tActividad: " + empleados[i].getActivo());           
            System.out.println();
        }
    }
    
    public static void ConsultaCoordi(Coordinador[] coordinadores, int contCoordi) {
       if(contCoordi==0){
           System.out.println("No hay coordinadores registrados");
           return;
       }
        System.out.println("\t\t- - - Consulta Empleados - - -\n");
        for (int i = 0; i < contCoordi; i++) {
            System.out.println("\nEmpleado #" + (i + 1));
            System.out.println("\tNombre: " + coordinadores[i].getNombre() + " " + coordinadores[i].getApellidoP() + " - Id: " + coordinadores[i].getId_Empleado());
            System.out.println("\tEmail: " + coordinadores[i].getEmail() + " - Teléfono: " + coordinadores[i].getTelefono());
            System.out.println("\tSueldo: $" + coordinadores[i].getSueldo());
            System.out.println("\tActividad: " + coordinadores[i].getActivo());
            System.out.println();
        }
    }

}