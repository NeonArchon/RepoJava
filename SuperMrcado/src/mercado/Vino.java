package mercado;

import java.time.LocalDate;

public class Vino implements IconDescuento, IesLiquido, IesAlimento{
	//NOTA: REVISAR LOS SET Y REALIZAR COMPROBACION (por hacer)
	
	//atributos de la clase
	
	private String Marca;
	private String TipoVino;
	private double Grados;
	private double Precio;
	
	//atributos de la interfaces
	
	private double Descuento;
	private double Volumen;
	private String tipoEnvase;
	private LocalDate Caducidad;
	//private int Calorias;
	
	
	//constructor con todos los atrubutos
	
	public Vino(String m, String tv, double g, double p) {

		this.setMarca(m);
		this.setTipoVino(tv);
		this.setGrados(g);
		this.setPrecio(p);
		
		this.setDescuento(0.2);
		this.setVolumen(0.5);
		this.setTipoEnvase("PET");
		
		LocalDate ahora = LocalDate.now();
		this.setCaducidad(ahora);
		
	}
	
	public Vino() {
		
		
	}
	
	//constructor
	
	public Vino(String m, String tv, double g, double p, double des, double vol, String env, LocalDate fecha) {
		
		this.setMarca(m);
		this.setTipoVino(tv);
		this.setGrados(g);
		this.setPrecio(p);
		
		this.setDescuento(des);
		this.setVolumen(vol);
		this.setTipoEnvase(env);
		
		this.setCaducidad(fecha);
		
	}

	
	//geters y setters de la clase Vino

	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		Marca = marca;
	}


	public String getTipoVino() {
		return TipoVino;
	}


	public void setTipoVino(String tipoVino) {
		TipoVino = tipoVino;
	}


	public double getGrados() {
		return Grados;
	}


	public void setGrados(double grados) {
		Grados = grados;
	}


	public double getPrecio() {
		return Precio;
	}


	public void setPrecio(double precio) {
		Precio = precio;
	}
	



	
	@Override
	public void setescuento(double des) {
		this.Descuento = des;
		
	}


	@Override
	public double getDescuento() {
	return this.Descuento;
	}


	@Override
	public double getPrecioDescuento() {
		return (this.getPrecio() - this.getPrecio()*this.getPrecioDescuento());
	}


	@Override
	public void setCaducidad(LocalDate fecha) {
		this.Caducidad = fecha;
		
	}


	@Override
	public LocalDate getCaducidad() {
	
		return this.Caducidad;
	}


	@Override
	public int getCalorias() {
		return 0;
	}


	@Override
	public void setVolumen(double v) {
		this.Volumen = v;
		
	}


	@Override
	public double getVolumen() {
		return this.Volumen;
	}


	@Override
	public void setTipoEnvase(String env) {
		this.tipoEnvase = env;
		
	}


	public int getClorias() {
		//multiplicar por 10 la gracuadion alcoholica
		// casting a ENTERO
		
		int calorias = (int) (this.getGrados()*10);
				return calorias;
	}





	public void setDescuento(double descuento) {
		Descuento = descuento;
	}


	@Override
	public String getTipoEnvase() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public String toString() {
		String cadena="";
		cadena += "\n Vino marca - " + this.getMarca();
		cadena += "\n --" + this.getTipoVino() + "con " + this.getGrados() + "grados";
		cadena += "\n Calorias" + this.getCalorias();
		cadena += "\n Precio; - " + this.getPrecio() + " €";
		cadena += "\n¿Tiene descuento? " +this.getDescuento() + " €";
		cadena += "\n Precio final: " + this.getPrecioDescuento();
		cadena += "\n Capacidad" + this.getVolumen() + " litros y en formato" + this.getTipoEnvase();
		cadena += "\n Fecha de Caducidad: " + this.getCaducidad().toString();
		return cadena;
				
	}
	
	
}
