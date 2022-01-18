package com.misaka.Domain;
//Json实体类
public class ReturnJson {
    public  int code;
    public String detail;

    public ReturnJson() {
    }

    public ReturnJson(int code, String detail) {
        this.code = code;
        this.detail = detail;
    }
}
