/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Model.Users;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jsDotx3
 */
@Stateless
public class UsersFacade extends AbstractFacade<Users> {

    @PersistenceContext(unitName = "Cotizacion_MyC-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsersFacade() {
        super(Users.class);
    }

    public boolean validatePassword(String rut, String password) {
        boolean verificar = false;
        try {
            Users user = em.createNamedQuery("Users.validatePassword", Users.class)
                    .setParameter("password", password).setParameter("rut", rut).getSingleResult();
            verificar = true;
        } catch (NoResultException ex) {
            verificar = false;
        }
        return verificar;
    }
}
