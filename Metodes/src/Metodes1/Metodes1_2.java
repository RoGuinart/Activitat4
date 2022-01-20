/* ENUNCIAT:
    Escriu el mètode min que retorni el mínim de tres números i el mètode mijana que retorni la mitjana aritmètica de tres números. 
    Proporciona funcions de testeig pels mètodes anteriors. Segueix el diagrama proporcionat.
    
    Signatures de les funcions
        public static double min(double x, double y, double z)
        public static double mitjana(double x, double y, double z)
*/

package Metodes1;

import java.util.Scanner;

class Metodes1_2 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double num1, num2, num3;

        System.out.print("Escriu el primer número: ");
        num1 = in.nextDouble();

        System.out.print("Escriu el segon número: ");
        num2 = in.nextDouble();

        System.out.print("Escriu el tercer número: ");
        num3 = in.nextDouble();
        
        in.close();

        testMin(num1, num2, num3);
        testMitjana(num1, num2, num3);
    }

    public static double min(double a, double b, double c) 
    {
        double aux = a;
        if(aux > b) aux = b;
        if(aux > c) aux = c;
        return aux;
    }

    public static double mitjana(double x, double y, double z) {
        return (x+y+z)/3;
    }

    static void testMin(double num1, double num2, double num3) {
        System.out.printf("Mínim de %.2f, %.2f i %.2f: %.2f\n", num1, num2, num3, min(num1, num2, num3));
    }

    static void testMitjana(double num1, double num2, double num3){
        System.out.printf("Mitjana de %.2f, %.2f i %.2f: %.2f\n", num1, num2, num3, mitjana(num1, num2, num3));
    }


}