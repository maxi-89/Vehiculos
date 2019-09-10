package vehiculos;

public class Moto extends Vehiculo{
private Persona acompaņante;


public Moto(int kmRecorridos, Persona chofer) {
	super(kmRecorridos, chofer);
	
	
}

public void cambiarChofer(Persona otroChofer) {
	if(this.tieneAcompaņante()==false) {
		 this.asignarChofer(otroChofer);
		 
	}else {
		System.out.println("no se puede");
	}
	
}

public void subirAcompaņante(Persona compa) {
	this.acompaņante=compa;
	}

public void bajarAcompaņante() {
	this.acompaņante=null;
	
}
public boolean tieneAcompaņante() {
	if(this.acompaņante!=null) {
		return true;
	}
	else return false;
}






}
