package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entidades.Casa;
import entidades.Prestacao;
import servico.GeraPrestacao;
import tipoFinanciamento.tipo1;
import tipoFinanciamento.tipo2;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Valor do imovel: ");
		double valor = sc.nextDouble();
		System.out.print("Data(dd/MM/yyyy) de compra do imovel: ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		System.out.println("Quantidade de parcelas: ");
		int quantParcelas = sc.nextInt();
		
		Casa casa = new Casa(valor,data);
		
		System.out.println("[1] - tipo1 de prestações");
		System.out.println("[2] - tipo2 de prestações");
		int op = sc.nextInt();
		
		switch (op) {
			case 1:
				GeraPrestacao gp1 = new GeraPrestacao(new tipo1());
				gp1.financiando(casa,quantParcelas);
			    break;
			case 2:
				GeraPrestacao gp2 = new GeraPrestacao(new tipo2());
				gp2.financiando(casa,quantParcelas);
			    break; 
			}
		
		
		
		
		System.out.println("Parcelas:");
		
		for (Prestacao prestacao : casa.getPrestacoes()) {
			System.out.println(prestacao);
			
		}
		System.out.println("O valor total: " + casa.getValorTotal());
		
		sc.close();
		
		}
		
	}


