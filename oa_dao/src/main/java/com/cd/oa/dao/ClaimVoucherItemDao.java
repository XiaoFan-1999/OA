package com.cd.oa.dao;

import com.cd.oa.entity.ClaimVoucherItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("claimVoucherItemDao")
public interface ClaimVoucherItemDao {
    void add(ClaimVoucherItem Item);

    void delete(int id);

    void update(ClaimVoucherItem Item);

    /**
     * 获取所有某报销项目所属报销单
     * @param claimVoucherId
     * @return
     */
    List<ClaimVoucherItem> selectByClaimVoucher(int claimVoucherId);
}
