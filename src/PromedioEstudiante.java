import java.util.Scanner;

    public class PromedioEstudiante {
    public static void main(String[] args) {


        //algoritmo para sacar promedio 5 notas


        //definir las notas y el promedio
        //se deberia poner float,int,chat,etc =0; pero por hegemonia y que el sistema no detecte errores no se pone

        float nota1 ;
        float nota2 ;
        float nota3 ;
        float nota4 ;
        float nota5 ;
        float PromedioEstudiante ;

        //declarar scanner
        Scanner console = new Scanner(System.in);

        //pedirle al usuario las notas

        System.out.println("ingresar nota1:");
        nota1= console.nextFloat();
        System.out.println("ingresar nota2:");
        nota2= console.nextFloat();
        System.out.println("ingresar nota3:");
        nota3= console.nextFloat();
        System.out.println("ingresar nota4:");
        nota4= console.nextFloat();
        System.out.println("ingresar nota5:");
        nota5= console.nextFloat();

        //definir resultado
        PromedioEstudiante=(nota1+nota2+nota3+nota4+nota5)/5;

        //resultado

        System.out.println("su promedio es:"+ PromedioEstudiante);
    }



}
