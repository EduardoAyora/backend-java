package ec.edu.ups.pw2.demoapp2.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.pw2.demoapp2.model.Operacion;

@Stateless
public class OperacionDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Operacion operacion) {
		em.persist(operacion);
	}
	
	public void update(Operacion operacion) {
		em.merge(operacion);
	}
	
	public Operacion read(int id) {
		Operacion operacion = em.find(Operacion.class, id);
		return operacion;
	}
	
	public void delete(int id) {
		Operacion operacion = em.find(Operacion.class, id);
		em.remove(operacion);
	}
}
