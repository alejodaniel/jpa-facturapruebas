/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.DAO;

import com.alejandro.dominio.Persona;
import com.alejandro.dominio.Usuario;
import java.util.List;
import javax.persistence.Query;

public class PersonaDao extends DAOAbstract<Persona> {

    public PersonaDao(Persona persona) {
        //super llama al constructor padre
        super(persona);
    }

    @Override
    public List<Persona> buscarTodos() {
//        Query query = this.getEntityManager().createQuery("Select * from Persona ");   SQL
        Query query = this.getEntityManager().createQuery("Select p from Persona p");
        return query.getResultList();
    }

    public Persona getPersonaById(int idPersona) {
        Query query = this.getEntityManager().createQuery("Select p from Persona p where p.idPersona=" + idPersona);
        return (Persona) query.getSingleResult();
    }

    public List<Persona> buscarPorCriterio(String agregar) {
        Query query = this.getEntityManager().createQuery("Select p from Persona p where p.nombre like '%" + agregar + "%'");
        return query.getResultList();

    }

    public Usuario getUsuarioById(int idPersona) {
        Query query = this.getEntityManager().createQuery("Select p from Usuario p where p.idUsuario=" + idPersona);
        return (Usuario) query.getSingleResult();

    }

    public boolean editarPersona(Persona persona) {
        PersonaDao pd = new PersonaDao(persona);
        try {
            pd.update();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

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
