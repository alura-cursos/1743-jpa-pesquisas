package br.com.alura.jpa.testes;

import br.com.alura.jpa.modelo.dao.MovimentacaoDao;

public class TestaSomaDasMovimentacoes {
	public static void main(String[] args) {

		MovimentacaoDao dao = new MovimentacaoDao();
		System.out.println("A soma das movimentacoes é: " + dao.getSomaDasMovimentacoes());

	}
}
