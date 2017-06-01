package com.spring.bean.annotation.service;

import org.springframework.stereotype.Service;

/**
 * 持久层
 * @author Administrator
 *
 */
@Service
public class UserService {
	public void save() {
		System.out.println("UserService save....");
	}
}
