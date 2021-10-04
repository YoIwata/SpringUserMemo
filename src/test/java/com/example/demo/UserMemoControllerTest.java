package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.UserMemoController;

@SpringBootTest
public class UserMemoControllerTest {

	@Autowired
	private UserMemoController userMemoController;
	
	@Test
	public void メモ全件取得() {
	
		
	}
}
