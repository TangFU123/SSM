package com.t2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.t2.bean.Customer;
import com.t2.bean.CustomerExample;
import com.t2.bean.CustomerExample.Criteria;
import com.t2.dao.CustomerMapper;

public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerMapper customerMapper;
	
	public int register(Customer customer) {
		return customerMapper.insert(customer);
	}

	public List<Customer> selectCustomerByAccountExample(Customer customer) {
		//Example条件查询类的使用
				CustomerExample customerExample = new CustomerExample();
				Criteria criteria = customerExample.createCriteria();
				//criteria.andIdLessThan(2);
				//criteria.andNameEqualTo("aaa");
				//criteria.andPasswordLike("__4%");
				criteria.andAccountEqualTo(customer.getAccount());
				
				return customerMapper.selectByExample(customerExample);
	}
	public List<Customer> selectCustomerByNumberExample(Customer customer) {
		//Example条件查询类的使用
				CustomerExample customerExample = new CustomerExample();
				Criteria criteria = customerExample.createCriteria();
				//criteria.andIdLessThan(2);
				//criteria.andNameEqualTo("aaa");
				//criteria.andPasswordLike("__4%");
				//criteria.andAccountEqualTo(customer.getAccount());
				criteria.andNumberEqualTo(customer.getNumber());
				
				return customerMapper.selectByExample(customerExample);
	}
}
	