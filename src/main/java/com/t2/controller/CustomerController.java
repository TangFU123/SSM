package com.t2.controller;

import java.util.List;

import javax.swing.JOptionPane;

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
	private static final String REGISTER = "register";
	private static final String LOGIN = "login";
	private static final String MAIN = "main";
	private static final String ERROR = "error";
	@RequestMapping("register")
	public ModelAndView register(Customer customer){
		//System.out.println("鸡骨草");
		//System.out.println(customer);
		List<Customer> list = customerService.selectCustomerByAccountExample(customer);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getPassword());
		}
		List<Customer> list1 = customerService.selectCustomerByNumberExample(customer);
		//System.out.println(customer);
		if(list.size() >= 1) {
			//System.out.println("账号已存在");
			JOptionPane.showMessageDialog(null, "账号已存在");
			ModelAndView mav = new ModelAndView(LOGIN);
			return mav;
		}
		else if(list1.size() >= 1) {
			//System.out.println("电话已存在");
			JOptionPane.showMessageDialog(null, "电话已存在");
			ModelAndView mav = new ModelAndView(LOGIN);
			return mav;
		}
		else {
			int num=customerService.register(customer);
			//System.out.println("num="+num);
			JOptionPane.showMessageDialog(null, "注册成功!");
			ModelAndView mav = new ModelAndView(LOGIN);
			return mav;
		}
	}
	
	@RequestMapping("selectCustomerByAccountExample")
	public ModelAndView selectCustomerByAccountExample(Customer customer){
		List<Customer> list = customerService.selectCustomerByAccountExample(customer);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getPassword());
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
	@RequestMapping("login")
	public ModelAndView login(Customer customer) {
		List<Customer> list = customerService.selectCustomerByAccountExample(customer);
		//System.out.println(list.size()+customer.getPassword()+","+list.get(0).getPassword());
		if(list.size() >= 1 && list.get(0).getPassword().equals(customer.getPassword())) {
			//System.out.println(list.size()+customer.getPassword()+","+list.get(0).getPassword());
			ModelAndView mav = new ModelAndView(MAIN);
			return mav;
		}else {
			JOptionPane.showMessageDialog(null, "账号或密码错误");
			ModelAndView mav = new ModelAndView(LOGIN);
			return mav;
			
		}
		
		
		
	}
		
		

}
