package cn.eone.productordemo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class ProductorDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductorDemoApplication.class, args);
    }
}
