package com.zy.hospital.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName doctor_prescription
 */
@Data
public class DoctorPrescription implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String uuid;

    /**
     * 
     */
    private Integer patientCardId;

    /**
     * 
     */
    private String diagnosis;

    /**
     * 
     */
    private Integer subDeptId;

    /**
     * 
     */
    private Integer doctorId;

    /**
     * 
     */
    private Integer registrationId;

    /**
     * 处方
     */
    private String rp;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DoctorPrescription other = (DoctorPrescription) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getPatientCardId() == null ? other.getPatientCardId() == null : this.getPatientCardId().equals(other.getPatientCardId()))
            && (this.getDiagnosis() == null ? other.getDiagnosis() == null : this.getDiagnosis().equals(other.getDiagnosis()))
            && (this.getSubDeptId() == null ? other.getSubDeptId() == null : this.getSubDeptId().equals(other.getSubDeptId()))
            && (this.getDoctorId() == null ? other.getDoctorId() == null : this.getDoctorId().equals(other.getDoctorId()))
            && (this.getRegistrationId() == null ? other.getRegistrationId() == null : this.getRegistrationId().equals(other.getRegistrationId()))
            && (this.getRp() == null ? other.getRp() == null : this.getRp().equals(other.getRp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getPatientCardId() == null) ? 0 : getPatientCardId().hashCode());
        result = prime * result + ((getDiagnosis() == null) ? 0 : getDiagnosis().hashCode());
        result = prime * result + ((getSubDeptId() == null) ? 0 : getSubDeptId().hashCode());
        result = prime * result + ((getDoctorId() == null) ? 0 : getDoctorId().hashCode());
        result = prime * result + ((getRegistrationId() == null) ? 0 : getRegistrationId().hashCode());
        result = prime * result + ((getRp() == null) ? 0 : getRp().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uuid=").append(uuid);
        sb.append(", patientCardId=").append(patientCardId);
        sb.append(", diagnosis=").append(diagnosis);
        sb.append(", subDeptId=").append(subDeptId);
        sb.append(", doctorId=").append(doctorId);
        sb.append(", registrationId=").append(registrationId);
        sb.append(", rp=").append(rp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}