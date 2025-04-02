package Executaveis;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Classes.Produto;

public class Exec {

	public static void main(String[] args) {

		ArrayList<Produto> produtos = new ArrayList<Produto>();

		while (true) {
			Produto produto = new Produto();

			String nome = JOptionPane.showInputDialog(null, "Nome do produto : ");
			if (nome.equals("fim")) {
				break;
			}
			String qtd = JOptionPane.showInputDialog(null, "Quantidade do produto : ");
			String preco = JOptionPane.showInputDialog(null, "Preço do produto : ");

			produto.setNome(nome);
			produto.setQtd(Integer.valueOf(qtd));
			produto.setPreco(Double.valueOf(preco));

			produtos.add(produto);
		}

		JOptionPane.showMessageDialog(null, produtos);
   teste

	}

}
