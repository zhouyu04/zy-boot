package com.zzyy.zyboot.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "transaction_flow")
public class TransactionFlow {
    @Id
    private Integer id;

    @Column(name = "rs_name")
    private String rsName;

    @Column(name = "rs_num")
    private Integer rsNum;

    @Column(name = "operateAmount")
    private BigDecimal operateamount;

    @Column(name = "date_create")
    private Date dateCreate;

    private String description;

    private Boolean status;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return rs_name
     */
    public String getRsName() {
        return rsName;
    }

    /**
     * @param rsName
     */
    public void setRsName(String rsName) {
        this.rsName = rsName == null ? null : rsName.trim();
    }

    /**
     * @return rs_num
     */
    public Integer getRsNum() {
        return rsNum;
    }

    /**
     * @param rsNum
     */
    public void setRsNum(Integer rsNum) {
        this.rsNum = rsNum;
    }

    /**
     * @return operateAmount
     */
    public BigDecimal getOperateamount() {
        return operateamount;
    }

    /**
     * @param operateamount
     */
    public void setOperateamount(BigDecimal operateamount) {
        this.operateamount = operateamount;
    }

    /**
     * @return date_create
     */
    public Date getDateCreate() {
        return dateCreate;
    }

    /**
     * @param dateCreate
     */
    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}
