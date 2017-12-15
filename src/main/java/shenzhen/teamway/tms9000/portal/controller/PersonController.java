package shenzhen.teamway.tms9000.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import shenzhen.teamway.tms9000.portal.domain.Orders;
import shenzhen.teamway.tms9000.portal.domain.Person;
import shenzhen.teamway.tms9000.portal.service.PersonService;

import java.util.List;
@Controller
public class PersonController {
    @Autowired
    PersonService personService;
    @RequestMapping("/ok/{id}")
    public String getList(ModelMap map,@PathVariable("id")int id){

        final Person person = personService.selectList(id);
        System.out.println(person);
        final List<Orders> orders = person.getOrders();
        for (Orders order : orders) {
            System.out.println(order);
        }
        return "success";
    }
}



