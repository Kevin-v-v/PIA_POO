package pia_poo;


import javax.swing.JOptionPane;
import static pia_poo.IDepartamentos.*;

public class Consultas {


    public static void ConsultaEmpNombre(Empleado[] empleados, int contEmp) {
        String buscar;
        buscar=JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado: " , "Consulta Nombre", JOptionPane.INFORMATION_MESSAGE);
        /*System.out.println("\t\t- - - Consulta Nombre - - -\n");
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado: ");
        buscar = scan.nextLine();*/
        boolean band=false;
        for (int i = 0; i < contEmp; i++) {
            if (buscar.equalsIgnoreCase(empleados[i].getNombre())) {
                band=true;
                JOptionPane.showMessageDialog(null, "RESULTADO DE CONSULTA\n" + "\nEmpleado #" + (i + 1)+ "\nNombre: " + empleados[i].getNombre() + " " + empleados[i].getApellidoP() + "\n Id: " + empleados[i].getId_empleado() + "\nEmail: " + empleados[i].getEmail() + "\n Teléfono: " + empleados[i].getTelefono() + "\nDepartamento: " + empleados[i].get_depto() + "\n Sueldo: $" + empleados[i].getSueldo() , "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
               /* System.out.println("\nEmpleado #" + (i + 1));
                System.out.println("\tNombre: " + empleados[i].getNombre() + " " + empleados[i].getApellidoP() + " - Id: " + empleados[i].getId_empleado());
                System.out.println("\tEmail: " + empleados[i].getEmail() + " - Teléfono: " + empleados[i].getTelefono());
                System.out.println("\tDepartamento: " + empleados[i].get_depto() + " - Sueldo: $" + empleados[i].getSueldo());
                System.out.println();
                System.out.println("\tActividad: " + empleados[i].getActivo());*/
            }
        }
        if(!band){
           JOptionPane.showMessageDialog(null, "No hay empleados con ese nombre registrados", "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
           
           
       }

    }

    public static void ConsultaId(Empleado[] empleados, int contEmp) {
        boolean band;
        /*System.out.println("\t\t- - - Consulta Departamentos - - -\n");
        Scanner scan = new Scanner(System.in);*/
        int i,depnum=0;
        String depa = null;
        do{
            band = false;
            depa=JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado: " , "Consulta Departamentos", JOptionPane.INFORMATION_MESSAGE);
            /*System.out.println("Ingrese el departamento sin acentos");
            depa = scan.nextLine();*/
            for(i=0; i<5; i++){
                if(depa.equalsIgnoreCase(NOM_DEPTOS[i])){
                    band=true;
                    depnum=i;
                    break;
                }
            }
            }while(!band);
        
      
        band=false;
        for (i = 0; i < contEmp; i++) {
            
            if (depa.equalsIgnoreCase(empleados[i].get_depto())) {
                band=true;
                JOptionPane.showMessageDialog(null, "RESULTADO DE CONSULTA\n" + DEPTO_TRABAJA[depnum] + "\n\n" +  "\nEmpleado #" + (i + 1)+ "\nNombre: " + empleados[i].getNombre() + " " + empleados[i].getApellidoP() + "\n Id: " + empleados[i].getId_empleado() + "\nEmail: " + empleados[i].getEmail() + "\n Teléfono: " + empleados[i].getTelefono() + "\nDepartamento: " + empleados[i].get_depto() + "\n Sueldo: $" + empleados[i].getSueldo() , "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
                /*System.out.println("\nEmpleado #" + (i + 1));
                System.out.println("\tNombre: " + empleados[i].getNombre() + " " + empleados[i].getApellidoP() + " - Id: " + empleados[i].getId_empleado());
                System.out.println("\tEmail: " + empleados[i].getEmail() + " - Teléfono: " + empleados[i].getTelefono());
                System.out.println("\tDepartamento: " + empleados[i].get_depto() + " - Sueldo: $" + empleados[i].getSueldo());
                System.out.println();
                System.out.println("\tActividad: " + empleados[i].getActivo());*/
            }
        }
        if(!band){
           JOptionPane.showMessageDialog(null, "No se encontró ningun empleado de ese departamento", "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
       }

    }

    public static void ConsultaTodos(Empleado[] empleados, int contEmp) {
        if(contEmp==0){
           JOptionPane.showMessageDialog(null, "No hay empleados registrados", "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
           return;
       }
        //System.out.println("\t\t- - - Consulta Empleados - - -\n");
        for (int i = 0; i < contEmp; i++) {
            JOptionPane.showMessageDialog(null, "RESULTADO DE CONSULTA\n" + "\nEmpleado #" + (i + 1)+ "\nNombre: " + empleados[i].getNombre() + " " + empleados[i].getApellidoP() + "\nId: " + empleados[i].getId_empleado() + "\nEmail: " + empleados[i].getEmail() + "\nTeléfono: " + empleados[i].getTelefono() + "\nDepartamento: " + empleados[i].get_depto() + "\nSueldo: $" + empleados[i].getSueldo() , "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
            /*System.out.println("\nEmpleado #" + (i + 1));
            System.out.println("\tNombre: " + empleados[i].getNombre() + " " + empleados[i].getApellidoP() + " - Id: " + empleados[i].getId_empleado());
            System.out.println("\tEmail: " + empleados[i].getEmail() + " - Teléfono: " + empleados[i].getTelefono());
            System.out.println("\tDepartamento: " + empleados[i].get_depto() + " - Sueldo: $" + empleados[i].getSueldo());
            System.out.println();
            System.out.println("\tActividad: " + empleados[i].getActivo());*/
        }
    }
    
    public static void ConsultaCoordi(Coordinador[] coordinadores, int contCoordi) {
       if(contCoordi==0){
           JOptionPane.showMessageDialog(null, "No hay coordinadores registrados", "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
           return;
       }
        coordinadores[0].empleadoTrabaja();
        //System.out.println("\t\t- - - Consulta Empleados - - -\n");
        for (int i = 0; i < contCoordi; i++) {
            JOptionPane.showMessageDialog(null, "RESULTADO DE CONSULTA\n" +  "\nCoordinador #" + (i + 1)+ "\nNombre: " + coordinadores[i].getNombre() + " " + coordinadores[i].getApellidoP() + "\nId: " + coordinadores[i].getId_Empleado() + "\nEmail: " + coordinadores[i].getEmail() + "\nTeléfono: " + coordinadores[i].getTelefono() + "\nSueldo: $" + coordinadores[i].getSueldo() , "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
            /*System.out.println("\nEmpleado #" + (i + 1));
            System.out.println("\tNombre: " + coordinadores[i].getNombre() + " " + coordinadores[i].getApellidoP() + " - Id: " + coordinadores[i].getId_Empleado());
            System.out.println("\tEmail: " + coordinadores[i].getEmail() + " - Teléfono: " + coordinadores[i].getTelefono());
            System.out.println("\tSueldo: $" + coordinadores[i].getSueldo());
            System.out.println();
            System.out.println("\tActividad: " + coordinadores[i].getActivo());*/
        }
    }

}