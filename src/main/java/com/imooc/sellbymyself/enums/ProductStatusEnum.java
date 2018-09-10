package com.imooc.sellbymyself.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author hekai
 * @date 2018/9/4 0004 下午 19:34
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
