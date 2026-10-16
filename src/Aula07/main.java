package Aula07;

public class main {
    //Metodo que aceita qualquer tipo de notificação (SMS, Email), sendo isso o Polimorfismo
    public static void dispararAlarme(Notificacao notificacao){
        System.out.println("\n [SISTEMA DE ALERTA]");
        notificacao.enviar(); //O java decide em tempo de execução qual metodo enviar será usado
    }


    public static void main(String[] args){
        //Isso é um objeto com o molde de notificação, mas com a especialização de Email
        //Em termos técnicos, definição de tipo Generics (Notificação) apontando para instâncias específicas
        Notificacao n1 = new Email("aluno@fiap.com", "Atividade Entrege", "Aviso importante");
        Notificacao n2 = new SMS("11940028922", "Você ganhou a bolsa");

        //Chamada Direta
        n1.enviar();
        System.out.println("---------------------------------------------------");
        n2.enviar();
        //Ele está sabendo qual metodo "enviar" ele esta chamando devido ao Override, sendo parte do Polimorfismo

        //Usando o metodo polimorfico sem condicionais
        dispararAlarme(n1);//Estamos passando o objeto "n1" para a função "disparar alarme".
        dispararAlarme(n2);


        //Usando o metodo polimorfico com condicionais simples
        //1 - Enviar Email
        //2 - Enviar SMS
        int tipo = 1;
        Notificacao notificaoEscolhida = null;

        if(tipo == 1){
            notificaoEscolhida = new Email("Alunoffff", "HIHIHIHIHIHI", "AAAAAAAAAAAAA");
        } else if (tipo == 2){
            notificaoEscolhida = new SMS("11111", "Não tô entendendo nadaaaa");
        }

        //Não importa o tipo do dado (Email, SMS), ele ainda vai escolher o metodo de enviar correto
        dispararAlarme(notificaoEscolhida);
    }
}
