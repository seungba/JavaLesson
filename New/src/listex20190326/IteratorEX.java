package listex20190326;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEX {
	
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		
		// 이터레이터 객체 itr 는 list값을 가져온다.
		
		Iterator<String> itr = list.iterator(); // 모든 컬렉션 안에는 iterator() 메소드가 있다.
		
		while(itr.hasNext()) { // 값이 나올 때 까지 판단하여 while문을 돈다.
			String str = itr.next(); // 문자열 변수 str에 값을 하나씩 넣는다.
			System.out.println(str);
			
		}
	}
	
	
}
