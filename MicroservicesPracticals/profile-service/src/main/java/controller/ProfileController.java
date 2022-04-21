package controller;

import com.rentcloud.commons.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.CustomerService;

@RestController
public class ProfileController {

    @Autowired
    CustomerService customerService;
    @RequestMapping(value = "/profile")
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

}
