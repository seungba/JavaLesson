package lesson;


public class FishBread {
    String breadType;

    // 생성자
    public FishBread(){

    }

    public FishBread(String type) {
        breadType = type;
    }

    public void getBreadType() {
        System.out.println(breadType + "빵 주세요");
    }

    public void sell(int num) {
        System.out.println(breadType + "빵을 " + num+"개 팔았습니다");
    }

    public void podSell(int num) {
        System.out.println("팥빵을 " + num + "개 팔았습니다");
    }
    //
    public void cremeSell(int num) {
        System.out.println("크림빵을 " + num + "개 팔았습니다");
    }

    public void sell(String type, int num) {
        System.out.println(type + "빵을 " + num + "개 팔았습니다");
    }

    public static void main(String[] args) {
        System.out.println("무엇을 주문하시겠습니까?");
        FishBread fb = new FishBread("팥");
        fb.getBreadType();
        fb.sell(10);

        System.out.println("==============");

        FishBread fb2 = new FishBread();
        fb2.podSell(5);
        fb2.cremeSell(6);
        fb2.sell("야채", 7);

    }
}