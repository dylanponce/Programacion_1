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
	//Ejercicio 1
	public static int diaDelMes(int mes,int anio) {
		if(mes<1||mes>12) {
			return 0;
		}
		if(mes==2) {
			if (esBiciesto(anio)) {
				return 29;
			}
			return 28;
		}
		if (mes==4||mes==6||mes==9||mes==11) {
			return 30;
		}
		return 31;
	}
	public static boolean esBiciesto(int anio) {
		return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
	}
	
	//Ejercicio 2
	
}