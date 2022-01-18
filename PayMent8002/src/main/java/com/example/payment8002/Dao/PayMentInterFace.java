package com.example.payment8002.Dao;


import com.misaka.Domain.PayMent;
import org.apache.ibatis.annotations.Mapper;


//接口
@Mapper
public interface PayMentInterFace {
//    创建订单
    public int CreatePay(PayMent payMent);
//    搜索订单 by id
    public PayMent GetPayMentById(int id);
}
