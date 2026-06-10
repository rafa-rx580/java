package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.domain.Estudante;
import academy.devdojo.maratonajava.javacore.bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.name = "Airgo";
        estudante1.age = 18;
        estudante1.gender = 'M';

        estudante2.name = "Valentine";
        estudante2.age = 18;
        estudante2.gender = 'F';

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
