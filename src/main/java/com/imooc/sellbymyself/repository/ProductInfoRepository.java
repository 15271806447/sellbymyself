package com.imooc.sellbymyself.repository;

import com.imooc.sellbymyself.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author hekai
 * @date 2018/9/4 0004 下午 19:01
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
