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
    
    public static boolean movAlfil(int filaP, int colP, int filaC, int colC) {
        // TODO: devolver true si es un movimiento válido de alfil
        return false;
    }

    public static boolean movCaballo(int filaP, int colP, int filaC, int colC) {
        // TODO: devolver true si es un movimiento válido de caballo
        return false;
    }
}
