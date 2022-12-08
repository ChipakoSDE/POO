public class EjemploAuto {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();
        Automovil mazda = new Automovil();

        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.cilindrada = 2.0;
        subaru.color = "Negro";

        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "Rojo";

        System.out.println(subaru.detalle()); // invoco al método detalle que está definido en la clase Automovil para mostrar los datos
        System.out.println(mazda.detalle());
        System.out.println(subaru.acelerar(95));
        System.out.println(mazda.acelerar(115));
        System.out.println(mazda.frenar());

        System.out.println(subaru.acelerarFrenar(150));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 50));

    }
}
