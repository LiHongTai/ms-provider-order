package github.roger.controller;

import github.roger.service.OrderService;
import github.roger.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @Autowired
    private ServiceInstance serviceInstance;

    @RequestMapping("/queryOrderListByUserId/{userId}")
    public List<OrderVo> queryOrderListByUserId(@PathVariable("userId") Integer userId){
        return orderService.findOrderListByUserId(userId);
    }

    @RequestMapping("/getRegisterInfo")
    public String getRegisterInfo(){
        return serviceInstance.getHost() + ":" + serviceInstance.getPort();
    }
}
