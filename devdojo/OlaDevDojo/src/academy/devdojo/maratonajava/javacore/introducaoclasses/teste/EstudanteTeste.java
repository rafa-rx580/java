package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante student = new Estudante();
        student.age = 17;
        student.gender = 'M';
        student.name = "Marcos";

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
