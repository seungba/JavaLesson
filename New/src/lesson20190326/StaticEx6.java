package lesson20190326;

public class StaticEx6 {
	public static void main(String[] args) {
		System.out.println("====init4()====");
		StaticEx4.init4();
		System.out.println("====init5()====");
		StaticEx5.init5();
		
// 		StaticEx01 의 11행이 static int cnt = 0 일 경우
//		====init4()====
//		cnt : 0
//		cnt : 1
//		cnt : 2
//		====init5()====
//		cnt : 3
//		cnt : 4
//		cnt : 5
//
// 		static 이 아닐 경우
//		====init4()====
//		cnt : 0
//		cnt : 1
//		cnt : 2
//		====init5()====
//		cnt : 0
//		cnt : 1
//		cnt : 2

	}
}
