package Tem7_8_9;

public class array_bidimensional {
    public static void main(String[] args) {
        //Crea un array bidimensional de enteros y recórrelo, mostrando la posición
        // y el valor de cada elemento en ambas dimensiones.
        int[][] array_bidimensional = new int[][]{{1,2, 3, 4}, {5, 6, 7, 8}};

        for (int i = 0; i < array_bidimensional.length; i++) {
            for (int j = 0; j < array_bidimensional[i].length; j++) {
                System.out.println("Datos en la posición: " + i + ", " + j + " - Valor: " + array_bidimensional[i][j]);
            }
        }
    }
}
