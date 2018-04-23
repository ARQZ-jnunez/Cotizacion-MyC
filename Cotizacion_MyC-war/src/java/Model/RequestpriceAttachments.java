/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jsDotx3
 */
@Entity
@Table(name = "REQUESTPRICE_ATTACHMENTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RequestpriceAttachments.findAll", query = "SELECT r FROM RequestpriceAttachments r")
    , @NamedQuery(name = "RequestpriceAttachments.findById", query = "SELECT r FROM RequestpriceAttachments r WHERE r.id = :id")
    , @NamedQuery(name = "RequestpriceAttachments.findByFileName", query = "SELECT r FROM RequestpriceAttachments r WHERE r.fileName = :fileName")
    , @NamedQuery(name = "RequestpriceAttachments.findBySize", query = "SELECT r FROM RequestpriceAttachments r WHERE r.size = :size")
    , @NamedQuery(name = "RequestpriceAttachments.findByFormatFile", query = "SELECT r FROM RequestpriceAttachments r WHERE r.formatFile = :formatFile")
    , @NamedQuery(name = "RequestpriceAttachments.findByDownloads", query = "SELECT r FROM RequestpriceAttachments r WHERE r.downloads = :downloads")
    , @NamedQuery(name = "RequestpriceAttachments.findByCreatedAt", query = "SELECT r FROM RequestpriceAttachments r WHERE r.createdAt = :createdAt")
    , @NamedQuery(name = "RequestpriceAttachments.findByUpdatedAt", query = "SELECT r FROM RequestpriceAttachments r WHERE r.updatedAt = :updatedAt")})
public class RequestpriceAttachments implements Serializable {

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
    @Column(name = "FILE_NAME")
    private String fileName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "PATH")
    private String path;
    @Basic(optional = false)
    @NotNull
    @Column(name = "size")
    private BigInteger size;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "FORMAT_FILE")
    private String formatFile;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DOWNLOADS")
    private BigInteger downloads;
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
    @JoinColumn(name = "REQUESTPRICE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Requestprice requestpriceId;

    public RequestpriceAttachments() {
    }

    public RequestpriceAttachments(BigDecimal id) {
        this.id = id;
    }

    public RequestpriceAttachments(BigDecimal id, String fileName, String path, BigInteger size, String formatFile, BigInteger downloads, Date createdAt, Date updatedAt) {
        this.id = id;
        this.fileName = fileName;
        this.path = path;
        this.size = size;
        this.formatFile = formatFile;
        this.downloads = downloads;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public BigInteger getSize() {
        return size;
    }

    public void setSize(BigInteger size) {
        this.size = size;
    }

    public String getFormatFile() {
        return formatFile;
    }

    public void setFormatFile(String formatFile) {
        this.formatFile = formatFile;
    }

    public BigInteger getDownloads() {
        return downloads;
    }

    public void setDownloads(BigInteger downloads) {
        this.downloads = downloads;
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

    public Requestprice getRequestpriceId() {
        return requestpriceId;
    }

    public void setRequestpriceId(Requestprice requestpriceId) {
        this.requestpriceId = requestpriceId;
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
        if (!(object instanceof RequestpriceAttachments)) {
            return false;
        }
        RequestpriceAttachments other = (RequestpriceAttachments) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.RequestpriceAttachments[ id=" + id + " ]";
    }
    
}
