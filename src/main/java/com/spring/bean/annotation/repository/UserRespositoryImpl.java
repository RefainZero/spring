package com.spring.bean.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * 业务层
 * @author Administrator
 *
 */
@Repository
public class UserRespositoryImpl implements UserRepository {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("UserRespositoryImpl add.....");

	}

}
