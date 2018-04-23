/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jsDotx3
 */
@Entity
@Table(name = "BUILDINGS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Buildings.findAll", query = "SELECT b FROM Buildings b")
    , @NamedQuery(name = "Buildings.findById", query = "SELECT b FROM Buildings b WHERE b.buildingsPK.id = :id")
    , @NamedQuery(name = "Buildings.findByLocation", query = "SELECT b FROM Buildings b WHERE b.location = :location")
    , @NamedQuery(name = "Buildings.findByClientId", query = "SELECT b FROM Buildings b WHERE b.buildingsPK.clientId = :clientId")})
public class Buildings implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BuildingsPK buildingsPK;
    @Size(max = 250)
    @Column(name = "LOCATION")
    private String location;
    @JoinColumn(name = "CLIENT_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Client client;

    public Buildings() {
    }

    public Buildings(BuildingsPK buildingsPK) {
        this.buildingsPK = buildingsPK;
    }

    public Buildings(BigInteger id, BigInteger clientId) {
        this.buildingsPK = new BuildingsPK(id, clientId);
    }

    public BuildingsPK getBuildingsPK() {
        return buildingsPK;
    }

    public void setBuildingsPK(BuildingsPK buildingsPK) {
        this.buildingsPK = buildingsPK;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (buildingsPK != null ? buildingsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buildings)) {
            return false;
        }
        Buildings other = (Buildings) object;
        if ((this.buildingsPK == null && other.buildingsPK != null) || (this.buildingsPK != null && !this.buildingsPK.equals(other.buildingsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Buildings[ buildingsPK=" + buildingsPK + " ]";
    }
    
}
