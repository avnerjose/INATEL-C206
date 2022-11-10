
public class SistemaOperacional {
	private String nome;

	public SistemaOperacional (String nome){
		this.nome = nome;
	}
	
	public String getNome() {//cria função que permite mostrar esse dado em outra classe
		return nome;
	}
}
