package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;
import academy.devdojo.maratonajava.javacore.bintroducaometodos.domain.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        Calculadora calculadora = new Calculadora();

        calculadora.alteraDoisNumeros(n1, n2);

        System.out.println("Dentro CalculadoraTest04");
        System.out.println(n1); // still with value 1
        System.out.println(n2); // still with value 2

    }
}
