package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Leon";
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
        System.out.println(estudante.name);
    }
}
