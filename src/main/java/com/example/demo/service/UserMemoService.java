package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.UserMemo;
import com.example.demo.mapper.UserMemoMapper;

@Service
public class UserMemoService {

	  @Autowired
	  private UserMemoMapper userMemoMapper;

	  @Transactional
	  public List<UserMemo> findAll() {
	    return userMemoMapper.findAll();
	  }

	  @Transactional
	  public UserMemo findOne(Long id) {
	    return userMemoMapper.findOne(id);
	  }

	  @Transactional
	  public void save(UserMemo userMemo) {
	    userMemoMapper.save(userMemo);
	  }

	  @Transactional
	  public void update(UserMemo userMemo) {
	    userMemoMapper.update(userMemo);
	  }

	  @Transactional
	  public void delete(Long id) {
	    userMemoMapper.delete(id);
	  }
}
