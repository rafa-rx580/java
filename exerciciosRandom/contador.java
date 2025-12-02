import java.util.Scanner;

public class contador{
    public static void main(String[] args) {

        int[] num = new int[3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            Scanner s = new Scanner(System.in);
            System.out.println("Digite um número: ");
            num[i] = s.nextInt();
            soma += num[i];
        }
        System.out.println("O valor da soma é: " + soma);
    }
}