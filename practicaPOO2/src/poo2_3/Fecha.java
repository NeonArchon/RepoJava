package poo2_3;
import java.util.Scanner;


public class Fecha extends Persona{
	
	//ATRIBUTOS
	
	private int dia;
	
	private int mes;
	
	private int anyo;

	
	//CONSTRUCTOR POR DEFECTO
		public Fecha(){
			
			
		}
		
	
	//CONSTRUCTOR CON PARAMETROS "dia" "mes" "anyo
	
	public Fecha (int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}
	
	
	
	//METODO fechaCorrecta
	
	public boolean fechaCorrecta(int dia, int mes, int anyo) {
		
		
		 return esBisiesto(anyo) && mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasEnMes(mes);
		
		
	}
	
	
	//METODO diaSiguiente
	
	public void diaSiguiente() {
        dia++;
        if (!fechaCorrecta(dia, mes, anyo)) {
            dia = 1;
            mes++;
            if (!fechaCorrecta(dia, mes, anyo)) {
                mes = 1;
                anyo++;
            }
        }
    }
	
	/*METODO mostrarFecha (toString)
	 * 
	 * MOSTRAR LA FECHA EN FORMATO dd-mm-aaaa
	 * */
	
	@Override
	public String toString() {
		//return "Fecha [dia= " + dia + ", mes= " + mes + ", anyo= " + anyo + "]";
		
		return String.format("%02d-%02d-%04d", dia, mes, anyo);
		
	}

	
	/*METODO mostrarFecha
	 * 
	 * IMPRIMIR POR PANTALLA FECHA DE MAS A TEXTO
	 * */
	
	public void mostrarFecha() {
        String nombreMes = obtenerNombreMes();
        System.out.printf("%02d-%s-%04d%n", dia, nombreMes, anyo);
    }
	
	//METODO PARA VERIFICAR SI EN ANYO ES BISIENTO
	
	private boolean esBisiesto(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
	
	//METODO PARA OBTEMER NOMBRE DE MES
	
    private String obtenerNombreMes() {
        String[] nombresMeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return nombresMeses[mes - 1];
    }
    
    //METODO PARA OBTENER LOS DIAS DE EL MES
    
    private int diasEnMes(int month) {
        int[] diasEnMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return diasEnMes[month - 1];
        
    }

	//GETTERS Y SETTERS
	

	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	
	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
		 int d, m, a;
		 

		        // Se pide por teclado el dia, mes y año
		        System.out.println("Introduce fecha: ");
		        System.out.print("dia: ");
		        d = sc.nextInt();
		        System.out.print("mes: ");
		        m = sc.nextInt();
		        System.out.print("año: ");
		        a = sc.nextInt();

		        // Se crea un objeto Fecha utilizando el consructor con parámetros
		        Fecha fecha = new Fecha(d, m, a);
		        if (fecha.fechaCorrecta(a, m, a)) {
		            // Se muestra utilizando el método toString()
		            System.out.println("Fecha introducida: " + fecha);

		            // Se muestran los 10 días siguientes utilizando el método diaSiguiente()
		            System.out.println("Los 10 días siguientes son:");
		            for (int i = 1; i <= 10; i++) {
		                fecha.diaSiguiente();
		                fecha.mostrarFecha(); // Utiliza el nuevo método mostrarFecha
		            }
		        } else {
		            // Si la fecha no es correcta
		            System.out.println("Fecha no valida");
		        }
		    }
		}