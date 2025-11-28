package academy.devdojo.maratona.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int num01 = 10;
        int num02 = 20;
        System.out.println(num01 / (double) num02);

        //
        System.out.println("--------------------------");
        //

        // %

        int r = 21 % 2;
        System.out.println(r);

        //
        System.out.println("--------------------------");
        //

        // < > <= >= == !=

         boolean isTenGreaterThanTwenty = 10 > 20;
         boolean isTenLessThanTwenty = 10 < 20;
         boolean isTenEqualTwenty = 10 == 20;
         boolean isTenEqualTen = 10 == 10;
         boolean isTenNotEqualToTen = 10 != 10;
         boolean isTenNotEqualToTwenty = 10 != 20;


        System.out.println(isTenGreaterThanTwenty);
        System.out.println(isTenLessThanTwenty);
        System.out.println(isTenEqualTen);
        System.out.println(isTenEqualTwenty);
        System.out.println(isTenNotEqualToTen);
        System.out.println(isTenNotEqualToTwenty);

        //
        System.out.println("--------------------------");
        //

        // && || !

        int age = 29;
        float salary = 3500F;
        boolean isLegalGreaterThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalLessThanThirty = age < 30 && salary >= 3381;

        System.out.println("isLegalGreaterThanThirty: " + isLegalGreaterThanThirty);
        System.out.println("isLegalLessThanThirty: " + isLegalLessThanThirty);

        double valueCheckingAccountTotal = 5000;
        double valueSavingsAccount = 750000;
        float playStationPrice = 300F;
        boolean isPlayStationFivePurchasable = valueCheckingAccountTotal > playStationPrice || valueSavingsAccount > playStationPrice;
        System.out.println("isPlayStationFivePurchasable: " + isPlayStationFivePurchasable);

        //
        System.out.println("--------------------------");
        //

        // = += -= *= /= %=

        double bonus = 1800;
        bonus = bonus + 1000;
        System.out.println("bonus: " + bonus);

        // Simplifying:

        double bonusTwo = 1800; // 1800
        bonusTwo += 1000; // 2800
        bonusTwo -= 1000; // 1800
        bonusTwo *= 2; // 3600
        bonusTwo /= 2; // 1800
        bonusTwo %= 2; // 0
        System.out.println("bonusTwo: " + bonusTwo);

        //
        int counter = 0;
        counter += 1; // counter = counter + 1
        counter++; // counter = counter + 1 -- after
        counter--; // counter = counter - 1
        ++counter; // -- before
        --counter;
        int counterTwo = 0;
        System.out.println("counter: " + counter);
        System.out.println(++counterTwo);
        System.out.println(counterTwo++);
    }
}
