/*===================================
 	CalculatorAfterThrowing.java
 	- After Throwing Advice 구성
=================================== */

package com.test.spr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

public class CalculatorAfterThrowing implements ThrowsAdvice
{
	// 보통 implemets 하게 되면 추상클래스라서 @Override 해야하는데....
	// @Override 하게되면 메소드() ..+모든예외..그럴수가 없다 그래서 정의만 하면된다.
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable
	{
	//	e...toStirng(); 등등
		Log log = LogFactory.getLog(this.getClass());
		log.info("After Throwing Advice 실행 ==============");
		log.info("주 업무 실행 과정에서 예외 발생 시 처리되는 사후 업무");
		log.info("After Throwing Advice 실행 ==============");
	}
	
}
