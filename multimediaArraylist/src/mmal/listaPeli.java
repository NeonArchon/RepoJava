package mmal;

import java.util.ArrayList;

public class listaPeli  {
	

	public static void main(String[] args) {
		
		listaMultimediaAL listaPelicula = new listaMultimediaAL();

        peliculaAL pelicula1 = new peliculaAL("Dune", "Timothee Chalamet", "wav", "120");
        peliculaAL pelicula2 = new peliculaAL("Doctor Strange", "Benedict Cumberbatch", "mp4","90");
        peliculaAL pelicula3 = new peliculaAL("Alien El octavo Pasajero", "Sigourney Weaver", "avi", "150");

        listaPelicula.add(pelicula1);
        listaPelicula.add(pelicula2);
        listaPelicula.add(pelicula3);

        System.out.println("Lista de Multimedia:");
        System.out.println(listaPelicula.toString());

        peliculaAL peliculaBusqueda = new peliculaAL(null, null, null, null);
        int posicion = listaPelicula.indexOf(peliculaBusqueda);

        if (posicion != -1) {
        	multimediaAL multimediaEncontrada = listaPelicula.get(posicion);
            System.out.println("\nObjeto encontrado en posición " + posicion + ": " + multimediaEncontrada.toString());
        } else {
            System.out.println("\nObjeto no encontrado en la lista.");
        }
		
		
	}

}
