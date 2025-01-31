package organisation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {
    @Test
    @DisplayName("Simple test")
    public void test(){
        assertTrue(true);
    }

    @Test
    @DisplayName("Simple negative test")
    public void ntest(){
        assertTrue(false);
    }
}
