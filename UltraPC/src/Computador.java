
public class Computador {
	private String marca;
	private double preco;
	private SistemaOperacional sistema;
	private Componente[] componentes;//criando referencia de um vetor
	private MemoriaUSB memoria; //cria um ponteiro para memoria, mas não a memoria (pode ter ou não)
	

	public Computador (String marca, double preco, int qtdComponentes, String nomeSistema){
		this.marca = marca;
		this.preco = preco;
		sistema = new SistemaOperacional(nomeSistema);//criando um SO dentro do computador (tem que ter)
		componentes = new Componente[qtdComponentes];//criando espaços (ponteiros)
	}
	
	public double getPreco() {
		return preco;
	}

	public  void addComponentes (Componente comp) {
		 for (int i = 0; i < componentes.length; i++) {//percorre o vetor de componentes 
			 if (componentes [i]== null) {//se a posição estiver vazia
				 componentes [i]= comp;//add componente na posição 
				 break;
			 } 
		 }
	 }
	 
	public void addMemoriaUSB (MemoriaUSB mem) {
		 memoria = mem;
	 }
	 
	public void mostraPcConfig () {
		System.out.println("Marca = " + marca);
		System.out.println("Preço = " + preco);
		System.out.println("Sistema operacional");
		System.out.println("nome: " + sistema.getNome());//usar o get para acessar informação de outra classe
		
		for (int i = 0; i < componentes.length; i++) {//percorrer vetor de componentes 
			if (componentes [i] != null) {//se posição não estiver vazia
				System.out.println("Componente " + (i+1));
				System.out.println("tipo: " + componentes [i].getTipo());//acessar tipo do componente 
				System.out.println("nome: " + componentes [i].getNome());
			}
		}
		
		if (memoria != null) {
			System.out.println("Memoria");
			System.out.println("marca: " + memoria.getMarca());
			System.out.println("capacidade: " + memoria.getCapacidade());
		}
		
	}
}
