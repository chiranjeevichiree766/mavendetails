package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void testAdd() {
        App app = new App();
        int result = app.add(2, 2);
        assertEquals(4, result); // Update the expected value to 4
    }
}
