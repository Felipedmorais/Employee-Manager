package funcionarios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n -------- Employee Manager --------");
            System.out.println("1 Cadastrar funcionário comum");
            System.out.println("2 Cadastrar gerente");
            System.out.println("3 Cadastrar estagiário");
            System.out.println("4 Listar funcionários");
            System.out.println("0 Sair");
            System.out.print("Opção: ");

            opcao = lerInteiro(sc);

            switch (opcao) {

                case 1 -> {
                    System.out.println("\n -------- Cadastro Funcionário Comum --------");

                    System.out.print("ID: ");
                    int id = lerInteiro(sc);

                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Horas trabalhadas: ");
                    double horas = lerDouble(sc);

                    System.out.print("Valor por hora: ");
                    double valorHora = lerDouble(sc);

                    funcionarios.add(new Funcionariocomum(id, nome, horas, valorHora));
                    System.out.println("-------- Cadastro realizado. --------");
                }

                case 2 -> {
                    System.out.println("\n -------- Cadastro Gerente --------");

                    System.out.print("ID: ");
                    int id = lerInteiro(sc);

                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Horas trabalhadas: ");
                    double horas = lerDouble(sc);

                    System.out.print("Valor por hora: ");
                    double valorHora = lerDouble(sc);

                    System.out.print("Bônus: ");
                    double bonus = lerDouble(sc);

                    funcionarios.add(new Gerente(id, nome, horas, valorHora, bonus));
                    System.out.println("-------- Cadastro realizado. --------");
                }

                case 3 -> {
                    System.out.println("\n -------- Cadastro Estagiário --------");

                    System.out.print("ID: ");
                    int id = lerInteiro(sc);

                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Horas trabalhadas: ");
                    double horas = lerDouble(sc);

                    System.out.print("Valor por hora: ");
                    double valorHora = lerDouble(sc);

                    funcionarios.add(new Estagiario(id, nome, horas, valorHora));
                    System.out.println("-------- Cadastro realizado. --------");
                }

                case 4 -> {
                    System.out.println("\n -------- Lista de Funcionários --------");
                    if (funcionarios.isEmpty()) {
                        System.out.println("-------- Nenhum funcionário cadastrado. --------");
                    } else {
                        double total = 0;
                        for (Funcionario f : funcionarios) {
                            f.exibirInfo();
                            total += f.calcularSalario();
                        }
                        System.out.printf("Total da folha: R$ %.2f\n", total);
                        System.out.println("Quantidade cadastrada: " + funcionarios.size());
                    }
                }

                case 0 -> System.out.println("-------- Encerrando Processo... --------");

                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }

    public static int lerInteiro(Scanner sc) {
        while (true) {
            try {
                int num = sc.nextInt();
                return num;
            } catch (InputMismatchException e) {
                System.out.print("Erro: digite um número inteiro válido: ");
                sc.nextLine();
            }
        }
    }

    public static double lerDouble(Scanner sc) {
        while (true) {
            try {
                double num = sc.nextDouble();
                return num;
            } catch (InputMismatchException e) {
                System.out.print("Erro: digite um número válido: ");
                sc.nextLine();
            }
        }
    }
}