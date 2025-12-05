package funcionarios;

public abstract class Funcionario {
    protected int id;
    protected String nome;
    protected double horasTrabalhadas;
    protected double valorHora;

    public Funcionario(int id, String nome, double horasTrabalhadas, double valorHora) {
        this.id = id;
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public abstract double calcularSalario();

    public void exibirInfo() {
        System.out.println("Cargo: " + getClass().getSimpleName());
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor Hora: " + valorHora);
        System.out.println("Salário: " + calcularSalario());
        System.out.println("--------------------------");
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

}

