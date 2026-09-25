package Aula05;

public class TesteControleRemoto {
    public static void main(String[] args){
        //Criar um objeto do Controle Remoto
        ControleRemoto controle1 = new ControleRemoto();
        System.out.println("-------- Controle Remoto criado --------");
        System.out.println("Estado: "+ controle1.getStatus());
        System.out.println("Volume: "+ controle1.getVolume());
        System.out.println("----------------------------------------");
        System.out.println("Teste 01");
        controle1.setVolume(45);
        System.out.println("Volume: "+ controle1.getVolume());
        System.out.println("Teste 02");
        System.out.println("----------------------------------------");
        controle1.ligar();
        System.out.println("Teste 03");
        System.out.println("----------------------------------------");
        controle1.aumentar();
        controle1.ligar();
        controle1.aumentar();
        controle1.ligar();
        controle1.aumentar();
        controle1.aumentar();
        controle1.diminuir();
        controle1.diminuir();
        controle1.diminuir();
        System.out.println("Teste 04");
        System.out.println("----------------------------------------");
        controle1.setCanal(499);
        controle1.aumentarCanal();
        controle1.aumentarCanal();
        controle1.aumentarCanal();
        controle1.aumentarCanal();
        controle1.diminuirCanal();
        controle1.diminuirCanal();
        controle1.diminuirCanal();
        controle1.diminuirCanal();
        controle1.diminuirCanal();
        controle1.diminuirCanal();
        controle1.diminuirCanal();
        controle1.aumentarCanal();
        controle1.aumentarCanal();
        controle1.aumentarCanal();
        controle1.aumentarCanal();
        controle1.aumentarCanal();
        controle1.aumentarCanal();
        controle1.diminuirCanal();
        controle1.diminuirCanal();
        controle1.diminuirCanal();
        controle1.aumentarCanal();
        controle1.aumentarCanal();
        controle1.aumentarCanal();

    }
}