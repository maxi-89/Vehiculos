package vehiculos;

public class Moto extends Vehiculo{
private Persona acompañante;


public Moto(int kmRecorridos, Persona chofer) {
	super(kmRecorridos, chofer);
	
	
}

public void cambiarChofer(Persona otroChofer) {
	if(this.tieneAcompañante()==false) {
		 this.asignarChofer(otroChofer);
		 
	}else {
		System.out.println("no se puede");
	}
	
}

public void subirAcompañante(Persona compa) {
	this.acompañante=compa;
	}

public void bajarAcompañante() {
	this.acompañante=null;
	
}
public boolean tieneAcompañante() {
	if(this.acompañante!=null) {
		return true;
	}
	else return false;
}






}
