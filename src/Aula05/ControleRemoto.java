package Aula05;

public class ControleRemoto {
    //1. Definir atributos
    private boolean status = true;
    private int volume = 0;
    private int canal = 1;

    //2. Construtores

    public ControleRemoto() {
        this.status = false;
        this.volume = 10;
    }

    public ControleRemoto(boolean status, int volume) {
        this.status = status;
        this.volume = volume;
    }


    //3. Getters e Setters
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume alterado para " + volume);
        } else {
            System.out.println("Volume Inválido");
        }
    }

    public int getCanal() {
        return volume;
    }

    public void setCanal(int canal) {
        if (canal > 0 && canal <= 500) {
            this.canal = canal;
            System.out.println("Canal alterado para " + canal);
        } else {
            System.out.println("Canal Inválido");
        }
    }


    //4. Métodos Operacionais - Lógica Condicional

    //Metodo mudo
    public void mudo(){
        this.volume = 0;
    }

    public void ligar(){
        this.status = !this.status;
        if(this.status){
            System.out.println("A tv está ligada!!");
        } else{
            System.out.println("A tv está desligada!!");
        }
    }

    public void aumentar() {
        if (status == true) {
            if (volume < 100) {
                this.volume = this.volume + 1;
                System.out.println("Volume: " + this.volume);
            } else{
                System.out.println("O Volume já está no máximo!!");
            }
        } else {
            System.out.println("A tv está desligada!!");
        }
    }
    public void diminuir() {
        if (status == true) {
            if (volume > 0) {
                this.volume = this.volume - 1;
                System.out.println("Volume: " + this.volume);
            } else{
                System.out.println("O Volume já está no mudo!!");
            }
        } else {
            System.out.println("A tv está desligada!!");
        }
    }


    public void aumentarCanal() {
        if (status == true) {
            if (canal < 500) {
                this.canal = this.canal + 1;

                System.out.println("Canal: " + this.canal);
            } else{
                this.canal = 1;
                System.out.println("Canal: " + this.canal);
            }
        } else {
            System.out.println("A tv está desligada!!");
        }
    }
    public void diminuirCanal() {
        if (status == true) {
            if (canal > 1) {
                this.canal = this.canal - 1;
                System.out.println("Canal: " + this.canal);
            } else{
                this.canal = 500;
                System.out.println("Canal: " + this.canal);
            }
        } else {
            System.out.println("A tv está desligada!!");
        }
    }
}