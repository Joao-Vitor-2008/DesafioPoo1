package Executaveis;
import javax.swing.JOptionPane;

import Classes.Produto;
public class Exec {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		String nome = JOptionPane.showInputDialog(null, "Nome do produto : ");
		String qtd = JOptionPane.showInputDialog(null, "Quantidade do produto : ");
		String preco = JOptionPane.showInputDialog(null, "Preço do produto : ");
		
		produto.setNome(nome);
		produto.setQtd(Integer.valueOf(qtd));
		produto.setPreco(Double.valueOf(preco));
		
		System.out.println(produto.toString());
		
	}

}
