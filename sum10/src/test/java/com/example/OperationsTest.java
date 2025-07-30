package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    @DisplayName("Evalúa correctamente operaciones de suma básica")
    void testSolve1() {
        String resultado = Operations.Solve("2+3");
        assertEquals("2+3=5", resultado);
    }

    @Test
    @DisplayName("Evalúa correctamente operaciones de resta básica")
    void testSolve2() {
        String resultado = Operations.Solve("5-2");
        assertEquals("5-2=3", resultado);
    }

    @Test
    @DisplayName("Evalúa correctamente operaciones de multiplicación básica")
    void testSolve3() {
        String resultado = Operations.Solve("4*3");
        assertEquals("4*3=12", resultado);
    }

    @Test
    @DisplayName("Evalúa correctamente operaciones de división básica")
    void testSolve4() {
        String resultado = Operations.Solve("8/2");
        assertEquals("8/2=4", resultado);
    }

    @Test
    @DisplayName("Respeta la precedencia de operadores: multiplicación antes que suma")
    void testSolve5() {
        String resultado = Operations.Solve("2+3*4");
        assertEquals("2+3*4=14", resultado);
    }

    @Test
    @DisplayName("Respeta la precedencia de operadores: división antes que resta")
    void testSolve6() {
        String resultado = Operations.Solve("10-8/2");
        assertEquals("10-8/2=6", resultado);
    }

    @Test
    @DisplayName("Evalúa correctamente expresiones con múltiples operaciones de suma y resta")
    void testSolve7() {
        String resultado = Operations.Solve("1+2-3+4");
        assertEquals("1+2-3+4=4", resultado);
    }

    @Test
    @DisplayName("Evalúa correctamente expresiones con múltiples operaciones de multiplicación y división")
    void testSolve8() {
        String resultado = Operations.Solve("2*3/2*4");
        assertEquals("2*3/2*4=12", resultado);
    }

    @Test
    @DisplayName("Maneja correctamente expresiones complejas con todos los operadores")
    void testSolve9() {
        String resultado = Operations.Solve("2+3*4-6/2");
        assertEquals("2+3*4-6/2=11", resultado);
    }

    @Test
    @DisplayName("Evalúa correctamente un solo número")
    void testSolve10() {
        String resultado = Operations.Solve("42");
        assertEquals("42=42", resultado);
    }

    @Test
    @DisplayName("Maneja números de múltiples dígitos")
    void testSolve11() {
        String resultado = Operations.Solve("12+34");
        assertEquals("12+34=46", resultado);
    }

    @Test
    @DisplayName("Maneja expresiones que resulten en cero")
    void testSolve12() {
        String resultado = Operations.Solve("5-5");
        assertEquals("5-5=0", resultado);
    }

    @Test
    @DisplayName("Maneja expresiones con resultado negativo")
    void testSolve13() {
        String resultado = Operations.Solve("3-5");
        assertEquals("3-5=-2", resultado);
    }

    @Test
    @DisplayName("Evalúa correctamente expresiones largas con varias operaciones")
    void testSolve14() {
        String resultado = Operations.Solve("1+2*3+4*5-6/2");
        assertEquals("1+2*3+4*5-6/2=24", resultado);
    }

    @Test
    @DisplayName("Maneja división que resulta en número entero")
    void testSolve15() {
        String resultado = Operations.Solve("15/3");
        assertEquals("15/3=5", resultado);
    }

    @Test
    @DisplayName("Maneja operaciones consecutivas de suma")
    void testSolve16() {
        String resultado = Operations.Solve("1+1+1+1");
        assertEquals("1+1+1+1=4", resultado);
    }

    @Test
    @DisplayName("Maneja operaciones consecutivas de multiplicación")
    void testSolve17() {
        String resultado = Operations.Solve("2*2*2");
        assertEquals("2*2*2=8", resultado);
    }

    @Test
    @DisplayName("Evalúa correctamente expresión con precedencia: suma seguida de multiplicación")
    void testSolve18() {
        String resultado = Operations.Solve("5+2*3");
        assertEquals("5+2*3=11", resultado);
    }

    @Test
    @DisplayName("Evalúa correctamente expresión con precedencia: multiplicación seguida de suma")
    void testSolve19() {
        String resultado = Operations.Solve("2*3+5");
        assertEquals("2*3+5=11", resultado);
    }

    @Test
    @DisplayName("Maneja división con redondeo de decimales")
    void testSolve20() {
        String resultado = Operations.Solve("7/2");
        assertEquals("7/2=3", resultado); // División entera en Java
    }


}