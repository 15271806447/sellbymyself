package com.imooc.sellbymyself.enums;

import lombok.Getter;

/**
 * @author hekai
 * @date 2018/9/6 0006 下午 16:08
 */
@Getter
public enum  OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
