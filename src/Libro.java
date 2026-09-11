public class Libro {
    String titulo;
    String autor;
    boolean disponible;

    public Libro(String titulo, String autor,  boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible= disponible;
    }

    String getTitulo(){
        return  titulo;
    }

    String getAutor(){
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
