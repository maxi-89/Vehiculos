package vehiculos;

public class TestVehiculo {

	public static void main(String[] args) {
		Persona p1=new Persona ("migueliyo");
		Persona p2=new Persona ("roberto");
		Moto honda=new Moto(20,p1);
		
		Autobus un34=new Autobus(20,p1);
		
		
		System.out.println();
		
		System.out.println(honda.tieneAcompa�ante());
		
		honda.subirAcompa�ante(p2);
		
		System.out.println(honda.tieneAcompa�ante());
		
		honda.bajarAcompa�ante();
		
		System.out.println(honda.tieneAcompa�ante());
		
		honda.cambiarChofer(p2);
		System.out.println(p1.getNombre());
		
		un34.subirPasajeros(p2);
		System.out.println(un34.getCantPasajeros());
		System.out.println(un34.tienePasajero());
		un34.bajarPasajeros();
		System.out.println(un34.getCantPasajeros());
		
		un34.cambiarChofer(p2);
	    

	}

}
