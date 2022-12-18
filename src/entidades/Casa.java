package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Casa {
	
	private Double valorEntrada;
	private Double valor;
	private Double valorTotal;
	private LocalDate Data1Parcela;
	private List<Prestacao> prestacoes = new ArrayList<>();
	
	public Casa(Double valor, LocalDate data1Parcela) {
		this.valor = valor;
		this.Data1Parcela = data1Parcela;
	}

	public Double getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(Double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDate getData1Parcela() {
		return Data1Parcela;
	}

	public void setData1Parcela(LocalDate data1Parcela) {
		this.Data1Parcela = data1Parcela;
	}

	public List<Prestacao> getPrestacoes() {
		return prestacoes;
	}

	public void addPrestacoes(Prestacao prestacao) {
		prestacoes.add(prestacao);
		
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return String.format("%.2f", valorTotal);
	}
	
	
	
	
}
