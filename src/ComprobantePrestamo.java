public class ComprobantePrestamo {
    private Libro libro;
    private Socio socio;

    public ComprobantePrestamo(Libro libro, Socio socio){
        this.libro = libro;
        this.socio = socio;
    }
    public void mostrarDetalle() {
        System.out.println("--- COMPROBANTE DE PRÉSTAMO ---");
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("-------------------------------");
    }
}
