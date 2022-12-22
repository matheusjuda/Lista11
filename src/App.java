import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        float n3 = 0f;
        float contaA = 0f;
        float contaB = 0f;
        double contaC = 0f;

        System.out.println("Informe o primeiro número INTEIRO: ");
        n1 = console.nextInt();
        System.out.println("Informe o segundo número INTEIRO: ");
        n2 = console.nextInt();
        System.out.println("Informe um número real: ");
        n3 = console.nextFloat();

        contaA = (n1 * 2) * (n2 / 2);
        contaB = (n1 * 3) + n3;
        contaC = Math.pow(n3, 3);

        System.out.println("a) Produto do dobro do primeiro com metade do segundo: " + contaA);    
        System.out.println("b) A soma do triplo do primeiro com o terceiro: " + contaB);
        System.out.println("c) O terceiro elevado ao cubo: " + contaC);
        console.close();
    }
}