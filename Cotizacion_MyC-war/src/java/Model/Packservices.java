/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jsDotx3
 */
@Entity
@Table(name = "PACKSERVICES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Packservices.findAll", query = "SELECT p FROM Packservices p")
    , @NamedQuery(name = "Packservices.findById", query = "SELECT p FROM Packservices p WHERE p.id = :id")
    , @NamedQuery(name = "Packservices.findByName", query = "SELECT p FROM Packservices p WHERE p.name = :name")
    , @NamedQuery(name = "Packservices.findByPrice", query = "SELECT p FROM Packservices p WHERE p.price = :price")})
public class Packservices implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRICE")
    private BigInteger price;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "packservices")
    private Collection<PacksservicesRequestprice> packsservicesRequestpriceCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "packservices")
    private Collection<PackservicesServices> packservicesServicesCollection;

    public Packservices() {
    }

    public Packservices(BigDecimal id) {
        this.id = id;
    }

    public Packservices(BigDecimal id, String name, BigInteger price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    @XmlTransient
    public Collection<PacksservicesRequestprice> getPacksservicesRequestpriceCollection() {
        return packsservicesRequestpriceCollection;
    }

    public void setPacksservicesRequestpriceCollection(Collection<PacksservicesRequestprice> packsservicesRequestpriceCollection) {
        this.packsservicesRequestpriceCollection = packsservicesRequestpriceCollection;
    }

    @XmlTransient
    public Collection<PackservicesServices> getPackservicesServicesCollection() {
        return packservicesServicesCollection;
    }

    public void setPackservicesServicesCollection(Collection<PackservicesServices> packservicesServicesCollection) {
        this.packservicesServicesCollection = packservicesServicesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Packservices)) {
            return false;
        }
        Packservices other = (Packservices) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Packservices[ id=" + id + " ]";
    }
    
}
