package gestionAlmacenes;

public class Ventas extends Articulos{
	
	//atributos
	
	Articulos articulo;
	
	String fechaCompra;
	
	Articulos precio;
	
	Articulos iva;
	
	int pFinal; //este se consigue usandoo sumando el precio del articulo y el IVA
	
	boolean pagoCompra;
	
	
	//constructor vacio
	
	public Ventas() {
		
		
	}
	
	
	//constructor con atributos
	
	public Ventas(Articulos articulo, String fechaCompra, 
			Articulos precio, Articulos iva, int pFinal, boolean pagoCompra) {
		
		
		this.articulo = articulo;
		
		this.fechaCompra = fechaCompra;
		
		this.precio = precio;
		
		this.iva = iva;
		
		this.pFinal = pFinal;
		
		this.pagoCompra = pagoCompra;
		
	}
	
	//getters y setters

	public Articulos getArticulo() {
		return articulo;
	}


	public void setArticulo(Articulos articulo) {
		this.articulo = articulo;
	}


	public String getFechaCompra() {
		return fechaCompra;
	}


	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}


	public Articulos getprecio() {
		return precio;
	}


	public void setPrecio(Articulos precio) {
		this.precio = precio;
	}


	public Articulos getiva() {
		return iva;
	}


	public void setIva(Articulos iva) {
		this.iva = iva;
	}


	public int getpFinal() {
		return pFinal;
	}


	public void setpFinal(int pFinal) {
		this.pFinal = pFinal;
	}


	public boolean isPagoCompra() {
		return pagoCompra;
	}


	public void setPagoCompra(boolean pagoCompra) {
		this.pagoCompra = pagoCompra;
	}
	
	
	
	
	//metodo para obtener precio final
	
	public int precioFinal(int precio, int iva) {
		
		pFinal = precio + iva;
		
		return pFinal;
	}
	
	
	
	//metodo validar datos
	
	
	
	//metodo obtener datos
	
	
	

}
