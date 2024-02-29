package mercado;

public class Detergente implements IesLiquido, IconDescuento  {
	
	//atributos propios de la clase detergente
	private String Marca;
	private double Precio;
	
	//atributos necesarios para trabajar con Iesliquido
	private double Volumen;
	private String TipoEnvase;
	
	//atributos necesarios para trabajar conIconDescuento
	private double Descuento;
	
	
	
	
	//constructor marca-precio
	
		public Detergente(String Marca, double Precio) {
			
			this.setMarca(Marca);
			this.setPrecio(Precio);
			this.setVolumen(0.5);
			this.setTipoEnvase("PET");
			this.setescuento(0.2);
			
		}
		
	//segundo constructor con TODOS los atributos
	// de la clase y las interfazes
		
		public Detergente(String m, double p, double v, String te, double des) {
			
			this.setMarca(m);
			this.setPrecio(p);
			this.setVolumen(v);
			this.setTipoEnvase(te);
			this.setescuento(des);
			
			
		}
		
		//constructor vacio

		public Detergente() {
			
			
		}
	
	
	//metodos de la interfaz
	@Override
	public void setVolumen(double v) {

		this.Volumen = v;
		
		//se debe comprobar el dato antes e guardar!!
		/*  
		 * condicio; NO NEGATIVO (mayor que cero) y n
		 * */
	}
	@Override
	public double getVolumen() {

		return this.Volumen;
		
	}
	@Override
	public void setTipoEnvase(String env) {

		this.TipoEnvase = env;
		
		/* 
		 *Alguna comprobacion? 
		 * */
		
	}
	@Override
	public String getTipoEnvase() {

		return this.TipoEnvase;

	}
	
	
	//metodos de la interfaz 
	
	@Override
	public void setescuento(double des) {
		
		this.Descuento = des;
		
		/* 
		 * Numeroco - decimal  (0,_)
		 * 
		 * */
		
		
	}
	@Override
	public double getDescuento() {
		
		return this.Descuento;
	}
	@Override
	public double getPrecioDescuento() {
		double MiPrecio = this.getPrecio() - (this.getPrecio() * this.getDescuento());
		return MiPrecio;
	}
	
	
	
	
	//metodos de la clase
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
		
		/* 
		 * alguna comprobacion?
		 * */
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
		
		/* 
		 * comprobar mayor que cero;
		 * 
		 * */
	}
	
	@Override
	public String toString() {
		String cadena="";
		cadena += "\n Detergente marca - " + this.getMarca();
		cadena += "\n Precio; - " + this.getPrecio() + " €";
		cadena += "\n¿Tiene descuento? " +this.getDescuento();
		cadena += "\n Precio final: " + this.getPrecioDescuento();
		cadena += "\n Capacidad" + this.getVolumen() + " litros y en formato" + this.getTipoEnvase();
		return cadena;
				
	}
	
	
	
	

	
	//metodos de la clase
	
	
	

}
