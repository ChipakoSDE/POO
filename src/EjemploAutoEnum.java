public class EjemploAutoEnum {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAuto.SUV);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.GRIS, 2.5);
        mazda.setTipo(TipoAuto.PICKUP);
        System.out.println("Fabricante = " + mazda.getFabricante());

        TipoAuto tipo = subaru.getTipo();
        System.out.println("Nombre = " + tipo.getNombre());
        System.out.println("Descripción = " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El automóvil es deportivo y descapotable de 2 puertas");
            case COUPE -> System.out.println("Es un automóvil pequeño 2 puertas y por lo general deportivo");
            case FURGON -> System.out.println("Es una camioneta utilitaria de transporte");
            case HATCHBACK -> System.out.println("Es un automóvil mediano compacto, de aspecto deportivo");
            case SUV -> System.out.println("Es una camioneta familiar");
            case SEDAN -> System.out.println("Es un automóvil mediano de 4 puertas");
            case PICKUP -> System.out.println("Es una camioneta de 2 o 4 puertas");
            case STATION_WAGON -> System.out.println("Es un automóvil familiar, con mucha capacidad de equipaje");
        }
        TipoAuto[] tipos = TipoAuto.values();
        for (TipoAuto ta: tipos) {
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " + ta.getDescripcion() + ", " + ta.getNumeroPuertas() + " puertas");
            System.out.println();
        }
    }
}
