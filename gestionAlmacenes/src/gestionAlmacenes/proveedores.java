package gestionAlmacenes;

public class Proveedores {
	
	//atributos

	int cProveedor;
	
	int nProveedor;
	
	String fechaAlta; // en formato mm/dd/aaa
	
	int telefono;
	
	String eMail;
	
	//constructor vacio
	
	public Proveedores() {
		
		
	}
	
	public Proveedores(int cProveedor, int nProveedor, 
			String fechaAlta, int telefono, String eMail) {
		
		this.cProveedor = cProveedor;
		
		this.nProveedor = nProveedor;
		
		this.fechaAlta = fechaAlta;
		
		this.telefono = telefono;
		
		this.eMail = eMail;
		
	}
	
	
	//getters y setters

	public int getcProveedor() {
		return cProveedor;
	}

	public void setcProveedor(int cProveedor) {
		this.cProveedor = cProveedor;
	}

	public int getnProveedor() {
		return nProveedor;
	}

	public void setnProveedor(int nProveedor) {
		this.nProveedor = nProveedor;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	
	//metodo to string
	
	@Override
	public String toString() {
		return "Proveedores [cProveedor=" + cProveedor + ", nProveedor=" + nProveedor + ", fechaAlta=" + fechaAlta
				+ ", telefono=" + telefono + ", eMail=" + eMail + "]";
	}
	
	//metodo validar dato
	
	
	
	
	//metodo obtener informacion
	
	
	
}
