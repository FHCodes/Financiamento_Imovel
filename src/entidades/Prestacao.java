package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prestacao {
	
private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate dataVencimento;
	private Double valor;
	
	public Prestacao(LocalDate dataVencimento, Double valor) {
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}

	public static DateTimeFormatter getFmt() {
		return fmt;
	}

	public static void setFmt(DateTimeFormatter fmt) {
		Prestacao.fmt = fmt;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return dataVencimento.format(fmt) + " - " + String.format("%.2f", valor);
	}
	
	
	
	

}
