package multimedia;

public class LMultimedia{


	public static void main(String[] args) {

		listaMultimedia lista = new listaMultimedia(10);
		
		Pelicula pelicula1 = new Pelicula("Título1", "Autor1", "Formato1", "120", "Actor1", "Actriz1");
		Pelicula pelicula2 = new Pelicula("Título2", "Autor2", "Formato2", "90", "Actor2", null);
		Pelicula pelicula3 = new Pelicula("Título3", "Autor3", "Formato3", "50", null, "Actriz3");

		lista.add(pelicula1);
		lista.add(pelicula2);
		lista.add(pelicula3);
		
		System.out.println(lista.toString());
		
		Pelicula peliculaBusqueda = new Pelicula("Título1", "Autor1", "Formato1", 0, null, null);
		
		int posicion = lista.indexOf(peliculaBusqueda);
		
		if (posicion != -1) {
		    Multimedia objetoEnPosicion = lista.get(posicion);
		    System.out.println("Objeto en la posición " + posicion + ": " + objetoEnPosicion.toString());
		} else {
		    System.out.println("El objeto no se encuentra en la lista.");
		}

	}

}
