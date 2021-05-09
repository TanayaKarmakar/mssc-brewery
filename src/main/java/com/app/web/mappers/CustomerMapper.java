package com.app.web.mappers;

import com.app.domain.Customer;
import com.app.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * @author t0k02w6 on 09/05/21
 * @project mssc-brewery
 */
@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
