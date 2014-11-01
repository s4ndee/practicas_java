
public class ProbadorDeClases {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lapiz colorRandom = new Lapiz(1.57,2.15);// creamos lapiz con el constructor de dos argumentos
		
		System.out.println(colorRandom.getColor()); 
		
		colorRandom.setColor("Beige");
		
		System.out.println(colorRandom.getColor());
		
		Gorra miGorra = new Gorra("vatos locos","color",5);
		
		System.out.println(miGorra.getMensaje());
		
		miGorra.setMensaje("Vatitos Locos");
		
		System.out.println(miGorra.getMensaje());
		
		miGorra.setMarca(50);
		
		System.out.println(miGorra.getMarca());
		
		miGorra.duplicaMarca();
		
		System.out.println(miGorra.getMarca());
		
		
		

	}

}
