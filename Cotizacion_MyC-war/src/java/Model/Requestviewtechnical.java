/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jsDotx3
 */
@Entity
@Table(name = "REQUESTVIEWTECHNICAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Requestviewtechnical.findAll", query = "SELECT r FROM Requestviewtechnical r")
    , @NamedQuery(name = "Requestviewtechnical.findById", query = "SELECT r FROM Requestviewtechnical r WHERE r.id = :id")
    , @NamedQuery(name = "Requestviewtechnical.findByViewAt", query = "SELECT r FROM Requestviewtechnical r WHERE r.viewAt = :viewAt")
    , @NamedQuery(name = "Requestviewtechnical.findByStatus", query = "SELECT r FROM Requestviewtechnical r WHERE r.status = :status")})
public class Requestviewtechnical implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "VIEW_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date viewAt;
    @Lob
    @Column(name = "DESCRIPTION_PROBLEM")
    private String descriptionProblem;
    @Size(max = 50)
    @Column(name = "STATUS")
    private String status;
    @OneToMany(mappedBy = "requestviewtechnicalId")
    private Collection<Requestprice> requestpriceCollection;
    @JoinColumn(name = "USERS_ID2", referencedColumnName = "ID")
    @ManyToOne
    private Users usersId2;
    @JoinColumn(name = "USERS_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Users usersId;

    public Requestviewtechnical() {
    }

    public Requestviewtechnical(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getViewAt() {
        return viewAt;
    }

    public void setViewAt(Date viewAt) {
        this.viewAt = viewAt;
    }

    public String getDescriptionProblem() {
        return descriptionProblem;
    }

    public void setDescriptionProblem(String descriptionProblem) {
        this.descriptionProblem = descriptionProblem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<Requestprice> getRequestpriceCollection() {
        return requestpriceCollection;
    }

    public void setRequestpriceCollection(Collection<Requestprice> requestpriceCollection) {
        this.requestpriceCollection = requestpriceCollection;
    }

    public Users getUsersId2() {
        return usersId2;
    }

    public void setUsersId2(Users usersId2) {
        this.usersId2 = usersId2;
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
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
        if (!(object instanceof Requestviewtechnical)) {
            return false;
        }
        Requestviewtechnical other = (Requestviewtechnical) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Requestviewtechnical[ id=" + id + " ]";
    }
    
}
