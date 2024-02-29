package mmal;

import java.util.ArrayList;

public class listaDisco {
	
	
	public static void main(String[] args) {
		
		listaMultimediaAL listaDiscos = new listaMultimediaAL();

        discoAL disco1 = new discoAL("electronica", "mp3", "Hyperdrama", "Justice", "80" );
        discoAL disco2 = new discoAL("pop", "mp3" , "Thriller", "Michael Jackson", "100");
        discoAL disco3 = new discoAL("pop", "mp3", "Gorillaz", "Gorillaz", "68");

        listaDiscos.add(disco1);
        listaDiscos.add(disco2);
        listaDiscos.add(disco3);

        System.out.println("Lista de Discos:");
        System.out.println(listaDiscos.toString());

        discoAL discoBusqueda = new discoAL();
        int posicion = listaDiscos.indexOf(discoBusqueda);

        if (posicion != -1) {
        	multimediaAL discoEncontrado = listaDiscos.get(posicion);
            System.out.println("\nObjeto encontrado en posición " + posicion + ": " + discoEncontrado.toString());
        } else {
            System.out.println("\nObjeto no encontrado en la lista.");
        }

	}

}
