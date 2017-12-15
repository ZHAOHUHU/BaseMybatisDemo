package shenzhen.teamway.tms9000.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import shenzhen.teamway.tms9000.portal.domain.Orders;
import shenzhen.teamway.tms9000.portal.service.OrderService;

import java.util.List;

@Controller
public class OrdersController {
    @Autowired
    OrderService orderService;

    @RequestMapping("/ok")
    public  String index(){
        return "ok";
    }
    @RequestMapping("/list")
    @ResponseBody
    public  ModelMap  getList(){
        ModelMap map=new ModelMap();
        final List<Orders> orders = orderService.selectAll();
        map.put("orders", orders);
        for (Orders order : orders) {
            System.out.println(order);
        }
        return map;
    }
}
