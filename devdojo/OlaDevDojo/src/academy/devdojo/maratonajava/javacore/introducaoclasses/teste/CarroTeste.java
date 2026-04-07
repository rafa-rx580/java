package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Onix";
        carro.modelo = "LTZ";
        carro.ano = 2020;

        carro2.nome = "Corolla";
        carro2.modelo = "XEI";
        carro2.ano = 2008;

        System.out.println("Caracteristicas carro 1: " + "Nome: " + carro.nome + " Modelo: " + carro.modelo + " Ano: " + carro.ano );
        System.out.println("Caracteristicas carro 2: " + "Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano );
    }
}
