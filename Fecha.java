package objetos;

public class Fecha {
	private int dia;//Intancia
	private int mes;
	private int anio;
	
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
	
	boolean esVerano() {
		return (this.mes==1||this.mes==2)||
				(this.mes==12 && this.dia>=21)||
				(this.mes==3 && this.dia<=21);
			
		}
	
	//Getters and Setters
	
	//Getters
	public int getDia() {
		return this.dia;
	}
	public int getMes() {
		return this.mes;
	}
	public int getAnio() {
		return this.anio;
	}
	
	//Setters
	public void setDia(int dia) {
		if(dia<1 || dia>diaDelMes(this.mes,this.anio)) {
			System.out.println("Fecha Invalida");
		}
		else {
			this.dia = dia;			
		}
	}
	public void setMes(int mes) {
		if(mes<1 || mes>12) {
			System.out.println("Fecha Invalida");
		}
		else {
			this.mes = mes;			
		}
	}
	public void setAnio(int anio) {
		if(anio<1) {
			System.out.println("Fecha Invalida");
		}
		this.anio = anio;
	}
	
	
	
	//Ejercicio 1
	public static int diaDelMes(int mes,int anio) {//metodo de clase
		//if(mes<1||mes>12) {
		//	return 0;
		//}
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
	public boolean esValida() {
		if(this.anio<1) {
			return false;
		}
		if (this.mes<=1 || this.mes>=12){
			return false;
		} 
		if (this.dia<1 || this.dia>diaDelMes(this.mes,this.anio)) {
			return false;
		}
		return true;
	}
	
	//Ejercicio 3
	public void avanzarDia() {
		if(this.dia==diaDelMes(this.mes,this.anio)) {
			this.dia=1;			
			if(this.mes==12) {
				this.mes=1;
				this.anio++;
			}
			else {
				this.mes++;
			}
		}
		else {
			this.dia++;
		}
	}
	
	//Ejercicio 3 v2
	public void avanzarDiav2() {
		Fecha prueba1 = new Fecha(this.dia+1,this.mes,this.anio);
		if(prueba1.esValida()) {
			this.dia++;
		}
		else{
			Fecha prueba2 = new Fecha(1,this.mes+1,this.anio);
			if(prueba2.esValida()) {
				this.dia=1;
				this.mes++;
			}
			else {
				Fecha prueba3 = new Fecha(1,1,this.anio+1);//No hace falta
				if(prueba3.esValida()) {
					this.dia=1;
					this.mes=1;
					this.anio++;
				}
					
			}
		}
	}
	
	//Ejercicio 4
	public boolean antesQue(Fecha otra) {
		if(this.anio<otra.anio) {
			return true;
		}
		else {
			if((this.anio==otra.anio) && (this.mes<otra.mes)) {
				return true;
			}
			else {
				if
				((this.anio==otra.anio)&& (this.mes==otra.mes) && (this.dia<otra.dia)) {
					return true;
				}
			}
		}
		return false;
	}
	
	//Ejercicio 5
	public int diaDelAnio() {
		int cont=this.dia;
		for(int i =this.mes-1;i>0;i--) {
			cont=cont+(diaDelMes(i, this.anio));
		}
		return cont;
	}
	
	//Ejercicio 6
	public int diasDeDiferenciaCon(Fecha otra) {
	    Fecha menor, mayor;

	    if (this.antesQue(otra)) {
	        menor = this;
	        mayor = otra;
	    } else {
	        menor = otra;
	        mayor = this;
	    }

	    if (menor.anio == mayor.anio) {//Si es el mismo año
	        return Math.abs(menor.diaDelAnio() - mayor.diaDelAnio());
	    }
	    int diasEnMenorAnio;
	    if (esBiciesto(menor.anio)) {//Días restantes del año inicial
	        diasEnMenorAnio = 366;
	    } else {
	        diasEnMenorAnio = 365;
	    }
	    int cont = diasEnMenorAnio - menor.diaDelAnio();

	    cont += mayor.diaDelAnio();	    //Días del año final
	    
	    for (int i = menor.anio + 1; i < mayor.anio; i++) {	    //Años intermedios
	        if (esBiciesto(i)) {
	            cont += 366;
	        } else {
	            cont += 365;
	        }
	    }
	    return cont;
	}
}