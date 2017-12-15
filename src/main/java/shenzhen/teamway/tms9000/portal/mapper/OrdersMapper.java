package shenzhen.teamway.tms9000.portal.mapper;

import java.util.List;

import shenzhen.teamway.tms9000.portal.domain.Orders;

public interface OrdersMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(Orders record);

    Orders selectByPrimaryKey(String orderid);

    /*
     查询所有值
     */
    List<Orders> selectAll();

    int updateByPrimaryKey(Orders record);
}