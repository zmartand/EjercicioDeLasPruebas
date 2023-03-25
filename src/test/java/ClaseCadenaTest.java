import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClaseCadenaTest {

    @Test
    public void devuelveInicialesConNombreCompletoValido() {
        String iniciales = ClaseCadena.DevuelveIniciales("Andreas Dulac");
        assertEquals("A.D.", iniciales);
    }

    @Test
    public void devuelveInicialesConNombreIncompleto() {
        String iniciales = ClaseCadena.DevuelveIniciales("Andreas");
        assertEquals("A.", iniciales);
    }

    @Test
    public void devuelveInicialesConArgumentoNulo() {
        String iniciales = ClaseCadena.DevuelveIniciales(null);
        assertEquals("", iniciales);
    }

    @Test
    public void devuelveInicialesConArgumentoVacio() {
        String iniciales = ClaseCadena.DevuelveIniciales("");
        assertEquals("", iniciales);
    }

    @Test
    public void devuelveInicialesConNombreCompletoEnMinusculas() {
        String iniciales = ClaseCadena.DevuelveIniciales("andreas dulac");
        assertEquals("A.D.", iniciales);
    }

}