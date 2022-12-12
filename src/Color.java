public enum Color {
    ROJO("Rojo"), //
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris"),
    NARANJA("Naranja");

    // defino un atributo final del tipo String en el que vamos a guardar el color personalizado, para que no me
    // muestre el nombre de la constante como color
    private final String color;

    // creo un constructor para Color que pasa un String como argumento y lo asigna al atributo color
    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
