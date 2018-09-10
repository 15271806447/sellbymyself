package com.imooc.sellbymyself.dto;

import com.imooc.sellbymyself.dataobject.OrderDetail;
import com.imooc.sellbymyself.enums.OrderStatusEnum;
import com.imooc.sellbymyself.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author hekai
 * @date 2018/9/7 0007 下午 16:59
 */
@Data
public class OrderDTO {

    //订单
    private String orderId;

    //买家名字
    private String buyerName;

    //买家手机号
    private String buyerPhone;

    //买家地址
    private String buyerAddress;

    //买家微信
    private String buyerOpenid;

    //订单总金额
    private BigDecimal orderAmount;

    //订单状态，默认为新下单
    private Integer orderStatus;

    //支付状态，默认为未支付
    private Integer payStatus;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

    //订单详情
    List<OrderDetail> orderDetailList;
}
