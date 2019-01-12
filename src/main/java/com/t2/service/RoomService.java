package com.t2.service;

import java.util.Date;
import java.util.List;

public interface RoomService {
	public List<String> selectLikeByExample(Integer key,String type);
}
