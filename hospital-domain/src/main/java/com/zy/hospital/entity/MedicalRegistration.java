package com.zy.hospital.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName medical_registration
 */
@Data
public class MedicalRegistration implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer patientCardId;

    /**
     * 
     */
    private Integer workPlanId;

    /**
     * 
     */
    private Integer doctorScheduleId;

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
    private Integer slot;

    /**
     * 
     */
    private BigDecimal amount;

    /**
     * 
     */
    private String outTradeNo;

    /**
     * 
     */
    private String prepayId;

    /**
     * 
     */
    private String transactionId;

    /**
     * 
     */
    private Integer paymentStatus;

    /**
     * 
     */
    private Date createTime;

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
        MedicalRegistration other = (MedicalRegistration) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPatientCardId() == null ? other.getPatientCardId() == null : this.getPatientCardId().equals(other.getPatientCardId()))
            && (this.getWorkPlanId() == null ? other.getWorkPlanId() == null : this.getWorkPlanId().equals(other.getWorkPlanId()))
            && (this.getDoctorScheduleId() == null ? other.getDoctorScheduleId() == null : this.getDoctorScheduleId().equals(other.getDoctorScheduleId()))
            && (this.getDoctorId() == null ? other.getDoctorId() == null : this.getDoctorId().equals(other.getDoctorId()))
            && (this.getDeptSubId() == null ? other.getDeptSubId() == null : this.getDeptSubId().equals(other.getDeptSubId()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getSlot() == null ? other.getSlot() == null : this.getSlot().equals(other.getSlot()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getOutTradeNo() == null ? other.getOutTradeNo() == null : this.getOutTradeNo().equals(other.getOutTradeNo()))
            && (this.getPrepayId() == null ? other.getPrepayId() == null : this.getPrepayId().equals(other.getPrepayId()))
            && (this.getTransactionId() == null ? other.getTransactionId() == null : this.getTransactionId().equals(other.getTransactionId()))
            && (this.getPaymentStatus() == null ? other.getPaymentStatus() == null : this.getPaymentStatus().equals(other.getPaymentStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPatientCardId() == null) ? 0 : getPatientCardId().hashCode());
        result = prime * result + ((getWorkPlanId() == null) ? 0 : getWorkPlanId().hashCode());
        result = prime * result + ((getDoctorScheduleId() == null) ? 0 : getDoctorScheduleId().hashCode());
        result = prime * result + ((getDoctorId() == null) ? 0 : getDoctorId().hashCode());
        result = prime * result + ((getDeptSubId() == null) ? 0 : getDeptSubId().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getSlot() == null) ? 0 : getSlot().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getOutTradeNo() == null) ? 0 : getOutTradeNo().hashCode());
        result = prime * result + ((getPrepayId() == null) ? 0 : getPrepayId().hashCode());
        result = prime * result + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        result = prime * result + ((getPaymentStatus() == null) ? 0 : getPaymentStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", patientCardId=").append(patientCardId);
        sb.append(", workPlanId=").append(workPlanId);
        sb.append(", doctorScheduleId=").append(doctorScheduleId);
        sb.append(", doctorId=").append(doctorId);
        sb.append(", deptSubId=").append(deptSubId);
        sb.append(", date=").append(date);
        sb.append(", slot=").append(slot);
        sb.append(", amount=").append(amount);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", prepayId=").append(prepayId);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", paymentStatus=").append(paymentStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}