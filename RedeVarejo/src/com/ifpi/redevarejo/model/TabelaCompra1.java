package com.ifpi.redevarejo.model;

public class TabelaCompra1 implements TabelaCompra {

	@Override
	public double calcularDesconto(double valor) {
		if(valor >= 1000) {
			return 0.1;
		}
		return 0;
	}
	
	

}
