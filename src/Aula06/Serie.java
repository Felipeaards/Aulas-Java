package Aula06;

public class Serie extends Conteudo{

    private int totalTemporadas;

    public Serie(String titulo, String genero, int duracaoMinutos, int totalTemporadas) {
        super(titulo, genero, duracaoMinutos);
        this.totalTemporadas = totalTemporadas;
    }


    public int getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(int totalTemporadas) {
        if (totalTemporadas > 0){
            this.totalTemporadas = totalTemporadas;
        } else{
            System.out.println("Erro: Não foi possível definir o número de temporadas");
        }
    }

    public void exibirDetalhes(){
        System.out.println("--------------EXIBIR DETALHES------------");

        //O metodo get está sendo utilizado pois o atributo é privado em outra classe, mesmo sendo herdado
        System.out.println("Título: "+ this.getTitulo());
        System.out.println("Gênero: "+ this.getGenero());
        System.out.println("Duração: "+ this.getDuracaoMinutos());
        System.out.println("Temporadas: "+ this.totalTemporadas);
    }
}
