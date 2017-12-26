import java.util.Scanner;

public class tablero {
    int noFilas, noColumnas;
    String tablero[][];
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        tablero tb = new tablero();
        tb.CrearTablero();
        tb.llenarTablero();
        tb.imprimirTablero(tb.solucion(tb.tablero));
    }

    public void CrearTablero() {
        noFilas = sc.nextInt();
        noColumnas = sc.nextInt();
        tablero = new String[noFilas][noColumnas];
    }

    public void llenarTablero() {
        String filas[] = new String[noFilas];
        for (int i = 0; i < filas.length; i++) {
            filas[i] = sc.next();
        }
        for (int i = 0; i < filas.length; i++) {
            String[] fila = filas[i].split("");
            for (int j = 0; j < noColumnas; j++) {
                tablero[i][j] = fila[j];
            }
        }
    }

    public void imprimirTablero(String tablero[][]) {
        for (int i = 0; i < noFilas; i++) {
            for (int j = 0; j < noColumnas; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }
    }

    public String[][] solucion(String tablero[][]) {
        String tableroSolucion[][] = new String[tablero.length][tablero[0].length];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                int numeroMinas = 0;
                if (tablero[i][j].equals("*")) {
                    tableroSolucion[i][j] = "*";
                } else {
                    for (int k = -1; k < 2; k++) {
                        for (int k2 = -1; k2 < 2; k2++) {
                            if ((i + k >= 0 && i + k < tablero.length)
                                    && (j + k2 >= 0 && j + k2 < tablero[0].length)) {
                                if (tablero[i + k][j + k2].equals("*")) {
                                    numeroMinas++;
                                }
                            }
                        }
                    }
                    tableroSolucion[i][j] = Integer.toString(numeroMinas);
                }
            }
        }
        return tableroSolucion;
    }
}
