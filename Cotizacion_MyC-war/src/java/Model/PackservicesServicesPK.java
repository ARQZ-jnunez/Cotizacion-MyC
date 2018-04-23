/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jsDotx3
 */
@Embeddable
public class PackservicesServicesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigInteger id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PACKSERVICES_ID")
    private BigInteger packservicesId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SERVICES_ID")
    private BigInteger servicesId;

    public PackservicesServicesPK() {
    }

    public PackservicesServicesPK(BigInteger id, BigInteger packservicesId, BigInteger servicesId) {
        this.id = id;
        this.packservicesId = packservicesId;
        this.servicesId = servicesId;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getPackservicesId() {
        return packservicesId;
    }

    public void setPackservicesId(BigInteger packservicesId) {
        this.packservicesId = packservicesId;
    }

    public BigInteger getServicesId() {
        return servicesId;
    }

    public void setServicesId(BigInteger servicesId) {
        this.servicesId = servicesId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        hash += (packservicesId != null ? packservicesId.hashCode() : 0);
        hash += (servicesId != null ? servicesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PackservicesServicesPK)) {
            return false;
        }
        PackservicesServicesPK other = (PackservicesServicesPK) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        if ((this.packservicesId == null && other.packservicesId != null) || (this.packservicesId != null && !this.packservicesId.equals(other.packservicesId))) {
            return false;
        }
        if ((this.servicesId == null && other.servicesId != null) || (this.servicesId != null && !this.servicesId.equals(other.servicesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.PackservicesServicesPK[ id=" + id + ", packservicesId=" + packservicesId + ", servicesId=" + servicesId + " ]";
    }
    
}
