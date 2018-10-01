/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.ucc;

import com.alejandro.DAO.PersonaDao;
import com.alejandro.dominio.Persona;

/**
 *
 * @author Alejandro
 */
public class PersonaUcc {

    public boolean guardarPersona(Persona persona) {
        PersonaDao pd = new PersonaDao(persona);
        try {
            pd.persist();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
