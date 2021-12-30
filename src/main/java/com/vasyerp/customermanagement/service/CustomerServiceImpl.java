package com.vasyerp.customermanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasyerp.customermanagement.dto.CustomerDTO;
import com.vasyerp.customermanagement.model.Customer;
import com.vasyerp.customermanagement.repository.CustomerRepo;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public void createCustomer(CustomerDTO customerDto) {
		Customer customer = convertDtoToModel(customerDto);
		customerRepo.save(customer);	
	}

	@Override
	public List<CustomerDTO> getAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> list = customerRepo.findAll();
		List<CustomerDTO> customerList = list.stream()
				.map(CustomerDTO::new)
				.collect(Collectors.toCollection(ArrayList::new));
		return customerList;
	}

	@Override
	public void deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		customerRepo.deleteById(id);
		
	}

	@Override
	public CustomerDTO editCustomer(Integer id) {
		// TODO Auto-generated method stub
		Customer cust = customerRepo.getById(id);
		System.out.println(cust);
		return convertModelToDto(cust);
	}
	
	
	private CustomerDTO convertModelToDto(Customer cust) {
		// TODO Auto-generated method stub
		CustomerDTO custDto = new CustomerDTO();
        custDto.setId(cust.getId());
        custDto.setEmail(cust.getEmail());
        custDto.setMobile(cust.getMobile());
        custDto.setFirstName(cust.getFirstName());
        custDto.setLastName(cust.getLastName());
        
        
		return custDto;
	}

	private Customer convertDtoToModel(CustomerDTO customerDto) {
		// TODO Auto-generated method stub
		Customer cust = new Customer();
        if (customerDto.getId() != null) {
             cust.setId(customerDto.getId());
        }
        cust.setEmail(customerDto.getEmail());
        cust.setMobile(customerDto.getMobile());
        cust.setFirstName(customerDto.getFirstName());
        cust.setLastName(customerDto.getLastName());
        
        
		return cust;
	}
}
