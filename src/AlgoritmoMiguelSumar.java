import java.util.Scanner;

public class AlgoritmoMiguelSumar {
    public static void main(String[] args) {
        // algoritmo sumar numeros enteros
        //declarar scanner
        Scanner console = new Scanner(System.in);

        //declarar variables
        //se deberia poner float,int,chat,etc =0; pero por hegemonia y que el sistema no detecte errores no se pone

        int numero1;
        int numero2;
        int suma;


        System.out.println("ingrese numero1");
        numero1= console.nextInt();
        System.out.println("ingrese numero2");
        numero2= console.nextInt();

        //declarar suma
        suma=(numero1+numero2);

        System.out.println("el resultado es:"+ suma);

    }
}
