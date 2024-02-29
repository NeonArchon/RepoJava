package poo;
import java.util.Scanner;
public class ejecricio1Cuenta {

		
		/*ESTRUCTURA ESENCIAL PARA CADA CLASE EN PROGRAMACION ORIENTADA A OBJETOS
		 * 1) CLASE INICIAL
		 * 2) CLASE CON LOS PARAMETROS O VARIABLS QUE QUERRAMOS USAR
		 * 3) CONSTRUCTOR
		 * 4) CONSTRUCTOR CON LA VARIABLES
		 * 5) (OPCIONAL) CONTRUCTOR COPIA CON DATOS DE OTRO CONSTRUCTOR
		 * 6) SETTERS Y GETTERS
		 * 7) METODOS/ RESTO DE CODIGO UNA VES SE HAYAN REALIZADO LOS OTROS OBJETOS
		 * */

		/* EL SCANNER PARA QUE LEA LOS DATOS QUE QUERAMOS INSERTAR */
		
		Scanner leer = new Scanner(System.in);
		
		
		/*CLASE "CUENTA Y VARIABLES VARIABLES DE EL PROGRAMA */
		
		public class Cuenta{
		
		private String cliente; //NOMBRE DEL CLIENTE
		
		private String cuenta; //NUMERO DE LA CUENTA
		
		private double interes; //TIPO DE INTERES DE LA CUENTA
		
		private double saldo; //SALDO DE LA CUENTA
		
		/* CONTRUCTOR DE LA CLASE */
		public Cuenta() {
		}
		
		/* CONSTRUCTOR CON LA VARIABLES QUE QUEREMOS ASIGNARLE */
		
		public Cuenta(String cliente, String cuenta, double interes, double saldo) {
			
			
			this.cliente = cliente;
			this.cuenta = cuenta;
			this.interes = interes;
			this.saldo = saldo;
		}
		
		/* CONSTRUCTOR COPIA */
			
		public Cuenta (final Cuenta c) {
			
			cuenta = c.cuenta;
			cliente = c.cliente;
			interes = c.interes;
			saldo = c.saldo;
			
		}
		
		/* GETTERS Y SETTERS DE LAS VARIABLES 
		 * LOS GETTERS Y SETTER TIENEN QUE SER DEL MISMO TIPO DE DATO QUE LA VARIABLT (DUH)*/
		
		//SETTERS
		
		public void seCliente (String s) {
			cliente = s;
		}
		
		public void setCuenta (String s) {
			cuenta = s;
		}
		
		public void setInteres (double n) {
			interes = n;
		}

		public void setSaldo (double n) {
			saldo = n;
		}
		
		
		//GETTERS
		
		public String getCliente () {
			return cliente;
		}
		
		public String getCuenta () {
			return cuenta;
		}
		
		public double getInteres () {
			return interes;
		}
		
		public double getSaldo () {
			return saldo;
		}
		
		//METODO DE INGRESO DE SALDO
		
		public boolean ingreso (double n) {
			
			boolean ingCorrecto = true;
			if (n < 0) {
				ingCorrecto = false;
			} else {
				saldo = saldo +n;
			}
			return ingCorrecto;
			
		}
		
		//METODO DE REINGRESO DE SALDO
		
		public boolean reintegro (double n) {
			
			boolean reingCorrecto = true;
			if (n < 0) {
				reingCorrecto = false;
			} else if (saldo >= n){
				saldo -= n;
			} else {
				reingCorrecto = false;
			}
				return reingCorrecto;
		}
		
		//METODO DE TRASFERENCIA DE DATOS
		
		public boolean tranferencia (Cuenta c, double n) {
			
			boolean correcto = true;
			 if (n < 0 || this.saldo < n) {
		            correcto = false;
		        } else {
		            this.reintegro(n);
		            c.ingreso(n);
		        }
		        return correcto;
		    }
		}
}
		
		
