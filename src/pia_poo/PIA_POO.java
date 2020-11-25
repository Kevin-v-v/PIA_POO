
package pia_poo;

import java.util.Scanner;


public class PIA_POO {

    
    public static void main(String[] args) {
        
        Coordinador coordi = new Coordinador();
        Empleado emple = new Empleado();
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("=== PROGRAMA DE GESTION DE PERSONAL ===");
        System.out.println("1.-- REGISTRAR COORDINADORES");
        System.out.println("2.-- REGISTRAR EMPLEADOS");
        System.out.println("========================================");
        System.out.println("Ingrese una opcion: > ");
        int opcion = in.nextInt();
        in.nextLine();
        
        switch(opcion){
            case 1:
                coordi.registarCoordinadores(coordi);
                break;
            case 2:
                emple.registarEmpleados(emple);
                break;
            
        }

    }
    
}
