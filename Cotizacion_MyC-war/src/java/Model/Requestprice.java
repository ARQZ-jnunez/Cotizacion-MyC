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
import javax.persistence.CascadeType;
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
@Table(name = "REQUESTPRICE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Requestprice.findAll", query = "SELECT r FROM Requestprice r")
    , @NamedQuery(name = "Requestprice.findById", query = "SELECT r FROM Requestprice r WHERE r.id = :id")
    , @NamedQuery(name = "Requestprice.findByStatus", query = "SELECT r FROM Requestprice r WHERE r.status = :status")
    , @NamedQuery(name = "Requestprice.findByCreatedAt", query = "SELECT r FROM Requestprice r WHERE r.createdAt = :createdAt")
    , @NamedQuery(name = "Requestprice.findByUpdatedAt", query = "SELECT r FROM Requestprice r WHERE r.updatedAt = :updatedAt")})
public class Requestprice implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "STATUS")
    private String status;
    @Lob
    @Column(name = "RECORD_PROBLEM")
    private String recordProblem;
    @Lob
    @Column(name = "DETAILS")
    private String details;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UPDATED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @JoinColumn(name = "REQUESTVIEWTECHNICAL_ID", referencedColumnName = "ID")
    @ManyToOne
    private Requestviewtechnical requestviewtechnicalId;
    @JoinColumn(name = "USERS_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Users usersId;
    @JoinColumn(name = "USERS_ID2", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Users usersId2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "requestprice")
    private Collection<PacksservicesRequestprice> packsservicesRequestpriceCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "requestpriceId")
    private Collection<RequestpriceAttachments> requestpriceAttachmentsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "requestprice")
    private Collection<RequestpriceServices> requestpriceServicesCollection;

    public Requestprice() {
    }

    public Requestprice(BigDecimal id) {
        this.id = id;
    }

    public Requestprice(BigDecimal id, String status, Date createdAt, Date updatedAt) {
        this.id = id;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRecordProblem() {
        return recordProblem;
    }

    public void setRecordProblem(String recordProblem) {
        this.recordProblem = recordProblem;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Requestviewtechnical getRequestviewtechnicalId() {
        return requestviewtechnicalId;
    }

    public void setRequestviewtechnicalId(Requestviewtechnical requestviewtechnicalId) {
        this.requestviewtechnicalId = requestviewtechnicalId;
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
    }

    public Users getUsersId2() {
        return usersId2;
    }

    public void setUsersId2(Users usersId2) {
        this.usersId2 = usersId2;
    }

    @XmlTransient
    public Collection<PacksservicesRequestprice> getPacksservicesRequestpriceCollection() {
        return packsservicesRequestpriceCollection;
    }

    public void setPacksservicesRequestpriceCollection(Collection<PacksservicesRequestprice> packsservicesRequestpriceCollection) {
        this.packsservicesRequestpriceCollection = packsservicesRequestpriceCollection;
    }

    @XmlTransient
    public Collection<RequestpriceAttachments> getRequestpriceAttachmentsCollection() {
        return requestpriceAttachmentsCollection;
    }

    public void setRequestpriceAttachmentsCollection(Collection<RequestpriceAttachments> requestpriceAttachmentsCollection) {
        this.requestpriceAttachmentsCollection = requestpriceAttachmentsCollection;
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
        if (!(object instanceof Requestprice)) {
            return false;
        }
        Requestprice other = (Requestprice) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Requestprice[ id=" + id + " ]";
    }
    
}
