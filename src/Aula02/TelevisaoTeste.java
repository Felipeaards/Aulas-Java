package Aula02;

public class TelevisaoTeste {
    public static void main(String[] args){
        System.out.println("Minha Televisão");

        //Criação do Objeto TV
        Televisao TV1 = new Televisao();

        System.out.println("Objeto: " + TV1);// Apenas verifica se o objeto foi criado na memória, dando um hexadecimal de suas coordenadas
        System.out.println("Canal: " + TV1.getCanal());
        System.out.println("Volume: " + TV1.getVolume());
        System.out.println("Ligado: " + TV1.getLigado());
        System.out.println("Marca: "+ TV1.getMarca());


        System.out.println("--------------------------------------------------------------------------");
        //Alterando os atributos padrões do modelo Televisao no objeto TV1
        //TV1.canal = 5;
        TV1.setCanal(501);
        //TV1.volume = 15;
        TV1.setVolume(15);
        //TV1.ligado = true;
        TV1.setLigado(true);
        TV1.setMarca("TshangTshung");
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Canal: " + TV1.getCanal());
        System.out.println("Volume: " + TV1.getVolume());
        System.out.println("Ligado: " + TV1.getLigado());
        System.out.println("Marca: "+ TV1.getMarca());
    }
}
