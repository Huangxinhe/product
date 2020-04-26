package com.imooc.product.VO;

import lombok.Data;

/**
 * @ClassName ResultVO
 * @Description TODO
 * @Author hxh
 * @Date 2020/4/26 11:34 下午
 * @Version 1.0
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
