package github.roger.service;

import github.roger.vo.OrderVo;

import java.util.List;

public interface OrderService {

    List<OrderVo> findOrderListByUserId(Integer userId);

}
