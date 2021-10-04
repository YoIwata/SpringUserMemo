
package com.example.demo.domain;

import javax.validation.constraints.NotBlank;

public class UserMemo {
	private Long id;
	
	@NotBlank(message="ユーザー名を記入してください。")
	private String userName;
	
	@NotBlank(message="メモを記入してください。")
	private String memo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
