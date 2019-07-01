package github.roger.service.impl;

import github.roger.entity.Order;
import github.roger.mapper.OrderMapper;
import github.roger.service.OrderService;
import github.roger.vo.OrderVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<OrderVo> findOrderListByUserId(Integer userId) {
        List<Order> orderList = orderMapper.findListByUserId(userId);
        if(CollectionUtils.isEmpty(orderList)){
            return new ArrayList<>();
        }
        List<OrderVo> orderVoList = new ArrayList<>();
        orderList.forEach((order)->{
            OrderVo orderVo = new OrderVo();
            BeanUtils.copyProperties(order,orderVo);
            orderVoList.add(orderVo);
        });
        return orderVoList;
    }
}
