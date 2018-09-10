package com.imooc.sellbymyself.enums;

import lombok.Getter;

/**
 * @author hekai
 * @date 2018/9/6 0006 下午 16:37
 */
@Getter
public enum  PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;
    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
