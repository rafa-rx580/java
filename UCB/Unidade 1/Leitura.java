import java.util.Scanner;

public class Leitura {

    public static void main(String argsp[]) {
        try (Scanner entrada = new Scanner(System.in)) {
            double sal;
            int age;

            System.out.printf("Informe um salário: ");
            sal = entrada.nextDouble();

            System.out.printf("Informe uma idade: ");
            age = entrada.nextInt();

            System.out.println("O salário informado foi: " + sal);
            System.out.println("A idade informada foi: " + age);
        }
    }
}
