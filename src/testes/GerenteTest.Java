package funcionarios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GerenteTest {

    @Test
    void testCalcularSalario() {
        // horasTrabalhadas = 40, valorHora = 50, bonus = 500
        // cálculo: (40 * 50) + 500 = 2500
        Gerente g = new Gerente(3, "Carlos", 40, 50, 500);

        double salario = g.calcularSalario();

        assertEquals(2500, salario);
    }

    @Test
    void testGetId() {
        Gerente g = new Gerente(3, "Carlos", 40, 50, 500);

        assertEquals(3, g.getId());
    }
}
