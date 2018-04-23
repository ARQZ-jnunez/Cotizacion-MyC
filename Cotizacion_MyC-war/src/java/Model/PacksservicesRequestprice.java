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
@Table(name = "PACKSSERVICES_REQUESTPRICE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PacksservicesRequestprice.findAll", query = "SELECT p FROM PacksservicesRequestprice p")
    , @NamedQuery(name = "PacksservicesRequestprice.findById", query = "SELECT p FROM PacksservicesRequestprice p WHERE p.packsservicesRequestpricePK.id = :id")
    , @NamedQuery(name = "PacksservicesRequestprice.findByPackservicesId", query = "SELECT p FROM PacksservicesRequestprice p WHERE p.packsservicesRequestpricePK.packservicesId = :packservicesId")
    , @NamedQuery(name = "PacksservicesRequestprice.findByRequestpriceId", query = "SELECT p FROM PacksservicesRequestprice p WHERE p.packsservicesRequestpricePK.requestpriceId = :requestpriceId")})
public class PacksservicesRequestprice implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PacksservicesRequestpricePK packsservicesRequestpricePK;
    @JoinColumn(name = "PACKSERVICES_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Packservices packservices;
    @JoinColumn(name = "REQUESTPRICE_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Requestprice requestprice;

    public PacksservicesRequestprice() {
    }

    public PacksservicesRequestprice(PacksservicesRequestpricePK packsservicesRequestpricePK) {
        this.packsservicesRequestpricePK = packsservicesRequestpricePK;
    }

    public PacksservicesRequestprice(BigInteger id, BigInteger packservicesId, BigInteger requestpriceId) {
        this.packsservicesRequestpricePK = new PacksservicesRequestpricePK(id, packservicesId, requestpriceId);
    }

    public PacksservicesRequestpricePK getPacksservicesRequestpricePK() {
        return packsservicesRequestpricePK;
    }

    public void setPacksservicesRequestpricePK(PacksservicesRequestpricePK packsservicesRequestpricePK) {
        this.packsservicesRequestpricePK = packsservicesRequestpricePK;
    }

    public Packservices getPackservices() {
        return packservices;
    }

    public void setPackservices(Packservices packservices) {
        this.packservices = packservices;
    }

    public Requestprice getRequestprice() {
        return requestprice;
    }

    public void setRequestprice(Requestprice requestprice) {
        this.requestprice = requestprice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (packsservicesRequestpricePK != null ? packsservicesRequestpricePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacksservicesRequestprice)) {
            return false;
        }
        PacksservicesRequestprice other = (PacksservicesRequestprice) object;
        if ((this.packsservicesRequestpricePK == null && other.packsservicesRequestpricePK != null) || (this.packsservicesRequestpricePK != null && !this.packsservicesRequestpricePK.equals(other.packsservicesRequestpricePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.PacksservicesRequestprice[ packsservicesRequestpricePK=" + packsservicesRequestpricePK + " ]";
    }
    
}
