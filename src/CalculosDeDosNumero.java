//importar scanner
import java.util.Scanner;

public class CalculosDeDosNumero {

    public static void main(String[] args) {
//relacionar scanner
        Scanner console = new Scanner(System.in);
//definir variables
        //se deberia poner float,int,chat,etc =0; pero por hegemonia y que el sistema no detecte errores no se pone
        float numero1;
        float numero2;
        int opcion;
        //pedir al usuario los numeros

        System.out.println("Ingrese numero 1:");
        numero1 = console.nextFloat();

        System.out.println("Ingrese numero 2:");
        numero2 = console.nextFloat();
//desplegar opciones al usuario
        System.out.println("Elige una opcion:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        //leer opcion del usuario

        opcion = console.nextInt();
        //contemplar posibles opciones con if else para arrojar resultado

        if (opcion == 1) {
            System.out.println("Resultado: " + (numero1 + numero2));

        } else if (opcion == 2) {
            System.out.println("Resultado: " + (numero1 - numero2));

        } else if (opcion == 3) {
            System.out.println("Resultado: " + (numero1 * numero2));

        } else if (opcion == 4) {

            if (numero2 != 0) {
                System.out.println("Resultado: " + (numero1 / numero2));
            } else {
                System.out.println("No se puede dividir entre cero");
            }

        } else {
            System.out.println("Opcion no valida");
        }

        console.close();
        //fin algoritmo
    }
}