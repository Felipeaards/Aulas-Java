package Aula03;

public class TestePersonagens {
    public static void main (String[] args){

        //Construtor padrão
        Personagens p1 = new Personagens();
        Personagens p2 = new Personagens();

        //Construtor parametrizado
        Personagens p3 = new Personagens("Roger", 954);
        Personagens p4 = new Personagens("Sparda", 294);


//        System.out.println("Dados do Objeto p1");
//        System.out.println("Nome: "+ p1.getNome());
//        System.out.println("Nível: "+ p1.getLvl());
//        System.out.println("HP: "+ p1.getVida());

        p1.ExibirInfo();

        System.out.println("-----------------------------------------------------------------------------");

//        System.out.println("Dados do Objeto p2");
//        System.out.println("Nome: "+ p2.getNome());
//        System.out.println("Nível: "+ p2.getLvl());
//        System.out.println("HP: "+ p2.getVida());

        p2.ExibirInfo();


        System.out.println("-----------------------------------------------------------------------------");

//        System.out.println("Dados do Objeto p3");
//        System.out.println("Nome: "+ p3.getNome());
//        System.out.println("Nível: "+ p3.getLvl());
//        System.out.println("HP: "+ p3.getVida());
        p3.ExibirInfo();


        System.out.println("-----------------------------------------------------------------------------");

//        System.out.println("Dados do Objeto p4");
//        System.out.println("Nome: "+ p4.getNome());
//        System.out.println("Nível: "+ p4.getLvl());
//        System.out.println("HP: "+ p4.getVida());

        p4.ExibirInfo();

    }
}
