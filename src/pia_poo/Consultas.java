package pia_poo;


import javax.swing.JOptionPane;
import static pia_poo.IDepartamentos.*;

public class Consultas {


    public static void ConsultaEmpNombre(Empleado[] empleados, int contEmp) {
        String buscar;
        buscar=JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado: " , "Consulta Nombre", JOptionPane.INFORMATION_MESSAGE);
        
        boolean band=false;
        for (int i = 0; i < contEmp; i++) {
            if (buscar.equalsIgnoreCase(empleados[i].getNombre())) {
                band=true;
                JOptionPane.showMessageDialog(null, "RESULTADO DE CONSULTA\n" + "\nEmpleado #" + (i + 1)+ "\nNombre: " + empleados[i].getNombre() + " " + empleados[i].getApellidoP() + "\n Id: " + empleados[i].getId_empleado() + "\nEmail: " + empleados[i].getEmail() + "\n Teléfono: " + empleados[i].getTelefono() + "\nDepartamento: " + empleados[i].get_depto() + "\n Sueldo: $" + empleados[i].getSueldo() + "\nActividad: " + empleados[i].getActivo(), "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
                break;
            }
        }
        if(!band){
           JOptionPane.showMessageDialog(null, "No hay empleados con ese nombre registrados", "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
           
           
       }

    }

    public static void ConsultaId(Empleado[] empleados, int contEmp) {
        boolean band;
        
        int i,depnum=0;
        String depa = null;
        do{
            band = false;
            depa=JOptionPane.showInputDialog(null, "Ingrese el departamento: " , "Consulta Departamentos", JOptionPane.INFORMATION_MESSAGE);
           
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
                JOptionPane.showMessageDialog(null, "RESULTADO DE CONSULTA\n" + DEPTO_TRABAJA[depnum] + "\n\n" +  "\nEmpleado #" + (i + 1)+ "\nNombre: " + empleados[i].getNombre() + " " + empleados[i].getApellidoP() + "\n Id: " + empleados[i].getId_empleado() + "\nEmail: " + empleados[i].getEmail() + "\n Teléfono: " + empleados[i].getTelefono() + "\nDepartamento: " + empleados[i].get_depto() + "\n Sueldo: $" + empleados[i].getSueldo() + "\nActividad: " + empleados[i].getActivo() , "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
                
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
       
        for (int i = 0; i < contEmp; i++) {
            JOptionPane.showMessageDialog(null, "RESULTADO DE CONSULTA\n" + "\nEmpleado #" + (i + 1)+ "\nNombre: " + empleados[i].getNombre() + " " + empleados[i].getApellidoP() + "\nId: " + empleados[i].getId_empleado() + "\nEmail: " + empleados[i].getEmail() + "\nTeléfono: " + empleados[i].getTelefono() + "\nDepartamento: " + empleados[i].get_depto() + "\nSueldo: $" + empleados[i].getSueldo() + "\nActividad: " + empleados[i].getActivo() , "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
            
        }
    }
    
    public static void ConsultaCoordi(Coordinador[] coordinadores, int contCoordi) {
       if(contCoordi==0){
           JOptionPane.showMessageDialog(null, "No hay coordinadores registrados", "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
           return;
       }
        coordinadores[0].empleadoTrabaja();
        
        for (int i = 0; i < contCoordi; i++) {
            JOptionPane.showMessageDialog(null, "RESULTADO DE CONSULTA\n" +  "\nCoordinador #" + (i + 1)+ "\nNombre: " + coordinadores[i].getNombre() + " " + coordinadores[i].getApellidoP() + "\nId: " + coordinadores[i].getId_Empleado() + "\nEmail: " + coordinadores[i].getEmail() + "\nTeléfono: " + coordinadores[i].getTelefono() + "\nSueldo: $" + coordinadores[i].getSueldo() + "\nActividad: " + coordinadores[i].getActivo(), "PROGRAMA DE GESTION DE EMPLEADOS", JOptionPane.INFORMATION_MESSAGE, null);
           
        }
    }

}