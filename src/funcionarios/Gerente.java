package funcionarios;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(int id, String nome, double horasTrabalhadas, double valorHora, double bonus) {
        super(id, nome, horasTrabalhadas, valorHora);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        // Gerente ganha o salário base + bônus
        return (horasTrabalhadas * valorHora) + bonus;
    }

    public double getBonus() {
        return bonus;
    }

}
