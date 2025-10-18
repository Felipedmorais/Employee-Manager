package funcionarios;

public class Estagiario extends Funcionario {
    public Estagiario(int id, String nome, double horasTrabalhadas, double valorHora) {
        super(id, nome, horasTrabalhadas, valorHora);
    }
    @Override
    public double calcularSalario(){
        return (horasTrabalhadas * valorHora) *  0.8;
    }
}
