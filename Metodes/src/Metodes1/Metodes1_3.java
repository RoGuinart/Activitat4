/* ENUNCIAT:
    Escriu el mètode totsIguals que indica si tres números són iguals o no, el mètode totsDiferents que indica 
    si tres números són tots diferents i el mètode estanOrdenats que indica tres números estan ordenats de menor a major. 
    Proporciona funcions de testeig pels mètodes anteriors. Segueix el diagrama proporcionat.
    
    Signatures de les funcions
        public static boolean totsIguals(double x, double y, double z)
        public static boolean totsDiferents(double x, double y, double z)
        public static boolean estanOrdenats(double x, double y, double z)


*/

package Metodes1;

import java.util.Scanner;

class Metodes1_3 {

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

        testTotsIguals(num1, num2, num3);
        testTotsDiferents(num1, num2, num3);
        testEstanOrdenats(num1, num2, num3);

    }

    public static boolean totsIguals(double x, double y, double z) {
        return x == y && y == z;
    }

    public static boolean totsDiferents(double x, double y, double z) {
        return x != y && y != z && x != z;
    }

    public static boolean estanOrdenats(double x, double y, double z) {
        return x < y && y < z;
    }

    public static void testTotsIguals(double x, double y, double z) {
        if(totsIguals(x, y, z)) System.out.printf("\nEls números %f, %f i %f són iguals.", x, y, z);
        else System.out.printf("\nEls números %f, %f i %f no són iguals.", x, y, z);
    }

    public static void testTotsDiferents(double x, double y, double z) {
        if(totsDiferents(x, y, z)) System.out.printf("\nEls números %f, %f i %f són tots diferents.", x, y, z);
        else System.out.printf("\nEls números %f, %f i %f no són tots diferents.", x, y, z);
    }

    public static void testEstanOrdenats(double x, double y, double z) {
        if(estanOrdenats(x, y, z)) System.out.printf("\nEls números %f, %f i %f estan ordenats ascendentment.\n", x, y, z);
        else System.out.printf("\nEls números %f, %f i %f no estan ordenats.\n", x, y, z);
    }
    
}