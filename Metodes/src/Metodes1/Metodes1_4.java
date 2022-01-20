/* ENUNCIAT:
    Escriu el mètode primerDigit que retorna el primer dígit de l’argument, el mètode ultimDigit que retorna l'últim digit de l’argument 
    i el mètode contaDigits que retorna el nombre de dígits de l’argument. Proporciona funcions de testeig pels mètodes anteriors. 
    Segueix el diagrama proporcionat.
    
    Signatures de les funcions
        public static int primerDigit(int n)
        public static int ultimDigit(int n)
        public static int contaDigits(int n)
*/

package Metodes1;

import java.util.Scanner;

class Metodes1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Escriu un número: ");
        n = in.nextInt();

        in.close();

        testContaDigits(n);
        testPrimerDigit(n);
        testUltimDigit(n);
    }

    public static int primerDigit(int n) {
        int aux;
        do {
            aux = n;
            n/=10;
        } while(n != 0);
        return Math.abs(aux);
    }

    public static int ultimDigit(int n) {
        return Math.abs(n%10);
    }

    public static int contaDigits(int n) {
        int i = 0;
        while (n != 0) {
            n/=10;
            i++;
        }
        return i;
    }

    public static void testPrimerDigit(int n) {
        System.out.printf("El primer dígit de %d és %d\n", n, primerDigit(n));
    }

    public static void testUltimDigit(int n) {
        System.out.printf("L'últim dígit de %d és %d\n", n, ultimDigit(n));
    }

    public static void testContaDigits(int n) {
        System.out.printf("El número %d té %d dígits\n", n, contaDigits(n));
    }
}