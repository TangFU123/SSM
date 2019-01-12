package com.t2.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.t2.service.CustomerService;
import com.t2.service.PhotoService;
import com.t2.service.RoomService;

import net.sf.json.JSONObject;

@Controller
public class RoomController extends HttpServlet{
	@Autowired
	RoomService roomService;
	@Autowired
	CustomerService customerService;
	@RequestMapping("searchRoom")
	@ResponseBody
	public Object search(@RequestBody(required=false) String key){
		//String×ªjson
		JSONObject json = JSONObject.fromObject(key.toString());
		System.out.println(json);
		JSONObject jsonObject = new JSONObject();
		List<String> list = roomService.selectLikeByExample(0,"normal");	
		List<String> list2 = roomService.selectLikeByExample(0,"senior");
		List<String> list3 = roomService.selectLikeByExample(0,"top-level");
		if(list.size() >= 1||list2.size()>=1||list3.size()>=1) {
			//System.out.println("ÕËºÅÒÑ´æÔÚ");		
			jsonObject.put("result", 1);
			jsonObject.put("rid1", list);
			jsonObject.put("type1", "normal");
			jsonObject.put("rid2", list2);
			jsonObject.put("type2", "senior");
			jsonObject.put("rid3", list3);
			jsonObject.put("type3", "top-level");
			return jsonObject;
		}
		else {
			jsonObject.put("result", 0);
			
			return jsonObject;
			
		}

	}
}
