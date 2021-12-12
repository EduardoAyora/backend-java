package ec.edu.ups.pw2.demoapp2.ON;

import java.util.List;

import javax.ejb.Remote;

import ec.edu.ups.pw2.demoapp2.model.Factura;

@Remote
public interface FacturacionONRemote {
	public void insertar(Factura p) throws Exception;
	
	public List<String> getFacturas();
}
