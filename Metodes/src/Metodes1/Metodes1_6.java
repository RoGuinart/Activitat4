/* ENUNCIAT:
    Escriu una funció generarMatriuBinaria que retorni una matriu n per n generada aleatòriament 
    amb zeros i uns i una funció, mostrarMatriu, que mostri una matriu de dues dimensions.
    
    Signatures de les funcions
        public static int[][] generarMatriuBinaria(int dimensio)
        public static void mostrarMatriu(int m[][])
*/

package Metodes1;

import java.util.Scanner;

class Metodes1_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dimensio = 0;
        while (dimensio <= 0){
            System.out.print("Introdueix la llargada n d'una matriu n*n: ");
            if(in.hasNextInt()) {
                dimensio = in.nextInt();
                if(dimensio <= 0) {
                    System.err.println("El nombre ha de ser positiu.");
                    in.nextLine();
                }
            } else {
                System.err.println("Entrada invàlida.");
                in.nextLine();
            }

            
        }

        in.close();

        mostrarMatriu(generarMatriuBinaria(dimensio));
    }

    public static int[][] generarMatriuBinaria(int dimensio) {
        int[][] m = new int[dimensio][dimensio];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = (int) Math.round(Math.random());
            }
        }
        return m;
    }

    public static void mostrarMatriu(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}