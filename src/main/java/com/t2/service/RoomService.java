package com.t2.service;

import java.util.List;

import com.t2.bean.Room;

public interface RoomService {
	public List<Room> selectRoomByIsfreeExample(Room room);

}
