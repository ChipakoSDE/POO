public class EjemploAuto {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        Automovil mazda = new Automovil("Mazda", "BT-50");
        Automovil nissan = new Automovil();

        subaru.setCilindrada(2.0);
        subaru.setColor("Negro");

        mazda.setCilindrada(3.0);
        mazda.setColor("Rojo");

        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        System.out.println(subaru.detalle()); // invoco al método detalle que está definido en la clase Automovil para mostrar los datos
        System.out.println(mazda.detalle());
        System.out.println(subaru.acelerar(95));
        System.out.println(mazda.acelerar(115));
        System.out.println(mazda.frenar());

        System.out.println(subaru.acelerarFrenar(150));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 50));

    }
}
