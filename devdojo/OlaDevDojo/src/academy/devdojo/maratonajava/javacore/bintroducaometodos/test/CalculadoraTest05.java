package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.domain.Calculadora;

public class CalculadoraTest05 {

    public static void main(String[] args) {

       // Método convencional, eu crio um array e passo ele depois.
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);

        // Usando VarArgs eu posso passar diretamente dentro da chamada.
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);
    }

}
