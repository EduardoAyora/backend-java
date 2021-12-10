package ec.edu.ups.pw2.demoapp2.ON;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw2.demoapp2.dao.FacturaDAO;
import ec.edu.ups.pw2.demoapp2.model.Factura;

@Stateless
public class FacturacionON implements FacturacionONRemote {
	@Inject
	private FacturaDAO facturaDAO;
	
	public void insertar(Factura f) throws Exception {
		facturaDAO.insert(f);
	}
	
	public List<Factura> getFacturas() {
		return facturaDAO.getList();
	}
}
