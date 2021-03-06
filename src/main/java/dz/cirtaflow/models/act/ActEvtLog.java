/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.cirtaflow.models.act;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author diab
 */
@Entity
@Table(name = "ACT_EVT_LOG", catalog = "dev", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActEvtLog.findAll", query = "SELECT a FROM ActEvtLog a")})
public class ActEvtLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LOG_NR_", nullable = false)
    private Long logNr;
    @Column(name = "TYPE_", length = 64)
    private String type;
    @Column(name = "PROC_DEF_ID_", length = 64)
    private String procDefId;
    @Column(name = "PROC_INST_ID_", length = 64)
    private String procInstId;
    @Column(name = "EXECUTION_ID_", length = 64)
    private String executionId;
    @Column(name = "TASK_ID_", length = 64)
    private String taskId;
    @Basic(optional = false)
    @Column(name = "TIME_STAMP_", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "USER_ID_", length = 255)
    private String userId;
    @Lob
    @Column(name = "DATA_")
    private byte[] data;
    @Column(name = "LOCK_OWNER_", length = 255)
    private String lockOwner;
    @Column(name = "LOCK_TIME_")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lockTime;
    @Column(name = "IS_PROCESSED_")
    private Short isProcessed;

    public ActEvtLog() {
    }

    public ActEvtLog(Long logNr) {
        this.logNr = logNr;
    }

    public ActEvtLog(Long logNr, Date timeStamp) {
        this.logNr = logNr;
        this.timeStamp = timeStamp;
    }

    public Long getLogNr() {
        return logNr;
    }

    public void setLogNr(Long logNr) {
        this.logNr = logNr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(String procDefId) {
        this.procDefId = procDefId;
    }

    public String getProcInstId() {
        return procInstId;
    }

    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getLockOwner() {
        return lockOwner;
    }

    public void setLockOwner(String lockOwner) {
        this.lockOwner = lockOwner;
    }

    public Date getLockTime() {
        return lockTime;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    public Short getIsProcessed() {
        return isProcessed;
    }

    public void setIsProcessed(Short isProcessed) {
        this.isProcessed = isProcessed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logNr != null ? logNr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActEvtLog)) {
            return false;
        }
        ActEvtLog other = (ActEvtLog) object;
        if ((this.logNr == null && other.logNr != null) || (this.logNr != null && !this.logNr.equals(other.logNr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cirtaflow.business.cirtaflow.ActEvtLog[ logNr=" + logNr + " ]";
    }
    
}
