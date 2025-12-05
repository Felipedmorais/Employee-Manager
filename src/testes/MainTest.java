package testes;

import funcionarios.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private ByteArrayOutputStream saidaConsole;

    @BeforeEach
    void setUp() {
        saidaConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaConsole));
    }

    // =============== TESTE 1 — Entrada de ID ==================
    @Test
    void testEntradaID() {
        Scanner sc = new Scanner("7");
        int id = Main.lerInteiro(sc);
        assertEquals(7, id);
    }

    // =============== TESTE 2 — Entrada de Nome ==================
    @Test
    void testEntradaNome() {
        Funcionariocomum f = new Funcionariocomum(1, "Felipe", 10, 20);
        assertEquals("Felipe", f.getNome());
    }

    // =============== TESTE 3 — Entrada Horas Trabalhadas ==================
    @Test
    void testEntradaHorasTrabalhadas() {
        Funcionariocomum f = new Funcionariocomum(1, "Ana", 40, 15);
        assertEquals(40, f.getHorasTrabalhadas());
    }

    // =============== TESTE 4 — Entrada Valor por Hora ==================
    @Test
    void testEntradaValorHora() {
        Funcionariocomum f = new Funcionariocomum(1, "Paulo", 30, 18.5);
        assertEquals(18.5, f.getValorHora());
    }

    // =============== TESTE 5 — Entrada Bonus ==================
    @Test
    void testEntradaBonusGerente() {
        Gerente g = new Gerente(1, "Marcos", 40, 20, 500);
        assertEquals(500, g.getBonus());
    }

    // =============== TESTE 6 — Teste exibirInfo ==================
    @Test
    void testExibirInfo() {
        Funcionario f = new Funcionariocomum(1, "João", 10, 10);
        f.exibirInfo();

        String output = saidaConsole.toString();
        assertTrue(output.contains("João"));
        assertTrue(output.contains("10"));
        assertTrue(output.contains("Salário"));
    }

    // =============== TESTE 7 — Listar Funcionários ==================
    @Test
    void testListarFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionariocomum(1, "João", 10, 10));

        for (Funcionario f : funcionarios) {
            f.exibirInfo();
        }

        String output = saidaConsole.toString();
        assertTrue(output.contains("João"));
        assertTrue(output.contains("10"));
    }

    // =============== TESTE 8 — Total da Folha ==================
    @Test
    void testTotalFolha() {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionariocomum(1, "João", 10, 10)); //100
        funcionarios.add(new Estagiario(2, "Ana", 10, 10));        //80
        funcionarios.add(new Gerente(3, "Paulo", 10, 10, 50));     //150

        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.calcularSalario();
        }

        assertEquals(330, total);
    }
}
