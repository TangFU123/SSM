package com.t2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.t2.bean.Customer;
import com.t2.bean.Room;
import com.t2.service.RoomService;

@Controller
public class RoomController {
	@Autowired
	RoomService roomService;
	private static final String DISPLAY = "display";
	@RequestMapping("search")
	public ModelAndView search(Room room){
		/*//System.out.println("���ǲ�");
		List<Room> list = roomService.selectRoomByIsfreeExample(room);
		//�з������ ��Ԥ��
		if(list.size() >= 1) {
			list.get(0).setStartdate(startdate);
			
			
		}
		
		*/
		System.out.println("����");
		ModelAndView mav = new ModelAndView(DISPLAY);
		return mav;
		
		
	}


}
