package Aula07;

public class Notificacao {
    private String destinatario;
    private String mensagem;

    public Notificacao(String destinatario, String mensagem){
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    //Comportamento genérico (Pois está na SuperClasse, sem especificar). Será sobrescrito
    // em tempo de execução (Overrite)
    public void enviar(){
        System.out.println("Mensagem enviada para "+ this.getDestinatario());
    }

}
