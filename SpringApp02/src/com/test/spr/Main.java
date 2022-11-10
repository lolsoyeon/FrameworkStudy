/*============================================
 	Main.java
 	- 클래스
 	- main() 메소드가 포함된 테스트 클래스
 ============================================*/


package com.test.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		// 스프링이 처리하고 관리하게 될 영역~!!
		// ---------------------------------------------------------------------
		/*
		// RecoedImpl1(Record) 객체 생성 과정
		//-- RecordView 입장에서의 의존객체(Dependency)
		Record rec1 = new RecordImpl1();
		
		// RecoedImpl2(Record) 객체 생성 과정
		//-- RecordView 입장에서의 의존객체(Dependency)
		Record rec2 = new RecordImpl2();
		
		// RecoedImpl3(Record) 객체 생성 과정
		//-- RecordView (A)입장에서의 의존객체(Dependency)(Record == B)
		Record rec3 = new RecordImpl3();
		
		
		// RecordView(RecordView) 객체 생성 과정
		RecordView view = new RecordViewImpl();
		
		
		// 의존 객체 주입(Injection)
//		view.setRecord(rec1);
//		view.setRecord(rec2);		//-- setter injection(setter 를 통한 주입)
		view.setRecord(rec3);
		
		
		//-- 의존객체 주입 방법을 사용하게 되면
		//	 느슨한 결합을 구성 할 수 있게 되고
		//   한 쪽의 변동 상황이 다른 한쪽에 영향을 덜 줄 수 있게 된다.
		 */
		// ---------------------------------------------------------------------


		// ※ 스프링 프레임워크에서는
		//    객체 생성 과정 및 DI(의존 객체 주입)에 대한 설정은 
		//    스프링 환경 설정 파일로 대체된다.
		
		// 스프링 프레임워크에서 『applicationContext.xml』 파일을 읽어서
		// 생성 및 관리할 객체에 대한 정보를 얻어낼 수 있도록 처리해 주는 과정이 필요하다.
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// context로 부터 『getBean()』 메소드를 이용하여
		// 사용자가 원하는 객체를 얻어와서 사용 할 수 있다.
		// 이 과정에서 메소드 인자값으로는 id를 지정하면 된다.
		//RecordView view = (RecordViewImpl)context.getBean("view");
		
		//-- object 타입으로 반환돼서 (RecordViewImpl)로 캐스팅
		
		
		// ※ 위 코드(line 62)는 스프링 3.0 이후 버전부터
		//    아래 코드 형식으로 사용하는 것이 가능.
		RecordView view = context.getBean("view", RecordViewImpl.class);
		
		view.intput();
		view.output();
	}
}
