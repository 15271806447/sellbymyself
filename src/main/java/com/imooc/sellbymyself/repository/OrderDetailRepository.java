package com.imooc.sellbymyself.repository;

import com.imooc.sellbymyself.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author hekai
 * @date 2018/9/6 0006 下午 17:05
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    List<OrderDetail> findByOrderId(String orderId);
}
