package Classes;

public class Produto {
	private String nome;
	private double preco;
	private int qtd;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public double getValorTotal () {
		double vt = qtd * preco;
		return vt;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", qtd=" + qtd + ", getValorTotal()=" + getValorTotal()
				+ "]";
	}

	
}
