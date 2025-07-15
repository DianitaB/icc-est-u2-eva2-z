package models;

public class Book implements Comparable<Book> {
    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public int compareTo(Book otro) {
        int cmpTitulo = otro.titulo.compareToIgnoreCase(this.titulo);
        if (cmpTitulo != 0) {
            return cmpTitulo;
        }
        return Integer.compare(this.anio, otro.anio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return this.anio == other.anio &&
               this.titulo.equalsIgnoreCase(other.titulo);
    }

    @Override
    public int hashCode() {
        return titulo.toLowerCase().hashCode() + anio;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + anio + ")";
    }
}
