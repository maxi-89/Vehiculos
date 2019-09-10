package vehiculos;

public abstract  class Vehiculo {

	private int kmRecorridos;
	private Persona chofer;
	private Persona otroChofer;
	
	
	//constructor clase vehiculo
	public Vehiculo(int kmRecorridos, Persona chofer) {
		this.kmRecorridos=kmRecorridos;
		this.chofer=chofer;}

	//metodo asignar chofer
		public void asignarChofer(Persona chofer) {
	chofer=chofer;
}
//metodo obtener chofer
public Persona getChofer() {
	return chofer;
}

//metodo abstracto cambiar chofer
public abstract void cambiarChofer(Persona otroChofer);













}