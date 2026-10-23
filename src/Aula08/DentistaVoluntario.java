package Aula08;

public class DentistaVoluntario extends Voluntario{
    //DentistaVolntário deve implementar os metodos abstratos da classe abstrata Voluntario
    private String cro;
    private int consultasRealizadas;

    public DentistaVoluntario(String nome, String email, String cro, int consultasRealizadas) {
        this.cro = cro;
        this.consultasRealizadas = consultasRealizadas;
        super(nome, email);
    }

    @Override
    public void realizarAcao() {
        System.out.println("Realizando atendimento com o CRO: "+ this.cro);
    }

    @Override
    public double calcularHorasDedicadas() {
        return this.consultasRealizadas * 1.5; //Média de atendimentos em horas
    }
}
