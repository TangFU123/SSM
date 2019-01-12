package com.t2.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.t2.dao.RoomMapper;

public class RoomServiceImpl implements RoomService{
	@Autowired
	RoomMapper roomMapper;
	public List<String> selectLikeByExample(Integer in,String type)
	{
		return roomMapper.selectLikeByExample(in,type);
		
	}
	
}
