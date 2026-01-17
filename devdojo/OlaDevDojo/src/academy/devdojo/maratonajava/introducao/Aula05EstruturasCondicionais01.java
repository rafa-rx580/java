package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 18;
        boolean isAuthorizedToBuyAlcohol = age >= 18;

        if (isAuthorizedToBuyAlcohol){
            System.out.println("Autorizado a comprar bebidas alcóolicas.");
        } else {
            System.out.println("Não autorizado a comprar bebidas alcóolicas.");
        }

        System.out.println("Fora do if");

    }
}
