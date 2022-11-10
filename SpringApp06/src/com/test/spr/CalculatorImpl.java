/*=======================
 	CalculatorImpl.java
 	- 클래스
 	- Calculator 인터페이스를 구현하는 클래스.
 	- 주 업무, 보조 업무가 결합된 형태로 함께 처리되는 구조로 구성.
 	(AOP 기법 적용 이전)
 =======================*/

package com.test.spr;

public class CalculatorImpl implements Calculator
{
	// 인터페이스로 부터 상속 받은 메소드 재정의를 통해
	// 주 업무(core concern) 실행(수행)을 위한 메소드 구햔
	
	@Override
	public int add(int x, int y)
	{
		// 반환할 결과값
		int result = 0;
		
		// 주 업무(core concern) 실행 내용
		result = x + y;
		System.out.printf("%d + %d = %d\n", x, y, result);

		// 최종 결과값 반환
		return result;
	}

	@Override
	public int sub(int x, int y)
	{
		// 반환할 결과값
		int result = 0;

		// 주 업무(core concern) 실행 내용
		result = x - y;
		System.out.printf("%d - %d = %d\n", x, y, result);
		
		// 최종 결과값 반환
		return result;
	}

	@Override
	public int multi(int x, int y)
	{
		// 반환할 결과값
		int result = 0;

		// 주 업무(core concern) 실행 내용
		result = x * y;
		System.out.printf("%d * %d = %d\n", x, y, result);
		
		// 최종 결과값 반환
		return result;
	}

	@Override
	public int div(int x, int y)
	{
		// 반환할 결과값
		int result = 0;
		

		// 주 업무(core concern) 실행 내용
		result = x / y;
		System.out.printf("%d / %d = %d\n", x, y, result);
		
		
		// 최종 결과값 반환
		return result;
	}


}
