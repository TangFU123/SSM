package com.t2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.t2.bean.Room;
import com.t2.bean.RoomExample;
import com.t2.bean.RoomExample.Criteria;
import com.t2.dao.RoomMapper;

public class RoomServiceImpl implements RoomService{
	@Autowired
	RoomMapper roomMapper;

	public List<Room> selectRoomByIsfreeExample(Room room) {
		//Example条件查询类的使用
		RoomExample roomExample = new RoomExample();
		Criteria criteria = roomExample.createCriteria();
		//criteria.andIdLessThan(2);
		//criteria.andNameEqualTo("aaa");
		//criteria.andPasswordLike("__4%");
		//criteria.andAccountEqualTo(customer.getAccount());
		criteria.andIsfreeEqualTo(0);
		return roomMapper.selectByExample(roomExample);
	}
	

}
