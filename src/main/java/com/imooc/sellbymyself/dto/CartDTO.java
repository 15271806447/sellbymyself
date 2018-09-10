package com.imooc.sellbymyself.dto;

import lombok.Data;

/**
 * 购物车
 * @author hekai
 * @date 2018/9/7 0007 下午 21:19
 */
@Data
public class CartDTO {

    //商品ID
    private String productId;

    //数量
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
