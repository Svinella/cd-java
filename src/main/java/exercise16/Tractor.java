package exercise16;

public class Tractor implements Imachine{
    public void  start(){
        System.out.println("Encendido");
    }

    public void stop(){
        System.out.println("Apagado");
    }
    public void maintenance(){
        System.out.println("En mantenimiento");
    }
}
