package EJERC01; //horoscopo
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String horoscopo = "";
		Scanner leer = new Scanner(System.in);
		System.out.println("introduzca el mes");
		int mes = leer.nextInt();
		System.out.println("introduzca el dia");
		int dia = leer.nextInt();
			
		 switch(mes) {
	      case 1:
	        if (dia < 21) {
	          horoscopo = "capricornio";
	        } else {
	          horoscopo = "acuario";
	        }
	        break;
	      case 2:
	        if (dia < 20) {
	          horoscopo = "acuario";
	        } else {
	          horoscopo = "piscis";
	        }
	        break;
	      case 3:
	        if (dia < 21) {
	          horoscopo = "piscis";
	        } else {
	          horoscopo = "aries";
	        }
	        break;
	      case 4:
	        if (dia < 21) {
	          horoscopo = "aries";
	        } else {
	          horoscopo = "tauro";
	        }
	        break;
	      case 5:
	        if (dia < 20) {
	          horoscopo = "tauro";
	        } else {
	          horoscopo = "géminis";
	        }
	        break;
	      case 6:
	        if (dia < 22) {
	          horoscopo = "géminis";
	        } else {
	          horoscopo = "cáncer";
	        }
	        break;
	      case 7:
	        if (dia < 22) {
	          horoscopo = "cáncer";
	        } else {
	          horoscopo = "Leo";
	        }
	        break;
	      case 8:
	        if (dia < 24) {
	          horoscopo = "leo";
	        } else {
	          horoscopo = "virgo";
	        }
	        break;
	      case 9:
	        if (dia < 23) {
	          horoscopo = "virgo";
	        } else {
	          horoscopo = "libra";
	        }
	        break;
	      case 10:
	        if (dia < 23) {
	          horoscopo = "libra";
	        } else {
	          horoscopo = "escorpio";
	        }
	        break;
	      case 11:
	        if (dia < 23) {
	          horoscopo = "escorpio";
	        } else {
	          horoscopo = "sagitario";
	        }
	        break;
	      case 12:
	        if (dia < 21) {
	          horoscopo = "sagitario";
	        } else {
	          horoscopo = "capricornio";
	        }
	        break;
	      default:
	    }

	    System.out.print("Su horóscopo es " + horoscopo);

	  }
	}