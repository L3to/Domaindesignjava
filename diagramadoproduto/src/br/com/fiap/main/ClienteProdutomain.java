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
		objCliente.setEndereco(objendereco);
//produto
		objproduto.setTipo("Chinelo");
		objproduto.setCodigo(8912);
		objproduto.setValor(15.74);
		objproduto.setMarca("HAVAIANINHA");
//endereço
		
		objendereco.setLogradouro("Rua Covil dos Louva-Deuses");
		objendereco.setNumero(825);
		objendereco.setComplemento("Apto 607B");
		objendereco.setBairro("Jardim Santinho");
		objendereco.setCep("04869-180");
		objendereco.setCidade("São Paulo");
		objendereco.setEstado("SP");
		objendereco.setPais("Brasil");
		
		// Saída
//cliente
		System.out.println("Nome do cliente: " + objCliente.getNome() +
			    "\nIdade: " + objCliente.getIdade() + " anos" +
			    "\nAltura: " + objCliente.getAltura() + " metros" +
//endereço
			    "\nLogradouro do Cliente: " + objCliente.getEndereco().getLogradouro() +
			    "\nBairro: " + objCliente.getEndereco().getBairro() +
			    "\nNúmero: " + objCliente.getEndereco().getNumero() +
			    "\nCEP: " + objCliente.getEndereco().getCep() +
			    "\nCidade: " + objCliente.getEndereco().getCidade() +
			    "\nEstado: " + objCliente.getEndereco().getEstado() +
			    "\nPaís: " + objCliente.getEndereco().getPais() +
			    "\nComplemento: " + objCliente.getEndereco().getComplemento());

//produto
		System.out.println("Tipo do produto: " + objproduto.getTipo() + "\nCódigo: " + objproduto.getCodigo() + "\nValor: " + objproduto.getValor() + " reais" + "\nMarca: " + objproduto.getMarca());

	}

}
