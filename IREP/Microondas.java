package objetos;

public class Microondas {
	private boolean puertaAbierta;
	private boolean encendido;
	private int minutos;
	
//IREP	
//puertaAbierta == true && encendido == false && minutos == 0
//							||
//puertaAbierta == false && encendido == false && minutos == 0
//    						||
//puertaAbierta == false && encendido == true && minutos > 0
	
	public Microondas(boolean puertaAbierta,boolean encendido,int minutos) {
		this.puertaAbierta=puertaAbierta;
		this.encendido=encendido;
		this.minutos=minutos;
	}
	
	public boolean esValida() {
		if((puertaAbierta == true && encendido == false && minutos == 0)||
		   (puertaAbierta == false && encendido == false && minutos == 0)||
		   (puertaAbierta == false && encendido == true && minutos > 0)) {
			return true;
		}
		return false;
	}
	
	public boolean isPuertaAbierta() {
		return puertaAbierta;
	}
	public void setPuertaAbierta(boolean puertaAbierta) {
		this.puertaAbierta = puertaAbierta;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
}
