package com.ifpi.redevarejo.model;

import java.util.List;

public class TabelaItem1 implements TabelaItem {

	@Override
	public double calcularDesconto(List<ItemCompra> itens) {
		double desconto = 0;
		for(ItemCompra item: itens) {
			if(item.getQuantidade() >= 20){
				desconto += ((item.getQuantidade() * item.getPreco()) * 0.1);
			}
		}
		return desconto;
	}
	

}
