package testes;

import funcionarios.Estagiario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EstagiarioTest {

    Estagiario estagiario;

    @BeforeEach
    void setup() {
        estagiario = new Estagiario(1, "João", 20, 15);
    }

    @Test
    void testCalcularSalario() {
        // 20 * 15 = 300 → 300 * 0.8 = 240
        assertEquals(240, estagiario.calcularSalario());
    }

    @Test
    void testGetId() {
        assertEquals(1, estagiario.getId());
    }
}
