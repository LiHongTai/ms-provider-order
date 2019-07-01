package github.roger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//从Spring Cloud Edgware开始，@EnableDiscoveryClient 或@EnableEurekaClient 可省略
@EnableDiscoveryClient
@Slf4j
public class MsProviderOrder8002Application {

    public static void main(String[] args) {
        SpringApplication.run(MsProviderOrder8002Application.class, args);
        log.info("微服务订单服务的提供者8002启动....");
    }
}
