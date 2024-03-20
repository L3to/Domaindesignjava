package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class TesteSistema {

	public static void main(String[] args) {

		Colaborador objColaborador = new Colaborador();
		Endereco objEndColaborador = new Endereco();

		Empresa objEmpresa = new Empresa();
		Endereco objEndEmpresa = new Endereco();

		objColaborador.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do colaborador: ")));
		objColaborador.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do colaborador: ")));
		objColaborador.setRenda(Double.parseDouble(JOptionPane.showInputDialog("Digite a renda do colaborador: ")));
		objColaborador.setNome(JOptionPane.showInputDialog("Informe o nome do colaborador: "));
		objEndColaborador.setBairro(JOptionPane.showInputDialog("Informe o bairro do colaborador: "));
		objEndColaborador.setCep(JOptionPane.showInputDialog("Informe o CEP do colaborador: "));
		objEndColaborador.setLogradouro(JOptionPane.showInputDialog("Informe o logradouro do colaborador: "));
		objEndColaborador.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do endereço do colaborador: ")));
		objColaborador.setEndereco(objEndColaborador);

		objEmpresa.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ da empresa: "));
		objEmpresa.setRazaoSocial(JOptionPane.showInputDialog("Informe a razão social da empresa: "));
		objEndEmpresa.setBairro(JOptionPane.showInputDialog("Informe o bairro da empresa: "));
		objEndEmpresa.setCep(JOptionPane.showInputDialog("Informe o CEP da empresa: "));
		objEndEmpresa.setLogradouro(JOptionPane.showInputDialog("Informe o logradouro da empresa: "));
		objEndEmpresa.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do endereço da empresa: ")));
		objEmpresa.setEndereco(objEndEmpresa);

		//Colaborador
		System.out.println(
				"\nColaborador\n\nNome do Colaborador: " + objColaborador.getNome() + "\nIdade do Colaborador: "
						+ objColaborador.getIdade() + "\nRenda do Colaborador: " + objColaborador.getRenda()
						+ "\nCódigo do Colaborador:" + objColaborador.getCodigo() + "\nEndereço do Colaborador -\nRua: "
						+ objEndColaborador.getBairro() + "\nLogradouro: " + objEndColaborador.getLogradouro()
						+ "\nCEP: " + objEndColaborador.getCep() + "\nNúmero: " + objEndColaborador.getNumero());

		//Empresa
		System.out.println("\nEmpresa\n\nCNPJ da Empresa: " + objEmpresa.getCnpj() + "\nRazão Social: "
				+ objEmpresa.getRazaoSocial() + "\nEndereço da Empresa -\nRua: " + objEndEmpresa.getBairro()
				+ "\nLogradouro: " + objEndEmpresa.getLogradouro() + "\nCEP: " + objEndEmpresa.getCep() + "\nNúmero: "
				+ objEndEmpresa.getNumero());

	}

}
