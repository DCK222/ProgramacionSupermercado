package SuperMercado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Trabajo {

static Scanner sc = new Scanner(System.in); //INICIALIZAMOS SCANNER
	
	
	public static int menu (int seleccionar) { //CREAMOS FUNCION MENU CLIENTE
		
		seleccionar = 0;
		
		
		while (seleccionar <1 || seleccionar >6 ) { //CREAMOS UN WHILE CON LOS PARAMETROS DE ELECCION
			// Y ADEMAS CREAMOS LA ESTRUCTURA DEL MENU CLIENTE
			
			System.out.println("********** MENÚ *******");
			System.out.println("1. Mostrar productos del supermercado");
			System.out.println("2. Añadir productos al carrito");
			System.out.println("3. Mostrar carrito de la compra ordenado");
			System.out.println("4. Consultar producto de carrito");
			System.out.println("5. Cambiar un producto por otro");
			System.out.println("6. Salir");
			System.out.print("Seleccione una opción: ");
			seleccionar = sc.nextInt();
			
	
	}
		return seleccionar ;
	}
	
	
	
	
	public static void main(String[] args) { //DENTRO DEL MAIN CREAMOS EL MENU CLIENTE

		int intentos = 3;           //DECLARAMOS LAS VARIABLES
        String clave = "4v4d0n4";
        int opcion;
        

        System.out.println("********** ACCESO *******");  //ESTRUCTURA DEL MENU EMPLEADO
        System.out.println("1. Personal del supermercado");
        System.out.println("2. Cliente");

        opcion = sc.nextInt();  //RECOGEMOS LA RESPUESTA DEL USUARIO

        if (opcion == 1) {  //CREAMOS UN IF PARA LA OPCION 1 DEL MENU DE EMPLEADO
            while (intentos > 0) {
                System.out.println("Introduce la clave:"); //PEDIMOS QUE INTRODUZCA LA CLAVE
                String claveIngresada = sc.next(); //LA RECOGEMOS

                if (claveIngresada.equals(clave)) { //CREAMOS ESTE IF EN CASO DE QUE USUARIO INSERTE LA CLAVE CORRECTAMENTE
                    System.out.println("********** MENÚ *******");  // ESTRUCTURA DEL MENU
                    System.out.println("1. Mostrar productos del supermercado");
                    System.out.println("2. Añadir productos");
                    System.out.println("3. Eliminar producto");
                    System.out.println("4. Modificar producto");
                    System.out.println("5. Salir");
                    break;
                } else { //ELSE EN CASO DE QUE NO ACIERTE LA CLAVE Y TE DIGA EL NUMERO DE INTENTOS QUE TE QUEDAN HASTA LLEGAR A 3
                    intentos--;
                    System.out.println("Incorrecta. Quedan " + intentos + " intentos."); 
                }
            }
            if (intentos == 0) { //UNA VEZ ALCANZADO EL NUMERO DE INTENTOS MAXIMOS
                System.out.println("Denegado. Has superado el número de intentos.");
            }
        } else if (opcion == 2) { //EN CASO DE QUE UTILICE EL MENU UN CLIENTE
            System.out.println("Acceso Cliente.");
        } else {
            System.out.println("Ingrese un numero Valido");
        }

		int seleccionar = 0;

		//PARTE DE CODIGO SOBRE EL MENU CLIENTE
		
		TreeSet<String> Productos = new TreeSet<>(); //CREAMOS UN TREESET 
		ArrayList<String> productosElegidos = new ArrayList<>();
		HashSet<String> ProductosOrdenados  =new HashSet<>();
		
		Productos.add("Tomate"); //AÑADIMOS LOS PRODUCTOS AL TREESET
		Productos.add("Aceite");
		Productos.add("Pan");
		Productos.add("Leche");
		Productos.add("Yogur");
		Productos.add("Queso");
		Productos.add("Jamon");
		Productos.add("Harina");
		Productos.add("Champú");
		Productos.add("Manzana");
		 
		
		while(seleccionar!=6) {  //CREAMOS WHILE PARA PARA EO MENU CLIENTE Y SUS DIFERENTES OPCIONES

			switch (seleccionar = menu(seleccionar)) { //CREAMOS EL SWICH Y DENTRO LA OPCION DEL SELECCIONAR PARA PODER COJER DATOS DESDE FUERA DE LA FUNCION
			
			case 1: //CASO 1
				System.out.println("                   *******Productos del Supermercado*******            ");

				System.out.println(Productos);

				
				break;

			case 2: //CASO2

				System.out.print("Ingrese cuantos productos desea comprar: ");
				int n = sc.nextInt();
				sc.nextLine();

				while (productosElegidos.size() < n) {
					System.out.print("Ingrese un producto: ");
					String producto = sc.nextLine();
				
					productosElegidos.add(producto);
					for (int i = 0; i < productosElegidos.size()-1; i++) {
						
						if (productosElegidos.contains(producto)) {
							System.out.println("Contiene el producto");
						}
						
					}
					
					

					
				}
				
				
				System.out.println("Productos elegidos: " + productosElegidos);
				
				break;

			case 3: //CASO 3
				ProductosOrdenados.addAll(productosElegidos);
				Collections.sort(productosElegidos);

				ProductosOrdenados.addAll(productosElegidos);

				System.out.println("Los Productos Comprados  : " + ProductosOrdenados);
				
				break;

			case 4: //CASO 4
				
				ArrayList<String> consultaLista = new ArrayList<>();
				ProductosOrdenados.addAll(consultaLista);
				System.out.println("Que Producto quieres Consultar: ");
				sc.nextLine();
				String Consulta = sc.nextLine();

				System.out.println(consultaLista);
				for (int i = 0; i < consultaLista.size(); i++) {
					
					System.out.println(consultaLista);

					if (consultaLista.get(i).equals(Consulta)) {

						System.out.println("El producto esta en la cesta");

					} else {
						System.out.println("El producto no esta en la cesta =(");
					}
				}
				
				break;

			case 5: //CASO 5

				System.out.println("¿Quieres cambiar un producto? responde Si o No");

				String Respuesta = sc.nextLine();

				if (Respuesta.equalsIgnoreCase("Si")) {

					System.out.println("¿Que Producto desea cambiar?");

					String objetoAnt = sc.nextLine();

				}
				
				break;

			case 6: //CASO 6

				System.out.println("Saliendo al menu Principal =)");

				break;
				
			}

			}

		

	}

}
