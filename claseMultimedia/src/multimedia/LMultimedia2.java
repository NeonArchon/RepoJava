package multimedia;

public class LMultimedia2 {

	public static void main(String[] args) {
		
		listaMultimedia lista = new listaMultimedia(10);
		
		Disco disco1 = new Disco(Genero.rock);
		Disco disco2 = new Disco(Genero.synthwave);
		Disco disco3 = new Disco(Genero.experimental);

		lista.add(disco1);
		lista.add(disco2);
		lista.add(disco3);
		
		System.out.println(lista.toString());
		
		Disco discoBuscar = new Disco(Genero.pop);

		int posicion = lista.indexOf(discoBuscar);

		if (posicion != -1) {
		    Multimedia objetoEnPosicion = lista.get(posicion);
		    System.out.println("Objeto en posición " + posicion + ": " + objetoEnPosicion.toString());
		} else {
		    System.out.println("El objeto no se encuentra en la lista.");
		}
		

	}

}
