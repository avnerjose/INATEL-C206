
public class Componente {
	private String tipo;
	private String nome;
	
	public Componente (String tipo, String nome){
		this.tipo = tipo;
		this.nome = nome;
	}

	public String getTipo() {//cria fun��o que permite mostrar esse dado em outra classe
		return tipo;
	}

	public String getNome() {//cria fun��o que permite mostrar esse dado em outra classe
		return nome;
	}

}
