package com.aksys;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testHelloWorld() {
        App app = new App();
        assertEquals("Hello world!!!", app.helloWorld());
    }

    @Test
    void testMain() {
    	App.main(new String[]{});
        assertTrue(true);
    }
}
