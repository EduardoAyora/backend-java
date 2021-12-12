package ec.edu.ups.pw2.demoapp2.ON;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw2.demoapp2.dao.FacturaDAO;
import ec.edu.ups.pw2.demoapp2.model.DetalleFactura;
import ec.edu.ups.pw2.demoapp2.model.Factura;

@Stateless
public class FacturacionON implements FacturacionONRemote {
	@Inject
	private FacturaDAO facturaDAO;
	
	public void insertar(Factura f) throws Exception {
		facturaDAO.insert(f);
	}
	
	public List<String> getFacturas() {
		List<Factura> facturas = facturaDAO.getList();
		List<String>facturasEnTexto = new ArrayList<>();
		for (Factura factura : facturas) {
			String facturaEnTexto = "Número factura: " + Integer.toString(factura.getNumero()) + ", Fecha: " + factura.getFecha() + ", Cliente: " + factura.getCliente().getCedula()
					 + ", " + factura.getCliente().getNombre() + ", " + factura.getCliente().getDireccion();
			for (DetalleFactura detalle : factura.getDetalles()) {
				facturaEnTexto += ", Precio producto: " + detalle.getProducto().getPrecio() + ", Cantidad Producto: " + detalle.getCantidad() + ", Total de detalle: " + detalle.getPrecio();
			}
			facturasEnTexto.add(facturaEnTexto);
        }
		System.out.println(facturasEnTexto);
		return facturasEnTexto;
		
	}
}
