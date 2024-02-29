package gestionAlmacenes;

import java.util.ArrayList;
import java.util.Scanner;

public class programaPrincipal {

	public static void main(String[] args) {

		        // Crear listas para almacenar artículos, proveedores y ventas
		        ArrayList<Articulos> listaArticulos = new ArrayList<>();
		        ArrayList<Proveedores> listaProveedores = new ArrayList<>();
		        ArrayList<Ventas> listaVentas = new ArrayList<>();

		        // Crear un objeto Scanner para leer la entrada del usuario
		        Scanner scanner = new Scanner(System.in);

		        // Menú principal
		        int opcion;
		        do {
		            System.out.println("\nMenú Principal:");
		            System.out.println("1. Alta Artículo");
		            System.out.println("2. Baja Artículo");
		            System.out.println("3. Alta Proveedor");
		            System.out.println("4. Baja Proveedor");
		            System.out.println("5. Listar Artículos");
		            System.out.println("6. Listar Proveedores");
		            System.out.println("7. Venta Artículo");
		            System.out.println("8. Existencias Disponibles (Stock)");
		            System.out.println("0. Salir");

		            System.out.print("\nIngrese la opción: ");
		            opcion = scanner.nextInt();

		            switch (opcion) {
		                case 1:
		                    altaArticulo(listaArticulos, listaProveedores, scanner);
		                    break;
		                case 2:
		                    bajaArticulo(listaArticulos, scanner);
		                    break;
		                case 3:
		                    altaProveedor(listaProveedores, scanner);
		                    break;
		                case 4:
		                    bajaProveedor(listaProveedores, scanner);
		                    break;
		                case 5:
		                    listarArticulos(listaArticulos);
		                    break;
		                case 6:
		                    listarProveedores(listaProveedores);
		                    break;
		                case 7:
		                    ventaArticulo(listaArticulos, listaVentas, scanner);
		                    break;
		                case 8:
		                    existenciasDisponibles(listaArticulos, scanner);
		                    break;
		                case 0:
		                    System.out.println("Saliendo del programa...");
		                    break;
		                default:
		                    System.out.println("Opción no válida. Intente de nuevo.");
		            }
		        } while (opcion != 0);
		    }

		  //funcion alta de articulo
		  
		  private static void altaArticulo(ArrayList<Articulos> listaArticulos, ArrayList<Proveedores> listaProveedores, Scanner scanner) {
			    // Pedir datos al usuario
			    System.out.print("Ingrese el código del artículo: ");
			    int codigo = scanner.nextInt();

			    System.out.print("Ingrese el nombre del artículo: ");
			    String nombre = scanner.next();

			    System.out.print("Ingrese la descripción del artículo: ");
			    String descripcion = scanner.next();

			    System.out.print("Ingrese el precio del artículo: ");
			    double precio = scanner.nextDouble();

			    System.out.print("Ingrese el iva aplicado al artículo: ");
			    double iva = scanner.nextDouble();

			    // Mostrar proveedores disponibles
			    System.out.println("Proveedores disponibles:");
			    for (Proveedores proveedor : listaProveedores) {
			        System.out.println(proveedor.toString());
			    }

			    // Solicitar al usuario seleccionar un proveedor existente
			    System.out.print("Ingrese el código del proveedor del artículo: ");
			    int codigoProveedor = scanner.nextInt();

			    // Buscar el proveedor en la lista
			    Proveedores proveedorAsociado = null;
			    for (Proveedores proveedor : listaProveedores) {
			        if (proveedor.getcProveedor() == codigoProveedor) {
			            proveedorAsociado = proveedor;
			            break;
			        }
			    }

			    // Si el proveedor no se encuentra, mostrar un mensaje y salir de la función
			    if (proveedorAsociado == null) {
			        System.out.println("Proveedor no encontrado. Por favor, registre el proveedor primero.");
			        return;
			    }

			    System.out.print("Ingrese el número de unidades disponibles: ");
			    int unidadesDisponibles = scanner.nextInt();

			    // Crear un nuevo artículo y agregarlo a la lista
			    Articulos nuevoArticulo = new Articulos(codigo, nombre, descripcion, precio, iva, proveedorAsociado, unidadesDisponibles);
			    listaArticulos.add(nuevoArticulo);

			    System.out.println("Artículo agregado con éxito.");
			}
		  
		  		//funcion baja de articulo
		  
		  private static void bajaArticulo(ArrayList<Articulos> listaArticulos, Scanner scanner) {
			    // Pedir al usuario el código del artículo a dar de baja
			    System.out.print("Ingrese el código del artículo a dar de baja: ");
			    int codigoArticulo = scanner.nextInt();

			    // Buscar el artículo en la lista
			    for (Articulos articulo : listaArticulos) {
			        if (articulo.getCodigo() == codigoArticulo) {
			            // Remover el artículo si se encuentra
			            listaArticulos.remove(articulo);
			            System.out.println("Artículo dado de baja con éxito.");
			            return;
			        }
			    }

			    // Si el artículo no se encuentra, mostrar un mensaje
			    System.out.println("Artículo no encontrado.");
			}
		  		
