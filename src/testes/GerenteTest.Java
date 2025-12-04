package testes;

import funcionarios.Gerente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    Gerente gerente;

    @BeforeEach
    void setup() {
        gerente = new Gerente(2, "Maria", 40, 30, 500);
    }

    @Test
    void testCalcularSalario() {
        // (40 * 30) + 500 = 1700
        assertEquals(1700, gerente.calcularSalario());
    }

    @Test
    void testGetId() {
        assertEquals(2, gerente.getId());
    }
}
