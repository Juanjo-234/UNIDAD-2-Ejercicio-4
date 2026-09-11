public class Biblioteca {
    public ComprobantePrestamo prestarLibro(Libro libro, Socio socio) {

        if (libro.isDisponible()) {
            libro.setDisponible(false);
            System.out.println("[BIBLIOTECA] Préstamo aprobado.");
            return new ComprobantePrestamo(libro, socio);
        } else {
            System.out.println("[BIBLIOTECA] Préstamo rechazado: El libro no se encuentra disponible.");
            return null;
        }
    }
}
