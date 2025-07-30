package com.example;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OperationsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    
    @DisplayName("Este test realiza la validacion para que el metodo MakeFormula no retorne un valor no nulo")
    @Test
    void testMakeFormulaRetornoNoNulo() {
        String formula = Operations.MakeFormula();
        assertNotNull(formula);

    }
    @DisplayName("Este test realiza la validacion para que comience con un numero")
    @Test
    void testMakeFormulaComienzaConNumero() {
        String formula = Operations.MakeFormula();
        char firstChar = formula.charAt(0);
        assertTrue(Character.isDigit(firstChar), "La fórmula no comienza con un dígito.");
    }

    @DisplayName("Este test realiza la validacion para que el metodo MakeFormula no retorne un valor vacio")
    @Test
    void testMakeFormulaRetornoNoVacio() {
        String formula = Operations.MakeFormula();
        assertFalse(formula.isEmpty());
    }




    @Test
    void solve() {
    }

}