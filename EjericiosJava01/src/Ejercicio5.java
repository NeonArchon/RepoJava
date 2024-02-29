
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public void piramide(int i,int j);
		
	        if(i>0)
	        {
	            System.out.print("*");
	            piramide(--i,j);
	        }else
	        {
	            if(j>0)
	            {
	                i=j;
	                System.out.println("");
	                piramide(--i,--j);
	            }
	        }
	}
}