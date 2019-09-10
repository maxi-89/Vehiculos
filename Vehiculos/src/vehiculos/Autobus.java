package vehiculos;

public class Autobus extends Vehiculo {
	private int cantPasajeros=0;
	int i;
	Persona pasajeros []=new Persona [30];
	
	
	public Autobus(int kmRecorridos, Persona chofer) {
		super(kmRecorridos, chofer);
		
	}

	public void subirPasajeros(Persona pirucho) {
	
		pasajeros[cantPasajeros]=pirucho;
	
		this.cantPasajeros++;
		}

	public int getCantPasajeros() {
		return cantPasajeros;
	}

	public void setCantPasajeros(int cantPasajeros) {
		this.cantPasajeros = cantPasajeros;
	}

	public void bajarPasajeros() {
		pasajeros[cantPasajeros]=null;
		this.cantPasajeros--;
		
	}
	public boolean tienePasajero() {
		if(this.cantPasajeros!=0) {
			return true;
		}
		else return false;
	}
	
	
	
	
	@Override
	public void cambiarChofer(Persona otroChofer) {
		if(this.tienePasajero()==false) {
			this.asignarChofer(otroChofer);
			
		}
		
	}

}
