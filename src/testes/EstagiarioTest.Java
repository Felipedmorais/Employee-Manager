package funcionarios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EstagiarioTest {

    @Test
    void testCalcularSalario() {
        // horasTrabalhadas = 20, valorHora = 15
        // cálculo: (20 * 15) * 0.8 = 240
        Estagiario e = new Estagiario(1, "João", 20, 15);

        double salario = e.calcularSalario();

        assertEquals(240, salario);
    }

    @Test
    void testGetId() {
        Estagiario e = new Estagiario(1, "João", 20, 15);

        assertEquals(1, e.getId());
    }
}
