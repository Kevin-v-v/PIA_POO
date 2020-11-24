
package pia_poo;


public class PIA_POO {

    
    public static void main(String[] args) {
        Coordinador coordi = new Coordinador();
        Empleado emple = new Empleado();
        coordi.registarCoordinadores(coordi);
        emple.registarEmpleados(emple);
    }
    
}
