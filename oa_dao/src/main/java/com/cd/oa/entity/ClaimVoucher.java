package com.cd.oa.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 报销单
 */
public class ClaimVoucher {
    private int id;             //编号
    private String cause;       //创建事由
    private String createId;    //创建ID
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm")
    private Date createTime;    //创建时间
    private String nextDealId;  //待处理人
    private Double totalAmount; //总金额
    private String status; //事由
    private Employee creator; //关联对象
    private Employee dealer;

    public Employee getCreator() {
        return creator;
    }

    public void setCreator(Employee creator) {
        this.creator = creator;
    }

    public Employee getDealer() {
        return dealer;
    }

    public void setDealer(Employee dealer) {
        this.dealer = dealer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNextDealId() {
        return nextDealId;
    }

    public void setNextDealId(String nextDealId) {
        this.nextDealId = nextDealId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
