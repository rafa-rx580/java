package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como Domingo

        byte dia = 6;
        String business;

        switch(dia) {
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
                System.out.println("Útil");
                break;
            case 3:
                System.out.println("Útil");
                break;
            case 4:
                System.out.println("Útil");
                break;
            case 5:
                System.out.println("Útil");
                break;
            case 6:
                System.out.println("Útil");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
