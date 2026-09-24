package academy.devdojo.maratonajava.javacore.cexercicios.domain;

public class CalculadoraAvancada {
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int i : numeros){
            soma += i;
        }
        System.out.println(soma);
    }

    public void mediaVarArgs(double... numeros){
        double media = 0;
        double soma = 0;
        for (double i : numeros){
            soma += i;
            media = soma / numeros.length;
        }
        System.out.println(media);
    }

    public void maiorNumero(int... numeros){
        int aux = 0;
        for(int i : numeros){
            if(i > aux){
                aux = i;
            }
        }
        System.out.println(aux);
    }
}
