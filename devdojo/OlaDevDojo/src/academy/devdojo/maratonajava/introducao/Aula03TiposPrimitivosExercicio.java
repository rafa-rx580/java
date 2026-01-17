package academy.devdojo.maratonajava.introducao;
/*
    Prática:

     Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

     Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>.
*/
public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String name = "Rafael";
        String address = "250 Don Valley Pkwy, Toronto, Ontario, Canada";
        double salary = 20000.00;
        String date = "05/01/2035";
        System.out.println("Eu, " + name + ", morando no endereço: " + address + " confirmo que recebi o salário de $" + salary + " na data " + date);
    }
}
