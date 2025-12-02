package funcionarios;

public class Funcionariocomum extends Funcionario {

    public Funcionariocomum(int id, String nome, double horasTrabalhadas, double valorHora) {
        super(id, nome, horasTrabalhadas, valorHora);
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}
