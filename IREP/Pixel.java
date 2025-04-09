package objetos;

//IREP
//Rojo,Azul y Verde deben ser mayores= a 0 y menores= a 255

public class Pixel {
	private int rojo;
	private int verde;
	private int azul;
	
	public Pixel(int rojo,int verde,int azul) {
		this.rojo=rojo;
		this.verde=verde;
		this.azul=azul;
	}
	
	
	public boolean esValida() {
		if((rojo>=0 && rojo<=255) && (verde>=0 && verde<=255) && (azul>=0 && azul<=255)) {
			return true;
		}
		return false;
	}
	
	public int getRojo() {
		return rojo;
	}
	public void setRojo(int rojo) {
		this.rojo = rojo;
	}
	public int getVerde() {
		return verde;
	}
	public void setVerde(int verde) {
		this.verde = verde;
	}
	public int getAzul() {
		return azul;
	}
	public void setAzul(int azul) {
		this.azul = azul;
	}
}
