package com.ifpi.redevarejo.model;

import java.util.List;

public class Compra {
	
	private Cliente cliente;
	private double valorTotal;
	private List<ItemCompra> itens;
	
	
	public Compra(Cliente cliente, double valorTotal, List<ItemCompra> itens) {
		this.cliente = cliente;
		this.valorTotal = valorTotal;
		this.itens = itens;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public List<ItemCompra> getItens() {
		return itens;
	}


	public void setItens(List<ItemCompra> itens) {
		this.itens = itens;
	}
	
	
}