		  private static void altaProveedor(ArrayList<Proveedores> listaProveedores, Scanner scanner) {
			  
			// Pedir datos al usuario
			    System.out.print("Ingrese el código del proveedor: ");
			    int codigoProveedor = scanner.nextInt();

			    System.out.print("Ingrese el nombre del proveedor: ");
			    String nombreProveedor = scanner.next();

			    System.out.print("Ingrese la dirección del proveedor: ");
			    String direccionProveedor = scanner.next();

			    System.out.print("Ingrese la fecha de alta del proveedor (en formato mm/dd/aaaa): ");
			    String fechaAltaProveedor = scanner.next();
			    

			    System.out.print("Ingrese el teléfono del proveedor: ");
			    String telefonoProveedor = scanner.next();

			    System.out.print("Ingrese el correo electrónico del proveedor: ");
			    String emailProveedor = scanner.next();

			    // Crear un nuevo proveedor y agregarlo a la lista
			    Proveedores nuevoProveedor = new Proveedores(codigoProveedor, nombreProveedor, direccionProveedor, fechaAlta, telefonoProveedor, emailProveedor);
			    listaProveedores.add(nuevoProveedor);

			    System.out.println("Proveedor agregado con éxito."); 
			  
		  }
		  
		  
		  
		  private static void bajaProveedor(ArrayList<Proveedores> listaProveedores, Scanner scanner) {
			  
			// Pedir al usuario el código del proveedor a dar de baja
			    System.out.print("Ingrese el código del proveedor a dar de baja: ");
			    int codigoProveedor = scanner.nextInt();

			    // Buscar el proveedor en la lista
			    for (Proveedores proveedor : listaProveedores) {
			        if (proveedor.getcProveedor() == codigoProveedor) {
			            // Remover el proveedor si se encuentra
			            listaProveedores.remove(proveedor);
			            System.out.println("Proveedor dado de baja con éxito.");
			            return;
			        }
			    }

			    // Si el proveedor no se encuentra, mostrar un mensaje
			    System.out.println("Proveedor no encontrado.");
			}
			  
		  }
		  
		  
		  private static void listarArticulos (ArrayList<Articulos> listaArticulos) {

				    // Mostrar información de todos los artículos
				    System.out.println("Lista de Artículos:");
				    for (Articulos articulo : listaArticulos) {
				        System.out.println(articulo.toString());
				    }
				}
			  
		  }
		  
		  private static void listarProveedores (ArrayList<Proveedores> listaproveedores) {
			  
			// Mostrar información de todos los proveedores
			    System.out.println("Lista de Proveedores:");
			    for (Proveedores proveedor : listaproveedores) {
			        System.out.println(proveedor.toString());
			    }
			  
		  }
		  
		  
		  private static void ventaArticulo(ArrayList<Articulo> listaArticulos, ArrayList<Venta> listaVentas, Scanner scanner) {
			    // Mostrar los artículos disponibles
			    System.out.println("Artículos disponibles para la venta:");
			    for (Articulos articulo : listaArticulos) {
			        System.out.println(articulo.toString());
			    }

			    // Pedir al usuario el código del artículo a vender
			    System.out.print("Ingrese el código del artículo a vender: ");
			    int codigoArticulo = scanner.nextInt();

			    // Buscar el artículo en la lista
			    Articulos articuloAVender = null;
			    for (Articulos articulo : listaArticulos) {
			        if (articulo.getCodigo() == codigoArticulo) {
			            articuloAVender = articulo;
			            break;
			        }
			    }

			    // Si el artículo no se encuentra, mostrar un mensaje y salir de la función
			    if (articuloAVender == null) {
			        System.out.println("Artículo no encontrado.");
			        return;
			    }

			    // Pedir al usuario la cantidad de unidades a vender
			    System.out.print("Ingrese la cantidad de unidades a vender: ");
			    int cantidadVentas = scanner.nextInt();

			    // Validar si hay suficientes unidades disponibles para la venta
			    if (cantidadVentas > articuloAVender.getUdDisponibles()) {
			        System.out.println("No hay suficientes unidades disponibles para la venta.");
			        return;
			    }

			    // Pedir al usuario la fecha de la venta como una cadena de texto
			    System.out.print("Ingrese la fecha de la venta (en formato mm/dd/aaaa): ");
			    String fechaVenta = scanner.next();

			    // Calcular el precio total con IVA
			    double precioTotal = articuloAVender.getPrecio() * cantidadVentas * (1 + articuloAVender.getIva());

			    // Crear un objeto de la clase Venta y agregarlo a la lista
			    Venta nuevaVenta = new Ventas(articuloAVender, fechaVenta, cantidadVentas, precioTotal, "N"); // Supongamos que inicialmente la venta no está pagada
			    listaVentas.add(nuevaVenta);

			    // Actualizar las unidades disponibles del artículo
			    articuloAVender.setUdDisponibles(articuloAVender.getUdDisponibles() - cantidadVentas);

			    System.out.println("Venta realizada con éxito.");
			}

			  
		  
		  
		  private static void existenciasDisponibles (ArrayList<Articulos> listaArticulos, Scanner scanner) {
			  
			// Pedir al usuario el código del artículo
			    System.out.print("Ingrese el código del artículo: ");
			    int codigoArticulo = scanner.nextInt();

			    // Buscar el artículo en la lista
			    for (Articulos articulo : listaArticulos) {
			        if (articulo.getCodigo() == codigoArticulo) {
			            // Mostrar las existencias disponibles
			            System.out.println("Existencias disponibles: " + articulo.getUdDisponibles());
			            return;
			        }
			    }

			    // Si el artículo no se encuentra sae este mensaje
			    System.out.println("Artículo no encontrado.");
			}
		  
		    
		}