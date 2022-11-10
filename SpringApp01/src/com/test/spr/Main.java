/*============================================
 	Main.java
 	- 클래스
 	- main() 메소드가 포함된 테스트 클래스
 ============================================*/


package com.test.spr;

public class Main
{
	public static void main(String[] args)
	{
		// 스프링이 처리하고 관리하게 될 영역~!!
		// ---------------------------------------------------------------------
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
		
		// ---------------------------------------------------------------------
		view.intput();
		view.output();
	}
}
