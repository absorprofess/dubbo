package cn.eone.consumerdemo.controller;


import cn.eone.service.DemoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：pengzhaofeng
 * @ Date       ：Created in 9:11 2018/12/8 0008
 * @ Description：demo
 * @ Modified By：
 * @Version: 1.0
 **/
@RestController
public class DemoController {

    @Reference
    private DemoService demoService;

    @RequestMapping("/getInfo")
    public String getInfo() {
        return demoService.getInfo();
    }
}
