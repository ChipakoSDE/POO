import java.util.Arrays;

public class EjemploAutoArreglo {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Elmos", "Quito");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor (2.0, TipoMotor.NAFTERO));
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAuto.SEDAN);
        subaru.setConductor(conductorSubaru);

        Persona conductorMazda = new Persona("Pato", "Criollo");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.GRIS, new Motor(3,TipoMotor.DIESEL));
        mazda.setTanque(new Tanque(45));
        mazda.setTipo(TipoAuto.PICKUP);
        mazda.setConductor(conductorMazda);

        Persona conductorNissan = new Persona("Tutan", "Kamon");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO,
                new Motor(3.5, TipoMotor.NAFTERO), new Tanque(45));
        nissan.setTipo(TipoAuto.PICKUP);
        nissan.setConductor(conductorNissan);


        Persona conductorCitroen = new Persona("Lito", "Grafia");
        Automovil citroen = new Automovil("Citroen", "C5 Aircross", Color.AZUL,
                new Motor(1.8, TipoMotor.NAFTERO), new Tanque(60));
        citroen.setTipo(TipoAuto.SUV);
        citroen.setConductor(conductorCitroen);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Cata", "Pulta"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = citroen;
        autos[4] = audi;

        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto);

        }

    }
}
