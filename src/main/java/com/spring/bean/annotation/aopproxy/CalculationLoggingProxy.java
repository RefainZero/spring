package com.spring.bean.annotation.aopproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalculationLoggingProxy {
//	要代理的对象
	private Calculation target;
	public CalculationLoggingProxy(Calculation target) {
		// TODO Auto-generated constructor stub
		this.target=target;
	} 
//	获得代理对象
	public Calculation getCalculationLoggingProxy(){
		Calculation proxy=null;
//		指定代理对象由哪个类负责加载
		ClassLoader loader = target.getClass().getClassLoader();
//		代理对象类型
		Class []interfaces=new Class[]{Calculation.class}; 
//		指定代理对象调用方法， 该执行的方法
		InvocationHandler h=new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				// TODO Auto-generated method stub
//				日志
				System.out.println("the method begins "+method.getName()+" "+Arrays.asList(args));
//				执行的方法
				Object result = method.invoke(target, args);
//				日志
				System.out.println("the method ends "+method.getName()+" "+Arrays.asList(args)+" "+result);
				return result;
			}
		};
		proxy=	(Calculation) Proxy.newProxyInstance(loader, interfaces, h);
		return proxy;
		
	}
}
