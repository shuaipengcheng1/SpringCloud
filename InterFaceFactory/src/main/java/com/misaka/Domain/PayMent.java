package com.misaka.Domain;

import java.io.Serializable;

// 订单实体类
public class PayMent  implements Serializable {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public PayMent(String id, String detail) {
        this.id = id;
        Detail = detail;
    }

    public String id;

    public PayMent() {
    }

    public String Detail;
}
