package EJ5;
import java.util.Scanner;
public class Ejercicio6_TresEnLinea {
	
	
	 public static boolean diagonalInversa(char mat[][],char jugador){
	        boolean diagonalInvers=false;
	         int k=0;
	        for(int i=2, j=0;j<mat.length;i--,j++){
	           
	            if(mat[i][j]==jugador){
	                k++;
	            }
	            if(k==3){
	                diagonalInvers=true;
	            }
	        }
	        return diagonalInvers;
	    }
	    
	    
	    public static boolean diagonal(char mat[][],char jugador){
	        boolean diagonal=false;
	        int k=0;
	        for(int i=0, j=0;i<mat.length;i++,j++){
	            
	            if(mat[i][j]==jugador){
	                k++;
	            }
	            if(k==3){
	                diagonal=true;
	            }
	        }
	        return diagonal;
	    }
	    
	    
	    public static boolean columnas(char mat[][],char jugador){
	        boolean columna=false;
	        for (int j=0;j<mat[0].length;j++){
	            int k=0;
	            
	            for(int i=0;i<mat.length;i++){
	                if(mat[i][j]==jugador){
	                    k++;
	                }
	                if(k==3){
	                    columna= true;
	                }
	                
	            }
	            
	        }
	        return columna;
	    }
	    
	    public static boolean pintar(int fila,int columna,char mat[][],char jugador){
	        
	        try{
	        if(mat[fila][columna]=='-'){
	           
	                mat[fila][columna]=jugador;
	                return true;
	            
	            
	        }else{
	            System.out.println("Movimiento incorrecto");
	            return false;
	        }
	        }catch(Exception e){
	            System.out.println("Te has salido de la pista");
	            return false;
	        }
	    }
	    
	    public static void mostrar(char mat[][]){
	        for (int i=0;i<mat.length;i++){
	            for(int j=0;j<mat[i].length;j++){
	                System.out.print(mat[i][j]+" ");
	            }
	            System.out.println(" ");
	        }
	    }
	    
	    public static boolean filas(char mat[][],char jugador){
	        boolean linea=false;
	        for (int i=0;i<mat.length;i++){
	            int k=0;
	            
	            for(int j=0;j<mat[i].length;j++){
	                if(mat[i][j]==jugador){
	                    k++;
	                }
	                if(k==3){
	                    linea= true;
	                }
	                
	            }
	            
	        }
	        return linea;
	    }
	    
	    
	    public static void main(String[] args) {
	        // TODO code application logic here
	        
	        char mat[][]= new char[3][3];
	        Scanner miteclado = new Scanner(System.in);
	        for (int i=0;i<mat.length;i++){
	            for(int j=0;j<mat[i].length;j++){
	               mat[i][j]='-';
	            }
	        }
	        char player='x';
	        char ultimo='x';
	        
	        while(!filas(mat,ultimo)&&!columnas(mat, ultimo)&&!diagonal(mat, ultimo)&&!diagonalInversa(mat, ultimo)){
	        
	            int fila,columna;
	        
	            do{
	                System.out.println("Jugador "+player+"\n Donde quieres poner la "+player+"?\n Indica la fila");
	                fila=miteclado.nextInt();
	                System.out.println(" Indica la columna");
	                columna=miteclado.nextInt();
	            }while(!pintar(fila, columna, mat, player));
	            
	            mostrar(mat);
	            filas(mat,player);
	            columnas(mat,player);
	            diagonal(mat,player);
	            diagonalInversa(mat,player);
	            if (filas(mat,player)||columnas(mat, player)||diagonal(mat, player)||diagonalInversa(mat, player))
	                    System.out.println("Ha ganado "+player);
	            ultimo=player;
	            switch(player){
	                case 'x':{
	                    player='o';
	                    break;
	                }
	                case 'o':{
	                    player='x';
	                    break;
	                }
	            }
	        }
	    }
	    
	}