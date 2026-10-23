package Aula08;

public abstract class Voluntario {
    //O ABSTRACT DEFINE QUE ELA É DO TIPO ABSTRATO
    //tentar criar um objeto dela (Instanciar) vai dar erro de compilação
    private String nome;
    private String email;

    public Voluntario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Metodos concretos: Compartilhado por todas as subclasses. Um metodo normal

    public String getInfo(){
        return "Nome: " + this.nome + " | Email: " + this.email;
    }

    //Métodos Abstratos: Não tem corpo (Implementação/código), é vazio, sem chaves
    //Eles obrigam qualquer classe filha concreta a implementar a lógica específica desse metodo, respeitando a assinatura


    public abstract void realizarAcao(); // Essa é a assinatura do metodo. Todas as subclasses DEVEM utilizar
    //esse metodo, mas devem ter sas próprias lógicas.

    public abstract double calcularHorasDedicadas(); // Aqui diz o que será feito, não como (Assinatura e lógica)



}
