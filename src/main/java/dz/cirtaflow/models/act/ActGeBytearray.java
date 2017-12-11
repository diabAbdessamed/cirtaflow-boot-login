/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.cirtaflow.models.act;

import java.io.Serializable;
import java.util.List;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author diab
 */
@Entity
@Table(name = "ACT_GE_BYTEARRAY", catalog = "dev", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActGeBytearray.findAll", query = "SELECT a FROM ActGeBytearray a")})
public class ActGeBytearray implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_", nullable = false, length = 64)
    private String id;
    @Column(name = "REV_")
    private Integer rev;
    @Column(name = "NAME_", length = 255)
    private String name;
    @Lob
    @Column(name = "BYTES_")
    private byte[] bytes;
    @Column(name = "GENERATED_")
    private Short generated;
    @JoinColumn(name = "DEPLOYMENT_ID_", referencedColumnName = "ID_")
    @ManyToOne
    private ActReDeployment deploymentId;
    @OneToMany(mappedBy = "editorSourceValueId")
    private List<ActReModel> actReModelList;
    @OneToMany(mappedBy = "editorSourceExtraValueId")
    private List<ActReModel> actReModelList1;
    @OneToMany(mappedBy = "bytearrayId")
    private List<ActRuVariable> actRuVariableList;
    @OneToMany(mappedBy = "exceptionStackId")
    private List<ActRuDeadletterJob> actRuDeadletterJobList;
    @OneToMany(mappedBy = "exceptionStackId")
    private List<ActRuJob> actRuJobList;
    @OneToMany(mappedBy = "infoJsonId")
    private List<ActProcdefInfo> actProcdefInfoList;
    @OneToMany(mappedBy = "exceptionStackId")
    private List<ActRuSuspendedJob> actRuSuspendedJobList;
    @OneToMany(mappedBy = "exceptionStackId")
    private List<ActRuTimerJob> actRuTimerJobList;

    public ActGeBytearray() {
    }

    public ActGeBytearray(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRev() {
        return rev;
    }

    public void setRev(Integer rev) {
        this.rev = rev;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public Short getGenerated() {
        return generated;
    }

    public void setGenerated(Short generated) {
        this.generated = generated;
    }

    public ActReDeployment getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(ActReDeployment deploymentId) {
        this.deploymentId = deploymentId;
    }

    @XmlTransient
    public List<ActReModel> getActReModelList() {
        return actReModelList;
    }

    public void setActReModelList(List<ActReModel> actReModelList) {
        this.actReModelList = actReModelList;
    }

    @XmlTransient
    public List<ActReModel> getActReModelList1() {
        return actReModelList1;
    }

    public void setActReModelList1(List<ActReModel> actReModelList1) {
        this.actReModelList1 = actReModelList1;
    }

    @XmlTransient
    public List<ActRuVariable> getActRuVariableList() {
        return actRuVariableList;
    }

    public void setActRuVariableList(List<ActRuVariable> actRuVariableList) {
        this.actRuVariableList = actRuVariableList;
    }

    @XmlTransient
    public List<ActRuDeadletterJob> getActRuDeadletterJobList() {
        return actRuDeadletterJobList;
    }

    public void setActRuDeadletterJobList(List<ActRuDeadletterJob> actRuDeadletterJobList) {
        this.actRuDeadletterJobList = actRuDeadletterJobList;
    }

    @XmlTransient
    public List<ActRuJob> getActRuJobList() {
        return actRuJobList;
    }

    public void setActRuJobList(List<ActRuJob> actRuJobList) {
        this.actRuJobList = actRuJobList;
    }

    @XmlTransient
    public List<ActProcdefInfo> getActProcdefInfoList() {
        return actProcdefInfoList;
    }

    public void setActProcdefInfoList(List<ActProcdefInfo> actProcdefInfoList) {
        this.actProcdefInfoList = actProcdefInfoList;
    }

    @XmlTransient
    public List<ActRuSuspendedJob> getActRuSuspendedJobList() {
        return actRuSuspendedJobList;
    }

    public void setActRuSuspendedJobList(List<ActRuSuspendedJob> actRuSuspendedJobList) {
        this.actRuSuspendedJobList = actRuSuspendedJobList;
    }

    @XmlTransient
    public List<ActRuTimerJob> getActRuTimerJobList() {
        return actRuTimerJobList;
    }

    public void setActRuTimerJobList(List<ActRuTimerJob> actRuTimerJobList) {
        this.actRuTimerJobList = actRuTimerJobList;
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
        if (!(object instanceof ActGeBytearray)) {
            return false;
        }
        ActGeBytearray other = (ActGeBytearray) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cirtaflow.business.cirtaflow.ActGeBytearray[ id=" + id + " ]";
    }
    
}
