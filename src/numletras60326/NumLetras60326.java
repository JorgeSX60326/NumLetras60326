/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numletras60326;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class NumLetras60326 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 0;
        Scanner usuario = new Scanner(System.in);
        System.out.println("Ingrese un número entre 0 y 99");
        numero = usuario.nextInt();
        
        String letras = null;
        
        if (numero > 99) {
            System.out.println("Número inválido, verifique que el numero sea menor a 100");
        } else {
            if (numero<30) {
                switch (numero) {
                    case 0:
                        letras = "Cero";
                        break;
                    case 1:
                        letras = "Uno";
                        break;
                    case 2:
                        letras = "Dos";
                        break;    
                    case 3:
                        letras = "Tres";
                        break;
                    case 4:
                        letras = "Cuatro";
                        break;
                    case 5:
                        letras = "Cinco";
                        break;
                    case 6:
                        letras = "Seis";
                        break;
                    case 7:
                        letras = "Siete";
                        break;
                    case 8:
                        letras = "Ocho";
                        break;
                    case 9:
                        letras = "Nueve";
                        break;
                    case 10:
                        letras = "Diez";
                        break;
                    case 11:
                        letras = "Once";
                        break;
                    case 12:
                        letras = "Doce";
                        break;
                    case 13:
                        letras = "Trece";
                        break;
                    case 14:
                        letras = "Catorce";
                        break;
                    case 15:
                        letras = "Quince";
                        break;
                    case 16:
                        letras = "Dieciseis";
                        break;
                    case 17:
                        letras = "Diecisiete";
                        break;
                    case 18:
                        letras = "Dieciocho";
                        break;
                    case 19:
                        letras = "Diecinueve";
                        break;
                    case 20:
                        letras = "Veinte";
                        break;
                    case 21:
                        letras = "Veintiuno";
                        break;
                    case 22:
                        letras = "Veintidos";
                        break;
                    case 23:
                        letras = "Veintitres";
                        break;
                    case 24:
                        letras = "Veinticuatro";
                        break;
                    case 25:
                        letras = "Veinticinco";
                        break;
                    case 26:
                        letras = "Veintiseis";
                        break;
                    case 27:
                        letras = "Veintisiete";
                        break;
                    case 28:
                        letras = "Veintiocho";
                        break;
                    case 29:
                        letras = "Veintinueve";
                        break;
                    default:
                        break;
                }
                    System.out.println(letras);
                }
            if (numero >= 30){
            String decenas = null;
            int numdec;
            int numuni;
            numuni = numero%10;
            numero = numero/10;
            numdec = numero%10;
                 switch (numdec) {
                     case 3:
                        decenas = "Treinta";
                        break;
                     case 4:
                        decenas = "Cuarenta";
                        break;
                     case 5:
                        decenas = "Cincuenta";
                        break;
                     case 6:
                        decenas = "Sesenta";
                        break;
                     case 7:
                        decenas = "Setenta";
                        break;
                     case 8:
                        decenas = "Ochenta";
                        break;
                     case 9:
                        decenas = "Noventa";
                        break;
                     default:
                        break; 
                 }
                 switch (numuni){
                     case 1:
                        letras = "Uno";
                        break;
                     case 2:
                        letras = "Dos";
                        break;
                     case 3:
                        letras = "Tres";
                        break;
                     case 4:
                        letras = "Cuatro";
                        break;
                     case 5:
                        letras = "Cinco";
                        break;
                     case 6:
                        letras = "Seis";
                        break;
                     case 7:
                        letras = "Siete";
                        break;
                     case 8:
                        letras = "Ocho";
                        break;
                     case 9:
                        letras = "Nueve";
                        break;
                     default:
                        break;
                 }
                 if(numuni==0){
                    System.out.println(decenas);
                 }else{
                    System.out.println(decenas + " y " + letras);
                 }
            }
        }
        
    }
    
}
