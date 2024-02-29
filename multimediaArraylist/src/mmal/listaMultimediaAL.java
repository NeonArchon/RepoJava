package mmal;

import java.util.ArrayList;

public class listaMultimediaAL extends multimediaAL {
	
	// ATRIBUTOS
    private ArrayList<multimediaAL> listaMultimedia;
    private int maxSize;

    // CONSTRUCTOR
    
    /* for (int i=0;i<maxSize; i++){
     * listamultimedia.add(null)
     *  }
     *  */
    public void ListaMultimedia(int maxSize) {
        this.maxSize = maxSize;
        this.listaMultimedia = new ArrayList<>();
    }

    // MÉTODO size
    public int size() {
        return listaMultimedia.size();
    }

    // MÉTODO add
    public boolean add(multimediaAL m) {
        if (listaMultimedia.size() < maxSize) {
            listaMultimedia.add(m);
            return true;
        } else {
            return false;
        }
    }

    // MÉTODO get
    public multimediaAL get(int posicion) {
        if (posicion >= 0 && posicion < listaMultimedia.size()) {
            return listaMultimedia.get(posicion);
        } else {
            return null;
        }
    }

    // MÉTODO indexOf
    public int indexOf(multimediaAL m) {
        return listaMultimedia.indexOf(m);
    }

    // MÉTODO toString
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ListaMultimedia [");
        for (multimediaAL m : listaMultimedia) {
            result.append(m.toString()).append(", ");
        }
        // Eliminar la última coma y espacio
        if (!listaMultimedia.isEmpty()) {
            result.setLength(result.length() - 2);
        }
        result.append("]");
        return result.toString();
    }

	public int indexOf(peliculaAL peliculaBusqueda) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void add(peliculaAL pelicula3) {
		// TODO Auto-generated method stub
		
	}
}
