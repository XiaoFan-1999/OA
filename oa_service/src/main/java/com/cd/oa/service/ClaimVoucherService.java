package com.cd.oa.service;


import com.cd.oa.entity.ClaimVoucher;
import com.cd.oa.entity.ClaimVoucherItem;
import com.cd.oa.entity.DealRecord;

import java.util.List;

public interface ClaimVoucherService {

    /**
     * 保存报销单
     * @param claimVoucher
     * @param items
     */
    void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);

    /**
     * 获取报销单
     * @param id
     * @return
     */
    ClaimVoucher get(int id);

    /**
     * 获取报销单条目
     * @param claimVoucherId
     * @return
     */
    List<ClaimVoucherItem> getItems(int claimVoucherId);

    /**
     * 获取处理记录
     * @param claimVoucherId
     * @return
     */
    List<DealRecord> getRecords(int claimVoucherId);

    /**
     * 获取个人报销单
     * @param id
     * @return
     */
    List<ClaimVoucher> getForSelf(String id);

    /**
     * 获取待处理报销单
     * @param id
     * @return
     */
    List<ClaimVoucher> getForDeal(String id);

    /**
     * 修改报销单
     * @param claimVoucher
     * @param items
     */
    void update(ClaimVoucher claimVoucher,List<ClaimVoucherItem> items);

    /**
     * 提交表单
     * @param id
     */
    void submit(int id);

    /**
     * 报销单审核与打款
     * @param dealRecord
     */
    void deal(DealRecord dealRecord);
}
