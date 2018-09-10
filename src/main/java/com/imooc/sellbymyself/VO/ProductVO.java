package com.imooc.sellbymyself.VO;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.imooc.sellbymyself.dataobject.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * 商品（包含类目）
 * @author hekai
 * @date 2018/9/4 0004 下午 20:41
 */
@Data
public class ProductVO {

    @JsonProperty("name")//返回给前端时，属性名为"name"
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
