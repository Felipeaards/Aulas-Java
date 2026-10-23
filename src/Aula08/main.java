package Aula08;

public class main {
    public static void main(String[] args){

        //1. Tentativa de instanciar a classe voluntária
        //Voluntario vv = new Voluntario("nnn","adaada") ----- Não dá certo, o código nem inicia

        //2. Criando instancias das classes concretas

        DentistaVoluntario dentista01 = new DentistaVoluntario("Dr. João", "João@email.com", "SP-123456", 3);
        EducadorVoluntario educador01 = new EducadorVoluntario("Marcos", "Marcos@gmail.com", 3);


//        System.out.println("----------Voluntário 01------------");
//        System.out.println(dentista01.getInfo());
//        dentista01.realizarAcao();
//        System.out.println("Horas: "+dentista01.calcularHorasDedicadas() + "h\n");
//
//
//        System.out.println("----------Voluntário 02------------");
//        System.out.println(educador01.getInfo());
//        educador01.realizarAcao();
//        System.out.println("Horas: "+educador01.calcularHorasDedicadas() + "h\n");

        imprimirRelatorio(dentista01); //Não tem o objeto no começo "dentista01.imprimirRelatório()" por que
        // o metodo "imprimirRelatorio()" é do tipo "STATIC", por isso não precisa do objeto
        imprimirRelatorio(educador01);


    }

    //Metodo Polimorfico: recebe a classe abstrata como parâmetro
    public static void imprimirRelatorio(Voluntario v){
        System.out.println("---------Relatório----------");
        System.out.println(v.getInfo());
        v.realizarAcao(); // Executa o comportamento específico da subclasse
        System.out.println("Horas: "+v.calcularHorasDedicadas() + "h\n");
        System.out.println("----------------------------------------------------------------------\n");
    }
}
