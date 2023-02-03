package vectoresymatrices;

import java.util.Scanner;

public class VectoresyMatrices {

    public static void main(String[] args) {

       Array3d.ejemplo2();
    }
    
    public static void sumamatrices(){
     int[][] matriz = new int[3][3];
        int sumatoria = 0;
        for (int i = 0; i < 3; i++) 
        {  // fila
            for (int j = 0; j < 3; j++)
            {  // columna
                
                if (i==2) {
                    matriz[i][j] = 10;
                } else {
                    matriz[i][j] = 1;
                }
                System.out.print(matriz[i][j] + "  ");
                sumatoria+=matriz[i][j]; // java
            }
            System.out.println("");
        }
        System.out.println("El total es de: " + sumatoria);
    }

    public static void matriz1() {
        int[][] matriz = new int[3][3];
        Scanner leer = new Scanner(System.in);
        for (int f = 0; f < 2; f++) // filas
        {
            for (int c = 0; c < 2; c++) // columnas
            {
                System.out.println("Ingrese un valor:");
                matriz[f][c] = leer.nextInt();
            }
            System.out.println("");
        }
        System.out.println("***************");
        System.out.println("");
        matriz[1][2] = 5;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }

    }

    public static void Arreglos() {  // metodo en java
//       Array3d matriz3d = new Array3d();
//     matriz3d.ejemplo2();
        Scanner leer = new Scanner(System.in);
        // Arreglo
        int n;
        String[] nombres = new String[5];
        nombres[0] = "Susana";
        nombres[1] = "Karla";
        nombres[2] = "Marco";
        nombres[3] = "Pedro";
        nombres[4] = "Sergio";

        int[] Edad = new int[]{20, 12, 36, 54, 45};

        while (true) {
            System.out.print("Digite el tamanio del arreglo");
            n = leer.nextInt();
            int[] salario = new int[n];

            for (int i = 0; i < salario.length; i++) {
                System.out.print(salario[i] + " ");
            }

            System.out.println(salario[0]);
            salario[0] = 5;
            System.out.println(salario[0]);

        }
    }
}
