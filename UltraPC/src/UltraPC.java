
public class UltraPC {

	public static void main(String[] args) {
		
		//passando por parametro dados de Cliente
		Cliente cliente = new Cliente("Elizabeth", 111222333, 2);
		
		//passando por parametro dados de Computador
		Computador pc1 = new Computador ("Asus", 4000, 4, "windows");
		Computador pc2 = new Computador ("Samsung", 3500, 4, "windows");
		
		//passando por parametro dados de Componente
		Componente c1 = new Componente ("GPU", "Geforce RTX 3080");
		Componente c2 = new Componente ("CPU", "Intel I5");
		Componente c3 = new Componente ("SSD", "1TB");
		Componente c4 = new Componente ("RAM", "32GB");
		Componente c5 = new Componente ("CPU", "Pentium III");
		Componente c6 = new Componente ("HD", "100GB");
		Componente c7 = new Componente ("RAM", "1GB");
		Componente c8 = new Componente ("Modem", "Discado");
		MemoriaUSB m2 = new MemoriaUSB ("Kingston", 8);
		
		//add componentes cadastrados nos pc's
		pc1.addComponentes(c1);
		pc1.addComponentes(c2);
		pc1.addComponentes(c3);
		pc1.addComponentes(c4);
		pc2.addComponentes(c5);
		pc2.addComponentes(c6);
		pc2.addComponentes(c7);
		pc2.addComponentes(c8);
		
		pc2.addMemoriaUSB(m2);
		
		//add pc's ao cliente
		cliente.addComputador(pc1);
		cliente.addComputador(pc2);
		
		pc1.mostraPcConfig();
		pc2.mostraPcConfig();
		
		System.out.println("Preço total da compra = " + cliente.calculaCompra());
	

	}

}
