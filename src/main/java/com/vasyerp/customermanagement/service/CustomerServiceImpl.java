package com.vasyerp.customermanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasyerp.customermanagement.dto.CustomerDTO;
import com.vasyerp.customermanagement.model.CustAddress;
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
		List<CustomerDTO> customerList = new ArrayList<>();
		for (Customer customer : list) {
			CustAddress custaddr = customer.getAddress();
			CustomerDTO custDto = new CustomerDTO();
			custDto.setAddress(custaddr.getAddress());
			System.out.println(customer.toString() + "  " + customer.getAddress());
			custDto.setFirstName(customer.getFirstName());
			custDto.setLastName(customer.getLastName());
			custDto.setEmail(customer.getEmail());
			custDto.setMobile(customer.getMobile());
			custDto.setId(customer.getId());
			customerList.add(custDto);
		}
		
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
		CustAddress address = cust.getAddress();
		System.out.println("******************************************************");
		System.out.println(cust+"  " + address.getAddress());
		return convertModelToDto(cust,address);
	}
	
	
	private CustomerDTO convertModelToDto(Customer cust, CustAddress address) {
		// TODO Auto-generated method stub
		CustomerDTO custDto = new CustomerDTO();
		custDto.setAddress(address.getAddress());
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
		CustAddress address = new CustAddress();
		
        if (customerDto.getId() != null) {
             cust.setId(customerDto.getId());
        }
        address.setAddress(customerDto.getAddress());
        cust.setAddress(address);
        cust.setEmail(customerDto.getEmail());
        cust.setMobile(customerDto.getMobile());
        cust.setFirstName(customerDto.getFirstName());
        cust.setLastName(customerDto.getLastName());
        
        
		return cust;
	}
}
