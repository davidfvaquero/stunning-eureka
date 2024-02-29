
/** Clase que sirve para saludar
 *
 * @author antoniovallezHooligan
 */
public class Saludador {

    private int contador;
    private static int general = 0;
    private String idioma;

    /**
     * Constructor vacio, pone el contador a 0 y el idioma en ES
     */
    public Saludador() {
        contador = 0;
        idioma = "ES";
    }

    /**
     * Constructor vacio que pone contador a 0 y cambia el idioma al indicado
     *
     * @param lenguaje Cadena con el idioma que se utiliza
     */
    public Saludador(String lenguaje) {
        contador = 0;
        idioma = lenguaje;
    }

    /**
     * Constructor completo
     *
     * @param contador Entero para fijar el valor del contador
     * @param idioma Cadena con el idioma del saludo
     */
    public Saludador(int contador, String idioma) {
        this.contador = contador;
        this.idioma = idioma;
    }

    /**
     * Constructor que inicializa contador a 0 y fija un idioma
     *
     * @param idioma Cadena con el idioma del saludo
     */
    public void setIdioma(String idioma) {
        this.contador = 0;
        this.idioma = idioma;
    }

    /**
     * Método que saluda (mostrando el numero de veces que se ha saludado)
     *
     * @return Una cadena con el saludo
     */
    public String saludar() {
        general++;
        if (idioma.equals("ES")) {
            return "Hola ( " + general + " )";
        }
        contador++;
        return "Hello ( " + contador + " )";
    }

    /**
     * Método de acceso al contador
     *
     * @return Un entero con el numero de veces que se ha llamado a saludar
     */
    public int getContador() {
        return contador;
    }
}
