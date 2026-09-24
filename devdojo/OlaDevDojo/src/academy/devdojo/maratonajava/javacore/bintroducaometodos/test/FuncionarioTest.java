package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.domain.ExercicioFuncionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        ExercicioFuncionario funcionario = new ExercicioFuncionario();

        funcionario.nome = "Claudio";
        funcionario.idade = 30;
        funcionario.salario = new double[]{1800, 2600, 3400};
        salario = funcionario.salario;




        funcionario.imprime();
        funcionario.mediaSal(salario);
    }
}
