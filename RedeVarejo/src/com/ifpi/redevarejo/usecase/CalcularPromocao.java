package com.ifpi.redevarejo.usecase;

import com.ifpi.redevarejo.model.Compra;
import com.ifpi.redevarejo.model.Fidelidade;
import com.ifpi.redevarejo.model.TabelaCompra;
import com.ifpi.redevarejo.model.TabelaItem;

public class CalcularPromocao {
	
	private TabelaCompra tabelaCompra;
	private Fidelidade fidelidade;
	private TabelaItem tabelaItem;
	
	
	public CalcularPromocao(TabelaCompra tabelaCompra, Fidelidade fidelidade,  TabelaItem tabelaItem) {
		this.tabelaCompra = tabelaCompra;
		this.fidelidade = fidelidade;
		this.tabelaItem = tabelaItem;
	}
	
	public double calcular(Compra compra){
		
		double descontoValor = tabelaCompra.calcularDesconto(compra.getValorTotal());
		double descontoFidelidade = fidelidade.calcularDesconto(compra.getCliente().getPontos());
		double descontoItens = tabelaItem.calcularDesconto(compra.getItens());
		
		double descontoFinal = ((compra.getValorTotal() * (descontoValor + descontoFidelidade)) + descontoItens); 
		
		return compra.getValorTotal() - descontoFinal;
	}
}
