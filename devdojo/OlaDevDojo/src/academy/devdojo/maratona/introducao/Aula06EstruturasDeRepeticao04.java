package academy.devdojo.maratona.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
    // Condição: O valor da parcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;

        System.out.println("---------------------------------------------");
        System.out.println("Opções de parcelamento:");

        for (int parcela = 1; parcela <= valorTotal; parcela++){

            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Até " + parcela + " vezes de R$" + valorParcela);
        }
        System.out.println("---------------------------------------------");
    }
}

