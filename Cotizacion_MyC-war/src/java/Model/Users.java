/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
        @Table(name = "USERS")
        @XmlRootElement
        @NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findById", query = "SELECT u FROM Users u WHERE u.id = :id")
    , @NamedQuery(name = "Users.findByNames", query = "SELECT u FROM Users u WHERE u.names = :names")
    , @NamedQuery(name = "Users.findByLastNames", query = "SELECT u FROM Users u WHERE u.lastNames = :lastNames")
    , @NamedQuery(name = "Users.findByRut", query = "SELECT u FROM Users u WHERE u.rut = :rut")
    , @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password")
    , @NamedQuery(name = "Users.validatePassword", query = "SELECT u FROM Users u WHERE u.password = :password AND u.rut = :rut")
})
public class Users implements Serializable {

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
    @Column(name = "NAMES")
    private String names;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "LAST_NAMES")
    private String lastNames;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "RUT")
    private String rut;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "PASSWORD")
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usersId")
    private Collection<Requestprice> requestpriceCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usersId2")
    private Collection<Requestprice> requestpriceCollection1;
    @OneToMany(mappedBy = "usersId2")
    private Collection<Requestviewtechnical> requestviewtechnicalCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usersId")
    private Collection<Requestviewtechnical> requestviewtechnicalCollection1;
    @JoinColumn(name = "CLIENT_ID", referencedColumnName = "ID")
    @ManyToOne
    private Client clientId;
    @JoinColumn(name = "ROLES_USERS_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private RolesUsers rolesUsersId;
    @JoinColumn(name = "USERS_PERSONAL_DATA_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private UsersPersonalData usersPersonalDataId;

    public Users() {
    }

    public Users(BigDecimal id) {
        this.id = id;
    }

    public Users(BigDecimal id, String names, String lastNames, String rut, String password) {
        this.id = id;
        this.names = names;
        this.lastNames = lastNames;
        this.rut = rut;
        this.password = password;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlTransient
    public Collection<Requestprice> getRequestpriceCollection() {
        return requestpriceCollection;
    }

    public void setRequestpriceCollection(Collection<Requestprice> requestpriceCollection) {
        this.requestpriceCollection = requestpriceCollection;
    }

    @XmlTransient
    public Collection<Requestprice> getRequestpriceCollection1() {
        return requestpriceCollection1;
    }

    public void setRequestpriceCollection1(Collection<Requestprice> requestpriceCollection1) {
        this.requestpriceCollection1 = requestpriceCollection1;
    }

    @XmlTransient
    public Collection<Requestviewtechnical> getRequestviewtechnicalCollection() {
        return requestviewtechnicalCollection;
    }

    public void setRequestviewtechnicalCollection(Collection<Requestviewtechnical> requestviewtechnicalCollection) {
        this.requestviewtechnicalCollection = requestviewtechnicalCollection;
    }

    @XmlTransient
    public Collection<Requestviewtechnical> getRequestviewtechnicalCollection1() {
        return requestviewtechnicalCollection1;
    }

    public void setRequestviewtechnicalCollection1(Collection<Requestviewtechnical> requestviewtechnicalCollection1) {
        this.requestviewtechnicalCollection1 = requestviewtechnicalCollection1;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public RolesUsers getRolesUsersId() {
        return rolesUsersId;
    }

    public void setRolesUsersId(RolesUsers rolesUsersId) {
        this.rolesUsersId = rolesUsersId;
    }

    public UsersPersonalData getUsersPersonalDataId() {
        return usersPersonalDataId;
    }

    public void setUsersPersonalDataId(UsersPersonalData usersPersonalDataId) {
        this.usersPersonalDataId = usersPersonalDataId;
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Users[ id=" + id + " ]";
    }

 

}
