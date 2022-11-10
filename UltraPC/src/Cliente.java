
public class Cliente {
	private String nome;
	private long cpf;
	private Computador[] computadores;//criando espaço para computadores
	
	public Cliente (String nome, long cpf, int qtdComputador){
		this.nome = nome;
		this.cpf =cpf;
		computadores = new Computador [qtdComputador];
	}
	
	public void addComputador (Computador computador) {
		for (int i = 0; i < computadores.length; i++) {//percorre vetor de computadores
			if (computadores [i] == null) {//verifica se a posição n está vazia
				computadores [i] = computador;//se estiver vazio, add computador 
				break;
			}
		}
	}
	
	public double calculaCompra () {
		double soma = 0;
		for (int i = 0; i < computadores.length; i++) {//percorre vetor de computadores
			if (computadores[i] != null)// se não estiver vazio
				soma += computadores[i].getPreco();//pega o preço do computador que está na posição
		}
		return soma;//retorno a soma dos preços dos pc's
	}

}
