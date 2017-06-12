package com.spring.bean.annotation.aopproxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation target = new CalculationImpl();
		Calculation proxy = new CalculationLoggingProxy(target).getCalculationLoggingProxy();
		proxy.sub(1, 1);
		proxy.div(1, 1);
	}

}
