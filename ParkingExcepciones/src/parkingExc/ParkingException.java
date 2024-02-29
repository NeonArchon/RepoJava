package parkingExc;

public class ParkingException extends Exception {

    private String mensaje;
    private String matricula;

    public ParkingException(String mensaje, String matricula) {
        super();
        this.mensaje = mensaje;
        this.matricula = matricula;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getMatricula() {
        return matricula;
    }
}