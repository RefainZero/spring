package com.spring.bean.annotation.aopproxy;

public class CalculationImpl implements Calculation {

	@Override
	public int sub(int i, int j) {
		// TODO Auto-generated method stub
		int result=i+j;
		return result;
	}

	@Override
	public int div(int i, int j) {
		// TODO Auto-generated method stub
		int result=i+j;
		return result;
	}


}
