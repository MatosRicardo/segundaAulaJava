package primeiraulabasico;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número para saber a tabuada: ");
        int numero = entrada.nextInt();

        System.out.println(numero +" x 1 = " + (numero * 1));
        System.out.println(numero +" x 1 = " + (numero * 2));
        System.out.println(numero +" x 1 = " + (numero * 3));
        System.out.println(numero +" x 1 = " + (numero * 4));
        System.out.println(numero +" x 1 = " + (numero * 5));
        System.out.println(numero +" x 1 = " + (numero * 6));
        System.out.println(numero +" x 1 = " + (numero * 7));
        System.out.println(numero +" x 1 = " + (numero * 8));
        System.out.println(numero +" x 1 = " + (numero * 9));
        System.out.println(numero +" x 1 = " + (numero * 10));
    }
}
