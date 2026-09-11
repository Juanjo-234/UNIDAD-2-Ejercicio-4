public class Socio {
    String nombreSocio;
    String numeroSocio;

    public Socio(String nombreSocio, String numeroSocio){
        this.nombreSocio = nombreSocio;
        this.numeroSocio = numeroSocio;
    }

    String getNombreSocio(){
        return nombreSocio;
    }

    String getNumeroSocio(){
        return  numeroSocio;
    }
}
