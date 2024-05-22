package com.aksys;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertEquals("Hello world!!", classUnderTest.getGreeting());
    }

    @Test
    void testMain() {
    	App.main(new String[]{});
        assertTrue(true);
    }
}
