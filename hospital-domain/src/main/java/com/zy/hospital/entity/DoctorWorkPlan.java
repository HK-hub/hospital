package com.zy.hospital.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName doctor_work_plan
 */
@Data
public class DoctorWorkPlan implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer doctorId;

    /**
     * 
     */
    private Integer deptSubId;

    /**
     * 
     */
    private Date date;

    /**
     * 
     */
    private Integer maximum;

    /**
     * 
     */
    private Integer num;

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
        DoctorWorkPlan other = (DoctorWorkPlan) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDoctorId() == null ? other.getDoctorId() == null : this.getDoctorId().equals(other.getDoctorId()))
            && (this.getDeptSubId() == null ? other.getDeptSubId() == null : this.getDeptSubId().equals(other.getDeptSubId()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getMaximum() == null ? other.getMaximum() == null : this.getMaximum().equals(other.getMaximum()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDoctorId() == null) ? 0 : getDoctorId().hashCode());
        result = prime * result + ((getDeptSubId() == null) ? 0 : getDeptSubId().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", doctorId=").append(doctorId);
        sb.append(", deptSubId=").append(deptSubId);
        sb.append(", date=").append(date);
        sb.append(", maximum=").append(maximum);
        sb.append(", num=").append(num);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}