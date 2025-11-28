package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // age < 15 => categoria infantil
        // age >= 15 && age < 18 => categoria juvenil
        // age > 18 => categoria adulto

        int age = 18;
        String categoria;
                if (age < 15){
                    categoria = ("Categoria Infantil");
                } else if (age >= 15 && age < 18) {
                    categoria = ("Categoria Juvenil");
                } else{
                    categoria = ("Categoria Adulto");
                }
        System.out.println(categoria);
    }
}
