package com.zy.hospital.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName medical_dept
 */
@Data
public class MedicalDept implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer outpatient;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private Integer recommended;

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
        MedicalDept other = (MedicalDept) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOutpatient() == null ? other.getOutpatient() == null : this.getOutpatient().equals(other.getOutpatient()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getRecommended() == null ? other.getRecommended() == null : this.getRecommended().equals(other.getRecommended()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOutpatient() == null) ? 0 : getOutpatient().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getRecommended() == null) ? 0 : getRecommended().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", outpatient=").append(outpatient);
        sb.append(", description=").append(description);
        sb.append(", recommended=").append(recommended);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}