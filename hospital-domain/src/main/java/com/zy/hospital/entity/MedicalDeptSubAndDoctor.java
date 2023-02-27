package com.zy.hospital.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName medical_dept_sub_and_doctor
 */
@Data
public class MedicalDeptSubAndDoctor implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer deptSubId;

    /**
     * 
     */
    private Integer doctorId;

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
        MedicalDeptSubAndDoctor other = (MedicalDeptSubAndDoctor) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDeptSubId() == null ? other.getDeptSubId() == null : this.getDeptSubId().equals(other.getDeptSubId()))
            && (this.getDoctorId() == null ? other.getDoctorId() == null : this.getDoctorId().equals(other.getDoctorId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDeptSubId() == null) ? 0 : getDeptSubId().hashCode());
        result = prime * result + ((getDoctorId() == null) ? 0 : getDoctorId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deptSubId=").append(deptSubId);
        sb.append(", doctorId=").append(doctorId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}