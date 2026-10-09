package Aula06;

public class Conteudo {
    //Atributos
    private String titulo;
    private String genero;
    private int duracaoMinutos;

    public Conteudo(String titulo, String genero, int duracaoMinutos){
        this.titulo = titulo;
        this.genero = genero;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        if (duracaoMinutos > 0) {
            this.duracaoMinutos = duracaoMinutos;
        } else {
            System.out.println("ERRO: Duração negativa não é permitida");
        }
    }

    public void darPlay(){
        System.out.println("Conteúdo iniciado!");
    }

}
