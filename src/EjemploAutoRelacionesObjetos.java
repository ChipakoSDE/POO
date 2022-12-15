public class EjemploAutoRelacionesObjetos {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Elmos", "Quito");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor (2.0, TipoMotor.NAFTERO));
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAuto.SEDAN);
        subaru.setConductor(conductorSubaru);
        // subaru.setRuedas(ruedasSubaru);
        Rueda[] ruedasSubaru = new Rueda[5];
        for (int i = 0; i < ruedasSubaru.length; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Persona conductorMazda = new Persona("Pato", "Criollo");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.GRIS, new Motor(3,TipoMotor.DIESEL));
        mazda.setTanque(new Tanque(45));
        mazda.setTipo(TipoAuto.PICKUP);
        mazda.setConductor(conductorMazda);
        // mazda.setRuedas(ruedasMazda);
        Rueda[] ruedasMazda = new Rueda[5];
        for (int i = 0; i < ruedasMazda.length; i++) {
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }

        Persona conductorNissan = new Persona("Tutan", "Kamon");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO,
                new Motor(3.5, TipoMotor.NAFTERO), new Tanque(45));
        nissan.setTipo(TipoAuto.PICKUP);
        nissan.setConductor(conductorNissan);
        nissan.addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5));

        Rueda[] ruedasCitroen = new Rueda[5];
        for (int i = 0; i < ruedasCitroen.length; i++) {
            ruedasCitroen[i] = new Rueda("Yokohama", 16, 7.5);
        }
        Persona conductorCitroen = new Persona("Lito", "Grafia");
        Automovil citroen = new Automovil("Citroen", "C5 Aircross", Color.AZUL,
                new Motor(1.8, TipoMotor.NAFTERO), new Tanque(60), conductorCitroen, ruedasCitroen);
        citroen.setTipo(TipoAuto.SUV);


        Automovil.setColorPatente(Color.NARANJA);
        Automovil.setCapacidadTanqueEstatico(65);

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(citroen.detalle());

    }
}
