package com.example.jenkinsdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void greetUsesProvidedName() {
        assertEquals("Hello, Build", App.greet("Build"));
    }

    @Test
    void greetFallsBackForBlankName() {
        assertEquals("Hello, Jenkins", App.greet("   "));
    }

    @Test
    void greetFallsBackForNullName() {
        assertEquals("Hello, Jenkins", App.greet(null));
    }
}
