public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Tanque tanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAuto tipo; // atributo para utilizar el enum

    private static Color colorPatente = Color.BLANCO;
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoId;

    // los atributos final son constantes del objeto, por lo general son públicas y estáticas, siempre se nombran
    // con mayúsculas separando las palabras con _
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";


    // defino un constructor vacío para poder instanciar Automovil sin pasar parámetros
    public Automovil(){
        this.id = ++ultimoId; // el atributo estático ultimoId mantiene el valor a través de las instancias,
                              // solo se incrementa cuando genero una nueva instancia del objeto Automovil
    }
    // creamos el constructor de la clase Automovil, de esta manera cuando creo una nueva instancia de la clase Automovil
    // se genera con 2 atributos que los paso como parámetros.
    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        // podemos optimizar el código reutilizando otros constructores, cuando uso el this() estoy haciendo
        // referencia a un constructor dentro de la clase, al constructor que usa los parámetros que pongo entre
        // paréntesis
        this(fabricante, modelo); // con esto evito reescribir las 2 líneas siguientes porque eso ya está escrito en
        // el constructor anterior
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque) {
        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, tanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    // defino los métodos para obtener y actualizar los atributos privados de la clase
    public String getFabricante() {
        return fabricante; // aquí podría usar el this.fabricante
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante; // uso el this.fabricante para que no sea ambiguo, estoy asignando al atributo
        // de la clase el valor que pasamos como argumento del método
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // al definir el setter y el getter de atributos estáticos, tienen que ser estáticos también
    public static Color getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente; // como es estática no puedo usar el this para identificarlos uso la clase
    }

    public static int getCapacidadTanqueEstatico(){
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico){
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public TipoAuto getTipo() {
        return tipo;
    }

    public void setTipo(TipoAuto tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        if(tanque == null){
            this.tanque = new Tanque();
        }
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
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

        String detalle = "Id = " + this.id +
                         "\nFabricante = " + this.fabricante +
                         "\nColor = " + this.color +
                         "\nModelo = " + this.modelo;
        if (getTipo() != null){
            detalle +=     "\nTipo = " + this.getTipo().getDescripcion() +
                    "\nPuertas = " + this.getTipo().getNumeroPuertas();
        }
        if (this.getMotor() != null){
            detalle +=   "\nCilindrada = " + this.getMotor().getCilindrada();
        }
        detalle +=       "\nColor Patente = " + colorPatente;
        return detalle;
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
        return km/(this.getTanque().getCapacidad() * (porcentajeNaftaConsumida/100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeNaftaConsumida){
        return km/(capacidadTanqueEstatico * (porcentajeNaftaConsumida/100f));
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

    // sobrescribo toString para que me muestre toda la información del objeto con el formato que quiero
    @Override
    public String toString() {
        String detalle = "Automovil{" +
                        "Id: " + id +
                        ", Fabricante: '" + fabricante + '\'' +
                        ", Modelo: '" + modelo + '\'';
        if(getTipo() != null){
            detalle +=  ", Tipo: '" + getTipo().getDescripcion() + '\'' +
                        ", Puertas: " + getTipo().getNumeroPuertas();
        }
        detalle +=      ", Color: '" + color + '\'';

        if(getMotor() != null) {
            detalle += ", Cilindrada: " + getMotor().getCilindrada();
        }
        detalle += ", Capacidad Tanque: " + getTanque().getCapacidad() + " litros" +
                    '}';
        return detalle;
    }
}
