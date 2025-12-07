package Ajedrez;
import java.util.Scanner;

public class Main {

    private Scanner keyboard = new Scanner(System.in);

    public void iniciarPrograma() {
        System.out.println("PROYECTO AJEDREZ");
        //TODO: Preguntar pieza al usuario
        //TODO: Preguntar fila y columna
        //TODO: Llamar a Tablero.imprimir() para mostrar tablero
    }

    public static void main(String[] args) {
        new Main().iniciarPrograma();
    }
}
