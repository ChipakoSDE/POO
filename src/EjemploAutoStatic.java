public class EjemploAutoStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Negro");

        Automovil mazda = new Automovil("Mazda", "BT-50", "Negro", 2.5);
        Automovil nissan = new Automovil("Nissan", "Navara", "Rojo", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Rojo", 3.5, 50);

        Automovil.setColorPatente("Naranja");

        System.out.println(nissan.detalle());
        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan2.detalle());


    }
}
