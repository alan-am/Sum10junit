package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void makeFormula(){

    }
    @Test
    void testMakeFormulaRetornoNoNulo() {
        String formula = Operations.MakeFormula();
        assertNotNull(formula);
        assertFalse(formula.isEmpty());
    }
    @Test
    void testMakeFormulaComienzaConNumero() {
        String formula = Operations.MakeFormula();
        char firstChar = formula.charAt(0);
        assertTrue(Character.isDigit(firstChar), "La fórmula no comienza con un dígito.");
    }

    




    @Test
    void solve() {
    }

}