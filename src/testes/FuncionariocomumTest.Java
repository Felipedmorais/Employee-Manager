package testes;

import funcionarios.Funcionariocomum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionariocomumTest {

    Funcionariocomum funcionario;

    @BeforeEach
    void setup() {
        funcionario = new Funcionariocomum(3, "Carlos", 30, 20);
    }

    @Test
    void testCalcularSalario() {
        // 30 * 20 = 600
        assertEquals(600, funcionario.calcularSalario());
    }

    @Test
    void testGetId() {
        assertEquals(3, funcionario.getId());
    }
}
