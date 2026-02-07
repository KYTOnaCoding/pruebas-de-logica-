import java.util.Scanner;

public class SegundosAMinutos {
    public static void main(String[] args) {


        //relacionar el scanner
        Scanner console = new Scanner(System.in);
        //definir variable
        float segundos;
        float minutos;

        //pedirle al usuario que ingrese segundos
        System.out.println("ingresar segundos:");
        segundos=console.nextFloat();

        minutos=(segundos/60);
        //arrojar resultado al usuario
        System.out.println("serian"+ minutos);

    }
}
