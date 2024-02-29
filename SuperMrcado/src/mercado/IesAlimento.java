package mercado;

import java.time.LocalDate;

public interface IesAlimento {
	
	public void setCaducidad(LocalDate fecha);
	public LocalDate getCaducidad();
	public int getCalorias();

}
