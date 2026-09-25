package Aula04;

public class Carro {
    private String Marca;
    private String Modelo;
    private int Ano;
    private String Cor;
    private float Preco;

    public Carro() { //Construtor vazio

    }

    public Carro(String Marca, String Modelo, int Ano){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
    }

    public Carro(String Marca, String Modelo, int Ano, String Cor, float Preco){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.Cor = Cor;
        this.Preco = Preco;
    }

    //Getters e Setters
    public String getMarca(){
        return Marca;
    }
    public String setModelo(){
        return Modelo;
    }
    public int setAno(){
        return Ano;
    }
    public String setCor(){
        return Cor;
    }
    public float set(){
        return Preco;
    }

    public void setMarca (String Marca){
        this.Marca = Marca;
    }

    public void setModelo (String Modelo){
        this.Modelo = Modelo;
    }
    public void setAno (int Ano){
        this.Ano = Ano;
    }
    public void setCor (String Cor){
        this.Cor = Cor;
    }
    public void setPreco (float Preco){
        this.Preco = Preco;
    }


    public void ExibirInfo(){
        System.out.println("Atributos do carro");
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Ano: " + Ano);
        System.out.println("Cor: " + Cor);
        System.out.println("Preco: " + Preco);
        System.out.println("-------------------------------------------------");

    }

}
