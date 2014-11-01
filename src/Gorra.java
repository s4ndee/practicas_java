
public class Gorra {

	private String mensaje;
	private String color;
	public int marca;
	
	public Gorra (String vatosLocos, String todosNegro, int numero) {
		mensaje = vatosLocos;
		color = todosNegro;
		marca = numero;	
	}
	
	public Gorra (){
		
	}
	
	public String getMensaje (){
		return this.mensaje;
		
	}
	
	public void setMensaje (String mensajeRecibido){
		mensaje = mensajeRecibido;
		
	}
	
	public void setMarca(int numeroImpreso){
		this.marca = numeroImpreso;
		
	}
	
	public int getMarca(){
		return this.marca;
		
	}
	
	public void duplicaMarca(){
	 this.marca = this.marca *2;
	
	}
	
	

}
