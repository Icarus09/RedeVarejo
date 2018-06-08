package com.ifpi.redevarejo.model;

public class Fidelidade1 implements Fidelidade {

	@Override
	public double calcularDesconto(int pontos) {
		if(pontos >= 1000) {
			return 0.05;
		}
		return 0;
	}
}
