package multimedia;

import java.util.Arrays;

public class listaMultimedia{
	
	//ATRIBUTOS
	
	private Multimedia[] objMultimedia;
	
	private int objetos;
	
	private int capacidad;
	
	
	//CONSTRUCTOR
	
	public listaMultimedia (int capacidad) {
		
		this.capacidad = capacidad;
		
		this.objMultimedia = new Multimedia[capacidad];
		
		this.objetos = 0; //NOTA, la lista empieza vacia
	}
	
	//GETTERS Y SETETRS

	public Multimedia[] getObjMultimedia() {
		return objMultimedia;
	}

	public void setObjMultimedia(Multimedia[] objMultimedia) {
		this.objMultimedia = objMultimedia;
	}

	public int getObjetos() {
		return objetos;
	}

	public void setObjetos(int objetos) {
		this.objetos = objetos;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
    // GETTER PARA OBJETOS
	
    public int size() {
        return objetos;
    }	
	
	// METODO ADD MULTIMEDIA
	
    public boolean add(Multimedia m) {
    	
    	if(objetos < capacidad) {
    		
    		objMultimedia[objetos] = m; //AQUI SE METEN LOS ONJETOS AL FINAL DE LA LISTA
    		
    		objetos++; //INCREMENTA EL CONTADOR
    		
    		return true; //PARA INDICAR QUE UN NUEVO OJETO SE HA INTERGRADO A LA LISTA
    		
    	} else {
    		
    		return false; //DEBE SALIR FALSE CUANDO LA LISTA ESTE LLEGA
    	}
    	
    }
	
    //METODO GET
    
    public Multimedia get(int p) { //P ES POR POSICION
    	
    	if (p >= 0 && p < objetos) {
    		
    		return objMultimedia[p]; //DEVUELVE EL OBJETOS EN LA POSICION DE LA LISTA
    		
    	} else {
    		
    		return null; //DEVUELVE NULL SI ES POSICION INVALIDA 
    	}
    	
    }
		
	//METODO INDEXOF
	
    public int indexOf(Multimedia m) {
    	
    	for (int i = 0; i <objetos; i++) {
    		
    		if (objMultimedia[i].equals(m)) {
    			
    			return i; //DEVUELVE LA POSISION SI SE ENCUENTRA EL OBJETO
    		}
    	}
    	return -1; //DEVUELVE -1 SI NO ENCUENTRA EL ONJETO
    }
	
	
	//METODO TO STRING

	@Override
	public String toString() {
		return "listaMultimedia [objMultimedia=" + Arrays.toString(objMultimedia) + "]";
	}

	
}
