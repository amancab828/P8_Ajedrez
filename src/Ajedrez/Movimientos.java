package Ajedrez;

public class Movimientos {

    public static boolean esMovimiento(String tipo, int f, int c, int fila, int col) {
        return switch (tipo) {
            case "dama" -> movDama(f, c, fila, col);
            case "alfil" -> movAlfil(f, c, fila, col);
            case "caballo" -> movCaballo(f, c, fila, col);
            default -> false;
        };
    }

    private static boolean movDama(int f, int c, int fila, int col) {
        if (Math.abs(f - fila) == Math.abs(c - col)) { //Condición para la diagonal
            return true;
        } else if (f == fila || c == col) {//Condición para la horizontal y vertical
        	return true;
        } else {
        	return false;
        }
    }
    
    private static boolean movAlfil(int f, int c, int fila, int col) {
        if (Math.abs(f - fila) == Math.abs(c - col)) { //Condición para la diagonal
            return true;
        } else {
        	return false;
        }
    }

    private static boolean movCaballo(int f, int c, int fila, int col) {
        int df = Math.abs(f - fila);
        int dc = Math.abs(c - col);

        if ((df == 2 && dc == 1) || (df == 1 && dc == 2)) {
        	return true;
        } else {
        	return false;
        }
    }
}
