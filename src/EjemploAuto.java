import java.util.Date;

public class EjemploAuto {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Negro");

        Automovil mazda = new Automovil("Mazda", "BT-50", "Negro", 2.5);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Rojo", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Rojo", 3.5, 50);

        Date fecha = new Date(); // nueva instancia del objeto Date

        // comparo los objetos enteros, como son diferentes instancias, a pesar de tener los mismos atributos, el
        // resultado es false, porque son 2 objetos distintos, 2 instancias diferentes del objeto Automovil
        System.out.println("Son iguales? " + (nissan == nissan2));
        // en este caso comparo solamente marca y modelo, por la sobrescritura del método equals dentro de la clase Automovil
        System.out.println("Son iguales con equals? " + nissan.equals(nissan2));

        System.out.println("Son iguales (otro tipo de Objeto)? " + nissan.equals(fecha));
        System.out.println(nissan); // imprimo el objeto, automáticamente se invoca el método toString

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
