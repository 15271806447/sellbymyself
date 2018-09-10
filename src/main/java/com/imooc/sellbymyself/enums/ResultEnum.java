package com.imooc.sellbymyself.enums;

import lombok.Getter;

/**
 * @author hekai
 * @date 2018/9/7 0007 下午 17:21
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10, "商品不存在"),

    PRODUCT_STOCK_ERROR(11, "商品库存不正确"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
