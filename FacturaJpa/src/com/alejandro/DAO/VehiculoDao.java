package com.alejandro.DAO;

import com.alejandro.dominio.Vehiculo;
import java.util.List;
import javax.persistence.Query;

public class VehiculoDao extends DAOAbstract<Vehiculo> {

    public VehiculoDao(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public List<Vehiculo> buscarTodos() {
        Query query = this.getEntityManager().createQuery("Select u from Vehiculo u");
        return query.getResultList();
    }

    public Vehiculo getVehiculoById(int idVehiculo) {
        Query query = this.getEntityManager().createQuery("Select u from Vehiculo u where u.idVehiculo" + idVehiculo);
        return (Vehiculo) query.getSingleResult();
    }

    public List<Vehiculo> buscarPorCriterio(String agregar) {
        Query query = this.getEntityManager().createQuery("Select p from Vehiculo p where p.marca like '%" + agregar + "%'");
        return query.getResultList();

    }
}
