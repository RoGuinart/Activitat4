/* ENUNCIAT: 
    Escriu el mètode caractersCentrals que retorna una cadena amb el caràcter central de l’argument si 
    la longitud és senar i retorna els dos caràcters centrals si la longitud de l’argument és parell.
    
    Signatures de les funcions
        public static String caractersCentrals(String str)
*/

package Metodes1;

import java.util.Scanner;

class Metodes1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        do {
            System.out.println("Escriu una cadena: ");
            str = in.nextLine();
            if(str.length() == 0) System.err.println("Has d'escriure alguna cosa!");
        } while (str.length() == 0);

        in.close();

        if(str.length() % 2 == 0) System.out.println("Els caràcters centrals són \"" + caractersCentrals(str) + "\".");
        else System.out.println("El caràcter central és '" + caractersCentrals(str) + "'.");
    }

    public static String caractersCentrals(String str) {
        if(str.length() % 2 == 0){ //Si és parell, no està del tot centrat
            return str.substring(str.length()/2-1, str.length()/2+1);
        } else { //Si és imparell, sí que està centrat.
            return str.substring(str.length()/2, str.length()/2+1);
        }
    }
}