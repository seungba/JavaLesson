package Crawling;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling {
	public static void main(String[] args) throws IOException {
		String url = "https://weather.naver.com/rgn/cityWetrMain.nhn";

        Document doc = Jsoup.connect(url).get();
        Elements elements_tbody = doc.getElementsByTag("tbody");
        Elements elements_row = doc.getElementsByTag("tbody");
        Element element = elements_tbody.get(1);
        
        // #1
//        elements = element.getElementsByTag("tr");
//        String str = elements.get(0).getElementsByTag("td").get(0).getElementsByTag("ul").get(0).getElementsByTag("li").get(0).text();
//        
//        System.out.println(str);
        
//         #2
//        elements = element.getElementsByAttributeValue("class", "nm");
//        System.out.println(elements.get(0).text());
//        System.out.println(elements);
        
       
       //#3
//       Elements trElem = element.getElementsByTag("tr");
//        for(int i=0; i < trElem.size(); i++) {
//	        Element element1 = trElem.get(i).getElementsByTag("th").get(0).getElementsByTag("a").get(0);
//	//        System.out.println(element1);
//	        
//	        String seoul = element1.text();
//	        System.out.println(seoul);
//	        
//	        elements = element.getElementsByAttributeValue("class", "nm");
//	        String moring = elements.get(0).text();
//	        System.out.println(moring);
//	        
//	        String temp = element.getElementsByTag("tr").get(0).getElementsByTag("td").get(0).getElementsByTag("ul").get(0).getElementsByTag("li").get(1).text();
//	        System.out.println(temp);
//	        
//	        elements = element.getElementsByAttributeValue("class", "nm");
//	        String lunch = elements.get(1).text();
//	        System.out.println(lunch);
//	        
//	        String temp2 = element.getElementsByTag("tr").get(0).getElementsByTag("td").get(1).getElementsByTag("ul").get(0).getElementsByTag("li").get(1).getElementsByTag("span").text();
//	        System.out.println(temp2);
//	        System.out.println();	        
//        }        
        elements_tbody = elements_tbody.get(1).getElementsByAttributeValue("class", "temp");
        elements_row = elements_row.get(1).getElementsByAttributeValue("scope", "row");
//        System.out.println(elements);
        

		System.out.println(element);
		System.out.println("--------");
		System.out.println(elements_tbody); // "class,tempt"
		System.out.println("--------");
		System.out.println(elements_row); // "scope,row" 0~11
		System.out.println("--------");
		
        for (int i = 0; i < elements_tbody.size(); i++) {
        	
			if(i%2 == 0) {
				System.out.println(elements_row.get(i/2).text());
				System.out.println("오전 : " + elements_tbody.get(i).text());
			} else {
				System.out.println("오후 : " + elements_tbody.get(i).text());
				System.out.println();
			}
		}
	}
}
