package academy.devdojo.maratonajava.javacore.cexercicios.test;

import academy.devdojo.maratonajava.javacore.cexercicios.domain.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Claudio";
        estudante.idade = 19;

        double[] notas = estudante.notas;
        notas[0] = 6;
        notas[1] = 7;

        estudante.imprime();

        System.out.println("Media: " + estudante.media());

        System.out.println("Passou? " + estudante.passarDeAno());
    }
}
