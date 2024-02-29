package gestionAlmacenes;

public class Articulos extends Proveedores{
	
	//atributos
	
	int codigo;
	
	String nombreArticulo;
	
	String descripcion;
	
	double precio;
	
	double iva;
	
	Proveedores proveedor;
	
	int udDisponibles;
	
	
	//constructor vacio
	
	public Articulos(){}
	
	//constructo con atributos
	
	public Articulos(int codigo, String nombreArticulo, String descripcion, 
			double precio, double iva, Proveedores proveedor, int udDisponibles){
		
		this.codigo = codigo;
		
		this.nombreArticulo = nombreArticulo;
		
		this.descripcion = descripcion;
		
		this.precio = precio;
		
		this.iva = iva;
		
		this.proveedor = proveedor;
		
		this.udDisponibles = udDisponibles;
		
	}
	
	//getters y setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public Proveedores getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedores proveedor) {
		this.proveedor = proveedor;
	}

	public int getUdDisponibles() {
		return udDisponibles;
	}

	public void setUdDisponibles(int udDisponibles) {
		this.udDisponibles = udDisponibles;
	}

	
	//metodo tostring
	
	@Override
	public String toString() {
		return "Articulos [codigo=" + codigo + ", nombreArticulo=" + nombreArticulo + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", iva=" + iva + ", proveedor=" + proveedor + ", udDisponibles="
				+ udDisponibles + "]";
	}
	
	
	// Método para obtener información del proveedor
	
    public String obtenerInfoProveedor() {
        if (proveedor != null) {
            return "Proveedor: " + proveedor.toString();
        } else {
            return "Proveedor no asignado";
        }
    }

	
	

}
