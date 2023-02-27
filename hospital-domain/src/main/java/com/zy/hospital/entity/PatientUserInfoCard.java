package com.zy.hospital.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName patient_user_info_card
 */
@Data
public class PatientUserInfoCard implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer userId;

    /**
     * 
     */
    private String uuid;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String sex;

    /**
     * 
     */
    private String pid;

    /**
     * 
     */
    private String tel;

    /**
     * 
     */
    private Date birthday;

    /**
     * 
     */
    private String medicalHistory;

    /**
     * 
     */
    private String insuranceType;

    /**
     * 
     */
    private Integer existFaceModel;

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
        PatientUserInfoCard other = (PatientUserInfoCard) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getMedicalHistory() == null ? other.getMedicalHistory() == null : this.getMedicalHistory().equals(other.getMedicalHistory()))
            && (this.getInsuranceType() == null ? other.getInsuranceType() == null : this.getInsuranceType().equals(other.getInsuranceType()))
            && (this.getExistFaceModel() == null ? other.getExistFaceModel() == null : this.getExistFaceModel().equals(other.getExistFaceModel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getMedicalHistory() == null) ? 0 : getMedicalHistory().hashCode());
        result = prime * result + ((getInsuranceType() == null) ? 0 : getInsuranceType().hashCode());
        result = prime * result + ((getExistFaceModel() == null) ? 0 : getExistFaceModel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", uuid=").append(uuid);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", pid=").append(pid);
        sb.append(", tel=").append(tel);
        sb.append(", birthday=").append(birthday);
        sb.append(", medicalHistory=").append(medicalHistory);
        sb.append(", insuranceType=").append(insuranceType);
        sb.append(", existFaceModel=").append(existFaceModel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}