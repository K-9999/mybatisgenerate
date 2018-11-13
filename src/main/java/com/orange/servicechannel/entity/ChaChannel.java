package com.orange.servicechannel.entity;

import java.io.Serializable;
import java.util.Date;

public class ChaChannel implements Serializable {
    private Integer id;

    private String chaCode;

    private String sequence;

    private Date saveTime;

    private String cipherText;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChaCode() {
        return chaCode;
    }

    public void setChaCode(String chaCode) {
        this.chaCode = chaCode == null ? null : chaCode.trim();
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence == null ? null : sequence.trim();
    }

    public Date getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText == null ? null : cipherText.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", chaCode=").append(chaCode);
        sb.append(", sequence=").append(sequence);
        sb.append(", saveTime=").append(saveTime);
        sb.append(", cipherText=").append(cipherText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}