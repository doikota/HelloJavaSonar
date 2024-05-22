package com.aksys;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testGreeting() {
        App app = new App();
        assertEquals("Hello world!!", app.greeting());
    }

    @Test
    void testMain() {
    	App.main(new String[]{});
        assertTrue(true);
    }
}
