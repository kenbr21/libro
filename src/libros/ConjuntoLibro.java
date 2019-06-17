package libros;

import java.util.ArrayList;
import java.util.Scanner;

public class ConjuntoLibro {

	static int elim = 0;

	String titulo = "";
	String autor = "";
	int numPage = 0;
	int puntuacion = 0;
	int conf = 1;

	Scanner reader = new Scanner(System.in);

	Libro libro[] = new Libro[3];

	// menu de acciones
	public void accion() {
		int accion = 0;

		Scanner reader = new Scanner(System.in);
		ConjuntoLibro cl = new ConjuntoLibro();

		System.out.println("-----------------------------------");
		System.out.println("QUE DESEA HACER:");
		System.out.println("1-Ingresar un libro");
		System.out.println("2-Eliminar un libro");
		System.out.println("3-Mostrar los libros");
		System.out.println("4-Mostrar por puntuacion");
		System.out.println("5-Finalizar");

		accion = reader.nextInt();
		switch (accion) {
		case 1:
			crearLibro();
			break;
		case 2:
			eliminarLibro();
			break;
		case 3:
			mostrarLibro();
			break;
		case 4:
			mostrarPunt();
			break;
		default:
			System.out.println("fin");
		}
	}

	// metodo crear un libro
	public void crearLibro() {
		System.out.println("-----------------------------------");
		System.out.println("INGRESE 3 LIBROS");
		System.out.println("-----------------------------------");

		for (int i = 0; i < libro.length && conf == 1; i++) {
			System.out.println("LIBRO " + (i + 1));
			System.out.println("-----------------------------------");
			// titulo
			System.out.println("ingrese titulo del libro: ");
			titulo = reader.nextLine();
			// autor
			System.out.println("ingrese autor del libro: ");
			autor = reader.nextLine();
			// numero de paginas
			do {
				System.out.println("ingrese numero de paginas del libro: ");
				numPage = reader.nextInt();
			} while (numPage <= 0);
			// puntuacion
			do {
				System.out.println("ingrese puntuacion del libro:");
				puntuacion = reader.nextInt();
			} while (0 > puntuacion && 10 < puntuacion);

			libro[i] = new Libro(titulo, autor, numPage, puntuacion);
			System.out.println("-----------------------------------");
			reader.nextLine();
			if (i > libro.length) {
				System.out.println("lo sentimos no se pueden agregar mas libros");
				System.out.println("-----------------------------------");
			}

		}
	}

	// metodo mostrar todos los libros
	public void mostrarLibro() {
		System.out.println("-----------------------------------");
		System.out.println("TITULO LIBRO");
		for (int i = 0; i < libro.length; i++) {
			int a = i + 1;
			System.out.println(a + "- " + libro[i].getTitulo());
		}
	}

	// metodo mostrar libro por puntuacion
	public void mostrarPunt() {
		int numMayor;
		int numMenor;
		String mayTit = "";
		String menTit = "";

		// mayor puntuacion del libro
		System.out.println("-----------------------------------");
		System.out.println("LIBRO MAYOR PUNTUACION:");
		numMayor = libro[0].getPuntuacion();
		for (int i = 0; i < libro.length; i++) {
			if (libro[i].getPuntuacion() > numMayor) {
				numMayor = libro[i].getPuntuacion();
				mayTit = libro[i].getTitulo();
			}
		}
		System.out.println(mayTit + " - puntuacion: " + numMayor);

		// menor puntuacion del libro
		System.out.println("-----------------------------------");
		System.out.println("LIBRO MENOR PUNTUACION:");
		numMenor = libro[0].getPuntuacion();
		menTit = libro[0].getTitulo();
		for (int i = 0; i < libro.length; i++) {
			if (libro[i].getPuntuacion() < numMenor) {
				numMenor = libro[i].getPuntuacion();
				menTit = libro[i].getTitulo();
			}
		}
		System.out.println(menTit + " - puntuacion: " + numMenor);

	}

	// metodo eliminar libro
	public void eliminarLibro() {
		System.out.println("-----------------------------------");
		System.out.println("eliminar libros por:");
		System.out.println("1 para eliminar por autor");
		System.out.println("2 para eliminar por titulo");
		elim = reader.nextInt();
		System.out.println("-----------------------------------");
		// elije la opcion 1
		if (elim == 1) {
			int n1 = 0;
			System.out.println("escriba el nombre del autor del libro a eliminar: ");
			reader.nextLine();
			autor = reader.nextLine();

			// elimina el libro
			for (int i = 0; i < libro.length && !(libro[i].getAutor()== autor) ; i++) {
				n1=i+1;
				
				}
			   
			if (libro[n1].getAutor()== autor) {
				libro[n1] = null;
				System.out.println("se a eliminado el libro.");
				System.out.println("-----------------------------------");
				System.out.println("INGRESE EL NUEVO LIBRO");
				// titulo
				System.out.println("ingrese titulo del libro: ");
				titulo = reader.nextLine();
				// autor
				System.out.println("ingrese autor del libro: ");
				autor = reader.nextLine();
				// numero de paginas
				do {
					System.out.println("ingrese numero de paginas del libro: ");
					numPage = reader.nextInt();
				} while (numPage <= 0);
				// puntuacion
				do {
					System.out.println("ingrese puntuacion del libro:");
					puntuacion = reader.nextInt();
				} while (0 > puntuacion && 10 < puntuacion);

				libro[n1] = new Libro(titulo, autor, numPage, puntuacion);
				System.out.println("-----------------------------------");

			}
			}
		
			
			
		// elije la opcion 2
		else if (elim == 2) {
			int n2 = 0;
			System.out.println("escriba el nombre del titulo del libro a eliminar: ");
			reader.nextLine();
			titulo = reader.nextLine();

			// elimina el libro
			for (int i = 0; i < libro.length && !(libro[i].getTitulo()== titulo); i++) {
			 n2=i+1;
			}
				
				if (libro[n2].getAutor()== autor) {
					libro[n2] = null;
					System.out.println("se a eliminado el libro.");
					System.out.println("-----------------------------------");
					System.out.println("INGRESE EL NUEVO LIBRO");
					// titulo
					System.out.println("ingrese titulo del libro: ");
					titulo = reader.nextLine();
					// autor
					System.out.println("ingrese autor del libro: ");
					autor = reader.nextLine();
					// numero de paginas
					do {
						System.out.println("ingrese numero de paginas del libro: ");
						numPage = reader.nextInt();
					} while (numPage <= 0);
					// puntuacion
					do {
						System.out.println("ingrese puntuacion del libro:");
						puntuacion = reader.nextInt();
					} while (0 > puntuacion && 10 < puntuacion);

					libro[n2] = new Libro(titulo, autor, numPage, puntuacion);
					System.out.println("-----------------------------------");

				}
			
		}
		}

}
