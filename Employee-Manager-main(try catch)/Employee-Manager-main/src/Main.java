import funcionarios.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        int opcao = -1;

        while (opcao != 0) {

            System.out.println("==== SISTEMA DE FUNCIONÁRIOS ====");
            System.out.println("1 - Cadastrar Funcionário Comum");
            System.out.println("2 - Cadastrar Gerente");
            System.out.println("3 - Cadastrar Estagiário");
            System.out.println("4 - Listar Funcionários");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiroPositivo(sc);

            switch (opcao) {
                case 1 -> cadastrarFuncionarioComum(sc, funcionarios);
                case 2 -> cadastrarGerente(sc, funcionarios);
                case 3 -> cadastrarEstagiario(sc, funcionarios);
                case 4 -> listar(funcionarios);
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }

    public static int lerInteiroPositivo(Scanner sc) {
        while (true) {
            try {
                int num = sc.nextInt();
                sc.nextLine();
                if (num < 0) {
                    System.out.print("Erro: o valor não pode ser negativo. Digite novamente: ");
                    continue;
                }
                return num;
            } catch (InputMismatchException e) {
                System.out.print("Erro: digite um número inteiro válido: ");
                sc.nextLine();
            }
        }
    }

    public static double lerDoublePositivo(Scanner sc) {
        while (true) {
            try {
                double num = sc.nextDouble();
                sc.nextLine();
                if (num < 0) {
                    System.out.print("Erro: o valor não pode ser negativo. Digite novamente: ");
                    continue;
                }
                return num;
            } catch (InputMismatchException e) {
                System.out.print("Erro: digite um número válido: ");
                sc.nextLine();
            }
        }
    }

    public static double lerHorasValidas(Scanner sc) {
        while (true) {
            double horas = lerDoublePositivo(sc);
            if (horas > 24) {
                System.out.print("Erro: horas inválidas (máx 24). Digite novamente: ");
                continue;
            }
            return horas;
        }
    }

    public static void cadastrarFuncionarioComum(Scanner sc, List<Funcionario> funcionarios) {
        System.out.print("ID: ");
        int id = lerInteiroPositivo(sc);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Horas trabalhadas: ");
        double horas = lerHorasValidas(sc);

        System.out.print("Valor por hora: ");
        double valor = lerDoublePositivo(sc);

        funcionarios.add(new Funcionariocomum(id, nome, horas, valor));
    }

    public static void cadastrarGerente(Scanner sc, List<Funcionario> funcionarios) {
        System.out.print("ID: ");
        int id = lerInteiroPositivo(sc);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Horas trabalhadas: ");
        double horas = lerHorasValidas(sc);

        System.out.print("Valor por hora: ");
        double valor = lerDoublePositivo(sc);

        System.out.print("Bônus: ");
        double bonus = lerDoublePositivo(sc);

        funcionarios.add(new Gerente(id, nome, horas, valor, bonus));
    }

    public static void cadastrarEstagiario(Scanner sc, List<Funcionario> funcionarios) {
        System.out.print("ID: ");
        int id = lerInteiroPositivo(sc);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Horas trabalhadas: ");
        double horas = lerHorasValidas(sc);

        System.out.print("Valor por hora: ");
        double valor = lerDoublePositivo(sc);

        funcionarios.add(new Estagiario(id, nome, horas, valor));
    }

    public static void listar(List<Funcionario> funcionarios) {
        System.out.println("\n=== LISTA DE FUNCIONÁRIOS ===");
        for (Funcionario f : funcionarios) {
            f.exibirinfo();
        }
    }
}
