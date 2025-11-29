package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        byte dia = 6;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção Inválida, selecione de 1 até 7.");
                break;
        }

        char sx = 'M';
        switch (sx){
            case 'M':
                System.out.println("Masculino");
                break;

            case 'F':
                System.out.println("Feminino");
                break;

            default:
                System.out.println("Inválido");
                break;
        }
    }
}
