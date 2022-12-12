public class EjemploAutoStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.GRIS, 2.5);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO, 3.5, 50);
        Automovil citroen = new Automovil("Citroen", "C5 Aircross", Color.AZUL, 1.8, 60);

        Automovil.setColorPatente(Color.NARANJA);
        Automovil.setCapacidadTanqueEstatico(45);

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(citroen.detalle());

        System.out.println("Kilómetros por litro = " + Automovil.calcularConsumoEstatico(300,60));
        System.out.println("Velocidad máxima en ruta = " + Automovil.VELOCIDAD_MAX_CARRETERA + " km/h");
        System.out.println("Velocidad máxima en ciudad = " + Automovil.VELOCIDAD_MAX_CIUDAD + " km/h");

        System.out.println(subaru);
        System.out.println(mazda);
        System.out.println(nissan);
        System.out.println(citroen);


    }
}
