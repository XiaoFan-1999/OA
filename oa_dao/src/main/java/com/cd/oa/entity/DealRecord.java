package com.cd.oa.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 报销单处理记录实体类
 */
public class DealRecord {
    private int id;         // 编号
    private int claimVoucherId;     //报销单编号
    private String dealId;          //处理人
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm")
    private Date dealTime;          //处理时间
    private String dealType;        //处理类型
    private String dealResult;      //处理结果
    private String comment;         //备注
    private Employee dealer;      //关联

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

    public int getClaimVoucherId() {
        return claimVoucherId;
    }

    public void setClaimVoucherId(int claimVoucherId) {
        this.claimVoucherId = claimVoucherId;
    }

    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public String getDealResult() {
        return dealResult;
    }

    public void setDealResult(String dealResult) {
        this.dealResult = dealResult;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
