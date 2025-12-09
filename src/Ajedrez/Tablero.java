package Ajedrez;

public class Tablero {

	// Colores ANSI
	private static final String reset = "\u001B[0m";
	private static final String blue = "\u001B[44m  " + reset; // pieza
	private static final String red = "\u001B[41m  " + reset; // movimientos
	private static final String white = "\u001B[47m  " + reset; // casilla blanca
	private static final String black = "\u001B[40m  " + reset; // casilla negra

	public static void imprimir(int fila, int columna, String tipo) {
    	
    	System.out.println("  a b c d e f g h");

        for (int row = 8; row >= 1; row--) {

            System.out.printf(" %d", row);

            for (int column = 1; column <= 8; column++) {

                boolean esMovimiento = Movimientos.esMovimiento(tipo, piezaFila, piezaColumna, row, column);

                if (row == piezaFila && column == piezaColumna) {
                    System.out.print(blue);
        
    }
}
