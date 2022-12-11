public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "Gris";
    private double cilindrada;
    private int capacidadTanque = 40;
    private static String colorPatente = "Blanco";

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

    // al definir el setter y el getter de atributos estáticos, tienen que ser estáticos también
    public static String getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente; // como es estática no puedo usar el this para identificarlos uso la clase
    }

    public String detalle(){
        // si estoy en un método y quiero hacer referencia a un atributo de la clase uso el this.Atributo
        /*
        StringBuilder sb = new StringBuilder();
        sb.append("Fabricante: " + this.fabricante);
        sb.append("\nModelo: " + this.modelo);
        sb.append("\nColor: " + this.color);
        sb.append("\nCilindrada: " + this.cilindrada);
        sb.append("\nCapacidad Tanque: " + this.capacidadTanque);
        return sb.toString();
        */
        // Siguiendo las buenas prácticas dentro de una clase que representa datos nunca se deberían imprimir datos,
        // por eso devolvemos el String y después al momento de utilizarlo defino que necesito hacer con esos datos.
        // El IDE también me está marcando que no es necesario utilizar StringBuilder, porque es una cadena corta, por
        // lo que podría reducirlo y dejar el código más limpio de la siguiente manera:

        return "Fabricante = " + this.fabricante +
                "\nColor = " + this.color +
                "\nModelo = " + this.modelo +
                "\nCilindrada = " + this.cilindrada +
                "\nColor Patente = " + colorPatente;

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

    // sobrescritura de métodos, sobrescribimos el equals dentro de ésta clase para que solo valide fabricante y modelo
    @Override
    public boolean equals(Object obj) {
        // primero valido si son el mismo objeto, si es asi devuelvo true
        if (this == obj){
            return true;
        }
        // valido que el obj que estoy pasando sea una instancia de Automovil, si no es así devuelvo false
        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj; // casteamos el obj para que sea un Automovil, es el objeto contra el que voy
        // a comparar los atributos de la instancia.
        // valido que fabricante y modelo de la instancia y del obj parámetro no sean null y que sean iguales
        boolean b = (this.fabricante != null) && (this.modelo != null)
                && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo());
        return b;
    }

    // sobrescribo toString para que me muestre toda la informacion del objeto con el formato que quiero
    @Override
    public String toString() {
        return "Automovil{" +
                "Fabricante: '" + fabricante + '\'' +
                ", Modelo: '" + modelo + '\'' +
                ", Color: '" + color + '\'' +
                ", Cilindrada: " + cilindrada +
                ", Capacidad Tanque: " + capacidadTanque + " litros" +
                '}';
    }
}
