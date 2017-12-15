package shenzhen.teamway.tms9000.portal.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shenzhen.teamway.tms9000.portal.domain.Orders;
import shenzhen.teamway.tms9000.portal.domain.Person;
import shenzhen.teamway.tms9000.portal.mapper.PersonMapper;
import shenzhen.teamway.tms9000.portal.service.PersonService;

import java.util.List;
@Service
public class PersonServiceImp implements PersonService {
    @Autowired
    PersonMapper personMapper;
    @Override
    public Person selectList(int id) {
        return personMapper.selectList(id);
    }
}
