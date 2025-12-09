package Ajedrez;

import java.util.Scanner;

public class Main {

	private Scanner keyboard = new Scanner(System.in);

	public void iniciarPrograma() {
		System.out.println("BIENVENIDO AL PROYECTO DE AJEDREZ");

		boolean repetir = true;

		while (repetir) {
			// Pedir pieza
			int opcion;
			do {
				System.out.println("Elige la pieza para jugar: ");
				System.out.println(" 1. Dama\n 2. Alfil\n 3. Caballo");
				opcion = keyboard.nextInt();
				keyboard.nextLine();

				if (opcion < 1 || opcion > 3) {
					System.out.println("Pieza inválida, prueba de nuevo");
				}
			} while (opcion < 1 || opcion > 3);

			// Pedir posición fila
			int fila;
			do {
				System.out.print("Introduce fila (1-8): ");
				fila = keyboard.nextInt();
				keyboard.nextLine();
				if (fila < 1 || fila > 8) {
					System.out.println("Posición inválida. Debe ser entre 1 y 8.");
				}
			} while (fila < 1 || fila > 8);

			// Pedir posición columna
			int columna;
			do {
				System.out.print("Introduce columna (a-h): ");
				columna = (int) keyboard.nextLine().charAt(0) - 'a' + 1;
				if (columna < 1 || columna > 8) {
					System.out.println("Posición inválida. Debe ser entre a y h.");
				}
			} while (columna < 1 || columna > 8);

			// Mostramos tablero según la pieza
			switch (opcion) {
			case 1 -> Tablero.imprimir(fila, columna, "dama");
			case 2 -> Tablero.imprimir(fila, columna, "alfil");
			case 3 -> Tablero.imprimir(fila, columna, "caballo");
			}

			System.out.print("¿Quieres colocar otra pieza? (s/n): ");
			repetir = keyboard.next().equalsIgnoreCase("s");
		}

		System.out.println("Fin del programa.");
	}

	public static void main(String[] args) {
		new Main().iniciarPrograma();
	}
}
