package ControlProgramacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class main {
	static ArrayList<String> Cuidadores = new ArrayList<>();
	static ArrayList<String> habitats = new ArrayList<>();
	static ArrayList<String> animales = new ArrayList<>();
	static HashMap<String, String> animalescuidadores = new HashMap<>();
	static HashMap<String, String> animaleshabitat = new HashMap<>();
	static TreeMap<String, Integer> animalesEdad = new TreeMap<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int respuesta = 0;

		Switch(sc);

	}

	private static void Switch(Scanner sc) {
		int respuesta;
		do {

			respuesta = Menu(sc);

			switch (respuesta) {
			case 1:
				Case1(sc);

				break;
			case 2:
				Case2(sc);

				break;
			case 3:

				Case3(sc);

				break;
			case 4:

				Case4(sc);

				break;
			case 5:

				Case5(sc);

				break;
			case 6:

				Case6(sc);

				break;
			case 7:

				Case7(sc);

				break;

			default:
				break;
			}

		} while (respuesta != 7);
	}

	private static void Case7(Scanner sc) {
		int m = 0;
		do {
			System.out.println("1.Mostrar nombre-edad");
			System.out.println("2.Exit");
			m = sc.nextInt();
			switch (m) {
			case 1:
				System.out.println("Nombre y edades de los animales");
				System.out.println(animalesEdad.toString());
				break;
			case 2:

				Switch(sc);

				break;

			default:
				break;
			}
		} while (m != 2);
	}

	private static void Case6(Scanner sc) {
		int m = 0;

		do {
			System.out.println("1.Mostrar Animal-Habitat-cuidador");

			System.out.println("2.Exit");
			m = sc.nextInt();
			switch (m) {
			case 1:
				System.out.println(animaleshabitat.toString());
				System.out.println(animalescuidadores.toString());
				break;

			case 2:
				Switch(sc);
				break;

			default:
				break;
			}
		} while (m != 2);
	}

	private static void Case5(Scanner sc) {

		int t = 0;

		do {
			System.out.println("1.Mostrar Animales :");
			System.out.println("2.Mostrar Cuidadores :");
			System.out.println("3.Asignar Cuidadores :");
			System.out.println("4. Exit");
			t = sc.nextInt();
			switch (t) {
			case 1:

				System.out.println(animales.toString());

				break;
			case 2:

				System.out.println(Cuidadores.toString());

				break;
			case 3:
				System.out.println("Que animal quieres Elegir");
				sc.nextLine();
				String animalasignar = sc.nextLine().toLowerCase();
				if (animales.contains(animalasignar)) {
					System.out.println("A que cuidador quieres elegir:");
					String nombre = sc.nextLine();
					if (Cuidadores.contains(nombre)) {
						animalescuidadores.put(animalasignar, nombre);
					}
					System.out.println("Animales Añadido al habitat");
					System.out.println(animalescuidadores.toString());
				}

				break;
			case 4:
				Switch(sc);

				break;

			default:
				break;
			}
		} while (t != 4);
	}

	private static void Case4(Scanner sc) {

		int t = 0;
		do {
			System.out.println("1.Mostrar Animales");
			System.out.println("2.Mostrar Habitats");
			System.out.println("3.Asignar animales");
			System.out.println("4.Exit");
			t = sc.nextInt();
			switch (t) {
			case 1:
				System.out.println(animales.toString());

				break;
			case 2:
				System.out.println(habitats.toString());
				break;
			case 3:
				System.out.println("Que animal quieres Elegir");
				sc.nextLine();
				String animalasignar = sc.nextLine().toLowerCase();
				if (animales.contains(animalasignar)) {
					System.out.println("A que habitat quieres meterlo:");
					String habitatmeter = sc.nextLine();
					if (habitats.contains(habitatmeter)) {
						animaleshabitat.put(animalasignar, habitatmeter);
					}
					System.out.println("Animales Añadido al habitat");
					System.out.println(animaleshabitat.toString());
				}
				break;
			case 4:
				Switch(sc);
				break;

			default:
				break;
			}
		} while (t != 4);
	}

	private static void Case3(Scanner sc) {

		int s = 0;

		do {
			System.out.println("1.Agregar Cuidador");
			System.out.println("2.Eliminar Cuidador");
			System.out.println("3.Exit");
			s = sc.nextInt();

			switch (s) {
			case 1:

				System.out.println("Cuantos cuidadores quiere añadir");
				int numCuidadores = sc.nextInt();
				System.out.println("Introduce el nombre de los cuidadores: ");
				for (int i = -1; i < numCuidadores; i++) {

					String nombre = sc.nextLine().toLowerCase();
					
					Cuidadores.add(nombre);
				}

				System.out.println("Cuidadores añadidos!!! ");
				System.out.println(Cuidadores.toString());

				break;
			case 2:

				System.out.println("Cuantos cuidadores quieres eliminar? :");
				int cuidadoresEliminar = sc.nextInt();

				System.out.println("Introduce los nombre de los cuidadores a elminar");
				for (int i = 0; i < cuidadoresEliminar; i++) {
					String cuidadoreselimi = sc.nextLine().toLowerCase();
					Cuidadores.remove(cuidadoresEliminar);
				}

				System.out.println("Cuidadores eliminados correctamente");
				System.out.println(Cuidadores.toString());
				break;

			case 3:
				Switch(sc);
				;

			default:
				break;
			}

		} while (s != 3);
		System.out.println("Error introduce un numero valido.");
	}

	private static void Case2(Scanner sc) {

		int r = 0;

		do {
			System.out.println("1.Agregar Habitat");
			System.out.println("2.Eliminar Habitat");
			System.out.println("3.Exit");
			r = sc.nextInt();

			switch (r) {
			case 1:

				System.out.println("Cuantos habitats quieres añadir");
				int numhabitats = sc.nextInt();

				System.out.println("introduce el habitat");
				for (int i = -1; i < numhabitats; i++) {

					String nombrehabitats = sc.nextLine();
					habitats.add(nombrehabitats);

					
				}
				System.out.println("Habitats Anñadidos correctamente");
				System.out.println(habitats.toString());
				System.out.println("Quieres inspeccionarlos? (Y/N)");
				String respuesta = sc.nextLine().toUpperCase();
				if (respuesta == "Y") {
					System.out.println(habitats.toString());
				} else

					break;
			case 2:

				System.out.println("Cuantos habitats desea eliminar ? :");
				int numhabitatselim = sc.nextInt();
				System.out.println("Introduce el habitat : ");
				for (int i = -1; i < numhabitatselim; i++) {

					String nombrehabitatselim = sc.nextLine();
					habitats.remove(numhabitatselim);

				}
				System.out.println("Habitats Eliminados");
				System.out.println(habitats.toString());
				break;

			case 3:
				Switch(sc);
				break;

			default:
				break;
			}

		} while (r != 3);
		System.out.println("Error introduce un numero valido.");
	}

	private static void Case1(Scanner sc) {

		int n = 0;

		do {
			System.out.println("1.Agregar Animal");
			System.out.println("2.Eliminar Animal");
			System.out.println("3.Exit");
			n = sc.nextInt();

			switch (n) {
			case 1:

				System.out.println("Cuantos Animales quieres añadir? :");
				int cuidadoresEliminar = sc.nextInt();

				for (int i = 0; i < cuidadoresEliminar; i++) {

					System.out.println("Introduce los nombre del animal");
					sc.nextLine();
					String nombreAnimal = sc.nextLine();
					System.out.println("Introduce el genero");
					String generoanimal = sc.nextLine();
					System.out.println("Introduce especie");
					String especie = sc.nextLine();
					System.out.println("Introduce Edad");
					int edad = sc.nextInt();
					animales.add(especie);
					Animales animal = new Animales(nombreAnimal, generoanimal, especie, edad);
					animalesEdad.put(generoanimal, edad);
				}

			case 2:
				System.out.println("Cuantos animales quieres Eliminar");
				sc.nextLine();
				int nanimalesElimi = sc.nextInt();
				System.out.println("Cual es el animal : ");
				for (int i = -1; i < nanimalesElimi; i++) {
					String animalEliminar = sc.nextLine().toLowerCase();
					if (animales.contains(animalEliminar)) {
						animales.remove(animalEliminar);

					}

				}
				System.out.println("Eliminado correctamente");
				System.out.println("Los animales que hay en el zoo son :" + animales.toString());
				break;

			case 3:

				Switch(sc);
				break;

			default:
				break;
			}

		} while (n != 3);
		System.out.println("Error introduce un numero valido.");
	}

	private static int Menu(Scanner sc) {
		int respuesta;
		System.out.println("****************ZOOPUNCHIS*******************");
		System.out.println("1.Agregar y eliminar animales del zoológico.");
		System.out.println("2.Agregar y eliminar hábitats del zoológico.");
		System.out.println("3.Agregar y eliminar cuidadores del zoológico.");
		System.out.println("4.Asignar animales a hábitats específicos");
		System.out.println("5.Asignar cuidadores a animales específicos.");
		System.out.println("6.Mostrar información detallada de cada animal, hábitat y cuidador");
		System.out.println("7.Mostrar los animales del zoo ordenados por edad.");
		System.out.println("Introduce una opcion : ");
		System.out.println("*************************************************");
		respuesta = sc.nextInt();
		return respuesta;
	}

}
