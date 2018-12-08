package cn.eone.productordemo.service.impl;

import cn.eone.service.DemoService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @ Author     ：pengzhaofeng
 * @ Date       ：Created in 9:55 2018/12/8 0008
 * @ Description：
 * @ Modified By：
 * @Version:
 **/
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String getInfo() {
        return "RPC远程调用成功!";
    }
}
