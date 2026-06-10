package academy.devdojo.maratonajava.javacore.bintroducaometodos.domain;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("==============================");
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
        System.out.println("==============================");
    }
}
