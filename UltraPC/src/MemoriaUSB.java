
public class MemoriaUSB {
	private String marca;
	private long capacidade;
	
	public MemoriaUSB(String marca, long capacidade){
		this.marca = marca;
		this.capacidade = capacidade;
		
	}

	public String getMarca() {//cria fun��o que permite mostrar esse dado em outra classe
		return marca;
	}

	public long getCapacidade() {//cria fun��o que permite mostrar esse dado em outra classe
		return capacidade;
	}
	
	

}
