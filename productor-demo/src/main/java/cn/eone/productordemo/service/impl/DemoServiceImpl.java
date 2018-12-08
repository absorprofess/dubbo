package cn.eone.productordemo.service.impl;

import cn.eone.service.DemoService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：pengzhaofeng
 * @ Date       ：Created in 9:55 2018/12/8 0008
 * @ Description：demo
 * @ Modified By：
 * @Version: 1.0
 **/
@Service
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public String getInfo() {
        return "RPC远程调用成功!";
    }
}
