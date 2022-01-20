/* ENUNCIAT:
    Escriu un mètode sumaRang que calculi la suma dels nombres enters entre n i m amb n i m inclosos. 
    Comprova que dona resultats correctes amb les següents entrades:
    
    Signatures de les funcions
        public static int sumaRang(int limit1, int limit2)

        (4, 7) -> 22
        (-2, 5) -> 12
        (-2, -5) -> -14
        (-5, -2) -> -14
        (7, 7) -> 14
        (5, 2) -> 14
*/

package Metodes1;

import java.util.Scanner;

class Metodes1_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;

        System.out.print("Escriu el primer número: ");
        num1 = in.nextInt();

        System.out.print("Escriu el segon número: ");
        num2 = in.nextInt();

        in.close();

        testSumaRang(num1, num2);
    }

    public static int sumaRang(int a, int b) {
        int suma = 0;
        if(a==b) {
            suma = a+b;
        } else {
            int aux = b;
            if(a>b) { //En el cas que a > b, no podem utilitzar el for que ve després. Per tant, canviem variables. És això o escriure un altre for.
                aux = a;
                a=b;
            }

            for (int i = a; i <= aux; i++) {
                suma+= i;
            }
        }
        return suma;
    }

    public static void testSumaRang(int num1, int num2) {
        
        System.out.printf("(%d, %d) -> %d\n", num1, num2, sumaRang(num1, num2));

    }
}