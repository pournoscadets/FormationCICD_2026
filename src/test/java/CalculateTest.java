import org.example.CalculateImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {
    @Test
    void testSum() {
        CalculateImpl calc = new CalculateImpl();
        assertEquals(5.0, calc.sum(2.0, 3.0));
    }

    @Test
    void testMultiply() {
        CalculateImpl calc = new CalculateImpl();
        assertEquals(6.0, calc.multiply(2.0, 3.0));
    }
}

