package github.roger.mapper;

import github.roger.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {

    @Select("select * from orders t where t.user_id = #{userId}")
    public List<Order> findListByUserId(Integer userId);

}
