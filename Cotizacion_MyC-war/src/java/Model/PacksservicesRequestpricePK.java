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
public class PacksservicesRequestpricePK implements Serializable {

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
    @Column(name = "REQUESTPRICE_ID")
    private BigInteger requestpriceId;

    public PacksservicesRequestpricePK() {
    }

    public PacksservicesRequestpricePK(BigInteger id, BigInteger packservicesId, BigInteger requestpriceId) {
        this.id = id;
        this.packservicesId = packservicesId;
        this.requestpriceId = requestpriceId;
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

    public BigInteger getRequestpriceId() {
        return requestpriceId;
    }

    public void setRequestpriceId(BigInteger requestpriceId) {
        this.requestpriceId = requestpriceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        hash += (packservicesId != null ? packservicesId.hashCode() : 0);
        hash += (requestpriceId != null ? requestpriceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacksservicesRequestpricePK)) {
            return false;
        }
        PacksservicesRequestpricePK other = (PacksservicesRequestpricePK) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        if ((this.packservicesId == null && other.packservicesId != null) || (this.packservicesId != null && !this.packservicesId.equals(other.packservicesId))) {
            return false;
        }
        if ((this.requestpriceId == null && other.requestpriceId != null) || (this.requestpriceId != null && !this.requestpriceId.equals(other.requestpriceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.PacksservicesRequestpricePK[ id=" + id + ", packservicesId=" + packservicesId + ", requestpriceId=" + requestpriceId + " ]";
    }
    
}
