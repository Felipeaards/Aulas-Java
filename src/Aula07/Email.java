package Aula07;

public class Email extends Notificacao{
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto){
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override //Basicamente uma mensagem para o java dizendo que:
    //Existe essa classe também dentro da SuperClasse, mas não queremos que as duas apareçam
    //Precisamos que o metodo do Email entre no lugar do metodo da superclasse
    //Com esse comando, ele não vai duplicar o metodo e vai sobrescrever DURANTE a execução
    //Isso é chamado de Polimorfismo
    public void enviar(){
        System.out.println("-----------Enviando Email----------");
        System.out.println("Assunto: "+ this.getAssunto());
        System.out.println("Destinatário: "+ this.getDestinatario());
        System.out.println("Mensagem: "+ this.getMensagem());
    }

}
