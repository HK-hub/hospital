package com.zy.hospital.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName doctor_work_plan_schedule
 */
@Data
public class DoctorWorkPlanSchedule implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer workPlanId;

    /**
     * 
     */
    private Integer slot;

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
        DoctorWorkPlanSchedule other = (DoctorWorkPlanSchedule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkPlanId() == null ? other.getWorkPlanId() == null : this.getWorkPlanId().equals(other.getWorkPlanId()))
            && (this.getSlot() == null ? other.getSlot() == null : this.getSlot().equals(other.getSlot()))
            && (this.getMaximum() == null ? other.getMaximum() == null : this.getMaximum().equals(other.getMaximum()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkPlanId() == null) ? 0 : getWorkPlanId().hashCode());
        result = prime * result + ((getSlot() == null) ? 0 : getSlot().hashCode());
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
        sb.append(", workPlanId=").append(workPlanId);
        sb.append(", slot=").append(slot);
        sb.append(", maximum=").append(maximum);
        sb.append(", num=").append(num);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}