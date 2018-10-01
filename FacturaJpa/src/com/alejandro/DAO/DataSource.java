/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alejandro
 */
public class DataSource {

    private static EntityManager em=null;

    public static EntityManager getEntityManager() {
        if (em == null || !em.isOpen()) {
            ConfigXml config = new ConfigXml();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("FacturaPU", config.getConfiguracionbd());
            em = emf.createEntityManager();
        }
        return em;
    }
}
