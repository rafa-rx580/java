package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        //Doar se salário > 5000

        double salary = 20000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo!";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";

        //Sintaxe operador ternário: (condicao) ? verdadeiro : falso;

        String resultado = salary > 5000 ? mensagemDoar : mensagemNaoDoar;

        //Também poderia ser: String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo!" : "Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado);
    }
}
