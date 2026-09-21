package academy.devdojo.maratonajava.javacore.cexercicios.domain;

public class Calculadora {

    public int somaDoisNum(int a, int b){
        return a + b;
    }

    public int subtraiDoisNum(int a, int b){
        return a - b;
    }

    public int multiplicaDoisNum(int a, int b){
        return a * b;
    }

    public double divideDoisNum(double a, double b){
        if(b != 0){
            return a / b;
        }
        return 0;
    }
}
