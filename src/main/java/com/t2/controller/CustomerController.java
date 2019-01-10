package com.t2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.t2.bean.Customer;
import com.t2.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	private static final String LOGIN = "login";
	private static final String MAIN = "main";
	private static final String ERROR = "error";
	@RequestMapping("register")
	public ModelAndView register(Customer customer){
		System.out.println("鸡骨草");
		System.out.println(customer);
		List<Customer> list = customerService.selectCustomerByAccountExample(customer);
		if(list.size() >= 1) {
			System.out.println("账号已存在");
			ModelAndView mav = new ModelAndView(ERROR);
			return mav;
		}
		List<Customer> list1 = customerService.selectCustomerByNumberExample(customer);
		if(list1.size() >= 1) {
			System.out.println("电话已存在");
			ModelAndView mav = new ModelAndView(ERROR);
			return mav;
		}
		int num=customerService.register(customer);
		System.out.println("num="+num);
		ModelAndView mav = new ModelAndView(LOGIN);
		return mav;
	}
	
	@RequestMapping("selectCustomerByAccountExample")
	public ModelAndView selectCustomerByAccountExample(Customer customer){
		List<Customer> list = customerService.selectCustomerByAccountExample(customer);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		ModelAndView mav = new ModelAndView(MAIN);
		return mav;
	}
	@RequestMapping("selectCustomerByNumberExample")
	public ModelAndView selectCustomerByNumberExample(Customer customer){
		List<Customer> list = customerService.selectCustomerByNumberExample(customer);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		ModelAndView mav = new ModelAndView(MAIN);
		return mav;
	}
		
		

}
