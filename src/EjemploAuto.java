public class EjemploAuto {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Negro");

        Automovil mazda = new Automovil("Mazda", "BT-50", "Negro", 2.5);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Rojo", 3.5, 50);
        System.out.println(nissan.detalle());



        System.out.println(subaru.detalle()); // invoco al método detalle que está definido en la clase Automovil para mostrar los datos
        System.out.println(mazda.detalle());
        System.out.println(subaru.acelerar(95));
        System.out.println(mazda.acelerar(115));
        System.out.println(mazda.frenar());

        System.out.println(subaru.acelerarFrenar(150));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 50));
        System.out.println("Kilómetros por litro " + nissan.calcularConsumo(300, 50));

    }
}
