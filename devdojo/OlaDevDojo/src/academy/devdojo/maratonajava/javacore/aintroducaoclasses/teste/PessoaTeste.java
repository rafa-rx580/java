package academy.devdojo.maratonajava.javacore.aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses.domain.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.idade  = 19;
        pessoa.nome = "Gustavo";
        pessoa.sexo = 'M';

        System.out.println(pessoa.idade);
        System.out.println(pessoa.nome);
        System.out.println(pessoa.sexo);
    }
}
