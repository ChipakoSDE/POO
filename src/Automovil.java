public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "Gris";
    private double cilindrada;
    private int capacidadTanque = 40;

    // creamos el constructor de la clase Automovil, de esta manera cuando creo una nueva instancia de la clase Automovil
    // se genera con 2 atributos que los paso como parámetros.
    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    // defino un constructor vacío para poder instanciar Automovil sin pasar parámetros
    public Automovil(){

    }

    // defino los métodos para obtener y actualizar los atributos privados de la clase
    public String getFabricante() {
        return fabricante; // aquí podría usar el this.fabricante
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante; // uso el this.fabricante para que no sea ambiguo, estoy asignando al atributo
        // de la clase el valor que pasamos como argumento del método
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }
    public void setCapacidadTanque(int capacidadTanque){
        this.capacidadTanque = capacidadTanque;
    }


    public String detalle(){
        // si estoy en un método y quiero hacer referencia a un atributo de la clase uso el this.Atributo
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
