
public class Lapiz {

	private String color;
	private int grafito;
	public double largo;
	
	public Lapiz (/*no hay argumentos*/){
		/*no necesitamos de nada para construir un lapiz*/
	}
	
	public Lapiz(String colorLapiz, int grafitoLapiz){
		/*Proceso para construir el lapiz*/
		color = colorLapiz;
		grafito = grafitoLapiz;
	}
	
	public Lapiz(int numeroGrafito, String colorcin, double tama�o){
		grafito = numeroGrafito;
		color = colorcin;
		largo = tama�o;
	}
	
	public Lapiz(double largoLapiz, double tama�o){
		largo = largoLapiz;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public String getColor (){
		return this.color;
		
	}
	
	public void setColor (String colorRecibido){
		color = colorRecibido;
	}

}
