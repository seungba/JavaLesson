package lesson20190326;

public class StaticEx3 {
	public static void main(String[] args) {
		
		//	StaticEx01 Ŭ������
		// 16���� static �� �ƴ� �� 
		
		System.out.println("StaticEx01 Ŭ������ 16��");
		System.out.println("public void numDisp1() ��");
		System.out.println("non-static �� ��");
		System.out.println("new �����ڷ� ��ü����");
		
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
		
		System.out.println("StaticEx01 Ŭ������ 22��");
		System.out.println("public static void numDisp2() ��");
		System.out.println("static �� ��");
		
		//	static �� ��
		StaticEx01.numDisp2();		// 0
		StaticEx01.numDisp2();		// 1
		StaticEx01.numDisp2();		// 2
		System.out.println("");
		
//		===========================
		
		System.out.println("StaticEx01 Ŭ������ 16��");
		System.out.println("public void numDisp3() ��");
		System.out.println("non-static �� ��");
		System.out.println("new �����ڷ� ��ü����");
		
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
		
		System.out.println("StaticEx01 Ŭ������ 34��");
		System.out.println("public static void numDisp4() ��");
		System.out.println("static �� ��");
		
		//	static �� ��
		StaticEx01.numDisp4();		// 0
		StaticEx01.numDisp4();		// 0
		StaticEx01.numDisp4();		// 0
	
	}
}
