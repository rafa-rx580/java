import java.util.Scanner;

public class Metodo01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro num: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo num: ");
        double num2 = input.nextDouble();

        double resultado = somar(num1, num2);

        System.out.println(formatar(resultado));

        input.close();
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static String formatar(double valor) {
        return String.format("%.2f", valor);
    }
}
