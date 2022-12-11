public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "Gris";
    private double cilindrada;
    private int capacidadTanque = 40;

    // defino un constructor vacío para poder instanciar Automovil sin pasar parámetros
    public Automovil(){

    }
    // creamos el constructor de la clase Automovil, de esta manera cuando creo una nueva instancia de la clase Automovil
    // se genera con 2 atributos que los paso como parámetros.
    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        // podemos optimizar el código reutilizando otros constructores, cuando uso el this() estoy haciendo
        // referencia a un constructor dentro de la clase
        this(fabricante, modelo); // con esto evito reescribir las 2 líneas siguientes porque eso ya está escrito en
        // el constructor anterior
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }
    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
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
        sb.append("Fabricante: " + this.fabricante);
        sb.append("\nModelo: " + this.modelo);
        sb.append("\nColor: " + this.color);
        sb.append("\nCilindrada: " + this.cilindrada);
        sb.append("\nCapacidad Tanque: " + this.capacidadTanque);
        return sb.toString();
        // Siguiendo las buenas prácticas dentro de una clase que representa datos nunca se deberían imprimir datos,
        // por eso devolvemos el String y después al momento de utilizarlo defino que necesito hacer con esos datos.
        // El IDE también me está marcando que no es necesario utilizar StringBuilder, porque es una cadena corta, por
        // lo que podría reducirlo y dejar el código más limpio de la siguiente manera:
        /*
        return "Fabricante = " + this.fabricante +
                "\nColor = " + this.color +
                "\nModelo = " + this.modelo +
                "\nCilindrada = " + this.cilindrada;
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
