package br.com.sparta.operacoes.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.sparta.function.Operacoes;

public class OperacoesTest {
	@Test
	public void somaTest() {
		Operacoes op = new Operacoes(3, 3);
		int ret = op.soma();
		Assert.assertEquals(6, ret);
	}

	@Test
	public void subTest() {
		Operacoes op = new Operacoes(5, 3);
		int ret = op.subtracao();
		Assert.assertEquals(2, ret);
	}

}
