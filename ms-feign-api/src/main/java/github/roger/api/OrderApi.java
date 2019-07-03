package github.roger.api;


import github.roger.vo.OrderVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 *  name对应服务提供者的应用名:
 *          spring.application.name=ms-provider-order
 *  path 对应Controller类上的@RequestMapping的值
 *
 *  把对应Controller中的方法签名迁移过来，
 *  包含方法上的@RequestMapping原样迁移过来
 */
@FeignClient(name = "ms-provider-order",path = "/order")
public interface OrderApi {

    @RequestMapping("/queryOrdersByUserId/{userId}")
    List<OrderVo> queryOrdersByUserId(@PathVariable("userId") Integer userId);

    @RequestMapping("/getRegisterInfo")
    String getRegisterInfo();
}
