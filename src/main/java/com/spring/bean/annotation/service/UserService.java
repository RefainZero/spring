package com.spring.bean.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.bean.annotation.repository.UserRepository;

/**
 * 持久层
 * @author Administrator
 *
 */
@Service
public class UserService { 
	private UserRepository userRespository;
	
	/**
	 * 当有两个业务层都实现同一个接口，如果 实现类上防注解内不区分开，会报错，找到两个实例
	 * 方案：
	 * 1.在respository()中加入指定实现类的bean的名称，即类的首字母小写
	 * 2.使用@Qualifier("userJdbcRespositoryImpl")括号内指定实现类的名称
	 * @param userRespository
	 */
	@Autowired
	@Qualifier("userJdbcRespositoryImpl")
	public void setUserRespository(UserRepository userRespository) {
		this.userRespository = userRespository;
	}
	public void save() {
		userRespository.add();
		System.out.println("UserService save....");
	}
}
