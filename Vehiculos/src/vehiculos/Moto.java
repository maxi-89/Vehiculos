package vehiculos;

public class Moto extends Vehiculo{
private Persona acompa�ante;


public Moto(int kmRecorridos, Persona chofer) {
	super(kmRecorridos, chofer);
	
	
}

public void cambiarChofer(Persona otroChofer) {
	if(this.tieneAcompa�ante()==false) {
		 this.asignarChofer(otroChofer);
		 
	}else {
		System.out.println("no se puede");
	}
	
}

public void subirAcompa�ante(Persona compa) {
	this.acompa�ante=compa;
	}

public void bajarAcompa�ante() {
	this.acompa�ante=null;
	
}
public boolean tieneAcompa�ante() {
	if(this.acompa�ante!=null) {
		return true;
	}
	else return false;
}






}
