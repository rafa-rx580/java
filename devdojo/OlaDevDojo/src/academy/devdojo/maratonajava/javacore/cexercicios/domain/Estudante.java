package academy.devdojo.maratonajava.javacore.cexercicios.domain;

public class Estudante {
    public String nome;
    public int idade;
    public double[] notas = new double[2];

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.print("Nota 1: " + this.notas[0]);
        System.out.println(" Nota 2: " + this.notas[1]);
    }

    public double media(){
        double n1 = this.notas[0];
        double n2 = this.notas[1];

            return (n1 + n2) / 2;
    }

    public boolean passarDeAno(){
        return !(media() < 6);
    }
}

