package com.t2.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.t2.bean.Customer;
import com.t2.bean.Room;
import com.t2.service.PhotoService;
import com.t2.service.RoomService;

import net.sf.json.JSONObject;



@Controller
public class PhotoController extends HttpServlet{
	@Autowired
	PhotoService photoService;
	private static final String DISPLAY = "display";
	private static final String MAIN = "main";
	@RequestMapping("searchPhoto")
	@ResponseBody
	public Object search(@RequestBody(required=false) String key){
		//String×ªjson
		JSONObject json = JSONObject.fromObject(key.toString());
		System.out.println(json);
		List<String> list = photoService.selectLikeByExample(json.getString("decription"),json.getInt("page"),1);
		JSONObject jsonObject = new JSONObject();
		if(list.size() >= 1) {
			//System.out.println("ÕËºÅÒÑ´æÔÚ");
			
			
			jsonObject.put("result", 1);
			jsonObject.put("loaction", list);
			return jsonObject;
		}
		else {
			jsonObject.put("result", 0);
			
			return jsonObject;
			
		}
		
	
	
		
		
	}


}
