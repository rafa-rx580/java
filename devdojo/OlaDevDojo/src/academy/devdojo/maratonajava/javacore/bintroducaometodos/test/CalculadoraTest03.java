package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros01(20, 2);

        System.out.println(result);

        System.out.println(calculadora.divideDoisNumeros02(20, 0));

        System.out.println("-------------------");

        calculadora.imprimeDivisaoDoisNumeros(86,5);
    }
}
