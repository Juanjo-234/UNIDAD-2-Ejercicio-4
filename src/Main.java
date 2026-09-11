void main() {
    Biblioteca biblioteca = new Biblioteca();

    Socio socio1 = new Socio("JUAN PEREZ", "JK-23");
    Socio socio2 = new Socio("PEPE SANCHEZ", "GQ-342");

    Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", true);
    Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", false);

    System.out.println("Pedido de prestamso para: " + socio1.getNombreSocio());
    ComprobantePrestamo comprobante1 = biblioteca.prestarLibro(libro1, socio1);
    if (comprobante1 != null) {
        comprobante1.mostrarDetalle();
    }


    System.out.println("Pedido de prestamo para: " + socio2.getNombreSocio());
    ComprobantePrestamo comprobante2 = biblioteca.prestarLibro(libro2, socio2);
    if (comprobante2 != null) {
        comprobante2.mostrarDetalle();
    }
}
