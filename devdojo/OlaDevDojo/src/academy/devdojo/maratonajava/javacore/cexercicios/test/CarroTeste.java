package academy.devdojo.maratonajava.javacore.cexercicios.test;

import academy.devdojo.maratonajava.javacore.cexercicios.domain.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.nome = "Cruze";
        carro.modelo = "GT";
        carro.ano = "2015";

        carro.imprime();
    }
}
