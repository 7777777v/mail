package com.springboot.email.web;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName IndexController
 * @Description index controller
 * @Author 2985062714@qq.com
 * @Date 2019/8/2 16:08
 * @Version 1.0
 */
@Api(tags = "通用访问拦截匹配")
@Controller
public class IndexController {

    /** 页面跳转 */
    @GetMapping("{url}.shtml")
    public String page(@PathVariable("url") String url){
        return url;
    }

    /** 页面跳转(二级目录) */
    public String page(@PathVariable("module")String module,@PathVariable("url") String url){

        return module + "/" + url;
    }

}
