package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.UserMemo;


@Mapper
public interface UserMemoMapper {
	List<UserMemo> findAll();
	
	UserMemo findOne(Long id);
	
	void save(UserMemo userMemo);
	
	void update(UserMemo userMemo);
	
	void delete(Long id);
}
