package icc.pap.u01;

public class TiposDemo {
    public static void main(String[] args) {
        Caja<String> lugar = new Caja<String>("lab06");
        Caja<Integer> limite = new Caja<Integer>(30);
        Caja<Sensor> device = new Caja<>(new Sensor("s01", lugar.obtener()));

        System.out.println(lugar.obtener());
        System.out.println(limite.obtener());
        System.out.println(device.obtener());
        System.out.println(device.obtener().id() + device.obtener().ubicacion());

    }

}
