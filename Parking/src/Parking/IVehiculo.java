package Parking;

public interface IVehiculo {
	
	public double factura();
	
	public boolean hayPlaza(Parking parking);
	
	public void aparca(Parking parking);
	
	public void setTiempo(int tiempo);

}
