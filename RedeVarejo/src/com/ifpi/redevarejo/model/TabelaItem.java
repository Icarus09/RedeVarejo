package com.ifpi.redevarejo.model;

import java.util.List;

public interface TabelaItem {
	
	double calcularDesconto(List<ItemCompra> itens);

}
