package avaliacaoEscolar;

import static org.junit.Assert.*;

import org.junit.Test;

import alfa.br.com.gilmario.modelo.Avaliacao;
import alfa.br.com.gilmario.modelo.ValoresInvalidosException;

public class AvaliacaoTest {


    @Test(expected = ValoresInvalidosException.class)
    public void testAvaliacaoComValoresInvalidos() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.avalia(-2.00, 8.00, 12, 128);
    }

    @Test
    public void testAvaliacaoReprovadoPorFalta() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(5.50, 8.00, 33, 128);
        assertEquals("Reprovado por Falta.", resultado);
    }

    @Test
    public void testAvaliacaoReprovadoPorMedia() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(2.00, 3.00, 12, 128);
        assertEquals("Reprovado por Média.", resultado);
    }

    @Test
    public void testAvaliacaoRecuperacao() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(5.49, 6.50, 12, 128);
        assertEquals("Recuperação.", resultado);
    }

    @Test
    public void testAvaliacaoAprovado() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(7.00, 7.50, 12, 128);
        assertEquals("Aprovado.", resultado);
    }

}
