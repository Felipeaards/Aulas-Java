package Aula03;

public class Personagens {

    //atributos
    private String nome;
    private int lvl;
    private int vida;


    //construtores
    public Personagens(){
        this.nome = "Novato";
        this.lvl = 1;
        this.vida = 100;
    }

    //contrutores parametrizados
    public Personagens(String nome, int lvl){ // Criando um "Personagem" público, com as variáveis a serem
        // recebidas sendo "String nome" e "int lvl", sendo variáveis locais
        this.nome = nome;
        this.lvl = lvl;
        this.vida = (int) (lvl * 54.25);
    }

    //getters and setters
    /*
    Gerar Getters and Setters de forma automática:
    1. Ctrl + Botão direito do mouse
    2. Generate
    3. Getters and Setters
    4. Selecionar todos e clicar em Generate
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    //outros métodos

    public void ExibirInfo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Nível: "+ lvl);
        System.out.println("HP: "+ vida);
    }

}
