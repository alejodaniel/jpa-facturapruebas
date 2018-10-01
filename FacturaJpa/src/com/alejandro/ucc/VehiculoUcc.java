package com.alejandro.ucc;

import com.alejandro.DAO.VehiculoDao;
import com.alejandro.dominio.Vehiculo;

public class VehiculoUcc {

    public boolean guardarVehiculo(Vehiculo vehiculo) {
        VehiculoDao vd = new VehiculoDao(vehiculo);
        try {
            vd.persist();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
