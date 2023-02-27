package com.zy.hospital.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName video_diagnose
 */
@Data
public class VideoDiagnose implements Serializable {
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
    private Integer doctorId;

    /**
     * 
     */
    private String outTradeNo;

    /**
     * 
     */
    private BigDecimal amount;

    /**
     * 
     */
    private Integer paymentStatus;

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
    private Date expectStart;

    /**
     * 
     */
    private Date expectEnd;

    /**
     * 
     */
    private Date realStart;

    /**
     * 
     */
    private Date realEnd;

    /**
     * 
     */
    private Integer status;

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
        VideoDiagnose other = (VideoDiagnose) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPatientCardId() == null ? other.getPatientCardId() == null : this.getPatientCardId().equals(other.getPatientCardId()))
            && (this.getDoctorId() == null ? other.getDoctorId() == null : this.getDoctorId().equals(other.getDoctorId()))
            && (this.getOutTradeNo() == null ? other.getOutTradeNo() == null : this.getOutTradeNo().equals(other.getOutTradeNo()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getPaymentStatus() == null ? other.getPaymentStatus() == null : this.getPaymentStatus().equals(other.getPaymentStatus()))
            && (this.getPrepayId() == null ? other.getPrepayId() == null : this.getPrepayId().equals(other.getPrepayId()))
            && (this.getTransactionId() == null ? other.getTransactionId() == null : this.getTransactionId().equals(other.getTransactionId()))
            && (this.getExpectStart() == null ? other.getExpectStart() == null : this.getExpectStart().equals(other.getExpectStart()))
            && (this.getExpectEnd() == null ? other.getExpectEnd() == null : this.getExpectEnd().equals(other.getExpectEnd()))
            && (this.getRealStart() == null ? other.getRealStart() == null : this.getRealStart().equals(other.getRealStart()))
            && (this.getRealEnd() == null ? other.getRealEnd() == null : this.getRealEnd().equals(other.getRealEnd()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPatientCardId() == null) ? 0 : getPatientCardId().hashCode());
        result = prime * result + ((getDoctorId() == null) ? 0 : getDoctorId().hashCode());
        result = prime * result + ((getOutTradeNo() == null) ? 0 : getOutTradeNo().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getPaymentStatus() == null) ? 0 : getPaymentStatus().hashCode());
        result = prime * result + ((getPrepayId() == null) ? 0 : getPrepayId().hashCode());
        result = prime * result + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        result = prime * result + ((getExpectStart() == null) ? 0 : getExpectStart().hashCode());
        result = prime * result + ((getExpectEnd() == null) ? 0 : getExpectEnd().hashCode());
        result = prime * result + ((getRealStart() == null) ? 0 : getRealStart().hashCode());
        result = prime * result + ((getRealEnd() == null) ? 0 : getRealEnd().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", doctorId=").append(doctorId);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", amount=").append(amount);
        sb.append(", paymentStatus=").append(paymentStatus);
        sb.append(", prepayId=").append(prepayId);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", expectStart=").append(expectStart);
        sb.append(", expectEnd=").append(expectEnd);
        sb.append(", realStart=").append(realStart);
        sb.append(", realEnd=").append(realEnd);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}