package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;

/**
 * @ClassName ResultVOUtil
 * @Description TODO
 * @Author hxh
 * @Date 2020/4/26 11:56 下午
 * @Version 1.0
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
