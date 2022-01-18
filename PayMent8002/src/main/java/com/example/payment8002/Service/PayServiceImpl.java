package com.example.payment8002.Service;

import com.example.payment8002.Dao.PayMentInterFace;

import com.misaka.Domain.PayMent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PayServiceImpl implements PayService {
    @Autowired
    PayMentInterFace payMentInterFace;
    @Override
    public Boolean CreatePay(PayMent payMent) {
        int result = payMentInterFace.CreatePay(payMent);
        if(result!=0){
            return true;
        }else

        return false;
    }

    @Override
    public PayMent GetPayMentById(int id) {
        return payMentInterFace.GetPayMentById(id);
    }
}
