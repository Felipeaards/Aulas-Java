package Aula01;
//Estamos executando o molde da classe Carro
public class CarroTeste {
    public static void main(String[] args){
        //System.out.println("Olá mundoo"); //o "ln" significa que ele vai pular a linha, caso
        //ele não estivesse aí, ficaria tudo na mesma linha

        //Criando o objeto "carro1" do tipo "Carro". carro1 é uma instância de Carro
        Carro carro1 = new Carro(); //Basicamente, Carro é como se fosse um tipo de variável (String, int)
        //Criando um objeto na memória

        //Atribuindo valores ao objeto
        carro1.marca = "Gol";
        carro1.modelo = "Bolinha";
        carro1.cor = "Cinza";
        carro1.VelocidadeAtual = 0;

        //Imprimindo os objetos
        System.out.println("Marca: " + carro1.marca); //Objeto (carro1) "." o que eu quero
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Velocidade: " + carro1.VelocidadeAtual);

        System.out.println("\n---------------------------------------------------------------\n");

        Carro carro2 = new Carro();
        carro2.marca = "Fiat";
        carro2.modelo = "Uno";
        carro2.cor = "Azul";
        carro2.VelocidadeAtual = 0; //Não pude colocar "0" pois declaramos essa variável como int

        System.out.println("Marca: " + carro2.marca); //Objeto (carro1) "." o que eu quero
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Cor: " + carro2.cor);
        System.out.println("Velocidade: " + carro2.VelocidadeAtual);


        System.out.println("\n---------------------------------------------------------------\n");

        System.out.println("Ações do carro " +carro1.modelo);
        carro1.Acelerar();
        carro1.Acelerar();
        carro1.Acelerar();
        System.out.println("Velocidade do " +carro1.modelo +" é de " + carro1.VelocidadeAtual + " Km/h");
        carro1.Desacelerar();
        System.out.println("Velocidade do " + carro1.modelo + " é de " + carro1.VelocidadeAtual + " Km/h");

        System.out.println("\n---------------------------------------------------------------\n");

        System.out.println("Ações do carro " +carro2.modelo);
        carro2.Acelerar();
        carro2.Acelerar();
        System.out.println("Velocidade do " +carro2.modelo +" é de " + carro2.VelocidadeAtual + " Km/h");
        carro2.Desacelerar();
        System.out.println("Velocidade do " + carro2.modelo + " é de " + carro2.VelocidadeAtual + " Km/h");

    }
}
