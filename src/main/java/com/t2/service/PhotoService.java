package com.t2.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.t2.bean.Photo;
import com.t2.bean.Room;

public interface PhotoService {
	public List<Photo> selectPhotoByAllExample();
	public List<Photo> selectPhotoByTagExample(String tag);
	List<String> selectLikeByExample(String key);
}
