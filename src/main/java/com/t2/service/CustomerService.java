package com.t2.service;

import java.util.List;

import com.t2.bean.Customer;
import com.t2.bean.Room;

public interface CustomerService {
	public int register(Customer customer);
	
	public List<Customer> selectCustomerByAccountExample(Customer customer);
	public List<Customer> selectCustomerByIdExample(Customer customer);
	public List<Customer> selectCustomerByNumberExample(Customer customer);
	public int updateRoomById(Customer customer);

}
