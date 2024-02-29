package Parking;


public class VehiculoCliente implements IVehiculo{

	//atributos
	
	 private String matricula; // Cadena de texto matricula no puede ser modificada
	 
	    private int tiempo; // Valor entero tiempo almacena el número de minutos que el vehículo está en el parking

	
	//constructor
	
	  public VehiculoCliente(String matricula) {
		  
	      this.matricula = matricula;
	      
	      this.tiempo =  0; // Valor inicial de tiempo es  0
	    }
	
	// Método que modifica el campo de tiempo
	 /*  public void setTiempo(int tiempo) {
		   
	      this.tiempo = tiempo;
	      
	    }
	
	  	*/
	  
	  
	  
	  
	@Override
	public double factura() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean hayPlaza(Parking parking) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void aparca(Parking parking) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setTiempo(int tiempo) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

	
	

}
