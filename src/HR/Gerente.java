
package HR;
public class Gerente extends Coordinador implements ITrabajo{
    public Gerente(String tipo,double salario,float horas_semana){
        Ocupacion gerencia = new Ocupacion("Gerente" + tipo);
        
    }
    
    @Override
    public void trabajar() {
        System.out.println("Este empleado se dedica a " );
     
    }
    
}
