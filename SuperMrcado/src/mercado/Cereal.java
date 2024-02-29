package mercado;

import java.time.LocalDate;

public class Cereal implements IesAlimento{
	
	//atriutos de la clase
	
	private String Marca;
	private double Precio;
	private String TipoCereal;
	
	//atrubutos de la interfaz
	private LocalDate Caducidad;
	
	//consructor con los atributos de la clase
	
	public Cereal (String m, double p, String tc) {
		
		this.setMarca(m);
		this.setPrecio(p);
		this.setTipoCereal(tc);
		this.setCaducidad(LocalDate.now());
		
		
	}
	
	public Cereal () {
		
	}
	
	public Cereal (String m, double p, String tc, LocalDate fecha) {
		
		this.setMarca(m);
		this.setPrecio(p);
		this.setTipoCereal(tc);
		this.setCaducidad(fecha);
	}
	

	
	//metodos propios de la clase

	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		Marca = marca;
	}


	public double getPrecio() {
		return Precio;
	}


	public void setPrecio(double precio) {
		Precio = precio;
	}


	public String getTipoCereal() {
		return TipoCereal;
	}


	public void setTipoCereal(String tipoCereal) {
		TipoCereal = tipoCereal;
	}
	
	//mertodos de la intefaz


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
		//por hacer
		//espelta - 5, maiz 8, trigo -12, el resto 1
		
		int calorias = 0;
		if (this.getTipoCereal().equalsIgnoreCase("Espelta")) {
			
			calorias = 5;
		} else if (this.getTipoCereal().equalsIgnoreCase("Maiz")) {
			
			calorias = 8;
		}else if (this.getTipoCereal().equalsIgnoreCase("Trigo")) {
		
		}
		else {
			calorias = 15;
			
		}
			
		
		return calorias;
	}
	
	
		public String toString() {
			String cadena="";
			cadena += "\n Cereal marca - " + this.getMarca();
			cadena += "\n de tipo; - " + this.getTipoCereal();
			cadena += "\n Precio " +this.getPrecio();
			cadena += "\n Calorias: " + this.getCalorias();
			cadena += "\n Fecha de caducidad" + this.getCaducidad();
			return cadena;
					
		}
	
	
}
