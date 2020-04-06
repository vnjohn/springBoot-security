package com.security.controller;

import com.security.common.util.ResultUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

/**
 * 初始页面
 * @author zwq
 * @date 2020-04-04
**/
@RestController
@RequestMapping("/index")
public class IndexController {


    /**
     * 首页
     * @author zwq
     * @date 2020/4/4
     * @return
     **/
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public Map<String,Object> userLogin(){
        // 组装参数
        Map<String,Object> result = new HashMap<>();
        result.put("title","这里是首页不需要权限和登录拦截");
        return ResultUtil.resultSuccess(result);
    }

}
