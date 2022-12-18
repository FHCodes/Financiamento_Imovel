package servico;

import entidades.Casa;

public class GeraPrestacao {

	private Financiamento financiamento;

	public GeraPrestacao(Financiamento financiamento) {
		this.financiamento = financiamento;
	}

	public void financiando(Casa casa, int quantParcelas) {
		financiamento.parcela(casa, quantParcelas);
		
		}
	}
