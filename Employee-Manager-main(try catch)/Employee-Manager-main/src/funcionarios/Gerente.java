package funcionarios;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(int id, String nome, double horasTrabalhadas, double valorHora, double bonus) {
        super(id, nome, horasTrabalhadas, valorHora);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return (horasTrabalhadas * valorHora) + bonus;
    }
}
