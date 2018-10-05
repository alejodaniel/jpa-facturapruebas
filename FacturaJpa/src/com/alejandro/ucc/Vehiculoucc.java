/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.ucc;

import com.alejandro.DAO.VehiculoDao;
import com.alejandro.dominio.Vehiculo;

/**
 *
 * @author Alejandro
 */
public class Vehiculoucc {

    public boolean editarVehiculo(Vehiculo vehiculo) {
        VehiculoDao vd = new VehiculoDao(vehiculo);
        try {
            vd.update();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

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
