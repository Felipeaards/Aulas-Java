package Aula04;

public class CarroTeste {
    public static void main(String[] args){
        Carro c1 = new Carro();
        Carro c2 = new Carro("Volksvagen", "Gol",1963);
        Carro c3 = new Carro("Renault", "Brasília", 1972, "Roxo", (float) 44093.22);

        c1.setMarca("Jipe");
        c1.setModelo("4x4");
        c1.setAno(1963);
        c1.setPreco((float) 24432.33);
        c1.setCor("Azul");

        c2.setPreco((float) 22475.22);
        c2.setCor("Vermelho");
        c1.ExibirInfo();
        c2.ExibirInfo();
        c3.ExibirInfo();
    }
}
