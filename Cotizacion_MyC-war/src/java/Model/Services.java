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
import javax.persistence.Lob;
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
@Table(name = "SERVICES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Services.findAll", query = "SELECT s FROM Services s")
    , @NamedQuery(name = "Services.findById", query = "SELECT s FROM Services s WHERE s.id = :id")
    , @NamedQuery(name = "Services.findByName", query = "SELECT s FROM Services s WHERE s.name = :name")
    , @NamedQuery(name = "Services.findByPrice", query = "SELECT s FROM Services s WHERE s.price = :price")})
public class Services implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "services")
    private Collection<PackservicesServices> packservicesServicesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "services")
    private Collection<RequestpriceServices> requestpriceServicesCollection;

    public Services() {
    }

    public Services(BigDecimal id) {
        this.id = id;
    }

    public Services(BigDecimal id, String name, BigInteger price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Collection<PackservicesServices> getPackservicesServicesCollection() {
        return packservicesServicesCollection;
    }

    public void setPackservicesServicesCollection(Collection<PackservicesServices> packservicesServicesCollection) {
        this.packservicesServicesCollection = packservicesServicesCollection;
    }

    @XmlTransient
    public Collection<RequestpriceServices> getRequestpriceServicesCollection() {
        return requestpriceServicesCollection;
    }

    public void setRequestpriceServicesCollection(Collection<RequestpriceServices> requestpriceServicesCollection) {
        this.requestpriceServicesCollection = requestpriceServicesCollection;
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
        if (!(object instanceof Services)) {
            return false;
        }
        Services other = (Services) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Services[ id=" + id + " ]";
    }
    
}
