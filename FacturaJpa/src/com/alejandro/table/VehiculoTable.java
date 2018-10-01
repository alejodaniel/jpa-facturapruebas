/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.table;

import com.alejandro.dominio.Vehiculo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class VehiculoTable extends AbstractTableModel {

    String titulo[] = {"Marca", "Color", "Año"};

    private List<Vehiculo> filas;
    private Vehiculo vehiculo;

    public VehiculoTable(List<Vehiculo> filas) {
        this.filas = filas;
    }
//Herencia

    @Override
    public int getRowCount() {
        return getFilas() != null ? getFilas().size() : 0;//retorna el numero de filas
    }

    @Override
    public int getColumnCount() {
        return titulo.length;
    }

    @Override
    public String getColumnName(int column) {
        return titulo[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        setVehiculo(getFilas().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return getVehiculo().getMarca();
            case 1:
                return getVehiculo().getColor();
            case 2:
                return getVehiculo().getAño();

        }

        return null;
    }

    public List<Vehiculo> getFilas() {
        return filas;
    }

    public void setFilas(List<Vehiculo> filas) {
        this.filas = filas;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
