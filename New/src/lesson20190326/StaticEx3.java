package lesson20190326;

public class StaticEx3 {
	public static void main(String[] args) {
		
		//	StaticEx01 클래스의
		// 16행이 static 이 아닐 때 
		
		System.out.println("StaticEx01 클래스의 16행");
		System.out.println("public void numDisp1() 가");
		System.out.println("non-static 일 때");
		System.out.println("new 연산자로 객체선언");
		
		System.out.println("a1.numDisp1();");
		StaticEx01 a1 = new StaticEx01();
		a1.numDisp1();		// 0
		a1.numDisp1();		// 1
		a1.numDisp1();		// 2
		
		System.out.println("a2.numDisp1();");
		StaticEx01 a2 = new StaticEx01();
		a2.numDisp1();		// 0
		a2.numDisp1();		// 1
		a2.numDisp1();		// 2
		System.out.println("");
		
//		===========================
		
		System.out.println("StaticEx01 클래스의 22행");
		System.out.println("public static void numDisp2() 가");
		System.out.println("static 일 때");
		
		//	static 일 때
		StaticEx01.numDisp2();		// 0
		StaticEx01.numDisp2();		// 1
		StaticEx01.numDisp2();		// 2
		System.out.println("");
		
//		===========================
		
		System.out.println("StaticEx01 클래스의 16행");
		System.out.println("public void numDisp3() 가");
		System.out.println("non-static 일 때");
		System.out.println("new 연산자로 객체선언");
		
		System.out.println("a3.numDisp3();");
		StaticEx01 a3 = new StaticEx01();
		a3.numDisp3();		// 0
		a3.numDisp3();		// 1
		a3.numDisp3();		// 2
		System.out.println("a4.numDisp3();");
		StaticEx01 a4 = new StaticEx01();
		a4.numDisp3();		// 0
		a4.numDisp3();		// 1
		a4.numDisp3();		// 2
		System.out.println("");
		
//		===========================
		
		System.out.println("StaticEx01 클래스의 34행");
		System.out.println("public static void numDisp4() 가");
		System.out.println("static 일 때");
		
		//	static 일 때
		StaticEx01.numDisp4();		// 0
		StaticEx01.numDisp4();		// 0
		StaticEx01.numDisp4();		// 0
	
	}
}
