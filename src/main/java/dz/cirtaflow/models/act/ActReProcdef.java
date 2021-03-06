/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.cirtaflow.models.act;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author diab
 */
@Entity
@Table(name = "ACT_RE_PROCDEF", catalog = "dev", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"KEY_", "VERSION_", "TENANT_ID_"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActReProcdef.findAll", query = "SELECT a FROM ActReProcdef a")})
public class ActReProcdef implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_", nullable = false, length = 64)
    private String id;
    @Column(name = "REV_")
    private Integer rev;
    @Column(name = "CATEGORY_", length = 255)
    private String category;
    @Column(name = "NAME_", length = 255)
    private String name;
    @Basic(optional = false)
    @Column(name = "KEY_", nullable = false, length = 255)
    private String key;
    @Basic(optional = false)
    @Column(name = "VERSION_", nullable = false)
    private int version;
    @Column(name = "DEPLOYMENT_ID_", length = 64)
    private String deploymentId;
    @Column(name = "RESOURCE_NAME_", length = 4000)
    private String resourceName;
    @Column(name = "DGRM_RESOURCE_NAME_", length = 4000)
    private String dgrmResourceName;
    @Column(name = "DESCRIPTION_", length = 4000)
    private String description;
    @Column(name = "HAS_START_FORM_KEY_")
    private Short hasStartFormKey;
    @Column(name = "HAS_GRAPHICAL_NOTATION_")
    private Short hasGraphicalNotation;
    @Column(name = "SUSPENSION_STATE_")
    private Integer suspensionState;
    @Column(name = "TENANT_ID_", length = 255)
    private String tenantId;
    @Column(name = "ENGINE_VERSION_", length = 255)
    private String engineVersion;
    @OneToMany(mappedBy = "procDefId")
    private List<ActRuTask> actRuTaskList;
    @OneToMany(mappedBy = "procDefId")
    private List<ActRuDeadletterJob> actRuDeadletterJobList;
    @OneToMany(mappedBy = "procDefId")
    private List<ActRuJob> actRuJobList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "procDefId")
    private ActProcdefInfo actProcdefInfo;
    @OneToMany(mappedBy = "procDefId")
    private List<ActRuSuspendedJob> actRuSuspendedJobList;
    @OneToMany(mappedBy = "procDefId")
    private List<ActRuExecution> actRuExecutionList;
    @OneToMany(mappedBy = "procDefId")
    private List<ActRuIdentitylink> actRuIdentitylinkList;
    @OneToMany(mappedBy = "procDefId")
    private List<ActRuTimerJob> actRuTimerJobList;

    public ActReProcdef() {
    }

    public ActReProcdef(String id) {
        this.id = id;
    }

    public ActReProcdef(String id, String key, int version) {
        this.id = id;
        this.key = key;
        this.version = version;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getDgrmResourceName() {
        return dgrmResourceName;
    }

    public void setDgrmResourceName(String dgrmResourceName) {
        this.dgrmResourceName = dgrmResourceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getHasStartFormKey() {
        return hasStartFormKey;
    }

    public void setHasStartFormKey(Short hasStartFormKey) {
        this.hasStartFormKey = hasStartFormKey;
    }

    public Short getHasGraphicalNotation() {
        return hasGraphicalNotation;
    }

    public void setHasGraphicalNotation(Short hasGraphicalNotation) {
        this.hasGraphicalNotation = hasGraphicalNotation;
    }

    public Integer getSuspensionState() {
        return suspensionState;
    }

    public void setSuspensionState(Integer suspensionState) {
        this.suspensionState = suspensionState;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    @XmlTransient
    public List<ActRuTask> getActRuTaskList() {
        return actRuTaskList;
    }

    public void setActRuTaskList(List<ActRuTask> actRuTaskList) {
        this.actRuTaskList = actRuTaskList;
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

    public ActProcdefInfo getActProcdefInfo() {
        return actProcdefInfo;
    }

    public void setActProcdefInfo(ActProcdefInfo actProcdefInfo) {
        this.actProcdefInfo = actProcdefInfo;
    }

    @XmlTransient
    public List<ActRuSuspendedJob> getActRuSuspendedJobList() {
        return actRuSuspendedJobList;
    }

    public void setActRuSuspendedJobList(List<ActRuSuspendedJob> actRuSuspendedJobList) {
        this.actRuSuspendedJobList = actRuSuspendedJobList;
    }

    @XmlTransient
    public List<ActRuExecution> getActRuExecutionList() {
        return actRuExecutionList;
    }

    public void setActRuExecutionList(List<ActRuExecution> actRuExecutionList) {
        this.actRuExecutionList = actRuExecutionList;
    }

    @XmlTransient
    public List<ActRuIdentitylink> getActRuIdentitylinkList() {
        return actRuIdentitylinkList;
    }

    public void setActRuIdentitylinkList(List<ActRuIdentitylink> actRuIdentitylinkList) {
        this.actRuIdentitylinkList = actRuIdentitylinkList;
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
        if (!(object instanceof ActReProcdef)) {
            return false;
        }
        ActReProcdef other = (ActReProcdef) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cirtaflow.business.cirtaflow.ActReProcdef[ id=" + id + " ]";
    }
    
}
