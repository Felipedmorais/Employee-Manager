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

    public void exibirinfo(){
        System.out.println("ID: "+ id );
        System.out.println("Nome: " + nome);
        System.out.println(("Horas Trabalhadas: " + horasTrabalhadas));
        System.out.println("Valor hora: "+ valorHora);
        System.out.println("Sálario: "+ calcularSalario());
        System.out.println("--------------------------");
    }

    public int getId(){
        return id;
    }
}
