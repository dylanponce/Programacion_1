package objetos;

public class Fecha {
	int dia;
	int mes;
	int anio;
	
	public Fecha() {
		this.dia=1;
		this.mes=1;
		this.anio=2000;
	}
	public Fecha(int dia,int mes,int anio) {
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	
	public void imprimir(){//Metodo Imprimir
		System.out.println(this.dia+"/"+this.mes+"/"+this.anio);
	}
	
	public String toString() {//Metodo toString
		return ""+this.dia+"/"+this.mes+"/"+this.anio;//Para Syso
	}
	
	
}