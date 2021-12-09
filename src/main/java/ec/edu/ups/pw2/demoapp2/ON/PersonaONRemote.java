package ec.edu.ups.pw2.demoapp2.ON;

import javax.ejb.Remote;

@Remote
public interface PersonaONRemote {
	public void crear(String cedula, String nombre, String direccion);
}
