package com.zzyy.zyboot.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rs_account")
public class RsAccount {
    @Id
    private Integer id;

    private BigDecimal balance;

    @Column(name = "accumulat_increase")
    private BigDecimal accumulatIncrease;

    @Column(name = "accumulat_decrease")
    private BigDecimal accumulatDecrease;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    private String operater;

    @Column(name = "last_balance")
    private BigDecimal lastBalance;

    @Column(name = "rs_name")
    private String rsName;

    @Column(name = "re_num")
    private String reNum;

    private Integer version;

    private String description;

    private String spell;

    @Column(name = "first_spell")
    private String firstSpell;

    @Column(name = "personMark")
    private String personmark;

    /**
     * true
     */
    private Boolean status;

    @Column(name = "operateAmount")
    private BigDecimal operateamount;

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
     * @return balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * @param balance
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * @return accumulat_increase
     */
    public BigDecimal getAccumulatIncrease() {
        return accumulatIncrease;
    }

    /**
     * @param accumulatIncrease
     */
    public void setAccumulatIncrease(BigDecimal accumulatIncrease) {
        this.accumulatIncrease = accumulatIncrease;
    }

    /**
     * @return accumulat_decrease
     */
    public BigDecimal getAccumulatDecrease() {
        return accumulatDecrease;
    }

    /**
     * @param accumulatDecrease
     */
    public void setAccumulatDecrease(BigDecimal accumulatDecrease) {
        this.accumulatDecrease = accumulatDecrease;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return modify_date
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * @return operater
     */
    public String getOperater() {
        return operater;
    }

    /**
     * @param operater
     */
    public void setOperater(String operater) {
        this.operater = operater == null ? null : operater.trim();
    }

    /**
     * @return last_balance
     */
    public BigDecimal getLastBalance() {
        return lastBalance;
    }

    /**
     * @param lastBalance
     */
    public void setLastBalance(BigDecimal lastBalance) {
        this.lastBalance = lastBalance;
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
     * @return re_num
     */
    public String getReNum() {
        return reNum;
    }

    /**
     * @param reNum
     */
    public void setReNum(String reNum) {
        this.reNum = reNum == null ? null : reNum.trim();
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
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
     * @return spell
     */
    public String getSpell() {
        return spell;
    }

    /**
     * @param spell
     */
    public void setSpell(String spell) {
        this.spell = spell == null ? null : spell.trim();
    }

    /**
     * @return first_spell
     */
    public String getFirstSpell() {
        return firstSpell;
    }

    /**
     * @param firstSpell
     */
    public void setFirstSpell(String firstSpell) {
        this.firstSpell = firstSpell == null ? null : firstSpell.trim();
    }

    /**
     * @return personMark
     */
    public String getPersonmark() {
        return personmark;
    }

    /**
     * @param personmark
     */
    public void setPersonmark(String personmark) {
        this.personmark = personmark == null ? null : personmark.trim();
    }

    /**
     * 获取true
     *
     * @return status - true
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置true
     *
     * @param status true
     */
    public void setStatus(Boolean status) {
        this.status = status;
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
}
