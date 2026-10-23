package Aula08;

public class EducadorVoluntario extends Voluntario{
    private int oficinasMinistradas;


    public EducadorVoluntario(String nome, String email, int oficinasMinistradas) {
        this.oficinasMinistradas = oficinasMinistradas;
        super(nome, email);
    }

    public int getOficinasMinistradas() {
        return oficinasMinistradas;
    }

    public void setOficinasMinistradas(int oficinasMinistradas) {
        this.oficinasMinistradas = oficinasMinistradas;
    }

    @Override
    public void realizarAcao() {
        System.out.println("Ministrando oficina de higiene bucal e prevenção");
    }

    @Override
    public double calcularHorasDedicadas() {
        return this.oficinasMinistradas * 2; // Média de duas horas por oficina
    }


}
