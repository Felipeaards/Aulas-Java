package Aula02;

/*
 Encapsulamento
 -Private -> Nível mais restrito o possíel, sem dar acesso externo aos
 atributos (Métodos com funções públicas para eles serem usados)

 -Protected

 -Public -> Público, podendo ser acessado por todas as classes
 */

import java.sql.SQLOutput;

public class Televisao {
    /* Anterior:
    int canal; //O valor padrão é 0, a não ser que seja declarado especificamente num novo objeto
    int volume;
    boolean ligado; //O valor padrão é False, a não ser que seja declarado especificamente num novo objeto
    String aaaa; //O valor padrão é Null, a não ser que seja declarado especificamente num novo objeto

     */
    private int canal; //Colocando esse "private" no início, esse atributo fica privado e não pode ser acessado
                       //em outras classes. Nele diz que deu 3 problemas é por quê estou tentando usar em outra classe
    private int volume;
    private boolean ligado;
    private String marca = "SamgSumg";


    //Métodos de acesso - getters()

    public int getCanal(){ //"public" para poder ser acessado por outras classes. "int" pois precisa ter o mesmo tipo da variável

        return canal;
    }
    public int getVolume(){

        return volume;
    }
    public boolean getLigado(){

        return ligado;
    }
    public String getMarca(){

        return marca;
    }

    //Modificadores setters()
    // o "canal" poderia ser qualquer nome. Dentro do parâmetro está sendo criada uma variável para receber os dados. Está passando uma informação
    public void setCanal(int canal){ //"void" não retorna nenhum tipo de informação. Dentro dos parenteses está declarando a variável. É um parâmetro
                            //Informação que vem de fora da classe para ele atribuir essa informação na classe
        if(ligado){
            if(canal>=0 && canal<=500) {
                this.canal = canal;//"this" = Desta classe. O canal da classe recebe como parâmetro (Explicar o quê ele recebe)
                System.out.println("Canal alterado para " + this.canal);
            } else{
                System.out.println("O Canal escolhido não existe, escolha um na faixa de 01 a 500");
            }
        }else {
            System.out.println("Não é possível alterar o canal pois a TV está desligada");
        }

                           //"canal" em rosa é o da variável
                           //O canal branco é onde está sendo recebido o novo valor da variável quando a função é chamada

    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void ligar(){
        this.ligado = !this.ligado; //Inverte o valor do boolean (não sei se é isso kkk)
        if(ligado){ // Não entendi, seria por quê o só existem dois tipos de valores para boolean, positivo (O que entra no if) e negativo ( o que vai pro else)? Mas onde diz que o if será ativado se for verdadeiro?
            System.out.println(">>>>> TV Ligada!!");
            } else {
                System.out.println(">>>>> TV Desligada!!");
            }
        }
    }
