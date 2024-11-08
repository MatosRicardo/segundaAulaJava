package primeiraulabasico; // pacote (pasta de organização das classes)
import java.util.Scanner;  // importando o scanner da bibli util

public class PrimeiraAaula { //Metodo principál

    public static void main(String[] args) {  //PSVM abreviar pra executar

        Scanner entrada = new Scanner(System.in); // entrada de dados pelo teclado

        System.out.println("Entre com o primeiro número: "); //permite a exibição em tela
        int numero = entrada.nextInt(); //instância da classe Scanner na variavel

        System.out.println("Entre com o segundo número: ");
        int numero2 = entrada.nextInt();

        int soma = numero + numero2;

        System.out.println("o valor do primeiro numero é " + numero);  // print para aparecer na tela
        System.out.println("o valor do segundo numero é " + numero2);
        System.out.println("O valor da soma dos dois numéros é " + soma);
    }
}
