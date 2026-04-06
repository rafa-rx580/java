package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Gabriel";
        professor.idade = 35;
        professor.sexo = 'M';

        System.out.println(professor.nome + professor.idade + professor.sexo);
    }
}
