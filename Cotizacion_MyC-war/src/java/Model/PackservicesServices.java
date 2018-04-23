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
@Table(name = "PACKSERVICES_SERVICES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PackservicesServices.findAll", query = "SELECT p FROM PackservicesServices p")
    , @NamedQuery(name = "PackservicesServices.findById", query = "SELECT p FROM PackservicesServices p WHERE p.packservicesServicesPK.id = :id")
    , @NamedQuery(name = "PackservicesServices.findByPackservicesId", query = "SELECT p FROM PackservicesServices p WHERE p.packservicesServicesPK.packservicesId = :packservicesId")
    , @NamedQuery(name = "PackservicesServices.findByServicesId", query = "SELECT p FROM PackservicesServices p WHERE p.packservicesServicesPK.servicesId = :servicesId")})
public class PackservicesServices implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PackservicesServicesPK packservicesServicesPK;
    @JoinColumn(name = "PACKSERVICES_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Packservices packservices;
    @JoinColumn(name = "SERVICES_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Services services;

    public PackservicesServices() {
    }

    public PackservicesServices(PackservicesServicesPK packservicesServicesPK) {
        this.packservicesServicesPK = packservicesServicesPK;
    }

    public PackservicesServices(BigInteger id, BigInteger packservicesId, BigInteger servicesId) {
        this.packservicesServicesPK = new PackservicesServicesPK(id, packservicesId, servicesId);
    }

    public PackservicesServicesPK getPackservicesServicesPK() {
        return packservicesServicesPK;
    }

    public void setPackservicesServicesPK(PackservicesServicesPK packservicesServicesPK) {
        this.packservicesServicesPK = packservicesServicesPK;
    }

    public Packservices getPackservices() {
        return packservices;
    }

    public void setPackservices(Packservices packservices) {
        this.packservices = packservices;
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
        hash += (packservicesServicesPK != null ? packservicesServicesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PackservicesServices)) {
            return false;
        }
        PackservicesServices other = (PackservicesServices) object;
        if ((this.packservicesServicesPK == null && other.packservicesServicesPK != null) || (this.packservicesServicesPK != null && !this.packservicesServicesPK.equals(other.packservicesServicesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.PackservicesServices[ packservicesServicesPK=" + packservicesServicesPK + " ]";
    }
    
}
