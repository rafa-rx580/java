package academy.devdojo.maratonajava.javacore.cexercicios.test;

import academy.devdojo.maratonajava.javacore.cexercicios.domain.Calculadora;

public class CalculadoraTeste01 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somaDoisNum(1,2));
        System.out.println(calculadora.subtraiDoisNum(1,2));
        System.out.println(calculadora.multiplicaDoisNum(1,2));
        System.out.println(calculadora.divideDoisNum(1,2));
    }
}
