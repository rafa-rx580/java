package academy.devdojo.maratonajava.javacore.cexercicios.domain;

public class ExercicioFuncionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime(){
        System.out.println(nome);
        System.out.println(idade);
        if(salario == null){
            return;
        }
            for (int i = 0; i < salario.length; i++) {
                System.out.println("Salário " + i + ": " + salario[i]);
            }
            mediaSal();

    }

    public void mediaSal(){
        if (salario == null){
            return;
        }
        double media = 0;
            for (double i : salario) {
                media += i;


            media /= salario.length;
        }
        System.out.printf("A média salarial é: %.2f", media); //Atenção ao printf, e atenção à virgula, aqui não usa o +
    }
}
