package br.com.gilmarioarantes.validacpf.model;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidaCPFTeste {

    private ValidaCPF validaCPF;

    @BeforeTest
    public void setUp() {
        validaCPF = new ValidaCPF();
    }

    @Test
    public void testValidCPF() {
        // Teste com CPF válido
        String cpfValido = "12345678909";
        boolean resultadoValido = validaCPF.isCPF(cpfValido);
        assertTrue(resultadoValido, "CPF válido");
    }

    @Test
    public void testInvalidCPF() {
        // Teste com CPF inválido
        String cpfInvalido = "11122233344";
        boolean resultadoInvalido = validaCPF.isCPF(cpfInvalido);
        assertFalse(resultadoInvalido, "CPF inválido");
    }

    @Test
    public void testShortCPF() {
        // Teste com CPF de tamanho menor que 11 (inválido)
        String cpfInvalido = "12345";
        boolean resultadoInvalido = validaCPF.isCPF(cpfInvalido);
        assertFalse(resultadoInvalido, "CPF inválido");
    }

    @Test
    public void testLongCPF() {
        // Teste com CPF de tamanho maior que 11 (inválido)
        String cpfInvalido = "123456789098";
        boolean resultadoInvalido = validaCPF.isCPF(cpfInvalido);
        assertFalse(resultadoInvalido, "CPF inválido");
    }

    @Test
    public void testCPFWithNonDigits() {
        // Teste com CPF contendo caracteres não numéricos (inválido)
        String cpfInvalido = "1234567890A";
        boolean resultadoInvalido = validaCPF.isCPF(cpfInvalido);
        assertFalse(resultadoInvalido, "CPF inválido");
    }

    @Test
    public void testAllSameDigitsCPF() {
        // Teste com CPF contendo todos os dígitos iguais (inválido)
        String cpfInvalido = "11111111111";
        boolean resultadoInvalido = validaCPF.isCPF(cpfInvalido);
        assertFalse(resultadoInvalido, "CPF inválido");
    }
}   
