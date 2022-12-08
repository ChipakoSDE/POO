public class Automovil {

    String fabricante;
    String modelo;
    String color = "Gris";
    double cilindrada;
    int capacidadTanque = 40;

    public String detalle(){
        // si estoy en un método y quiere hacer referencia a un atributo de la clase uso el this.Atributo
        StringBuilder sb = new StringBuilder();
        sb.append("auto.fabricante = " + this.fabricante);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.cilindrada = " + this.cilindrada);
        return sb.toString();
        // Siguiendo las buenas prácticas dentro de una clase que representa datos nunca se deberían imprimir datos,
        // por eso devolvemos el String y después al momento de utilizarlo defino que necesito hacer con esos datos.
        // El IDE también me está marcando que no es necesario utilizar StringBuilder, porque es una cadena corta, por
        // lo que podría reducirlo y dejar el código más limpio de la siguiente manera:
        /*
        return "auto.fabricante = " + this.fabricante +
                "\nauto.color = " + this.color +
                "\nauto.modelo = " + this.modelo +
                "\nauto.cilindrada = " + this.cilindrada;
         */
    }
    public String acelerar(int kmh){
        return "El auto " + this.fabricante + " está acelerando a " + kmh + " km/h";
    }
    public String frenar(){
        return this.fabricante + " " + this.modelo + " está frenando!";
    }
    public String acelerarFrenar(int kmh){
        String acelerar = this.acelerar(kmh); // le pasamos el atributo que recibimos en este método al método acelerar
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, int porcentajeNaftaConsumida){
        return km/(capacidadTanque * (porcentajeNaftaConsumida/100f));
    }
}
