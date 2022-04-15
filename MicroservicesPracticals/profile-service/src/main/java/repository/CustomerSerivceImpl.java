package repository;

import com.rentcloud.commons.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CustomerService;

@Service
public class CustomerSerivceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
