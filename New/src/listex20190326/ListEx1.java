package listex20190326;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListEx1 {
	public static void main(String[] args) {

//		int a = 3;						// int
//		int[] b = {1,2,3,4,5};			// 배열
		
		// 배열 
//		int[] b1 = new int[100000];
		
//		for (int i = 0; i< b.length; i++) {
//			System.out.println(b[i]);
//		}
		
		// ArrayList
//		ArrayList<String> list = new ArrayList<>();
//		list.add("10");  	// 0
//		list.add("11");		// 1
//		list.add("12");		// 2
//		list.add("13");		// 3
//		list.add("14");		// 4
//		list.add("15");		// 5
//		list.add("16");		// 6
//		
//		System.out.println("넣기 전 : " + list.get(1));			// 11
//		System.out.println("넣기 전 size : " + list.size());	// 7 
//		list.add(1, "20");
//		list.remove("20");
//		System.out.println("넣은 후 : " + list.get(1));			// 11
//		System.out.println("넣은 후 : " + list.get(2));			// 12
//		System.out.println("넣기 후 size : " + list.size());	// 7
		
//		list.get(0);		// "10"
		
		
		// Map
		HashMap<String, String> map = new HashMap<>();
		map.put("H", "HHH");
		map.put("s", "sss");
		map.put("1", "111");
		map.put("JH", "JH");
		map.put("9i", "9i");
		map.put("aaaaa", "aaaaa");
		
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		
//		while(iter.hasNext()) {
//			System.out.println(map.get(iter.next()));
//		}
		
		ArrayList<GeustInfo> cList = new ArrayList<>();
		
		GeustInfo guest1 = new GeustInfo();
		GeustInfo guest2 = new GeustInfo();

		guest1.setAddr("인천");
		guest1.setAge(33);
		guest1.setBloodType("A");
		guest1.setName("배성호");
		
		guest2.setAddr("영천");
		guest2.setAge(22);
		guest2.setBloodType("A");
		guest2.setName("이승준");
		
		cList.add(guest1);
		cList.add(guest2);
		
		String search = "배성호";
		
		// ArrayList 로 검색
		for(int i = 0; i<cList.size(); i++) {
			GeustInfo g = cList.get(i);
			String name = g.getName();
			if(name == search) {
				System.out.println("ArrayList");
				System.out.println(g.getAge());
			}
		}
		
		// HashMap으로 검색
		HashMap<String, GeustInfo> hMap1 = new HashMap<>();
		hMap1.put(guest1.getName(), guest1);
		hMap1.put(guest2.getName(), guest2);
		
		HashMap<String, GeustInfo> hMap2 = new HashMap<>();
		hMap2.put(guest1.getName(), guest1);
		hMap2.put(guest2.getName(), guest2);
		
		HashMap<String, GeustInfo> hMap3 = new HashMap<>();
		hMap3.put(guest1.getName(), guest1);
		hMap3.put(guest2.getName(), guest2);
		
		HashMap<String, GeustInfo> hMap4 = new HashMap<>();
		hMap4.put(guest1.getName(), guest1);
		hMap4.put(guest2.getName(), guest2);
		
		System.out.println("Map");
		System.out.println(hMap1.get(search).getAge());
		
		
		HashMap<Integer, HashMap<String, GeustInfo>> m1 = new HashMap<>();
		HashMap<Integer, ArrayList<GeustInfo>> m2 = new HashMap<>();
		m1.put(100, hMap1);
		m1.put(200, hMap2);
		m1.put(300, hMap3);
		m1.put(400, hMap4);
		
		m2.put(400, cList);
		
//		System.out.println(list.get(0));
//		System.out.println(list.size()); // 7
//		
//		// 반복문으로 출력
//		System.out.println("반복문으로 출력");
//		for(int i =0; i< list.size(); i++)
//			System.out.println(list.get(i));
		
	}
}

