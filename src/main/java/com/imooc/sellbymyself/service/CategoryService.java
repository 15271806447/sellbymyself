package com.imooc.sellbymyself.service;

import com.imooc.sellbymyself.dataobject.ProductCategory;

import java.util.List;

/**
 * @author hekai
 * @date 2018/9/4 0004 下午 16:48
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
