package com.imooc.sellbymyself.exception;

import com.imooc.sellbymyself.enums.ResultEnum;

/**
 * @author hekai
 * @date 2018/9/7 0007 下午 17:12
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

}
