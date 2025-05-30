package mipackage;

public class GestionLibros {

    private static final int MAX_LIBROS = 5;
    private static String[] libros = new String[MAX_LIBROS];
    private static int contador = 0;

    /**
     * Método main
     * @param args
     */
    public static void main(String[] args) {
        añadirLibro("Don Quijote");
        añadirLibro("Cien años de soledad");
        añadirLibro("El principito");

        System.out.println("Total de libros: " + contarLibros());

        int indice = buscarLibro("El principito");
        if (indice != -1) {
            System.out.println("Libro encontrado en índice " + indice + ": " + mostrarLibro(indice));
        } else {
            System.out.println("Libro no encontrado");
        }
    }

    /**
     * Método que pide un título de un libro y lo añade
     * a un array de libros
     * @param titulo String que sea el nombre del libro a añadir
     * @return true si se pudo añadir el libro false si no
     */
    public static boolean añadirLibro(String titulo) {
        if (contador < MAX_LIBROS) {
            libros[contador] = titulo;
            contador++;
            return true;
        }
        return false;
    }

    /**
     * Método al que se le pasa el título de un libro
     * por parámetro y te devuelve la posición en la 
     * que se encuentra dentro del array.
     * @param titulo String que sea el nombre del libro a añadir
     * @return La posición donde se encuentra en libro
     */
    public static int buscarLibro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (libros[i].equalsIgnoreCase(titulo)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Cuenta los libros que hay
     * @return La cantidad de libros
     */
    public static int contarLibros() {
        return contador;
    }

    /**
     * Método al que se le pasa un índice por parámetro 
     * para mostrar el libro que se encuentre en esa posición
     * @param indice Supuesta posición del libro
     * @return El libro buscado si se encuentra o el texto "Índice fuera de rango" si el índice pasado por parámetro esta fuera de rango.
     */
    public static String mostrarLibro(int indice) {
        if (indice >= 0 && indice < contador) {
            return libros[indice];
        } else {
            return "Índice fuera de rango";
        }
    }
}
