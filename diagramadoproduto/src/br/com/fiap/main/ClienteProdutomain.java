package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.endereco;
import br.com.fiap.beans.produto;

public class ClienteProdutomain {

	public static void main(String[] args) {
		// Instanciar objeto

		endereco objendereco = new endereco();
		Cliente objCliente = new Cliente();
		produto objproduto = new produto();

		// Entrada
//cliente
		objCliente.setNome("Luiz");
		objCliente.setIdade(17);
		objCliente.setAltura(1.74);
		objCliente.setEndereco(null);
//produto
		objproduto.setTipo("Chinelo");
		objproduto.setCodigo(8912);
		objproduto.setValor(15.74);
		objproduto.setMarca("HAVANAINHA");

		// Saída
//cliente
		System.out.println("\nNome do cliente: " + objCliente.getNome());
		System.out.println("\nIdade: " + objCliente.getIdade() + " anos");
		System.out.println("\nAltura: " + objCliente.getAltura() + " metros");
//produto
		System.out.println("\nTipo do produto: " + objproduto.getTipo());
		System.out.println("\nCódigo: " + objproduto.getCodigo());
		System.out.println("\nAltura: " + objproduto.getValor() + " reais");
		System.out.println("\nMarca: " + objproduto.getMarca());
	}

}
