package com.misaka.Service;

import com.misaka.Domain.PayMent;

public interface PayService {
    //    创建订单
    public Boolean CreatePay(PayMent payMent);
    //    搜索订单 by id
    public PayMent GetPayMentById(int id);
}
