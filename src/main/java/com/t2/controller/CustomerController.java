package com.t2.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.t2.bean.Customer;
import com.t2.service.CustomerService;

import net.sf.json.JSONObject;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerService;
	private static final String REGISTER = "register";
	private static final String LOGIN = "login";
	private static final String MAIN = "index";
	private static final String ERROR = "error";
	
    
	
	@RequestMapping("register")
	@ResponseBody
	public JSONObject  register(@RequestBody(required=false) Customer customer){
		

		JSONObject jsonObject = new JSONObject();

		
		System.out.println(customer);
		List<Customer> list = customerService.selectCustomerByAccountExample(customer);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getPassword());
		}
		List<Customer> list1 = customerService.selectCustomerByNumberExample(customer);
		//System.out.println(customer);
		if(list.size() >= 1) {
			//System.out.println("账号已存在");
			
			
			jsonObject.put("result", 0);
			
			return jsonObject;
		}
		else if(list1.size() >= 1) {
			//System.out.println("电话已存在");
			jsonObject.put("result", 1);
			
			return jsonObject;
			
		}
		else {
			int num=customerService.register(customer);
			//System.out.println("num="+num);
			jsonObject.put("result", 2);
			
			return jsonObject;
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
	@ResponseBody
	public JSONObject login(@RequestBody(required=false) Customer customer) {
		List<Customer> list = customerService.selectCustomerByAccountExample(customer);
		JSONObject jsonObject = new JSONObject();
		if(list.size() >= 1 && list.get(0).getPassword().equals(customer.getPassword())) {
			//System.out.println(list.size()+customer.getPassword()+","+list.get(0).getPassword());
			
			jsonObject.put("result", 0);
			return jsonObject;
		}else {
			jsonObject.put("result", 1);
			return jsonObject;
			
		}
		
		
		
	}
		
		

}
