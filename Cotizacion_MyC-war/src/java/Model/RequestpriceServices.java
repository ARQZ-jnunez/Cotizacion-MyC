/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jsDotx3
 */
@Entity
@Table(name = "REQUESTPRICE_SERVICES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RequestpriceServices.findAll", query = "SELECT r FROM RequestpriceServices r")
    , @NamedQuery(name = "RequestpriceServices.findById", query = "SELECT r FROM RequestpriceServices r WHERE r.requestpriceServicesPK.id = :id")
    , @NamedQuery(name = "RequestpriceServices.findByRequestpriceId", query = "SELECT r FROM RequestpriceServices r WHERE r.requestpriceServicesPK.requestpriceId = :requestpriceId")
    , @NamedQuery(name = "RequestpriceServices.findByServicesId", query = "SELECT r FROM RequestpriceServices r WHERE r.requestpriceServicesPK.servicesId = :servicesId")})
public class RequestpriceServices implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RequestpriceServicesPK requestpriceServicesPK;
    @JoinColumn(name = "REQUESTPRICE_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Requestprice requestprice;
    @JoinColumn(name = "SERVICES_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Services services;

    public RequestpriceServices() {
    }

    public RequestpriceServices(RequestpriceServicesPK requestpriceServicesPK) {
        this.requestpriceServicesPK = requestpriceServicesPK;
    }

    public RequestpriceServices(BigInteger id, BigInteger requestpriceId, BigInteger servicesId) {
        this.requestpriceServicesPK = new RequestpriceServicesPK(id, requestpriceId, servicesId);
    }

    public RequestpriceServicesPK getRequestpriceServicesPK() {
        return requestpriceServicesPK;
    }

    public void setRequestpriceServicesPK(RequestpriceServicesPK requestpriceServicesPK) {
        this.requestpriceServicesPK = requestpriceServicesPK;
    }

    public Requestprice getRequestprice() {
        return requestprice;
    }

    public void setRequestprice(Requestprice requestprice) {
        this.requestprice = requestprice;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requestpriceServicesPK != null ? requestpriceServicesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequestpriceServices)) {
            return false;
        }
        RequestpriceServices other = (RequestpriceServices) object;
        if ((this.requestpriceServicesPK == null && other.requestpriceServicesPK != null) || (this.requestpriceServicesPK != null && !this.requestpriceServicesPK.equals(other.requestpriceServicesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.RequestpriceServices[ requestpriceServicesPK=" + requestpriceServicesPK + " ]";
    }
    
}
