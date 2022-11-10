/*=======================
 	CalculatorImpl.java
 	- 클래스
 	- Calculator 인터페이스를 구현하는 클래스.
 	- 주 업무, 보조 업무가 결합된 형태로 함께 처리되는 구조로 구성.
 	(AOP 기법 적용 이전)
 =======================*/

package com.test.spr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class CalculatorImpl implements Calculator
{
	// 인터페이스로 부터 상속 받은 메소드 재정의를 통해
	// 주 업무(core concern) 실행(수행)을 위한 메소드 구햔
	
	@Override
	public int add(int x, int y)
	{
		// 반환할 결과값
		int result = 0;
		
		// 보조 업무(cross-cutting concern) 설정
		//-- 연산 과정에서 소요된 시간 측정 및 로그 기록
		Log log = LogFactory.getLog(this.getClass());	//-- 로그 구성 객체
		StopWatch sw = new StopWatch();					//-- 스톱워치 객체
		sw.start();										//-- 스톱워치의 시작버튼 클릭
		log.info("처리 시간 측정 시작--------------");	//-- 로그 기록
		
		// 주 업무(core concern) 실행 내용
		result = x + y;
		System.out.printf("%d + %d = %d\n", x, y, result);
		
		// 보조 업무(cross-cutting concern) 처리
		sw.stop();										//-- 스톱워티 종료버튼   									
		log.info("처리 시간 측정 종료--------------");	//-- 로그 기록
		log.info(String.format("경과시간 : %s/1000초", sw.getTotalTimeMillis()));
		
		
		
		// 최종 결과값 반환
		return result;
	}

	@Override
	public int sub(int x, int y)
	{
		// 반환할 결과값
		int result = 0;
		
		// 보조 업무(cross-cutting concern) 설정
		//-- 연산 과정에서 소요된 시간 측정 및 로그 기록
		Log log = LogFactory.getLog(this.getClass());	//-- 로그 구성 객체
		StopWatch sw = new StopWatch();					//-- 스톱워치 객체
		sw.start();										//-- 스톱워치의 시작버튼 클릭
		log.info("처리 시간 측정 시작--------------");	//-- 로그 기록
		
		// 주 업무(core concern) 실행 내용
		result = x - y;
		System.out.printf("%d - %d = %d\n", x, y, result);
		
		// 보조 업무(cross-cutting concern) 처리
		sw.stop();										//-- 스톱워티 종료버튼   									
		log.info("처리 시간 측정 종료--------------");	//-- 로그 기록
		log.info(String.format("경과시간 : %s/1000초", sw.getTotalTimeMillis()));
		
		
		
		// 최종 결과값 반환
		return result;
	}

	@Override
	public int multi(int x, int y)
	{
		// 반환할 결과값
		int result = 0;
		
		// 보조 업무(cross-cutting concern) 설정
		//-- 연산 과정에서 소요된 시간 측정 및 로그 기록
		Log log = LogFactory.getLog(this.getClass());	//-- 로그 구성 객체
		StopWatch sw = new StopWatch();					//-- 스톱워치 객체
		sw.start();										//-- 스톱워치의 시작버튼 클릭
		log.info("처리 시간 측정 시작--------------");	//-- 로그 기록
		
		// 주 업무(core concern) 실행 내용
		result = x * y;
		System.out.printf("%d * %d = %d\n", x, y, result);
		
		// 보조 업무(cross-cutting concern) 처리
		sw.stop();										//-- 스톱워티 종료버튼   									
		log.info("처리 시간 측정 종료--------------");	//-- 로그 기록
		log.info(String.format("경과시간 : %s/1000초", sw.getTotalTimeMillis()));
		
		
		
		// 최종 결과값 반환
		return result;
	}

	@Override
	public int div(int x, int y)
	{
		// 반환할 결과값
		int result = 0;
		
		// 보조 업무(cross-cutting concern) 설정
		//-- 연산 과정에서 소요된 시간 측정 및 로그 기록
		Log log = LogFactory.getLog(this.getClass());	//-- 로그 구성 객체
		StopWatch sw = new StopWatch();					//-- 스톱워치 객체
		sw.start();										//-- 스톱워치의 시작버튼 클릭
		log.info("처리 시간 측정 시작--------------");	//-- 로그 기록
		
		// 주 업무(core concern) 실행 내용
		result = x / y;
		System.out.printf("%d / %d = %d\n", x, y, result);
		
		// 보조 업무(cross-cutting concern) 처리
		sw.stop();										//-- 스톱워티 종료버튼   									
		log.info("처리 시간 측정 종료--------------");	//-- 로그 기록
		log.info(String.format("경과시간 : %s/1000초", sw.getTotalTimeMillis()));
		
		
		
		// 최종 결과값 반환
		return result;
	}


}
