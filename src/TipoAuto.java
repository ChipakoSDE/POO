public enum TipoAuto {
    SEDAN("Sedan", 4, "Auto normal"),
    STATION_WAGON("Station Wagon", 5, "Auto familiar grande"),
    HATCHBACK("Harckback", 5, "Auto compacto"),
    PICKUP("PickUp", 4, "Camioneta"),
    COUPE("Coupé", 2, "Auto pequeño"),
    SUV("SUV", 5, "Camioneta familiar"),
    CONVERTIBLE("Convertible", 2, "Auto deportivo"),
    FURGON("Furgón", 3, "Camioneta utilitaria");

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    // creo el constructor para pasarle los atributos como parámetros
    TipoAuto(String nombre, int numeroPuertas, String descripcion) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }
    // los enum no tienen Setter porque no son modificables, solo generamos los Getter
    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
