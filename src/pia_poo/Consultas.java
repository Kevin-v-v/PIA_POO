package pia_poo;

import java.util.Scanner;
import static pia_poo.IDepartamentos.*;

public class Consultas {

    public static void ConsultaEmpNombre(Empleado[] empleados, int contEmp) {
        System.out.println("\t\t- - - Consulta Nombre - - -\n");
        Scanner scan = new Scanner(System.in);
        String buscar;
        System.out.println("Ingrese el nombre del empleado: ");
        buscar = scan.nextLine();
        for (int i = 0; i < contEmp; i++) {
            if (buscar.equalsIgnoreCase(empleados[i].getNombre())) {
                System.out.println("\nEmpleado #" + (i + 1));
                System.out.println("\tNombre: " + empleados[i].getNombre() + " " + empleados[i].getApellidoP() + " - Id: " + empleados[i].getId_empleado());
                System.out.println("\tEmail: " + empleados[i].getEmail() + " - Teléfono: " + empleados[i].getTelefono());
                System.out.println("\tDepartamento: " + empleados[i].get_depto() + " - Sueldo: $" + empleados[i].getSueldo());
                System.out.println();
            }
        }

    }

    public static void ConsultaId(Empleado[] empleados, int contEmp) {
        boolean band;
        System.out.println("\t\t- - - Consulta Departamentos - - -\n");
        Scanner scan = new Scanner(System.in);
        int i;
        String depa = null, depto = null;
        do{
            band = false;
            System.out.println("Ingrese el departamento sin acentos");
            depa = scan.nextLine();
            for(i=0; i<5; i++){
                if(depa.equalsIgnoreCase(NOM_DEPTOS[i])){
                    depto=NOM_DEPTOS[i];
                    band=true;
                    break;
                }
            }
            }while(!band);
        System.out.println(DEPTO_TRABAJA[i] + "\n\n");
        for (i = 0; i < contEmp; i++) {
            if (depa.equalsIgnoreCase(empleados[i].get_depto())) {
                System.out.println("\nEmpleado #" + (i + 1));
                System.out.println("\tNombre: " + empleados[i].getNombre() + " " + empleados[i].getApellidoP() + " - Id: " + empleados[i].getId_empleado());
                System.out.println("\tEmail: " + empleados[i].getEmail() + " - Teléfono: " + empleados[i].getTelefono());
                System.out.println("\tDepartamento: " + empleados[i].get_depto() + " - Sueldo: $" + empleados[i].getSueldo());
                System.out.println();
            }
        }

    }

    public static void ConsultaTodos(Empleado[] empleados, int contEmp) {
        System.out.println("\t\t- - - Consulta Empleados - - -\n");
        for (int i = 0; i < contEmp; i++) {
            System.out.println("\nEmpleado #" + (i + 1));
            System.out.println("\tNombre: " + empleados[i].getNombre() + " " + empleados[i].getApellidoP() + " - Id: " + empleados[i].getId_empleado());
            System.out.println("\tEmail: " + empleados[i].getEmail() + " - Teléfono: " + empleados[i].getTelefono());
            System.out.println("\tDepartamento: " + empleados[i].get_depto() + " - Sueldo: $" + empleados[i].getSueldo());
            System.out.println();
        }
    }


}