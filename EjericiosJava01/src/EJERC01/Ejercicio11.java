package EJERC01; //Buenos dias-noches
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte H = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la hora");
		byte H1 = leer.nextByte();
		if ( !(H1>=0 && H1<24) ){
			System.out.println("invalido");
		}else {if (H1 <=12){
				System.out.println("Buenos Dias!");
			}else {if (H1 <=20){
					System.out.println("Buenas Tardes!");
				}else {
						System.out.println("Buenos Noches!");
					}
						}
					}
				}
												}