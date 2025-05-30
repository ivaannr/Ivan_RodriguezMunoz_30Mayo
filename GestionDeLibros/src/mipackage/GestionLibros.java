package mipackage;

public class GestionLibros {

    private static final int MAX_LIBROS = 5;
    private static String[] libros = new String[MAX_LIBROS];
    private static int contador = 0;

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

    public static boolean añadirLibro(String titulo) {
        if (contador < MAX_LIBROS) {
            libros[contador] = titulo;
            contador++;
            return true;
        }
        return false;
    }

    public static int buscarLibro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (libros[i].equalsIgnoreCase(titulo)) {
                return i;
            }
        }
        return -1;
    }

    public static int contarLibros() {
        return contador;
    }

    public static String mostrarLibro(int indice) {
        if (indice >= 0 && indice < contador) {
            return libros[indice];
        } else {
            return "Índice fuera de rango";
        }
    }
}
