package com.imooc.sellbymyself.dataobject;

import com.imooc.sellbymyself.enums.OrderStatusEnum;
import com.imooc.sellbymyself.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author hekai
 * @date 2018/9/6 0006 下午 16:02
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    //订单
    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    //支付状态，默认为未支付
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

//    //订单详情
//    @Transient//这处加这个属性是为方便程序调用，但数据库没有这个字段，不加该注解会报错。
//    private List<OrderDetail> orderDetailList;
//    但一般不这样写，这样缺乏规范，要写在dto层里
}
