package com.spring.bean.annotation.generics.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 定义服务层
 * @author Administrator
 *
 * @param <T>泛型
 */
public abstract class BaseService <T>{
	@Autowired
	protected BaseReponstory<T> baseReponstory;
	public void save(){
		System.out.println("save......");
		System.out.println(baseReponstory);
	}

}
