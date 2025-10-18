//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import funcionarios.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        int opcao;

        do {
            System.out.println("==== SISTEMA DE FUNCIONÁRIOS ====");
            System.out.println("1 - Cadastrar Funcionário Comum");
            System.out.println("2 - Cadastrar Gerente");
            System.out.println("3 - Cadastrar Estagiário");
            System.out.println("4 - Listar Funcionários");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 1 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Horas trabalhadas: ");
                    double horas = sc.nextDouble();
                    System.out.print("Valor por hora: ");
                    double valor = sc.nextDouble();

                    funcionarios.add(new Funcionariocomum(id, nome, horas, valor));
                }
                case 2 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Horas trabalhadas: ");
                    double horas = sc.nextDouble();
                    System.out.print("Valor por hora: ");
                    double valor = sc.nextDouble();
                    System.out.print("Bônus: ");
                    double bonus = sc.nextDouble();

                    funcionarios.add(new Gerente(id, nome, horas, valor, bonus));
                }
                case 3 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Horas trabalhadas: ");
                    double horas = sc.nextDouble();
                    System.out.print("Valor por hora: ");
                    double valor = sc.nextDouble();

                    funcionarios.add(new Estagiario(id, nome, horas, valor));
                }
                case 4 -> {
                    System.out.println("\n=== LISTA DE FUNCIONÁRIOS ===");
                    for (Funcionario f : funcionarios) {
                        f.exibirinfo();
                }

                }
                case 0 -> System.out.println("Encerrando Processo...");
                default -> System.out.println("Opcão Inválida! Tente Novamente.");

        }}while (opcao != 0);
        sc.close();
    }
}