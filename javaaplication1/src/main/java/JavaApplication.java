/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author autologon
 */
public class JavaApplication {
    public static void main(String[] args){
        
//              Exercício 1
        Pessoa p = new Pessoa();
        
//              Exercício 2
        Produto produto = new Produto();
        
//              Exercicio 3
        Circulo c = new Circulo();
        
//              Exercício 4
        Estudante estudante = new Estudante("João","321.321.321.321",20,"Rua Alvez");
        
        System.out.println(estudante.getNome());
        System.out.println(estudante.getCpf());
        System.out.println(estudante.getIdade());
        System.out.println(estudante.getEndereco());

//              Exercício 5

        ContaBancaria contaBancaria = new ContaBancaria(100);

        contaBancaria.setTitular("João");
        contaBancaria.setNumero(12345678);
        System.out.println(contaBancaria.depositar(5000));
        System.out.println(contaBancaria.depositar(525));
        System.out.println(contaBancaria.depositar(50));
        System.out.println(contaBancaria.sacar(7500));

//              Exercício 6

        Carro carro = new Carro(0);

        System.out.println(carro.acelerar( 200));
        
        System.out.println(carro.frear(50));

        System.out.println(carro.frear(50));

//              Exercício 7
        BanheiroCompartilhado banheiro = new BanheiroCompartilhado();

        System.out.println(banheiro.usarBanheiro("João"));
        System.out.println(banheiro.desocuparBanheiro("João"));
        System.out.println(banheiro.usarBanheiro("Oliver"));
        System.out.println(banheiro.usarBanheiro("Gabriel"));

    }
}
