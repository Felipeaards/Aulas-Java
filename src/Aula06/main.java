package Aula06;

public class main {
    public static void main(String[] args){

        //Instanciar e testar o filme
        Filme filme1 = new Filme("Parasita", "Suspense", 240, true);
        filme1.exibirDetalhes();
        filme1.darPlay();

        Serie serie1 = new Serie("Arcane", "Drama", 50, 2);
        serie1.exibirDetalhes();
        serie1.darPlay();
    }
}
