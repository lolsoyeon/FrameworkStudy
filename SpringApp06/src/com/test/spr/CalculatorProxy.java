/*===================================
 	CalculatorProxy.java
 	- 프록시 클래스
 	- 보조 업무 적용 및 주 업무 호출
 	(정말 중요한 클래스 복습하고 집가기)
 ===================================*/

package com.test.spr;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

// ※ Proxy 클래스를 설계하는 방법 들 중
// 	  비교적 쉽고 직관적인 방법은
// 	  InvocationHeandler 인터페이스를 구현하는 클래스를 만드는 것이다.

public class CalculatorProxy implements InvocationHandler
{
	// 주요 속성 구성 → 대상 객체
	// 그걸 객체 형식의 속성으로 타겟(외부인사)잡았다.
	private Object target;
	
	// 생성자 정의(사용자 정의 생성자)
	public CalculatorProxy(Object target)
	{
		this.target = target;
	}

	// InvocaionHandler 인터페이스의 invoke() 메소드 재정의
	// 필요하다면 
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		Object result = null;
		
		// 보조 업무(cross-cutting concern) 설정
		//-- 연산 과정에서 소요된 시간 측정 및 로그 기록
		Log log = LogFactory.getLog(this.getClass());	//-- 로그 구성 객체
		StopWatch sw = new StopWatch();					//-- 스톱워치 객체
		sw.start();										//-- 스톱워치의 시작버튼 클릭
		log.info("처리 시간 측정 시작--------------");	//-- 로그 기록
		
		// 주 업무(core concern) 실행 내용
		result = method.invoke(target, args);
		
		
		// 보조 업무(cross-cutting concern) 처리
		sw.stop();										//-- 스톱워치 종료버튼 클릭  									
		log.info("처리 시간 측정 종료--------------");	//-- 로그 기록
		log.info(String.format("경과시간 : %s/1000초", sw.getTotalTimeMillis()));

		return result;
	}

	
}
