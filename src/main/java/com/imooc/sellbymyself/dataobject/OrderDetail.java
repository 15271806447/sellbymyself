package com.imooc.sellbymyself.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author hekai
 * @date 2018/9/6 0006 下午 16:49
 */
@Entity
@Data
@DynamicUpdate
public class OrderDetail {

    @Id
    private String detailId;

    //订单id
    private String orderId;

    //商品名
    private String productName;

    //商品id
    private String productId;

    //单价
    private BigDecimal productPrice;

    //商品数量
    private Integer productQuantity;

    //商品小图
    private String productIcon;

}
