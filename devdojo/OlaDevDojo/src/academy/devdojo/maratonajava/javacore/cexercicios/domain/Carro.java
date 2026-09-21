package academy.devdojo.maratonajava.javacore.cexercicios.domain;

public class Carro {
    public String nome;
    public String modelo;
    public String ano;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.modelo);
        System.out.println(this.ano);
    }
}
