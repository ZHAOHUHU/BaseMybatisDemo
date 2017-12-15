package shenzhen.teamway.tms9000.portal.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shenzhen.teamway.tms9000.portal.domain.Orders;
import shenzhen.teamway.tms9000.portal.mapper.OrdersMapper;
import shenzhen.teamway.tms9000.portal.service.OrderService;

import java.util.List;
@Service
public class OrderServiceImp implements OrderService {
@Autowired
    OrdersMapper ordersMapper;
    @Override
    public List<Orders> selectAll() {
        return ordersMapper.selectAll();
    }
}
