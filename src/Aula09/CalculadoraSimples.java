package Aula09;

import java.util.Scanner;

public class CalculadoraSimples {

    public int menu(){
        Scanner input = new Scanner(System.in);

        System.out.println("----------------- Menu Principal-----------------");
        System.out.println("Opções:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");;
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("Selecione sua opção");
        int opcao = input;
    }

    public float entradaDados(){

    }

    public float soma(float n1,float n2){
        System.out.println("----------------- Soma -----------------");
        return n1+n2;
    }

    public float subtracao(float n1, float n2){
        System.out.println("----------------- Subtração -----------------");
        return n1-n2;
    }

    public float multiplicacao(float n1, float n2){
        System.out.println("----------------- Multiplicação -----------------");
        return n1*n2;
    }

    public float divisao(float n1, float n2){
        System.out.println("----------------- Divisão -----------------");
        return n1/n2;
    }


    public void imprimir(float result){
        System.out.println("----------------- Imprimir -----------------");
        System.out.println("Resultado: "+ result);
    }

    public float controlador(int opcao, float n1, float n2){
        System.out.println("----------------- Imprimir -----------------");

        float resultado = 0;
        switch (opcao){
            case 1:
                resultado = n1 + n2;
                break;
            case 2:
                resultado = n1 - n2;
                break;
            case 3:
                resultado = n1 * n2;
                break;
            case 4:
                resultado = n1 / n2;
                break;
            default:
                break;
        }
        return resultado;
    }
}
