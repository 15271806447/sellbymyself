package com.imooc.sellbymyself.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author hekai
 * @date 2018/9/4 0004 下午 20:24
 */
@Data
public class ResultVO<T> {

    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //具体内容
    private T data;
}
