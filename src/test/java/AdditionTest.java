import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AdditionTest {
    @Test
    void testSimpleAddition() {
        assertEquals(13, Addition.sum(10, 3));
    }

    @Test
    void testThrowsExceptionWhenDividingByZero() {
        assertThrows(ArithmeticException.class, () -> Addition.divide(10, 0));
    }
}