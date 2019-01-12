package com.t2.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import com.t2.bean.Photo;
import com.t2.bean.PhotoExample;
import com.t2.bean.PhotoExample.Criteria;
import com.t2.dao.PhotoMapper;


public class PhotoServiceImpl implements PhotoService{
	
	@Autowired
	PhotoMapper photoMapper;
	
	public List<String> selectLikeByExample(String key,Integer page,Integer size){
		return photoMapper.selectLikeByExample(key,page,size);
	}
	
	public List<Photo> selectPhotoByAllExample() {
		// TODO Auto-generated method stub
		
		PhotoExample photoExample = new PhotoExample();
		Criteria criteria =photoExample.createCriteria();
		for(int i = 0;i <6;i++)
		{
			
		}
		return null;
	}

	public List<Photo> selectPhotoByTagExample(String tag) {
		// TODO Auto-generated method stub
		return null;
	}

}
