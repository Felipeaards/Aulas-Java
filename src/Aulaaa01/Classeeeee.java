package Aulaaa01;
public class Classeeeee {
    String Marca;
    int modelo;

    void Ligar(){
        System.out.println("Ligarrr");
    }
    void Desligar(){
        System.out.println("Desligarrrr");
    }
    public static void main(String[] args){
        Classeeeee c1 = new Classeeeee();
        c1.Ligar();

        c1.Marca = "ZUUUUUUMMM";
        c1.modelo = 111;
        System.out.println(c1.Marca);
        System.out.println(c1.modelo);
        c1.Desligar();

        Classeeeee c2 = new Classeeeee();
        c1.Ligar();

        c1.Marca = "HIHIHIIH";
        c1.modelo = 1112222;
        System.out.println(c2.Marca);
        System.out.println(c2.modelo);
        c1.Desligar();
    }

}
