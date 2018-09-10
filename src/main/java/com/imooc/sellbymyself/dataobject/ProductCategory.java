package com.imooc.sellbymyself.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 * @author hekai
 * @date 2018/9/4 0004 下午 14:43
 * 数据库表名默认规范是product_category
 * 如果表名不同如：s_product_category,则要在类声明前加注释：@Table(name = "s_product_category")
 */
@Entity
@DynamicUpdate//动态更新时间
@Data
public class ProductCategory {

    //类目id.
    @Id
    @GeneratedValue
    private Integer categoryId;

    //类目名字
    private String categoryName;

    //类目编号
    private Integer categoryType;

    //创建时间
    private Date createTime;

    //修改时间
    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
