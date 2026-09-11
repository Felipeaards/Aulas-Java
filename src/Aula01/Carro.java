package Aula01;
//Carro é a classe, o modelo carro onde todos os objetos criados a
//partir dele terão os mesmos atributos e métodos
public class Carro {

    // Atributo - características / informações do objeto
    String marca;
    String modelo;
    String cor;
    int VelocidadeAtual;
    //Declaração de variáveis acima. Primeiro o tipo da variável e depois o nome dela

    // Métodos - Comportamento / ações

    void Acelerar(){
        System.out.println("Acelerando....");
        VelocidadeAtual = VelocidadeAtual + 10;
        System.out.println("A velocidade atualmente é " + VelocidadeAtual + " Km/h");
    }
    void Desacelerar(){
        System.out.println("Desacelerando....");
        VelocidadeAtual = VelocidadeAtual - 10;
        System.out.println("A velocidade atualmente é " + VelocidadeAtual + " Km/h");
    }
}
