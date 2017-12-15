package shenzhen.teamway.tms9000.portal.service;

import shenzhen.teamway.tms9000.portal.domain.Orders;

import java.util.List;

public interface OrderService {
    List<Orders> selectAll();
}
