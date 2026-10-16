package Aula07;

public class SMS extends Notificacao{
    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    public void enviar(){
        System.out.println("Enviando SMS....");
        System.out.println("Celular: "+ getDestinatario());
        System.out.println("Mensagem:"+ getMensagem());
    }

}
