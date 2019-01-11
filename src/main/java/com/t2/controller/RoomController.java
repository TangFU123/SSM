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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.t2.bean.Customer;
import com.t2.bean.Room;
import com.t2.service.RoomService;

import net.sf.json.JSONObject;

@Controller
public class RoomController extends HttpServlet{
	@Autowired
	RoomService roomService;
	private static final String DISPLAY = "display";
	private static final String MAIN = "main";
	/*@RequestMapping("search")
	public void search(HttpServletRequest request,HttpServletResponse response,Room room)throws ServletException, IOException{
		//System.out.println("���ǲ�");
		response.setContentType("text/html;charset=utf-8");
		List<Room> list = roomService.selectRoomByIsfreeExample(room);
		//�з������ ��Ԥ��
		if(list.size() >= 1) {
			System.out.println(list.get(0).getArea()+","+list.get(0).getType());
			list.get(0).setIsfree(1);
			list.get(0).setStartdate(room.getStartdate());
			list.get(0).setEnddate(room.getEnddate());
			JSONObject jsonObject = new JSONObject();

			jsonObject.put("room", list.get(0));
			jsonObject.put("area", list.get(0).getArea());
			jsonObject.put("type", list.get(0).getType());
			jsonObject.put("money", list.get(0).getMoney());
			jsonObject.put("isfree", list.get(0).getIsfree());
			jsonObject.put("startdate", list.get(0).getStartdate());
			jsonObject.put("enddate", list.get(0).getEnddate());
			jsonObject.put("rid", list.get(0).getRid());
			System.out.println(jsonObject);
			//��json�����ظ�ǰ�˹���
			response.getWriter().write(jsonObject.toString());


		}
			roomService.updateRoomById(list.get(0));
			System.out.println(list.get(0).getStartdate()+","+list.get(0).getEnddate());
			ModelAndView mav = new ModelAndView(DISPLAY);
			return mav;
		}else {
			JOptionPane.showMessageDialog(null, "�Բ��� û�п�Ԥ���ķ�����");
			ModelAndView mav = new ModelAndView(MAIN);
			return mav;
		}
		
	
		
		
	}*/
	
	@RequestMapping("insert")
	public void insert(HttpServletRequest request,HttpServletResponse response,Room room)throws ServletException, IOException{
		String cid = request.getParameter("cid");
		System.out.println(cid+","+room);
		Customer customer = new Customer();
		customer.setId(Integer.parseInt(cid));
		System.out.println(customer.getId());
		System.out.println(room.getId()+","+room.getStartdate()+","+room.getInterday());
		List<Room> list = roomService.selectRoomByIdExample(room);
		System.out.println(customer.getId());
		List<Customer> list1 = customerService.selectCustomerByIdExample(customer);
		
		if(list.size() >= 1) {
			if(list1.size() >= 1) {
				System.out.println(customer.getId());
				customer.setinterdate(room.getStartdate());
				customer.setRid(request.getParameter("rid"));
				customerService.updateRoomById(customer);
				roomService.updateRoomById(room);

				
			}else {
				JOptionPane.showMessageDialog(null, "�Բ��� ���û�������");
				
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "�Բ��� �÷��䲻����");
			
		}
	
	
	}


}
