import java.util.Date;

public class EjemploAuto {
    public static void main(String[] args) {
        Motor motorSubaru = new Motor (2.0, TipoMotor.NAFTERO);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.AZUL);

        Motor motorMazda = new Motor(3,TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.GRIS, motorMazda);
        mazda.setTanque(new Tanque(45));
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Motor motorNissan = new Motor(3.5, TipoMotor.NAFTERO);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO, motorNissan,
                new Tanque(50));
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.ROJO,
                new Motor(3.5, TipoMotor.NAFTERO), new Tanque(45));

        Date fecha = new Date(); // nueva instancia del objeto Date

        // comparo los objetos enteros, como son diferentes instancias, a pesar de tener los mismos atributos, el
        // resultado es false, porque son 2 objetos distintos, 2 instancias diferentes del objeto Automovil
        System.out.println("Son iguales? " + (nissan == nissan2));
        // en este caso comparo solamente marca y modelo, por la sobrescritura del método equals dentro de la clase Automovil
        System.out.println("Son iguales con equals? " + nissan.equals(nissan2));

        System.out.println("Son iguales (otro tipo de Objeto)? " + nissan.equals(fecha));
        System.out.println(nissan); // imprimo el objeto, automáticamente se invoca el método toString


        System.out.println(subaru.detalle()); // invoco al método detalle que está definido en la clase Automovil para mostrar los datos
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());

        System.out.println(subaru.acelerar(95));
        System.out.println(mazda.acelerar(115));
        System.out.println(mazda.frenar());

        System.out.println(subaru.acelerarFrenar(150));

        System.out.println("El " + subaru.getFabricante() + " " + subaru.getModelo() + " recorre "
                + subaru.calcularConsumo(300, 50) + " kilómetros por litro");
        System.out.println("El " + nissan.getFabricante() + " " + nissan.getModelo() + " recorre "
                + nissan.calcularConsumo(300, 50) + " kilómetros por litro");

    }
}
