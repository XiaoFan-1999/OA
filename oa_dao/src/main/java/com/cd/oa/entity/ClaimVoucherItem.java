package com.cd.oa.entity;

/**
 * 报销单明细
 */
public class ClaimVoucherItem {
    private int id;               //编号
    private int claimVoucherId;   //报销单编号
    private String item;          //费用类型
    private double amount;        //金额
    private String comment;       //备注

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

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
