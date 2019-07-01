package github.roger.service.impl;

import github.roger.BaseSpringTestSuit;
import github.roger.entity.Order;
import github.roger.service.OrderService;
import github.roger.vo.OrderVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImplTest extends BaseSpringTestSuit {

    @Autowired
    private OrderService orderService;

    @Test
    public void findOrderListByUserId() {
        List<OrderVo> orderVoList = orderService.findOrderListByUserId(1);
        for (OrderVo temp:orderVoList) {
            System.out.println(temp);
        }
    }
}