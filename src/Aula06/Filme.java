package Aula06;

public class Filme extends Conteudo{ //Extends = é estendido

    private boolean oscar;

    public Filme(String titulo, String genero, int duracaoMinutos, boolean oscar) { //Aqui é obrigado que sejam todas as informações do construtor de "Conteudo"
        super(titulo, genero, duracaoMinutos); //Super vem de SuperClasse
        this.oscar = oscar;
    }

    public boolean isOscar() {
        return oscar;
    }

    public void setOscar(boolean oscar) {
        this.oscar = oscar;
    }

    public void exibirDetalhes(){
        System.out.println("--------------EXIBIR DETALHES------------");

        //O metodo get está sendo utilizado pois o atributo é privado em outra classe, mesmo sendo herdado
        System.out.println("Título: "+ this.getTitulo());
        System.out.println("Gênero: "+ this.getGenero());
        System.out.println("Duração: "+ this.getDuracaoMinutos());
        if (this.oscar){
            System.out.println("Esse Filme indicado para o Oscar!");
        } else{
            System.out.println("Esse filme não foi indicado para o Oscar");
        }
    }
}
