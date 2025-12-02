package funcionarios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FuncionariocomumTest {

    @Test
    void testCalcularSalario() {
        // horasTrabalhadas = 40, valorHora = 22
        // cálculo: 40 * 22 = 880
        Funcionariocomum f = new Funcionariocomum(2, "Maria", 40, 22);

        double salario = f.calcularSalario();

        assertEquals(880, salario);
    }

    @Test
    void testGetId() {
        Funcionariocomum f = new Funcionariocomum(2, "Maria", 40, 22);

        assertEquals(2, f.getId());
    }
}
