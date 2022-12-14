public class EjemploAutoStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor (2.0, TipoMotor.NAFTERO));
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAuto.SEDAN);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.GRIS, new Motor(3,TipoMotor.DIESEL));
        // mazda.setTanque(new Tanque(45));
        mazda.setTipo(TipoAuto.PICKUP);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO, new Motor(3.5, TipoMotor.NAFTERO));
        nissan.setTanque(new Tanque(45));
        nissan.setTipo(TipoAuto.PICKUP);
        Automovil citroen = new Automovil("Citroen", "C5 Aircross", Color.AZUL,
                new Motor(1.8, TipoMotor.NAFTERO), new Tanque(60));
        citroen.setTipo(TipoAuto.SUV);
        Automovil.setColorPatente(Color.NARANJA);
        Automovil.setCapacidadTanqueEstatico(65);

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
        
        TipoAuto tipoSubaru = subaru.getTipo();
        System.out.println("tipoSubaru.getNombre() = " + tipoSubaru.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipoSubaru.getDescripcion());

        System.out.println("mazda = " + mazda.calcularConsumo(300, 70));


    }
}
