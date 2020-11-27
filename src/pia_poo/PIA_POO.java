
package pia_poo;

import java.util.Scanner;


public class PIA_POO {

    
    public static void main(String[] args) {
        
        Coordinador[] coordinadores = new Coordinador[10];
        Empleado[] empleados = new Empleado[100];
        int contEmp = 0, contCordi = 0;
        int opc;
        int auxiliar=0;
        Scanner in = new Scanner(System.in);
        do{
        do{
        System.out.println("=== PROGRAMA DE GESTION DE PERSONAL ===");
        System.out.println("1.-- REGISTRAR COORDINADORES");
        System.out.println("2.-- REGISTRAR EMPLEADOS");
        System.out.println("3.-- GUARDAR Y SALIR");
        System.out.println("========================================");
        System.out.println("Ingrese una opcion: > ");
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
                auxiliar++;
                if(contEmp<=99)
                {
                    empleados[contEmp] = new Empleado();
                    empleados[contEmp].registarEmpleados(empleados[contEmp], auxiliar);
                }
                else
                    System.out.println("Excedio el número máximo de empleados");
                break;
            case 3:
                //llama a la funcion de guardar y se termina la ejecucion
                break;
            
        }
        }while(opc!=3);

    }
    
}
