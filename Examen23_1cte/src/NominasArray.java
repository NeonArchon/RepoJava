/**
 * 
 */

/**
 * @author NOMBRE Y APELLIDOS DEL ALUMN@
 *
 */
public class NominasArray {

	/**
	 * @param args
	 * Programa; Cálculo de Nóminas
	 * Utilizar:
	 * -- Array para los empleados 
	 * -- Array bidimensional (sueldo por mes)
	 * -- Array sueldos anuales 
	 */
	static int totalEmpleados = 20;
	static int pagas = 12;
	
	String[] empleados 		= new String[totalEmpleados];
	double[][] sueldosMes 	= new double[pagas][totalEmpleados];
	double[] sueldoAnual 	= new double[totalEmpleados];
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Principal. Mostrar menú con las opciones del programa
		 * 1. Cargar Empleados
		 * 2. Cargar Nominas por meses
		 * 3. Calcular nómina Anual empleados
		 * 4. Imprimir Nómina Empleado (Empleado)
		 * 5. Imprimir Todas las nóminas
		 * 6. Calcular gasto Mensual de la empresa (Mes)
		 * 7. Calcular gasto anual de la empresa
		 * 8. Calcular coste total del empleado (Empleado)
		 * 0. Salir 
		 */

		//RELLENAR CÓDIGO Menú principal

	}
	
	
	private static void cargarEmpleados() {
		/* 
		 * Carga de los datos de los empleados
		 * Array empleados
		 */
		//RELLENAR CODIGO
	}
	
	private static void cargarNominasMeses() {
		/* 
		 * Método para cargar las Nóminas de los empleados X 12 meses
		 * Array SueldosMes
		 */
		
		//RELLENAR CODIGO
		
	}
	
	private static void calcularNominaAnual() {
		/* 
		 * Método para cargar los sueldos anuales de los empleados
		 * Tomamos los datos mensuales y generamos el dato anual por empleado
		 * Array SueldoAnual
		 */
		
		// RELLENAR CÓDIGO
		
	}

	private static void imprimirNomina(int empleado) {
		/*
		 * Método para imprimir las nóminas del año (12 MESES) 
		 *  e imprimir la nómina ANUAL del empleado indicado.
		 */
		
		// RELLENAR CODIGO
		
	}
	
	private static void imprimirNominas() {
		/*
		 * Método para imprimir las nóminas ANUALES de TODOS los empleados.
		 */
		
		// RELLENAR CÓDIGO
	}
	
	private static double costeMensual(int mes) {
		/* 
		 * Función que calcula el coste en nóminas del MES pasado por parámetro.
		 */
		double costeMes=0;
		
		//RELLENAR CÓDIGO
		
		return costeMes;
	}
	
	private static double costeAnual() {
		/* 
		 * Función que calcula el coste en nóminas del AÑO pasado por parámetro.
		 */
		double costeAnyo=0;
		
		//RELLENAR CÓDIGO
		
		return costeAnyo;
	}
	
	private static double costeEmpleado(int empleado) {
		/* 
		 * Función que calcula el coste del Empleado pasado por parámetro.
		 */
		double costeEmpleado=0;
		
		//RELLENAR CÓDIGO
		
		return costeEmpleado;
	}

}
