/* ENUNCIAT:
    Escriu un mètode equals que determini si dues matrius tenen els mateixos elements en el mateix ordre. 
    Proporciona funcions de testeig pels mètodes anteriors.
    
    Signatures de les funcions
        public static boolean equals(int[] a, int[] b)
*/

package Metodes1;

import java.util.Scanner;

class Metodes1_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte longitud;
        int[] a, b;

        System.out.print("Introdueix la llargada de la primera matriu: ");
        longitud = in.nextByte(); 
        in.nextLine(); //Reinicia Scanner
        a = new int[longitud];

        System.out.print("Introdueix la llargada de la segona matriu: ");
        longitud = in.nextByte(); 
        in.nextLine(); //Reinicia Scanner
        b = new int[longitud];

        System.out.println("Introdueix els continguts de la primera matriu:");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        in.nextLine(); //Reiniciem Scanner per evitar posar números a b[].

        System.out.println("Introdueix els continguts de la segona matriu:");
        for (int i = 0; i < b.length; i++) {
            b[i] = in.nextInt();
        }

        in.close();

        testEquals(a, b);
    }

    public static boolean equals(int[] a, int[] b) {
        if(a.length != b.length) return false;
        
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) return false;
        }

        return true;
    }

    public static void testEquals(int[] a, int[] b) {
        if(equals(a, b)) System.out.println("Les dues matrius són iguals.");
        else System.out.println("Les dues matrius són diferents.");
    }
}