package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.domain.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Roger";
        estudante.age = 18;
        estudante.gender = 'M';

        estudante.imprime();
    }
}
