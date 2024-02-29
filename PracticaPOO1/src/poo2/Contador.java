package poo2;


	
	/*ESTRUCTURA ESENCIAL PARA CADA CLASE EN PROGRAMACION ORIENTADA A OBJETOS
	 * 1) CLASE INICIAL
	 * 2) CLASE CON LOS PARAMETROS O VARIABLS QUE QUERRAMOS USAR
	 * 3) CONSTRUCTOR
	 * 4) CONSTRUCTOR CON LA VARIABLES
	 * 5) (OPCIONAL) CONTRUCTOR COPIA CON DATOS DE OTRO CONSTRUCTOR
	 * 6) SETTERS Y GETTERS
	 * 7) METODOS/ RESTO DE CODIGO UNA VES SE HAYAN REALIZADO LOS OTROS OBJETOS
	 * */
	
	/*CLASE "CONTADOR" */
	
	public class Contador {
		
		private int contador;
		
		
		/* CONSTRICTOR */
		
		public Contador() {
	}
	
	
	/* CONSTRUCTOR CON LOS PAREMETROS QUE QUEREMOS */
	
		
		public Contador(int contador) {
			if ( contador < 0) {
				this.contador = 0;
			}else {
				this.contador = contador;
			}
		}
			
		/* CONSTRUCTOR COPIA */
			
			public Contador(final Contador c) {
				contador = c.contador;
			}
			
			/* GETTER DEL ONTADOR */
			
			public int getContador() {
				
				return contador;
			}
			
			/* SETTER DEL CONTADOR */
			
			public void setContador(int contador) {
			
			if (contador < 0) {
				this.contador = 0;
			} else {
				this.contador = contador;
				}
			}
			
			/* METODO PARA INCREMENTAT EL CONTADOR */
			
			public void incrementar() {
				
				contador++;
				
			}
			
			/* METODO PARA DECREMENTAT EL CONTADOR */
			
			public void decrementar() {
			contador--;
			if (contador < 0) {
				contador=0;
			}
			
		}
		
			public class ejercicio2Contador {
			
		    public static void main(String[] args) {
		        Contador miContador = new Contador(5);

		        System.out.println("Contador inicial: " + miContador.getContador());

		        miContador.incrementar();
		        System.out.println("Contador después de incrementar: " + miContador.getContador());

		        miContador.decrementar();
		        System.out.println("Contador después de decrementar: " + miContador.getContador());
		    }
		}
	}
