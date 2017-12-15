package shenzhen.teamway.tms9000.portal.mapper;

import java.util.List;

import shenzhen.teamway.tms9000.portal.domain.Orders;
import shenzhen.teamway.tms9000.portal.domain.Person;

public interface PersonMapper {
    /*
    一对多的查询方法
     */
    Person selectList(int id);
}