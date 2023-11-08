package exercise16;

public class machineSandbox {
    public static void main(String[] args) {
        Imachine a1 = new Plane("Boing");
        a1.start();
        a1.stop();
        a1.maintenance();
        Imachine t1 = new Tractor(1200);
        t1.start();
        t1.stop();
        t1.maintenance();



        }
}
