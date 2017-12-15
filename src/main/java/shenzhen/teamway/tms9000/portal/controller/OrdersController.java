package shenzhen.teamway.tms9000.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import shenzhen.teamway.tms9000.portal.domain.Orders;
import shenzhen.teamway.tms9000.portal.service.OrderService;

import java.util.List;

@Controller
public class OrdersController {
    @Autowired
    OrderService orderService;
    @RequestMapping("/list")
    public  String  getList(ModelMap map){
        final List<Orders> orders = orderService.selectAll();
        map.put("orders", orders);
        for (Orders order : orders) {
            System.out.println(order);
        }
        return "ok";
    }
}
