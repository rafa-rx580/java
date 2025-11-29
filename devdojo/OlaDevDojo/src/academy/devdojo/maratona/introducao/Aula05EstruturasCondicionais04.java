package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double annualSalary = 500000;
        double taxes;

        if (annualSalary <= 34712){
            taxes = 0.097;
        } else if (annualSalary > 34713 && annualSalary <= 68507) {
            taxes = 0.3735;
        } else {
            taxes = 0.4950;
        }

        System.out.println("O valor total de imposto que você deverá pagar será: " + (annualSalary * taxes) + ", com uma taxa de: " + taxes + ".");

    }
}
