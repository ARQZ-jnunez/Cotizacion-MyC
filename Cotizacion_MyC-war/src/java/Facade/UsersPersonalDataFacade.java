/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Model.UsersPersonalData;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jsDotx3
 */
@Stateless
public class UsersPersonalDataFacade extends AbstractFacade<UsersPersonalData> {

    @PersistenceContext(unitName = "Cotizacion_MyC-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsersPersonalDataFacade() {
        super(UsersPersonalData.class);
    }
    
}
