package tipoFinanciamento;

import java.time.LocalDate;

import entidades.Casa;
import entidades.Prestacao;
import servico.Financiamento;

public class tipo2 implements Financiamento {
	private static final double JUROS = 0.93;

	@Override
	public void parcela(Casa casa, int quantParcelas) {

		double amortizar = casa.getValor() / quantParcelas;
		double valor = casa.getValor();
		double parcela;
		double valorTotal = 0;
		
		for (int i = 0; i < quantParcelas; i++) {
			parcela = amortizar + (JUROS / 100) * (valor);
			valor = valor - amortizar - (amortizar/100) ;
			LocalDate dataPrestacao = casa.getData1Parcela().plusMonths(i);
			casa.addPrestacoes(new Prestacao(dataPrestacao, parcela));
			valorTotal = valorTotal + parcela;
		}
		casa.setValorTotal(valorTotal);
	}
}
