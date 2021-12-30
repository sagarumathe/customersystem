package com.vasyerp.customermanagement.service;

import java.util.List;
import com.vasyerp.customermanagement.dto.CustomerDTO;

public interface CustomerService {
	public void createCustomer(CustomerDTO customerDto);
	public List<CustomerDTO> getAllCustomer();
	public void deleteCustomer(Integer id);
	public CustomerDTO editCustomer(Integer id);
}
