package Parking;

public enum HoraApertura {

	SEIS(6),
    DOCE(12),
    DIECIOCHO(18),
    VEINTICUATRO(24);

    private final int hora;

    HoraApertura(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }
	
}
