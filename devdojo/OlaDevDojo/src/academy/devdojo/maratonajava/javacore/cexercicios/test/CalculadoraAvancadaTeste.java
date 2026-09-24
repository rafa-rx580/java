package academy.devdojo.maratonajava.javacore.cexercicios.test;

import academy.devdojo.maratonajava.javacore.cexercicios.domain.CalculadoraAvancada;

public class CalculadoraAvancadaTeste {
    public static void main(String[] args) {
        CalculadoraAvancada calculadora = new CalculadoraAvancada();

        calculadora.somaVarArgs(10, 20, 30);
        calculadora.mediaVarArgs(10, 20, 30);
        calculadora.maiorNumero(10, 20, 30);
    }
}
