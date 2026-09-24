package academy.devdojo.maratonajava.javacore.bintroducaometodos.domain;

public class ExercicioFuncionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime(){
        System.out.println(nome);
        System.out.println(idade);
        for (int i = 0; i < salario.length; i++){
            System.out.println("Salário " + i + ": " + salario[i]);
        }
    }

    public void mediaSal(double[] salario){

        double media = 0;
        double soma = 0;
        for (double i : salario){
            soma += i;
        }

        media = soma / salario.length;

        System.out.println(media);
    }
}
