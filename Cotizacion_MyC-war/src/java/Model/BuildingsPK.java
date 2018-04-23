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
public class BuildingsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigInteger id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLIENT_ID")
    private BigInteger clientId;

    public BuildingsPK() {
    }

    public BuildingsPK(BigInteger id, BigInteger clientId) {
        this.id = id;
        this.clientId = clientId;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getClientId() {
        return clientId;
    }

    public void setClientId(BigInteger clientId) {
        this.clientId = clientId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        hash += (clientId != null ? clientId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BuildingsPK)) {
            return false;
        }
        BuildingsPK other = (BuildingsPK) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        if ((this.clientId == null && other.clientId != null) || (this.clientId != null && !this.clientId.equals(other.clientId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.BuildingsPK[ id=" + id + ", clientId=" + clientId + " ]";
    }
    
}
