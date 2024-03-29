public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private boolean prestado;

    // Constructor por defecto
    public Libro() {
        this.titulo = "";
        this.isbn = "";
        this.autor = "";
        this.prestado = false;
    }

    // Constructor con parámetros
    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.prestado = false;
    }

    // Métodos de acceso
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    // Método de préstamo
    public void prestar() {
        this.prestado = true;
    }

    // Método de devolución
    public void devolver() {
        this.prestado = false;
    }

    // Método toString
    @Override
    public String toString() {
        return titulo + ", " + isbn + ", " + autor;
    }
}
