import java.util.Scanner;

public class CalcularAreaTriangulo {
    public static void main(String[] args) {
        //inicio algoritmo

        //calcular area triangulo usando formula area=base X altura

        //relacion scanner
        try (Scanner console = new Scanner(System.in)) {
            //definimos los datos y resultado
            //se deberia poner float,int,chat,etc =0; pero por hegemonia y que el sistema no detecte errores no se pone
            float base;
            float altura;
            float area;

            //pedimos al usuario que ingrese los datos
            System.out.println("ingrese base:");
            base =console.nextFloat();
            System.out.println("ingrese altura");
            altura = console.nextFloat();

            //definir el area

            area=(base * altura)/2;

            //imprimimos el resultado en pantalla
            System.out.println("el area del triangulo es:"+ area);

            //fin del algoritmo


        }


    }
}