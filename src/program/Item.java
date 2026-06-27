package program;

public class Item {
	private String nome;	//DEIXA O NOME DO ITEM PRIVADO
	 double preco;    //DEIXA O VALOR DO PREÇO PRIVADO
	
	
	public Item(String nome, double preco) {
		this.nome = nome;	//AQUI TA FALANDO QUE OQUE O USER ESCREVER VAI SER O VALOR DO NOME
		this.preco = preco;	//AQUI TA FALANDO QUE OQUE O USER ESCREVER VAI SER O VALOR DO PREÇO

		}
	public String getNome() {
		return nome;		//RETURN O VALOR ARMAZENADO NO NOME
	}
	public double getPreco(){
		return preco; //RETURN O VALOR ARMAZENADO NO PREÇO 
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void  setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return nome + " - R$" + preco;
		
		}
	}
	
